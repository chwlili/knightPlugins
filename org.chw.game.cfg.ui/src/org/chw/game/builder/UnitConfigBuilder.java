package org.chw.game.builder;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.zip.Deflater;

import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.xml.sax.SAXException;

public class UnitConfigBuilder
{
	private IFile file;
	private TypeDef[] types;
	private TypeDef type;

	private UnitCodeBuilder classWriter;

	private Instance root;

	private int nextID = 1;

	private HashMap<Object, Integer> def_id = new HashMap<Object, Integer>();
	private HashMap<Integer, Integer> int_id = new HashMap<Integer, Integer>();
	private HashMap<Integer, Integer> uint_id = new HashMap<Integer, Integer>();
	private HashMap<Boolean, Integer> boolean_id = new HashMap<Boolean, Integer>();
	private HashMap<Float, Integer> float_id = new HashMap<Float, Integer>();
	private HashMap<String, Integer> string_id = new HashMap<String, Integer>();
	private HashMap<String, Integer> instance_id = new HashMap<String, Integer>();
	private HashMap<Instance, String> instance_txt = new HashMap<Instance, String>();

	private HashMap<Integer, Integer> id_refCount = new HashMap<Integer, Integer>();
	private HashMap<Integer, Object> id_value = new HashMap<Integer, Object>();
	private HashMap<Integer, TypeFieldDef> id_field = new HashMap<Integer, TypeFieldDef>();
	private HashMap<Integer, Integer> id_order = new HashMap<Integer, Integer>();

	private HashMap<String, HashSet<Integer>> typeName_ids = new HashMap<String, HashSet<Integer>>();
	private HashMap<String, Integer[]> typeName_idArray = new HashMap<String, Integer[]>();

	private ArrayList<IFile> writedFiles = new ArrayList<IFile>();

	/**
	 * 构造函数
	 * 
	 * @param instance
	 * @throws IOException
	 */
	public UnitConfigBuilder(IFile file, TypeDef[] types, TypeDef type, UnitCodeBuilder writer)
	{
		this.file = file;
		this.types = types;
		this.type = type;
		this.classWriter = writer;
	}

	/**
	 * 获取已经输出的文件
	 * 
	 * @return
	 */
	public IFile[] getWritedFiles()
	{
		return writedFiles.toArray(new IFile[] {});
	}

	/**
	 * 转换成String
	 * 
	 * @return
	 * @throws IOException
	 * @throws CoreException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public void buildTo(IFolder folder, String filePackName, String fileName, boolean changed) throws IOException, CoreException, SAXException, ParserConfigurationException
	{
		// 确保输出目录已存在
		if (filePackName == null)
		{
			filePackName = "";
		}
		String[] segments = filePackName.split("\\\\|/|\\.");
		for (String segment : segments)
		{
			if (!segment.isEmpty())
			{
				folder = folder.getFolder(segment);
				if (!folder.exists())
				{
					folder.create(true, true, null);
				}
			}
		}

		// 确定输出文件名
		int index = fileName.indexOf(".");
		if (index != -1)
		{
			fileName = fileName.substring(0, index);
		}
		fileName = fileName + ".cfg";

		// 输出
		writedFiles = new ArrayList<IFile>();
		IFile file = folder.getFile(fileName);
		if (changed || !file.exists())
		{
			// 转换成字节
			byte[] bytes = getBytes();

			bytes = compress(bytes);

			if (!file.exists())
			{
				file.create(new ByteArrayInputStream(bytes), true, null);
			}
			else
			{
				file.setContents(new ByteArrayInputStream(bytes), IFile.FORCE, null);
			}
			file.setDerived(true, null);
		}
		writedFiles.add(file);
	}

	/**
	 * 压缩
	 * 
	 * @param data
	 *            待压缩数据
	 * @return byte[] 压缩后的数据
	 */
	private byte[] compress(byte[] data)
	{
		byte[] output = new byte[0];

		Deflater compresser = new Deflater();

		compresser.reset();
		compresser.setInput(data);
		compresser.finish();
		ByteArrayOutputStream bos = new ByteArrayOutputStream(data.length);

		try
		{
			byte[] buf = new byte[1024];
			while (!compresser.finished())
			{
				int i = compresser.deflate(buf);
				bos.write(buf, 0, i);
			}
			output = bos.toByteArray();
		}
		catch (Exception e)
		{
			output = data;
			e.printStackTrace();
		}
		finally
		{
			try
			{
				bos.close();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		compresser.end();
		return output;
	}

	/**
	 * 解析实例
	 * 
	 * @param instance
	 */
	private void parseInstance(Instance instance)
	{
		for (InstanceField field : instance.getFields())
		{
			if (field.getValue() == null)
			{
				continue;
			}

			if (field.getDef().repeted)
			{
				@SuppressWarnings("rawtypes")
				ArrayList list = (ArrayList) field.getValue();
				for (Object value : list)
				{
					// 列表项计入引用数
					incrementRefCount(field.getDef(), value);

					// 所有主键计入引用数
					if ((value instanceof Instance) && field.getDef().indexKeys != null)
					{
						Instance valueInstance = (Instance) value;
						for (String key : field.getDef().indexKeys)
						{
							InstanceField keyField = valueInstance.findField(key);
							if (keyField != null)
							{
								incrementRefCount(keyField.getDef(), keyField.getValue());
							}
						}
					}

					// 递归
					if (field.getDef().isExtendType())
					{
						parseInstance((Instance) value);
					}
				}
			}
			else
			{
				// 值计入引用数
				incrementRefCount(field.getDef(), field.getValue());

				// 递归
				if (field.getDef().isExtendType())
				{
					parseInstance((Instance) field.getValue());
				}
			}
		}

		// 按引用次数排序ID
		for (String typeName : typeName_ids.keySet())
		{
			HashSet<Integer> ids = typeName_ids.get(typeName);
			Integer[] idArray = ids.toArray(new Integer[ids.size()]);
			Arrays.sort(idArray, new Comparator<Integer>()
			{
				@Override
				public int compare(Integer o1, Integer o2)
				{
					o1 = id_refCount.get(o1);
					o2 = id_refCount.get(o2);
					if (o1 > o2)
					{
						return -1;
					}
					else if (o1 < o2)
					{
						return 1;
					}
					return 0;
				}
			});

			for (int i = 0; i < idArray.length; i++)
			{
				int id = idArray[i];
				id_order.put(id, i + 1);
			}

			typeName_idArray.put(typeName, idArray);
		}
	}

	/**
	 * 递增值对象的引用计数
	 * 
	 * @param def
	 * @param value
	 */
	private void incrementRefCount(TypeFieldDef def, Object value)
	{
		int id = getID(def, value);
		if (id == 0)
		{
			return;
		}

		int count = 0;
		if (id_refCount.containsKey(id))
		{
			count = id_refCount.get(id);
		}
		count++;

		id_refCount.put(id, count);
		id_value.put(id, value);
		id_field.put(id, def);

		if (!typeName_ids.containsKey(def.type))
		{
			typeName_ids.put(def.type, new HashSet<Integer>());
		}
		typeName_ids.get(def.type).add(id);
	}

	// ------------------------------------------------------------------------------------------------------
	//
	// 获取ID
	//
	// ------------------------------------------------------------------------------------------------------

	/**
	 * 获取类型的ID
	 * 
	 * @param type
	 * @return
	 */
	private int getID(TypeDef type)
	{
		if (!def_id.containsKey(type))
		{
			def_id.put(type, nextID);
			nextID++;
		}
		return def_id.get(type);
	}

	/**
	 * 获取类型字段的ID
	 * 
	 * @param field
	 * @return
	 */
	private int getID(TypeFieldDef field)
	{
		if (!def_id.containsKey(field))
		{
			def_id.put(field, nextID);
			nextID++;
		}
		return def_id.get(field);
	}

	/**
	 * 查找ID
	 * 
	 * @param def
	 * @param value
	 * @return
	 */
	private int getID(TypeFieldDef def, Object value)
	{
		int id = 0;
		if (def != null && value != null)
		{
			if (def.isInt())
			{
				id = getID((Integer) value, false);
			}
			else if (def.isUint())
			{
				id = getID((Integer) value, true);
			}
			else if (def.isNumber())
			{
				id = getID((Float) value);
			}
			else if (def.isString())
			{
				id = getID((String) value);
			}
			else if (def.isBoolean())
			{
				id = getID((Boolean) value);
			}
			else if (def.isExtendType())
			{
				id = getID((Instance) value);
			}
		}
		return id;
	}

	/**
	 * 获取Int值的ID
	 * 
	 * @param value
	 * @return
	 */
	private int getID(Integer value, boolean sign)
	{
		if (value == 0)
		{
			return 0;
		}

		if (sign)
		{
			if (!uint_id.containsKey(value))
			{
				uint_id.put(value, nextID);
				nextID++;
			}
			return uint_id.get(value);
		}
		else
		{
			if (!int_id.containsKey(value))
			{
				int_id.put(value, nextID);
				nextID++;
			}
			return int_id.get(value);
		}
	}

	/**
	 * 获取Boolean值的ID
	 * 
	 * @param value
	 * @return
	 */
	private int getID(Boolean value)
	{
		if (value == false)
		{
			return 0;
		}
		if (!boolean_id.containsKey(value))
		{
			boolean_id.put(value, nextID);
			nextID++;
		}
		return boolean_id.get(value);
	}

	/**
	 * 获取Float值的ID
	 * 
	 * @param value
	 * @return
	 */
	private int getID(Float value)
	{
		if (Float.isNaN(value))
		{
			return 0;
		}
		if (!float_id.containsKey(value))
		{
			float_id.put(value, nextID);
			nextID++;
		}
		return float_id.get(value);
	}

	/**
	 * 获取String值的ID
	 * 
	 * @param value
	 * @return
	 */
	private int getID(String value)
	{
		if (value.isEmpty())
		{
			return 0;
		}
		if (!string_id.containsKey(value))
		{
			string_id.put(value, nextID);
			nextID++;
		}
		return string_id.get(value);
	}

	/**
	 * 获取Instance值的ID
	 * 
	 * @param instance
	 * @return
	 */
	private int getID(Instance instance)
	{
		String txt = hash(instance);
		if (!instance_id.containsKey(txt))
		{
			instance_id.put(txt, nextID);
			nextID++;
		}
		return instance_id.get(txt);
	}

	// ------------------------------------------------------------------------------------------------------
	//
	// 序号查找
	//
	// ------------------------------------------------------------------------------------------------------

	/**
	 * 查找序号
	 * 
	 * @param def
	 * @param value
	 * @return
	 */
	private int getOrder(TypeFieldDef def, Object value)
	{
		int id = getID(def, value);
		if (id != 0)
		{
			return id_order.get(id);
		}
		return 0;
	}

	// ------------------------------------------------------------------------------------------------------
	//
	// 计算实HASH码
	//
	// ------------------------------------------------------------------------------------------------------

	/**
	 * 获取实例的HASH表示
	 * 
	 * @param instance
	 * @return
	 */
	private String hash(Instance instance)
	{
		InstanceField[] fields = instance.getFields().toArray(new InstanceField[instance.getFields().size()]);
		Arrays.sort(fields, new Comparator<InstanceField>()
		{
			@Override
			public int compare(InstanceField o1, InstanceField o2)
			{
				return getID(o1.getDef()) - getID(o2.getDef());
			}
		});

		StringBuilder sb = new StringBuilder();
		sb.append("{");
		sb.append("$");
		sb.append(getID(instance.getType()));
		sb.append(":");
		for (InstanceField field : fields)
		{
			sb.append(hash(field));
		}
		sb.append("}");

		instance_txt.put(instance, sb.toString());

		return instance_txt.get(instance);
	}

	/**
	 * 获取实例字段的HASH表示
	 * 
	 * @param field
	 * @return
	 */
	private String hash(InstanceField field)
	{
		TypeFieldDef def = field.getDef();

		StringBuilder sb = new StringBuilder();
		sb.append("@");
		sb.append(getID(def));
		sb.append("=");

		if (def.isNativeType())
		{
			if (def.repeted)
			{
				sb.append("[");
				@SuppressWarnings("rawtypes")
				ArrayList list = (ArrayList) field.getValue();
				for (Object item : list)
				{
					sb.append(item);
					sb.append(",");
				}
				sb.append("]");
			}
			else
			{
				sb.append(field.getValue());
			}
		}
		else
		{
			if (def.repeted)
			{
				sb.append("[");
				@SuppressWarnings("rawtypes")
				ArrayList list = (ArrayList) field.getValue();
				for (Object item : list)
				{
					Instance instance = (Instance) item;
					sb.append(hash(instance));
					sb.append(",");
				}
				sb.append("]");
			}
			else
			{
				Instance instance = (Instance) field.getValue();
				sb.append(hash(instance));
			}
		}

		sb.append(";");

		return sb.toString();
	}

	// ------------------------------------------------------------------------------------------------------
	//
	// 保存
	//
	// ------------------------------------------------------------------------------------------------------

	/**
	 * 保存
	 * 
	 * @throws IOException
	 * @throws CoreException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	private byte[] getBytes() throws IOException, SAXException, ParserConfigurationException, CoreException
	{
		root = UnitInstanceBuilder.build(file.getContents(), types, type);

		parseInstance(root);

		// debugs
		System.out.println(toDebugString());

		ByteArrayOutputStream byteArrayOutput = new ByteArrayOutputStream();
		CfgOutputStream dataOutput = new CfgOutputStream(byteArrayOutput);

		String[] allTypeName = typeName_idArray.keySet().toArray(new String[typeName_idArray.size()]);
		Arrays.sort(allTypeName);

		dataOutput.writeVarInt(allTypeName.length);
		for (String typeName : allTypeName)
		{
			dataOutput.writeVarInt(classWriter.getTypeID(typeName));
			dataOutput.write(getBytes(typeName_idArray.get(typeName)));
		}
		dataOutput.writeVarInt(classWriter.getTypeID(root.getType().getName()));
		dataOutput.write(getBytes(root));

		return byteArrayOutput.toByteArray();
	}

	/**
	 * 获取字符串的字节数组
	 * 
	 * @param txt
	 * @return
	 * @throws IOException
	 */
	private byte[] getBytes(String txt) throws IOException
	{
		ByteArrayOutputStream byteArray = new ByteArrayOutputStream();
		CfgOutputStream output = new CfgOutputStream(byteArray);

		byte[] bytes = txt.getBytes("utf8");
		output.writeVarInt(bytes.length);
		output.write(bytes);

		return byteArray.toByteArray();
	}

	/**
	 * 获取对象列表的字节数组
	 * 
	 * @param list
	 * @return
	 * @throws IOException
	 */
	private byte[] getBytes(Integer[] list) throws IOException
	{
		int totalCount = list.length;
		int partLength = 100;

		ArrayList<byte[]> partBytes = new ArrayList<byte[]>();

		// 构建子部分
		int partCount = (int) Math.ceil((double) totalCount / partLength);
		for (int i = 0; i < partCount; i++)
		{
			ByteArrayOutputStream partByteArray = new ByteArrayOutputStream();
			CfgOutputStream partOutputStream = new CfgOutputStream(partByteArray);

			int left = i * partLength;
			int right = left + partLength;
			if (right > totalCount)
			{
				right = totalCount;
			}

			for (; left < right; left++)
			{
				TypeFieldDef field = id_field.get(list[left]);
				Object value = id_value.get(list[left]);

				if (field.isInt() || field.isUint())
				{
					partOutputStream.writeVarInt((Integer) value);
				}
				else if (field.isBoolean())
				{
					partOutputStream.writeVarInt((Boolean) value ? 1 : 0);
				}
				else if (field.isNumber())
				{
					partOutputStream.writeFloat((Float) value);
				}
				else if (field.isString())
				{
					partOutputStream.write(getBytes((String) value));
				}
				else if (field.isExtendType())
				{
					partOutputStream.write(getBytes((Instance) value));
				}
			}
			partOutputStream.flush();
			partBytes.add(partByteArray.toByteArray());
		}

		// 合并所有子部分
		ByteArrayOutputStream contentByteArray = new ByteArrayOutputStream();
		CfgOutputStream contentOutputStream = new CfgOutputStream(contentByteArray);
		contentOutputStream.writeVarInt(totalCount);
		contentOutputStream.writeVarInt(partLength);
		for (byte[] bytes : partBytes)
		{
			contentOutputStream.writeVarInt(bytes.length);
			contentOutputStream.write(bytes);
		}
		contentOutputStream.flush();

		// 返回
		return contentByteArray.toByteArray();
	}

	/**
	 * 获取实例对象的字节数组
	 * 
	 * @param instance
	 * @return
	 * @throws IOException
	 */
	private byte[] getBytes(Instance instance) throws IOException
	{
		ByteArrayOutputStream contentByteArray = new ByteArrayOutputStream();
		CfgOutputStream contentOutputStream = new CfgOutputStream(contentByteArray);

		for (TypeFieldDef fieldDef : instance.getType().fields)
		{
			InstanceField field = instance.findField(fieldDef.name);

			// 字段为空时，简单值输出空引用，列表值输出长度标记0
			if (field == null || field.getValue() == null)
			{
				contentOutputStream.writeVarInt(0);
				continue;
			}

			// 输出字段内容
			if (fieldDef.repeted && fieldDef.indexKeys != null)
			{
				@SuppressWarnings("rawtypes")
				ArrayList vals = (ArrayList) field.getValue();
				contentOutputStream.writeVarInt(vals.size());
				for (Object val : vals)
				{
					if (fieldDef.isExtendType())
					{
						Instance instanceVal = (Instance) val;
						for (String key : fieldDef.indexKeys)
						{
							InstanceField instanceField = instanceVal.findField(key);
							if (instanceField != null && instanceField.getValue() != null)
							{
								contentOutputStream.writeVarInt(getOrder(instanceField.getDef(), instanceField.getValue()));
							}
							else
							{
								contentOutputStream.writeVarInt(0);
							}
						}
					}
					contentOutputStream.writeVarInt(getOrder(fieldDef, val));
				}
			}
			else if (fieldDef.repeted)
			{
				@SuppressWarnings("rawtypes")
				ArrayList vals = (ArrayList) field.getValue();
				contentOutputStream.writeVarInt(vals.size());
				for (Object val : vals)
				{
					contentOutputStream.writeVarInt(getOrder(fieldDef, val));
				}
			}
			else
			{
				contentOutputStream.writeVarInt(getOrder(fieldDef, field.getValue()));
			}
		}

		return contentByteArray.toByteArray();
	}

	// -------------------------------------------------------------------------------------------------------
	//
	// debug函数
	//
	// -------------------------------------------------------------------------------------------------------

	/**
	 * 转换成debug字符串
	 */
	private String toDebugString()
	{
		StringBuilder sb = new StringBuilder();

		for (String typeName : typeName_idArray.keySet())
		{
			sb.append(typeName + ":");
			for (int id : typeName_idArray.get(typeName))
			{
				Object value = id_value.get(id);
				if (value instanceof Instance)
				{
					sb.append("{");
					Instance instance = (Instance) value;
					for (InstanceField field : instance.getFields())
					{
						sb.append(field.getDef().name);
						sb.append(":");
						sb.append(getOrder(field.getDef(), field.getValue()));
						sb.append(",");
					}
					sb.append("}");
				}
				else
				{
					sb.append(value);
				}
				sb.append(",");
			}
			sb.append("\n");
		}

		sb.append("{");
		for (InstanceField field : root.getFields())
		{
			sb.append(field.getDef().name);
			sb.append(":");
			TypeFieldDef def = field.getDef();
			if (def.repeted)
			{
				sb.append("[");
				if (field.getValue() != null)
				{
					@SuppressWarnings("rawtypes")
					ArrayList list = (ArrayList) field.getValue();
					for (Object item : list)
					{
						sb.append(getOrder(def, item));
						sb.append(",");
					}
				}
				sb.append("]");
			}
			else
			{
				sb.append(getOrder(def, field.getValue()));
			}
			sb.append(",");
		}
		sb.append("}");

		return sb.toString();
	}

	/**
	 * 配置输出流
	 * 
	 * @author ds
	 * 
	 */
	private static class CfgOutputStream extends DataOutputStream
	{
		public CfgOutputStream(OutputStream arg0)
		{
			super(arg0);
		}

		public void writeVarInt(int value) throws IOException
		{
			while (true)
			{
				if ((value & ~0x7F) == 0)
				{
					writeByte(value);
					return;
				}
				else
				{
					writeByte((value & 0x7F) | 0x80);
					value >>>= 7;
				}
			}
		}
	}
}
