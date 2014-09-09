package org.chw.game.builder;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

class CfgFileWriter
{
	private Instance root;

	private int nextID = 1;

	private HashMap<Object, Integer> def_id = new HashMap<Object, Integer>();
	private HashMap<Integer, Integer> int_id = new HashMap<Integer, Integer>();
	private HashMap<Float, Integer> float_id = new HashMap<Float, Integer>();
	private HashMap<String, Integer> string_id = new HashMap<String, Integer>();
	private HashMap<String, Integer> instance_id = new HashMap<String, Integer>();
	private HashMap<Instance, String> instance_txt = new HashMap<Instance, String>();

	private HashMap<Integer, Integer> id_refCount = new HashMap<Integer, Integer>();
	private HashMap<Integer, Object> id_value = new HashMap<Integer, Object>();
	private HashMap<Integer, Integer> id_order = new HashMap<Integer, Integer>();

	private HashMap<String, HashSet<Integer>> typeName_ids = new HashMap<String, HashSet<Integer>>();
	private HashMap<String, Integer[]> typeName_idArray = new HashMap<String, Integer[]>();

	/**
	 * ���캯��
	 * 
	 * @param instance
	 */
	public CfgFileWriter(Instance instance)
	{
		root = instance;
	}

	/**
	 * ת�����ֽ�����
	 * 
	 * @return
	 * @throws IOException
	 */
	public byte[] toByteArray() throws IOException
	{
		parseInstance(root);
		
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

		toDebugString();

		return getBytes();
	}

	/**
	 * ����ʵ��
	 * 
	 * @param instance
	 */
	private void parseInstance(Instance instance)
	{
		for (InstanceField field : instance.getFields())
		{
			if (field.getDef().repeted)
			{
				ArrayList list = (ArrayList) field.getValue();
				for (Object value : list)
				{
					incrementRefCount(field.getDef(), value);
					if (field.getDef().isExtendType())
					{
						parseInstance((Instance) value);
					}
				}
			}
			else
			{
				incrementRefCount(field.getDef(), field.getValue());
				if (field.getDef().isExtendType())
				{
					parseInstance((Instance) field.getValue());
				}
			}
		}
	}

	/**
	 * ����ֵ��������ü���
	 * 
	 * @param def
	 * @param value
	 */
	private void incrementRefCount(TypeFieldDef def, Object value)
	{
		int id = getID(def, value);
		int count = 0;
		if (id_refCount.containsKey(id))
		{
			count = id_refCount.get(id);
		}
		count++;
		id_refCount.put(id, count);
		id_value.put(id, value);

		if (!typeName_ids.containsKey(def.type))
		{
			typeName_ids.put(def.type, new HashSet<Integer>());
		}
		typeName_ids.get(def.type).add(id);
	}

	// ------------------------------------------------------------------------------------------------------
	//
	// ID����Ų��Һ���
	//
	// ------------------------------------------------------------------------------------------------------

	/**
	 * ����ID
	 * 
	 * @param def
	 * @param value
	 * @return
	 */
	private int getID(TypeFieldDef def, Object value)
	{
		int id = 0;
		if (value != null)
		{
			if (def.isInt() || def.isUint())
			{
				id = getID((Integer) value);
			}
			else if (def.isNumber())
			{
				id = getID((Float) value);
			}
			else if (def.isString())
			{
				id = getID((String) value);
			}
			else if (def.isExtendType())
			{
				id = getID((Instance) value);
			}
		}
		return id;
	}

	/**
	 * �������
	 * 
	 * @param def
	 * @param value
	 * @return
	 */
	private int getOrder(TypeFieldDef def, Object value)
	{
		if (def.isBoolean())
		{
			if (value != null)
			{
				return ((Boolean) value) ? 1 : 0;
			}
			return 0;
		}

		int id = getID(def, value);
		if (id != 0)
		{
			return id_order.get(id);
		}
		return 0;
	}

	// ------------------------------------------------------------------------------------------------------
	//
	// ��ȡ���͵�ID
	//
	// ------------------------------------------------------------------------------------------------------

	/**
	 * ��ȡ���͵�ID
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
	 * ��ȡ�����ֶε�ID
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

	// ------------------------------------------------------------------------------------------------------
	//
	// ��ȡֵ�����ID
	//
	// ------------------------------------------------------------------------------------------------------

	/**
	 * ��ȡIntֵ��ID
	 * 
	 * @param value
	 * @return
	 */
	private int getID(Integer value)
	{
		if (!int_id.containsKey(value))
		{
			int_id.put(value, nextID);
			nextID++;
		}
		return int_id.get(value);
	}

	/**
	 * ��ȡFloatֵ��ID
	 * 
	 * @param value
	 * @return
	 */
	private int getID(Float value)
	{
		if (!float_id.containsKey(value))
		{
			float_id.put(value, nextID);
			nextID++;
		}
		return float_id.get(value);
	}

	/**
	 * ��ȡStringֵ��ID
	 * 
	 * @param value
	 * @return
	 */
	private int getID(String value)
	{
		if (!string_id.containsKey(value))
		{
			string_id.put(value, nextID);
			nextID++;
		}
		return string_id.get(value);
	}

	/**
	 * ��ȡInstanceֵ��ID
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
	// ����ʵHASH��
	//
	// ------------------------------------------------------------------------------------------------------

	/**
	 * ��ȡʵ����HASH��ʾ
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
	 * ��ȡʵ���ֶε�HASH��ʾ
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
				sb.append(field.getValue().toString());
			}
		}
		else
		{
			if (def.repeted)
			{
				sb.append("[");
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
	// ����
	//
	// ------------------------------------------------------------------------------------------------------

	private void toDebugString()
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
						TypeFieldDef def = field.getDef();
						int valueID = 0;
						if (def.isExtendType())
						{
							valueID = getID((Instance) field.getValue());
						}
						else if (def.isInt() || def.isUint())
						{
							valueID = getID((Integer) field.getValue());
						}
						else if (def.isNumber())
						{
							valueID = getID((Float) field.getValue());
						}
						else if (def.isString())
						{
							valueID = getID((String) field.getValue());
						}
						sb.append(field.getDef().name);
						sb.append(":");
						sb.append(id_order.get(valueID));
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
				ArrayList list = (ArrayList) field.getValue();
				for (Object item : list)
				{
					sb.append(getOrder(def, item));
					sb.append(",");
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

		System.out.println(sb.toString());
	}

	/**
	 * ����
	 * 
	 * @throws IOException
	 */
	private byte[] getBytes() throws IOException
	{
		ByteArrayOutputStream byteArrayOutput = new ByteArrayOutputStream();
		DataOutputStream dataOutput = new DataOutputStream(byteArrayOutput);

		String[] allTypeName = typeName_idArray.keySet().toArray(new String[typeName_idArray.size()]);
		Arrays.sort(allTypeName);

		dataOutput.writeInt(allTypeName.length);
		for (String typeName : allTypeName)
		{
			// dataOutput.write(getBytes(typeName));
			dataOutput.write(getBytes(typeName_idArray.get(typeName)));
		}
		dataOutput.write(getBytes(root));

		return byteArrayOutput.toByteArray();
	}

	/**
	 * ��ȡ�ַ������ֽ�����
	 * 
	 * @param txt
	 * @return
	 * @throws IOException
	 */
	private byte[] getBytes(String txt) throws IOException
	{
		ByteArrayOutputStream byteArray = new ByteArrayOutputStream();
		DataOutputStream output = new DataOutputStream(byteArray);

		byte[] bytes = txt.getBytes("utf8");
		output.writeInt(bytes.length);
		output.write(bytes);

		return byteArray.toByteArray();
	}

	/**
	 * ��ȡ�����б���ֽ�����
	 * 
	 * @param list
	 * @return
	 * @throws IOException
	 */
	private byte[] getBytes(Integer[] list) throws IOException
	{
		int totalCount = list.length;
		int partLength = 10;

		ArrayList<byte[]> partBytes = new ArrayList<byte[]>();

		// �����Ӳ���
		int partCount = (int) Math.ceil((double) totalCount / partLength);
		for (int i = 0; i < partCount; i++)
		{
			ByteArrayOutputStream partByteArray = new ByteArrayOutputStream();
			DataOutputStream partOutputStream = new DataOutputStream(partByteArray);

			int left = i * partLength;
			int right = left + partLength;
			if (right > totalCount)
			{
				right = totalCount;
			}

			for (; left < right; left++)
			{
				Object value = id_value.get(list[left]);
				if (value instanceof Instance)
				{
					partOutputStream.write(getBytes((Instance) value));
				}
				else if (value instanceof String)
				{
					partOutputStream.write(getBytes((String) value));
				}
				else if (value instanceof Float)
				{
					partOutputStream.writeFloat((Float) value);
				}
				else if (value instanceof Integer)
				{
					partOutputStream.writeInt((Integer) value);
				}
			}
			partOutputStream.flush();
			partBytes.add(partByteArray.toByteArray());
		}

		// �ϲ������Ӳ���
		ByteArrayOutputStream contentByteArray = new ByteArrayOutputStream();
		DataOutputStream contentOutputStream = new DataOutputStream(contentByteArray);
		contentOutputStream.write(totalCount);
		contentOutputStream.write(partLength);
		for (byte[] bytes : partBytes)
		{
			contentOutputStream.write(bytes.length);
			contentOutputStream.write(bytes);
		}
		contentOutputStream.flush();

		// ��ӳ���ͷ���
		// byte[] content = contentByteArray.toByteArray();
		// ByteArrayOutputStream lastByteArray = new ByteArrayOutputStream();
		// DataOutputStream lastOutputStream = new
		// DataOutputStream(lastByteArray);
		// lastOutputStream.writeInt(content.length);
		// lastOutputStream.write(content);
		// lastOutputStream.flush();

		// ����
		// return lastByteArray.toByteArray();
		return contentByteArray.toByteArray();
	}

	/**
	 * ��ȡʵ��������ֽ�����
	 * 
	 * @param instance
	 * @return
	 * @throws IOException
	 */
	private byte[] getBytes(Instance instance) throws IOException
	{
		ByteArrayOutputStream contentByteArray = new ByteArrayOutputStream();
		DataOutputStream contentOutputStream = new DataOutputStream(contentByteArray);

		for (TypeFieldDef fieldDef : instance.getType().fields)
		{
			InstanceField field = instance.findField(fieldDef.name);

			// �ֶ�Ϊ��ʱ����ֵ��������ã��б�ֵ������ȱ��0
			if (field == null || field.getValue() == null)
			{
				contentOutputStream.write(0);
				continue;
			}

			// ����ֶ�����
			if (fieldDef.repeted && fieldDef.indexKeys != null)
			{
				ArrayList vals = (ArrayList) field.getValue();
				contentOutputStream.write(vals.size());
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
								contentOutputStream.writeInt(getOrder(instanceField.getDef(), instanceField.getValue()));
							}
							else
							{
								contentOutputStream.writeInt(0);
							}
						}
					}
					contentOutputStream.write(getOrder(fieldDef, val));
				}
			}
			else if (fieldDef.repeted)
			{
				ArrayList vals = (ArrayList) field.getValue();
				contentOutputStream.write(vals.size());
				for (Object val : vals)
				{
					contentOutputStream.write(getOrder(fieldDef, val));
				}
			}
			else
			{
				contentOutputStream.write(getOrder(fieldDef, field.getValue()));
			}
		}

		return contentByteArray.toByteArray();
	}
}