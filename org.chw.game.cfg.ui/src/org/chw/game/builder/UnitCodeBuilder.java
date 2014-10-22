package org.chw.game.builder;

import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;

public class UnitCodeBuilder
{
	private ClassTable classTable;
	private String corePack;
	private String currPack;

	private IFolder folder;

	private HashMap<String, String> listTypeNameTable = new HashMap<String, String>();
	private HashMap<String, HashMap<String[], String>> mapTypeNameTable = new HashMap<String, HashMap<String[], String>>();

	private ArrayList<IFile> writedFiles = new ArrayList<IFile>();

	public UnitCodeBuilder(ClassTable classTable, String corePack, String currPack)
	{
		this.classTable = classTable;
		this.corePack = corePack;
		this.currPack = currPack;
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
	 * 获取列表类型的名称
	 * 
	 * @param type
	 * @return
	 */
	private String getListTypeName(String type)
	{
		return listTypeNameTable.get(type);
	}

	/**
	 * 获取字典类型的名称
	 * 
	 * @param type
	 * @param keys
	 * @return
	 */
	private String getMapTypeName(String type, String[] keys)
	{
		return mapTypeNameTable.get(type).get(keys);
	}

	/**
	 * 构建到指定目录
	 * 
	 * @param folder
	 * @throws Exception
	 */
	public void buildTo(IFolder folder) throws CoreException, UnsupportedEncodingException
	{
		this.folder = folder;

		HashSet<String> nativeListType = new HashSet<String>();
		HashSet<Class> extendListType = new HashSet<Class>();
		HashSet<Enum> enumListType = new HashSet<Enum>();
		HashMap<String, HashSet<String[]>> indexListType = new HashMap<String, HashSet<String[]>>();

		// 计算需要列表类型和字典类型
		for (Class type : classTable.getAllClass())
		{
			for (int i = 0; i < type.fields.length; i++)
			{
				ClassField field = type.fields[i];
				if (field.repeted)
				{
					if (field.isExtendType())
					{
						if (field.hasIndex())
						{
							if (!indexListType.containsKey(field.type))
							{
								indexListType.put(field.type, new HashSet<String[]>());
							}
							indexListType.get(field.type).add(field.indexKeys);
						}
						else
						{
							extendListType.add(classTable.getClass(field.type));
						}
					}
					else if (field.isEnumType())
					{
						enumListType.add(classTable.getEnum(field.type));
					}
					else
					{
						nativeListType.add(field.type);
					}
				}
				else if (field.slice)
				{
					if (field.isEnumType())
					{
						enumListType.add(classTable.getEnum(field.type));
					}
					else if (field.isBaseType())
					{
						nativeListType.add(field.type);
					}
				}
			}
		}

		//
		writeConfigPoolClass();

		// 字节流类
		writeByteStreamClass();

		// 数据池类
		writeByteFileClass();

		// 基础列表类
		for (String type : nativeListType)
		{
			writeListType(type);
		}

		// 自定义列表类
		for (Class type : extendListType)
		{
			writeListType(type);
		}

		// 自定义枚举弄表
		for (Enum type : enumListType)
		{
			writeListType(type);
		}

		// 自定义字典类
		for (String type : indexListType.keySet())
		{
			String[][] keys = indexListType.get(type).toArray(new String[][] {});
			Arrays.sort(keys, new Comparator<String[]>()
			{
				public int compare(String[] o1, String[] o2)
				{
					if (o1.length != o2.length)
					{
						return o1.length - o2.length;
					}
					else
					{
						for (int i = 0; i < o1.length; i++)
						{
							int val = o1[i].compareTo(o2[i]);
							if (val != 0)
							{
								return val;
							}
						}
					}
					return 0;
				}
			});

			for (int i = 0; i < keys.length; i++)
			{
				writeMapType(classTable.getClass(type), i, keys[i]);
			}
		}

		// 自定义枚举
		for (Enum type : classTable.getAllEnum())
		{
			writeEnumClass(type);
		}

		// 自定义类
		for (Class type : classTable.getAllClass())
		{
			writeTypeClass(type);
		}

		// 入口类
		// writePoolType();
	}

	/**
	 * 输出字节流类
	 * 
	 * @throws UnsupportedEncodingException
	 * @throws CoreException
	 */
	private void writeConfigPoolClass() throws UnsupportedEncodingException, CoreException
	{
		StringBuilder sb = new StringBuilder();

		String typeName = "ConfigPool";

		sb.append(String.format("package %s\n", corePack));
		sb.append(String.format("{\n"));

		sb.append(String.format("\timport flash.utils.Dictionary;\n"));
		sb.append(String.format("\timport flash.utils.ByteArray;\n"));
		sb.append(String.format("\t\n"));

		sb.append(String.format("\tpublic class %s\n", typeName));
		sb.append(String.format("\t{\n"));

		// 私有变量
		sb.append(String.format("\t\tprivate static var byteStreamMap:Dictionary=new Dictionary();\n"));
		sb.append(String.format("\t\t\n"));

		sb.append(String.format("\t\t/**\n"));
		sb.append(String.format("\t\t * 获取文件\n"));
		sb.append(String.format("\t\t */\n"));
		sb.append(String.format("\t\tpublic static function getFile(name:String):ByteStream\n"));
		sb.append(String.format("\t\t{\n"));
		sb.append(String.format("\t\t\treturn byteStreamMap[name];\n"));
		sb.append(String.format("\t\t}\n"));
		sb.append(String.format("\t\t\n"));

		sb.append(String.format("\t\t/**\n"));
		sb.append(String.format("\t\t * 添加文件\n"));
		sb.append(String.format("\t\t */\n"));
		sb.append(String.format("\t\tpublic static function addFile(name:String,bytes:ByteArray):void\n"));
		sb.append(String.format("\t\t{\n"));
		sb.append(String.format("\t\t\tbyteStreamMap[name]=new ByteStream(bytes);\n"));
		sb.append(String.format("\t\t}\n"));
		sb.append(String.format("\t\t\n"));

		sb.append(String.format("\t}\n"));
		sb.append(String.format("}"));

		writeByteToFile(folder, corePack, typeName, sb.toString());
	}

	/**
	 * 输出字节流类
	 * 
	 * @throws UnsupportedEncodingException
	 * @throws CoreException
	 */
	private void writeByteStreamClass() throws UnsupportedEncodingException, CoreException
	{
		StringBuilder sb = new StringBuilder();

		String typeName = "ByteStream";

		sb.append(String.format("package %s\n", corePack));
		sb.append(String.format("{\n"));

		sb.append(String.format("\timport flash.utils.ByteArray;\n"));
		sb.append(String.format("\t\n"));

		sb.append(String.format("\tpublic class %s\n", typeName));
		sb.append(String.format("\t{\n"));

		// 私有变量
		sb.append(String.format("\t\tprivate var _bytes:ByteArray;\n"));
		sb.append(String.format("\t\t\n"));

		sb.append(String.format("\t\t/**\n"));
		sb.append(String.format("\t\t * 构造函数\n"));
		sb.append(String.format("\t\t */\n"));
		sb.append(String.format("\t\tpublic function %s(bytes:ByteArray)\n", typeName));
		sb.append(String.format("\t\t{\n"));
		sb.append(String.format("\t\t\t_bytes=bytes;\n"));
		sb.append(String.format("\t\t}\n"));
		sb.append(String.format("\t\t\n"));

		sb.append(String.format("\t\t/**\n"));
		sb.append(String.format("\t\t * 可读字节数\n"));
		sb.append(String.format("\t\t */\n"));
		sb.append(String.format("\t\tpublic function get bytesAvailable():uint\n"));
		sb.append(String.format("\t\t{\n"));
		sb.append(String.format("\t\t\treturn _bytes.bytesAvailable;\n"));
		sb.append(String.format("\t\t}\n"));
		sb.append(String.format("\t\t\n"));

		sb.append(String.format("\t\t/**\n"));
		sb.append(String.format("\t\t * 当前位置\n"));
		sb.append(String.format("\t\t */\n"));
		sb.append(String.format("\t\tpublic function get position():uint\n"));
		sb.append(String.format("\t\t{\n"));
		sb.append(String.format("\t\t\treturn _bytes.position;\n"));
		sb.append(String.format("\t\t}\n"));
		sb.append(String.format("\t\tpublic function set position(value:uint):void\n"));
		sb.append(String.format("\t\t{\n"));
		sb.append(String.format("\t\t\t_bytes.position=value;\n"));
		sb.append(String.format("\t\t}\n"));
		sb.append(String.format("\t\t\n"));

		sb.append(String.format("\t\t/**\n"));
		sb.append(String.format("\t\t * ZigZag32解码\n"));
		sb.append(String.format("\t\t * \n"));
		sb.append(String.format("\t\t */\n"));
		sb.append(String.format("\t\tprivate function decodeZigZag32(n:uint):int\n"));
		sb.append(String.format("\t\t{\n"));
		sb.append(String.format("\t\t\treturn (n>>>1) ^ -(n & 1);\n"));
		sb.append(String.format("\t\t}\n"));
		sb.append(String.format("\t\t\n"));

		sb.append(String.format("\t\t/**\n"));
		sb.append(String.format("\t\t * 读取INT\n"));
		sb.append(String.format("\t\t */\n"));
		sb.append(String.format("\t\tpublic function readInt():int\n"));
		sb.append(String.format("\t\t{\n"));
		sb.append(String.format("\t\t\tvar low:uint=0;\n"));
		sb.append(String.format("\t\t\t\n"));
		sb.append(String.format("\t\t\tvar byte:uint=0;\n"));
		sb.append(String.format("\t\t\t\n"));
		sb.append(String.format("\t\t\tvar i:int=0;\n"));
		sb.append(String.format("\t\t\tvar left:int=0;\n"));
		sb.append(String.format("\t\t\twhile(i<5 && _bytes.bytesAvailable>0)\n"));
		sb.append(String.format("\t\t\t{\n"));
		sb.append(String.format("\t\t\t\tbyte=_bytes.readUnsignedByte();\n"));
		sb.append(String.format("\t\t\t\tlow|=(byte&0x7F)<<left;\n"));
		sb.append(String.format("\t\t\t\tif(byte<0x80)\n"));
		sb.append(String.format("\t\t\t\t{\n"));
		sb.append(String.format("\t\t\t\t\treturn decodeZigZag32(low);\n"));
		sb.append(String.format("\t\t\t\t}\n"));
		sb.append(String.format("\t\t\t\t\n"));
		sb.append(String.format("\t\t\t\ti++;\n"));
		sb.append(String.format("\t\t\t\tleft+=7;\n"));
		sb.append(String.format("\t\t\t}\n"));
		sb.append(String.format("\t\t\t\n"));
		sb.append(String.format("\t\t\twhile(byte>=0x80 && _bytes.bytesAvailable>0)\n"));
		sb.append(String.format("\t\t\t{\n"));
		sb.append(String.format("\t\t\t\tbyte=_bytes.readUnsignedByte();\n"));
		sb.append(String.format("\t\t\t}\n"));
		sb.append(String.format("\t\t\t\n"));
		sb.append(String.format("\t\t\treturn decodeZigZag32(low);\n"));
		sb.append(String.format("\t\t}\n"));
		sb.append(String.format("\t\t\n"));

		sb.append(String.format("\t\t/**\n"));
		sb.append(String.format("\t\t * 读取Float\n"));
		sb.append(String.format("\t\t */\n"));
		sb.append(String.format("\t\tpublic function readFloat():Number\n"));
		sb.append(String.format("\t\t{\n"));
		sb.append(String.format("\t\t\treturn _bytes.readFloat();\n"));
		sb.append(String.format("\t\t}\n"));
		sb.append(String.format("\t\t\n"));

		sb.append(String.format("\t\t/**\n"));
		sb.append(String.format("\t\t * 读取UTF\n"));
		sb.append(String.format("\t\t */\n"));
		sb.append(String.format("\t\tpublic function readUTFBytes(length:int):String\n"));
		sb.append(String.format("\t\t{\n"));
		sb.append(String.format("\t\t\treturn _bytes.readUTFBytes(length);\n"));
		sb.append(String.format("\t\t}\n"));

		sb.append(String.format("\t}\n"));
		sb.append(String.format("}"));

		writeByteToFile(folder, corePack, typeName, sb.toString());
	}

	/**
	 * 输出数据池类
	 * 
	 * @param folder
	 * @throws UnsupportedEncodingException
	 * @throws CoreException
	 */
	private void writeByteFileClass() throws UnsupportedEncodingException, CoreException
	{
		StringBuilder sb = new StringBuilder();

		String typeName = "ByteFile";

		sb.append(String.format("package %s\n", corePack));
		sb.append(String.format("{\n"));

		sb.append(String.format("\timport flash.utils.Dictionary;\n"));
		sb.append(String.format("\t\n"));

		sb.append(String.format("\tpublic class %s\n", typeName));
		sb.append(String.format("\t{\n"));

		// 私有变量
		sb.append(String.format("\t\tprivate var _inited:Boolean=false;\n"));
		sb.append(String.format("\t\tprivate var _id2Index:Dictionary=new Dictionary();\n"));
		sb.append(String.format("\t\tprivate var _totalCounts:Vector.<int>=new Vector.<int>();\n"));
		sb.append(String.format("\t\tprivate var _pageSizes:Vector.<int>=new Vector.<int>();\n"));
		sb.append(String.format("\t\tprivate var _pageBeginLists:Vector.<Vector.<int>>=new Vector.<Vector.<int>>();\n"));
		sb.append(String.format("\t\tprivate var _pageEndLists:Vector.<Vector.<int>>=new Vector.<Vector.<int>>();\n"));
		sb.append(String.format("\t\tprivate var _pools:Dictionary=new Dictionary();\n"));
		sb.append(String.format("\t\tprivate var _root:Object;\n"));
		sb.append(String.format("\t\t\n"));

		sb.append(String.format("\t\t/**\n"));
		sb.append(String.format("\t\t * 获取原始字节流\n"));
		sb.append(String.format("\t\t */\n"));
		sb.append(String.format("\t\tprotected function getBytes():ByteStream\n"));
		sb.append(String.format("\t\t{\n"));
		sb.append(String.format("\t\t\treturn null;\n"));
		sb.append(String.format("\t\t}\n"));
		sb.append(String.format("\t\t\n"));

		sb.append(String.format("\t\t/**\n"));
		sb.append(String.format("\t\t * 初始化所有列表范围\n"));
		sb.append(String.format("\t\t */\n"));
		sb.append(String.format("\t\tprotected function initRange():void\n"));
		sb.append(String.format("\t\t{\n"));
		sb.append(String.format("\t\t\tif(_inited)\n"));
		sb.append(String.format("\t\t\t{\n"));
		sb.append(String.format("\t\t\t\treturn;\n"));
		sb.append(String.format("\t\t\t}\n"));
		sb.append(String.format("\t\t\t_inited=true;\n"));
		sb.append(String.format("\t\t\tvar bytes:ByteStream=getBytes();\n"));
		sb.append(String.format("\t\t\tif(bytes==null)\n"));
		sb.append(String.format("\t\t\t{\n"));
		sb.append(String.format("\t\t\t\treturn;\n"));
		sb.append(String.format("\t\t\t}\n"));
		sb.append(String.format("\t\t\t\n"));
		sb.append(String.format("\t\t\tbytes.position=0;\n"));
		sb.append(String.format("\t\t\t\n"));
		sb.append(String.format("\t\t\tvar partCount:int=bytes.readInt();\n"));
		sb.append(String.format("\t\t\tfor(var i:int=0;i<partCount;i++)\n"));
		sb.append(String.format("\t\t\t{\n"));
		sb.append(String.format("\t\t\t\tvar typeID:int=bytes.readInt();\n"));
		sb.append(String.format("\t\t\t\tvar totalCount:int=bytes.readInt();\n"));
		sb.append(String.format("\t\t\t\tvar pageSize:int=bytes.readInt();\n"));
		sb.append(String.format("\t\t\t\tvar pageCount:int=Math.ceil(totalCount/pageSize);\n"));
		sb.append(String.format("\t\t\t\tvar pageBegins:Vector.<int>=new Vector.<int>();\n"));
		sb.append(String.format("\t\t\t\tvar pageEnds:Vector.<int>=new Vector.<int>();\n"));
		sb.append(String.format("\t\t\t\t\n"));
		sb.append(String.format("\t\t\t\tfor(var j:int=0;j<pageCount;j++)\n"));
		sb.append(String.format("\t\t\t\t{\n"));
		sb.append(String.format("\t\t\t\t\tvar length:int=bytes.readInt();\n"));
		sb.append(String.format("\t\t\t\t\tvar pageBegin:int=bytes.position;\n"));
		sb.append(String.format("\t\t\t\t\tvar pageEnd:int=pageBegin+length;\n"));
		sb.append(String.format("\t\t\t\t\t\n"));
		sb.append(String.format("\t\t\t\t\tpageBegins.push(pageBegin);\n"));
		sb.append(String.format("\t\t\t\t\tpageEnds.push(pageEnd);\n"));
		sb.append(String.format("\t\t\t\t\t\n"));
		sb.append(String.format("\t\t\t\t\tbytes.position=pageEnd;\n"));
		sb.append(String.format("\t\t\t\t}\n"));
		sb.append(String.format("\t\t\t\t\n"));
		sb.append(String.format("\t\t\t\t_id2Index[typeID]=i;\n"));
		sb.append(String.format("\t\t\t\t_totalCounts.push(totalCount);\n"));
		sb.append(String.format("\t\t\t\t_pageSizes.push(pageSize);\n"));
		sb.append(String.format("\t\t\t\t_pageBeginLists.push(pageBegins);\n"));
		sb.append(String.format("\t\t\t\t_pageEndLists.push(pageEnds);\n"));
		sb.append(String.format("\t\t\t\t_pools[typeID]=new Dictionary();\n"));
		sb.append(String.format("\t\t\t}\n"));
		sb.append(String.format("\t\t\t\n"));
		sb.append(String.format("\t\t\t_root=readObject(bytes.readInt(),bytes);\n"));
		sb.append(String.format("\t\t}\n"));
		sb.append(String.format("\t\t\n"));

		sb.append(String.format("\t\t/**\n"));
		sb.append(String.format("\t\t * 查找数据\n"));
		sb.append(String.format("\t\t */\n"));
		sb.append(String.format("\t\tpublic function getValue(id:int,index:int):*\n"));
		sb.append(String.format("\t\t{\n"));
		sb.append(String.format("\t\t\tvar pool:Dictionary=_pools[id];\n"));
		sb.append(String.format("\t\t\tif(index>0 && pool!=null && pool[index]==null)\n"));
		sb.append(String.format("\t\t\t{\n"));
		sb.append(String.format("\t\t\t\tvar flagIndex:int=_id2Index[id];\n"));
		sb.append(String.format("\t\t\t\tvar totalCount:int=_totalCounts[flagIndex];\n"));
		sb.append(String.format("\t\t\t\tvar pageSize:int=_pageSizes[flagIndex];\n"));
		sb.append(String.format("\t\t\t\tvar pageBegins:Vector.<int>=_pageBeginLists[flagIndex];\n"));
		sb.append(String.format("\t\t\t\n"));
		sb.append(String.format("\t\t\t\tvar bytes:ByteStream=getBytes();\n"));
		sb.append(String.format("\t\t\t\tvar pageIndex:int=Math.floor((index-1)/pageSize);\n"));
		sb.append(String.format("\t\t\t\tvar from:int=pageIndex*pageSize;\n"));
		sb.append(String.format("\t\t\t\tvar to:int=Math.min(from+pageSize,totalCount);\n"));
		sb.append(String.format("\t\t\t\t\n"));
		sb.append(String.format("\t\t\t\tbytes.position=pageBegins[pageIndex];\n"));
		sb.append(String.format("\t\t\t\tfor(var i:int=from;i<to;i++)\n"));
		sb.append(String.format("\t\t\t\t{\n"));
		sb.append(String.format("\t\t\t\t\tswitch(id)\n"));
		sb.append(String.format("\t\t\t\t\t{\n"));
		sb.append(String.format("\t\t\t\t\t\tcase 1:\n"));
		sb.append(String.format("\t\t\t\t\t\t\t//int\n"));
		sb.append(String.format("\t\t\t\t\t\t\tpool[i+1]=bytes.readInt();\n"));
		sb.append(String.format("\t\t\t\t\t\t\tbreak;\n"));
		sb.append(String.format("\t\t\t\t\t\tcase 2:\n"));
		sb.append(String.format("\t\t\t\t\t\t\t//uint\n"));
		sb.append(String.format("\t\t\t\t\t\t\tpool[i+1]=bytes.readInt();\n"));
		sb.append(String.format("\t\t\t\t\t\t\tbreak;\n"));
		sb.append(String.format("\t\t\t\t\t\tcase 3:\n"));
		sb.append(String.format("\t\t\t\t\t\t\t//boolean\n"));
		sb.append(String.format("\t\t\t\t\t\t\tpool[i+1]=bytes.readInt()!=0;\n"));
		sb.append(String.format("\t\t\t\t\t\t\tbreak;\n"));
		sb.append(String.format("\t\t\t\t\t\tcase 4:\n"));
		sb.append(String.format("\t\t\t\t\t\t\t//number\n"));
		sb.append(String.format("\t\t\t\t\t\t\tpool[i+1]=bytes.readFloat();\n"));
		sb.append(String.format("\t\t\t\t\t\t\tbreak;\n"));
		sb.append(String.format("\t\t\t\t\t\tcase 5:\n"));
		sb.append(String.format("\t\t\t\t\t\t\t//string\n"));
		sb.append(String.format("\t\t\t\t\t\t\tpool[i+1]=bytes.readUTFBytes(bytes.readInt());\n"));
		sb.append(String.format("\t\t\t\t\t\t\tbreak;\n"));
		sb.append(String.format("\t\t\t\t\t\tdefault:\n"));
		sb.append(String.format("\t\t\t\t\t\t\t//datas\n"));
		sb.append(String.format("\t\t\t\t\t\t\tpool[i+1]=readObject(id,bytes);\n"));
		sb.append(String.format("\t\t\t\t\t\t\tbreak;\n"));
		sb.append(String.format("\t\t\t\t\t}\n"));
		sb.append(String.format("\t\t\t\t}\n"));
		sb.append(String.format("\t\t\t}\n"));
		sb.append(String.format("\t\t\t\n"));
		sb.append(String.format("\t\t\tif(pool!=null && pool[index]!=null)\n"));
		sb.append(String.format("\t\t\t{\n"));
		sb.append(String.format("\t\t\t\treturn pool[index];\n"));
		sb.append(String.format("\t\t\t}\n"));
		sb.append(String.format("\t\t\t\n"));
		sb.append(String.format("\t\t\tif(id==1 || id==2)\n"));
		sb.append(String.format("\t\t\t{\n"));
		sb.append(String.format("\t\t\t\treturn 0;\n"));
		sb.append(String.format("\t\t\t}\n"));
		sb.append(String.format("\t\t\telse if(id==3)\n"));
		sb.append(String.format("\t\t\t{\n"));
		sb.append(String.format("\t\t\t\treturn false;\n"));
		sb.append(String.format("\t\t\t}\n"));
		sb.append(String.format("\t\t\telse if(id==4)\n"));
		sb.append(String.format("\t\t\t{\n"));
		sb.append(String.format("\t\t\t\treturn Number.NaN;\n"));
		sb.append(String.format("\t\t\t}\n"));
		sb.append(String.format("\t\t\telse if(id==5)\n"));
		sb.append(String.format("\t\t\t{\n"));
		sb.append(String.format("\t\t\t\treturn \"\";\n"));
		sb.append(String.format("\t\t\t}\n"));
		sb.append(String.format("\t\t\t\n"));
		sb.append(String.format("\t\t\treturn null;\n"));
		sb.append(String.format("\t\t}\n"));
		sb.append(String.format("\t\t\n"));

		sb.append(String.format("\t\t/**\n"));
		sb.append(String.format("\t\t * 读取对象\n"));
		sb.append(String.format("\t\t */\n"));
		sb.append(String.format("\t\tprotected function readObject(typeID:int,bytes:ByteStream):*\n"));
		sb.append(String.format("\t\t{\n"));
		sb.append(String.format("\t\t\treturn null;\n"));
		sb.append(String.format("\t\t}\n"));
		sb.append(String.format("\t\t\n"));

		sb.append(String.format("\t\t/**\n"));
		sb.append(String.format("\t\t * 根节点对象\n"));
		sb.append(String.format("\t\t */\n"));
		sb.append(String.format("\t\tprotected function get root():*\n"));
		sb.append(String.format("\t\t{\n"));
		sb.append(String.format("\t\t\tif(!_inited)\n"));
		sb.append(String.format("\t\t\t{\n"));
		sb.append(String.format("\t\t\t\tinitRange();\n"));
		sb.append(String.format("\t\t\t}\n"));
		sb.append(String.format("\t\t\treturn _root;\n"));
		sb.append(String.format("\t\t}\n"));

		sb.append(String.format("\t}\n"));
		sb.append(String.format("}"));

		writeByteToFile(folder, corePack, typeName, sb.toString());
	}

	/**
	 * 输出原生列表类
	 * 
	 * @param folder
	 * @param type
	 * @throws CoreException
	 * @throws UnsupportedEncodingException
	 */
	private void writeListType(String type) throws CoreException, UnsupportedEncodingException
	{
		StringBuilder sb = new StringBuilder();

		String typeName = type.substring(0, 1).toUpperCase() + type.substring(1) + "List";

		sb.append(String.format("package %s\n", corePack));
		sb.append(String.format("{\n"));

		sb.append(String.format("\tpublic class %s\n", typeName));
		sb.append(String.format("\t{\n"));

		sb.append(String.format("\t\tprivate var _pool:ByteFile;\n"));
		sb.append(String.format("\t\tprivate var _indexList:Vector.<int>;\n"));
		sb.append(String.format("\t\t\n"));

		sb.append(String.format("\t\t/**\n"));
		sb.append(String.format("\t\t * 构造函数\n"));
		sb.append(String.format("\t\t */\n"));
		sb.append(String.format("\t\tpublic function %s(pool:ByteFile,indexList:Vector.<int>)\n", typeName));
		sb.append(String.format("\t\t{\n"));
		sb.append(String.format("\t\t\t_pool=pool;\n"));
		sb.append(String.format("\t\t\t_indexList=indexList;\n"));
		sb.append(String.format("\t\t}\n"));
		sb.append(String.format("\t\t\n"));

		sb.append(String.format("\t\t/**\n"));
		sb.append(String.format("\t\t * 列表长度\n"));
		sb.append(String.format("\t\t */\n"));
		sb.append(String.format("\t\tpublic function get length():int\n"));
		sb.append(String.format("\t\t{\n"));
		sb.append(String.format("\t\t\treturn _indexList.length;\n"));
		sb.append(String.format("\t\t}\n"));
		sb.append(String.format("\t\t\n"));

		sb.append(String.format("\t\t/**\n"));
		sb.append(String.format("\t\t * 按索引获取\n"));
		sb.append(String.format("\t\t */\n"));
		sb.append(String.format("\t\tpublic function getAt(index:int):%s\n", type));
		sb.append(String.format("\t\t{\n"));
		sb.append(String.format("\t\t\treturn _pool.getValue(%s,_indexList[index]);\n", classTable.getClassID(type)));
		sb.append(String.format("\t\t}\n"));

		sb.append(String.format("\t\t/**\n"));
		sb.append(String.format("\t\t * 转换成Vector\n"));
		sb.append(String.format("\t\t */\n"));
		sb.append(String.format("\t\tpublic function toVector():Vector.<%s>\n", type));
		sb.append(String.format("\t\t{\n"));
		sb.append(String.format("\t\t\tvar list:Vector.<%s>=new Vector.<%s>()\n", type, type));
		sb.append(String.format("\t\t\tfor(var i:int=0;i<length;i++)\n"));
		sb.append(String.format("\t\t\t{\n"));
		sb.append(String.format("\t\t\t\tlist.push(getAt(i));\n"));
		sb.append(String.format("\t\t\t}\n"));
		sb.append(String.format("\t\t\treturn list;\n"));
		sb.append(String.format("\t\t}\n"));

		sb.append(String.format("\t\t/**\n"));
		sb.append(String.format("\t\t * 查找\n"));
		sb.append(String.format("\t\t */\n"));
		sb.append(String.format("\t\tpublic function indexOf(value:%s):int\n", type));
		sb.append(String.format("\t\t{\n"));
		sb.append(String.format("\t\t\tfor(var i:int=0;i<length;i++)\n"));
		sb.append(String.format("\t\t\t{\n"));
		sb.append(String.format("\t\t\t\tif(getAt(i)==value)\n"));
		sb.append(String.format("\t\t\t\t{\n"));
		sb.append(String.format("\t\t\t\t\treturn i;\n"));
		sb.append(String.format("\t\t\t\t}\n"));
		sb.append(String.format("\t\t\t}\n"));
		sb.append(String.format("\t\t\treturn -1;\n"));
		sb.append(String.format("\t\t}\n"));

		sb.append(String.format("\t}\n"));

		sb.append(String.format("}\n"));

		writeByteToFile(folder, corePack, typeName, sb.toString());

		// 记录List类型
		listTypeNameTable.put(type, typeName);
	}

	/**
	 * 输出自定义列表类
	 * 
	 * @param folder
	 * @param typeName
	 * @throws CoreException
	 * @throws UnsupportedEncodingException
	 */
	private void writeListType(Class type) throws CoreException, UnsupportedEncodingException
	{
		StringBuilder sb = new StringBuilder();

		String typeName = type.name + "List";

		sb.append(String.format("package %s\n", currPack));
		sb.append(String.format("{\n"));

		sb.append(corePack.isEmpty() == false ? String.format("\timport %s.*;\n", corePack) : "");
		sb.append(String.format("\t\n"));

		sb.append(String.format("\tpublic class %s\n", typeName));
		sb.append(String.format("\t{\n"));

		sb.append(String.format("\t\tprivate var _pool:ByteFile;\n"));
		sb.append(String.format("\t\tprivate var _indexList:Vector.<int>;\n"));
		sb.append(String.format("\t\t\n"));

		sb.append(String.format("\t\t/**\n"));
		sb.append(String.format("\t\t * 构造函数\n"));
		sb.append(String.format("\t\t */\n"));
		sb.append(String.format("\t\tpublic function %s(pool:ByteFile,indexList:Vector.<int>)\n", typeName));
		sb.append(String.format("\t\t{\n"));
		sb.append(String.format("\t\t\t_pool=pool;\n"));
		sb.append(String.format("\t\t\t_indexList=indexList;\n"));
		sb.append(String.format("\t\t}\n"));
		sb.append(String.format("\t\t\n"));

		sb.append(String.format("\t\t/**\n"));
		sb.append(String.format("\t\t * 列表长度\n"));
		sb.append(String.format("\t\t */\n"));
		sb.append(String.format("\t\tpublic function get length():int\n"));
		sb.append(String.format("\t\t{\n"));
		sb.append(String.format("\t\t\treturn _indexList.length;\n"));
		sb.append(String.format("\t\t}\n"));
		sb.append(String.format("\t\t\n"));

		sb.append(String.format("\t\t/**\n"));
		sb.append(String.format("\t\t * 按索引获取\n"));
		sb.append(String.format("\t\t */\n"));
		sb.append(String.format("\t\tpublic function getAt(index:int):%s\n", type.name));
		sb.append(String.format("\t\t{\n"));
		sb.append(String.format("\t\t\treturn _pool.getValue(%s,_indexList[index]);\n", classTable.getClassID(type.name)));
		sb.append(String.format("\t\t}\n"));

		sb.append(String.format("\t}\n"));

		sb.append(String.format("}\n"));

		writeByteToFile(folder, currPack, typeName, sb.toString());

		// 记录List类型
		listTypeNameTable.put(type.name, typeName);
	}

	/**
	 * 输出自定义枚举列表类
	 * 
	 * @param folder
	 * @param type
	 * @throws CoreException
	 * @throws UnsupportedEncodingException
	 */
	private void writeListType(Enum type) throws CoreException, UnsupportedEncodingException
	{
		StringBuilder sb = new StringBuilder();

		String typeName = type.name + "List";

		sb.append(String.format("package %s\n", currPack));
		sb.append(String.format("{\n"));

		sb.append(String.format("\tpublic class %s\n", typeName));
		sb.append(String.format("\t{\n"));

		sb.append(String.format("\t\tprivate var _indexList:Vector.<int>;\n"));
		sb.append(String.format("\t\t\n"));

		sb.append(String.format("\t\t/**\n"));
		sb.append(String.format("\t\t * 构造函数\n"));
		sb.append(String.format("\t\t */\n"));
		sb.append(String.format("\t\tpublic function %s(indexList:Vector.<int>)\n", typeName));
		sb.append(String.format("\t\t{\n"));
		sb.append(String.format("\t\t\t_indexList=indexList;\n"));
		sb.append(String.format("\t\t}\n"));
		sb.append(String.format("\t\t\n"));

		sb.append(String.format("\t\t/**\n"));
		sb.append(String.format("\t\t * 列表长度\n"));
		sb.append(String.format("\t\t */\n"));
		sb.append(String.format("\t\tpublic function get length():int\n"));
		sb.append(String.format("\t\t{\n"));
		sb.append(String.format("\t\t\treturn _indexList.length;\n"));
		sb.append(String.format("\t\t}\n"));
		sb.append(String.format("\t\t\n"));

		sb.append(String.format("\t\t/**\n"));
		sb.append(String.format("\t\t * 按索引获取\n"));
		sb.append(String.format("\t\t */\n"));
		sb.append(String.format("\t\tpublic function getAt(index:int):%s\n", type.name));
		sb.append(String.format("\t\t{\n"));
		sb.append(String.format("\t\t\treturn %s.get%s(_indexList[index]);\n", type.name, type.name));
		sb.append(String.format("\t\t}\n"));

		sb.append(String.format("\t}\n"));

		sb.append(String.format("}\n"));

		writeByteToFile(folder, currPack, typeName, sb.toString());

		// 记录List类型
		listTypeNameTable.put(type.name, typeName);
	}

	/**
	 * 输出自定义字典类
	 * 
	 * @param folder
	 * @param type
	 * @throws CoreException
	 * @throws UnsupportedEncodingException
	 */
	private void writeMapType(Class type, int index, String[] keys) throws CoreException, UnsupportedEncodingException
	{
		StringBuilder classComment = new StringBuilder();
		for (String key : keys)
		{
			if (classComment.length() > 0)
			{
				classComment.append(",");
			}
			classComment.append(key);
		}

		StringBuilder sb = new StringBuilder();

		String typeName = type.name + "Map" + (index > 0 ? index : "");

		sb.append(String.format("package %s\n", currPack));
		sb.append(String.format("{\n"));

		sb.append(corePack.isEmpty() == false ? String.format("\timport %s.*;\n", corePack) : "");
		sb.append(String.format("\timport flash.utils.Dictionary;\n"));
		sb.append(String.format("\t\n"));

		sb.append(String.format("\t/**\n"));
		sb.append(String.format("\t * 主键("));
		for (int i = 0; i < keys.length; i++)
		{
			sb.append(i > 0 ? "," : "");
			sb.append(keys[i]);
		}
		sb.append(String.format(")\n"));
		sb.append(String.format("\t */\n"));
		sb.append(String.format("\tpublic class %s\n", typeName));
		sb.append(String.format("\t{\n"));

		sb.append(String.format("\t\tprivate var _pool:ByteFile;\n"));
		sb.append(String.format("\t\tprivate var _indexList:Vector.<int>=new Vector.<int>();\n"));
		sb.append(String.format("\t\tprivate var _table:Dictionary=new Dictionary();\n", type.name));
		sb.append(String.format("\t\t\n"));

		sb.append(String.format("\t\t/**\n"));
		sb.append(String.format("\t\t * 构造函数\n"));
		sb.append(String.format("\t\t */\n"));
		sb.append(String.format("\t\tpublic function %s(pool:ByteFile,count:int,values:Vector.<int>)\n", typeName));
		sb.append(String.format("\t\t{\n"));
		sb.append(String.format("\t\t\t_pool=pool;\n"));
		sb.append(String.format("\t\t\t\n"));
		sb.append(String.format("\t\t\tvar partSize:int=values.length/count;\n"));
		sb.append(String.format("\t\t\tfor(var i:int=0;i<count;i++)\n"));
		sb.append(String.format("\t\t\t{\n"));
		sb.append(String.format("\t\t\t\tvar begin:int=i*partSize;\n"));
		sb.append(String.format("\t\t\t\t\n"));
		sb.append(String.format("\t\t\t\tvar dic:Dictionary=_table;\n"));
		sb.append(String.format("\t\t\t\t\n"));
		for (int i = 0; i < keys.length; i++)
		{
			String fieldName = keys[i];
			String fieldType = type.getField(fieldName).type;
			sb.append(String.format("\t\t\t\t//主键：%s\n", fieldName));
			if (i < keys.length - 1)
			{
				sb.append(String.format("\t\t\t\tvar key_%s:%s=_pool.getValue(%s,values[begin+%s]);\n", (i + 1), fieldType, classTable.getClassID(fieldType), i));
				sb.append(String.format("\t\t\t\tif(dic[key_%s]==null)\n", (i + 1)));
				sb.append(String.format("\t\t\t\t{\n"));
				sb.append(String.format("\t\t\t\t\tdic[key_%s]=new Dictionary();\n", (i + 1)));
				sb.append(String.format("\t\t\t\t}\n"));
				sb.append(String.format("\t\t\t\tdic=dic[key_%s];\n", (i + 1)));
				sb.append(String.format("\t\t\t\t\n"));
			}
			else
			{
				sb.append(String.format("\t\t\t\tvar key_%s:%s=_pool.getValue(%s,values[begin+%s]);\n", (i + 1), fieldType, classTable.getClassID(fieldType), i));
				sb.append(String.format("\t\t\t\tdic[key_%s]=values[begin+%s];\n", i + 1, i + 1));
				sb.append(String.format("\t\t\t\t\n"));
				sb.append(String.format("\t\t\t\t//值列表\n"));
				sb.append(String.format("\t\t\t\t_indexList.push(values[begin+%s]);\n", i + 1));
			}
		}
		sb.append(String.format("\t\t\t}\n"));
		sb.append(String.format("\t\t}\n"));
		sb.append(String.format("\t\t\n"));

		sb.append(String.format("\t\t/**\n"));
		sb.append(String.format("\t\t * 列表长度\n"));
		sb.append(String.format("\t\t */\n"));
		sb.append(String.format("\t\tpublic function get length():int\n"));
		sb.append(String.format("\t\t{\n"));
		sb.append(String.format("\t\t\treturn _indexList.length;\n"));
		sb.append(String.format("\t\t}\n"));
		sb.append(String.format("\t\t\n"));

		sb.append(String.format("\t\t/**\n"));
		sb.append(String.format("\t\t * 按索引获取\n"));
		sb.append(String.format("\t\t */\n"));
		sb.append(String.format("\t\tpublic function getAt(index:int):%s\n", type.name));
		sb.append(String.format("\t\t{\n"));
		sb.append(String.format("\t\t\treturn _pool.getValue(%s,_indexList[index]);\n", classTable.getClassID(type.name)));
		sb.append(String.format("\t\t}\n"));
		sb.append(String.format("\t\t\n"));

		sb.append(String.format("\t\t/**\n"));
		sb.append(String.format("\t\t * 按主键获取\n"));
		sb.append(String.format("\t\t */\n"));
		sb.append(String.format("\t\tpublic function getBy("));
		for (int i = 0; i < keys.length; i++)
		{
			sb.append(i > 0 ? "," : "");
			sb.append(keys[i] + ":" + type.getField(keys[i]).type);
		}
		sb.append(String.format("):%s\n", type.name));
		sb.append(String.format("\t\t{\n"));
		StringBuilder depths = new StringBuilder();
		for (int i = 0; i < keys.length; i++)
		{
			depths.append("[" + keys[i] + "]");
			sb.append(String.format("\t\t\tif(!_table%s)\n", depths));
			sb.append(String.format("\t\t\t{\n"));
			sb.append(String.format("\t\t\t\treturn null;\n"));
			sb.append(String.format("\t\t\t}\n"));
		}
		sb.append(String.format("\t\t\treturn _pool.getValue(%s,_table%s);\n", classTable.getClassID(type.name), depths));
		sb.append(String.format("\t\t}\n"));

		sb.append(String.format("\t}\n"));

		sb.append(String.format("}\n"));

		writeByteToFile(folder, currPack, typeName, sb.toString());

		// 记录Map类型的名称
		if (!mapTypeNameTable.containsKey(type.name))
		{
			mapTypeNameTable.put(type.name, new HashMap<String[], String>());
		}
		mapTypeNameTable.get(type.name).put(keys, typeName);
	}

	/**
	 * 输出自定义枚举
	 * 
	 * @param type
	 * @throws UnsupportedEncodingException
	 * @throws CoreException
	 */
	private void writeEnumClass(Enum type) throws UnsupportedEncodingException, CoreException
	{
		String normalFieldName = "__unknow__";
		for (EnumField field : type.fields)
		{
			if (field.normal)
			{
				normalFieldName = field.name;
				break;
			}
		}

		StringBuilder sb = new StringBuilder();

		sb.append(String.format("package %s\n", currPack));
		sb.append(String.format("{\n"));

		if (type.comment != null)
		{
			sb.append(String.format("%s", formatComment(type.comment, "\t")));
		}
		sb.append(String.format("\tpublic class %s\n", type.name));
		sb.append(String.format("\t{\n"));

		for (int i = 0; i < type.fields.length; i++)
		{
			EnumField field = type.fields[i];
			sb.append(String.format("\t\tprivate static const %sLiteral:String = \"%s\";\n", field.name, field.value));
		}
		sb.append(String.format("\t\t\n"));

		// 静态成员
		sb.append(String.format("\t\tprivate static const __unknow__:%s = new %s(0);\n", type.name, type.name));
		sb.append(String.format("\t\t\n"));
		for (int i = 0; i < type.fields.length; i++)
		{
			EnumField field = type.fields[i];
			if (field.comment != null)
			{
				sb.append(String.format("%s", formatComment(field.comment, "\t\t")));
			}
			sb.append(String.format("\t\tpublic static const %s:%s = new %s(%s);\n", field.name, type.name, type.name, field.order));
			sb.append(String.format("\t\t\n"));
		}
		sb.append(String.format("\t\t\n"));

		//
		sb.append(String.format("\t\t/**\n"));
		sb.append(String.format("\t\t * 查找枚举\n"));
		sb.append(String.format("\t\t */\n"));
		sb.append(String.format("\t\tpublic static function get%s(id:int):%s\n", type.name, type.name));
		sb.append(String.format("\t\t{\n"));
		sb.append(String.format("\t\t\tswitch(id)\n"));
		sb.append(String.format("\t\t\t{\n"));
		for (int i = 0; i < type.fields.length; i++)
		{
			EnumField field = type.fields[i];
			sb.append(String.format("\t\t\t\tcase %s : return %s;break;\n", field.order, field.name));
		}
		sb.append(String.format("\t\t\t}\n"));
		sb.append(String.format("\t\t\treturn %s;\n", normalFieldName));
		sb.append(String.format("\t\t}\n"));
		sb.append(String.format("\t\t\n"));
		sb.append(String.format("\t\t\n"));

		//
		sb.append(String.format("\t\t/**\n"));
		sb.append(String.format("\t\t * 创建枚举\n"));
		sb.append(String.format("\t\t */\n"));
		sb.append(String.format("\t\tpublic static function new%s(value:String):%s\n", type.name, type.name));
		sb.append(String.format("\t\t{\n"));
		sb.append(String.format("\t\t\tswitch(value)\n"));
		sb.append(String.format("\t\t\t{\n"));
		for (int i = 0; i < type.fields.length; i++)
		{
			EnumField field = type.fields[i];
			sb.append(String.format("\t\t\t\tcase %sLiteral : return %s;break;\n", field.name, field.name));
		}
		sb.append(String.format("\t\t\t}\n"));
		sb.append(String.format("\t\t\treturn %s;\n", normalFieldName));
		sb.append(String.format("\t\t}\n"));
		sb.append(String.format("\t\t\n"));
		sb.append(String.format("\t\t\n"));

		// 私有变量
		sb.append(String.format("\t\tprivate var _id:int;\n"));
		sb.append(String.format("\t\t\n"));

		// 构造函数
		sb.append(String.format("\t\t/**\n"));
		sb.append(String.format("\t\t * 构造函数\n"));
		sb.append(String.format("\t\t */\n"));
		sb.append(String.format("\t\tpublic function %s(id:int)\n", type.name));
		sb.append(String.format("\t\t{\n"));
		sb.append(String.format("\t\t\t_id=id;\n"));
		sb.append(String.format("\t\t}\n"));
		sb.append(String.format("\t\t\n"));

		sb.append(String.format("\t\t/**\n"));
		sb.append(String.format("\t\t * 序号\n"));
		sb.append(String.format("\t\t */\n"));
		sb.append(String.format("\t\tpublic function get id():int\n"));
		sb.append(String.format("\t\t{\n"));
		sb.append(String.format("\t\t\treturn _id;\n"));
		sb.append(String.format("\t\t}\n"));
		sb.append(String.format("\t\t\n"));

		sb.append(String.format("\t\t/**\n"));
		sb.append(String.format("\t\t * 值\n"));
		sb.append(String.format("\t\t */\n"));
		sb.append(String.format("\t\tpublic function get value():String\n"));
		sb.append(String.format("\t\t{\n"));
		sb.append(String.format("\t\t\tswitch(id)\n"));
		sb.append(String.format("\t\t\t{\n"));
		for (int i = 0; i < type.fields.length; i++)
		{
			EnumField field = type.fields[i];
			sb.append(String.format("\t\t\t\tcase %s : return %sLiteral;break;\n", field.order, field.name));
		}
		sb.append(String.format("\t\t\t}\n"));
		sb.append(String.format("\t\t\treturn null;\n"));
		sb.append(String.format("\t\t}\n"));
		sb.append(String.format("\t\t\n"));

		// 字段列表
		for (int i = 0; i < type.fields.length; i++)
		{
			EnumField field = type.fields[i];

			if (field.comment != null)
			{
				sb.append(String.format("%s", formatComment(field.comment, "\t\t")));
			}
			sb.append(String.format("\t\tpublic function is%s():Boolean\n", field.name.substring(0, 1).toUpperCase() + field.name.substring(1)));
			sb.append(String.format("\t\t{\n"));
			sb.append(String.format("\t\t\treturn _id==%s;\n", field.order));
			sb.append(String.format("\t\t}\n"));
			sb.append(String.format("\t\t\n"));
		}

		sb.append(String.format("\t}\n"));
		sb.append(String.format("}"));

		writeByteToFile(folder, currPack, type.name, sb.toString());
	}

	/**
	 * 输出自定义类
	 * 
	 * @param classTable
	 * @param type
	 * @throws UnsupportedEncodingException
	 * @throws CoreException
	 */
	private void writeTypeClass(Class type) throws UnsupportedEncodingException, CoreException
	{
		boolean isMain = type == classTable.getMainClass();

		StringBuilder sb = new StringBuilder();

		sb.append(String.format("package %s\n", currPack));
		sb.append(String.format("{\n"));

		sb.append(corePack.isEmpty() == false ? String.format("\timport %s.*;\n", corePack) : "");
		sb.append(String.format("\t\n"));

		if (type.comment != null)
		{
			sb.append(String.format("%s", formatComment(type.comment, "\t")));
		}
		sb.append(String.format("\tpublic class %s %s\n", type.name, isMain ? "extends ByteFile" : ""));
		sb.append(String.format("\t{\n"));

		// 私有变量
		sb.append(String.format("\t\tprivate var __pool__:ByteFile;\n"));
		sb.append(String.format("\t\t\n"));
		for (ClassField field : type.fields)
		{
			if (field.repeted && field.hasIndex() && field.isExtendType())
			{
				sb.append(String.format("\t\tprivate var _%sKind:%s;\n", field.name, getFieldAsTypeName(field)));
			}
			else if (field.repeted && !field.isEnumType())
			{
				sb.append(String.format("\t\tprivate var _%sKind:%s;\n", field.name, getFieldAsTypeName(field)));
			}
			else if ((field.repeted || field.slice) && field.isEnumType())
			{
				sb.append(String.format("\t\tprivate var _%sKind:%s;\n", field.name, getFieldAsTypeName(field)));
			}
			else if (field.slice && field.isBaseType())
			{
				sb.append(String.format("\t\tprivate var _%sKind:%s;\n", field.name, getFieldAsTypeName(field)));
			}
			else
			{
				sb.append(String.format("\t\tprivate var _%sKind:int;\n", field.name));
			}
		}
		sb.append(String.format("\t\t\n"));

		// 构造函数
		sb.append(String.format("\t\t/**\n"));
		sb.append(String.format("\t\t * 构造函数\n"));
		sb.append(String.format("\t\t */\n"));
		if (isMain)
		{
			sb.append(String.format("\t\tpublic function %s(bytes:ByteStream=null,pool:ByteFile=null)\n", type.name));
			sb.append(String.format("\t\t{\n"));
			sb.append(String.format("\t\t\tif(bytes==null)\n"));
			sb.append(String.format("\t\t\t{\n"));
			sb.append(String.format("\t\t\t\tbytes=getBytes();\n"));
			sb.append(String.format("\t\t\t\t__pool__=this;\n"));
			sb.append(String.format("\t\t\t\treturn;\n"));
			sb.append(String.format("\t\t\t}\n"));
			sb.append(String.format("\t\t\t\n"));
		}
		else
		{
			sb.append(String.format("\t\tpublic function %s(bytes:ByteStream,pool:ByteFile)\n", type.name));
			sb.append(String.format("\t\t{\n"));
		}
		sb.append(String.format("\t\t\t__pool__=pool;\n"));
		sb.append(String.format("\t\t\t\n"));
		sb.append(String.format("\t\t\tvar pos:int=bytes.position;\n"));
		for (ClassField field : type.fields)
		{
			sb.append(String.format("\t\t\t\n"));
			sb.append(String.format("\t\t\t//%s\n", field.name));
			if (field.repeted && field.hasIndex() && field.isExtendType())
			{
				sb.append(String.format("\t\t\tvar %s_list:Vector.<int>=new Vector.<int>();\n", field.name));
				sb.append(String.format("\t\t\tvar %s_length:int=bytes.readInt();\n", field.name));
				sb.append(String.format("\t\t\tfor(var %s_i:int=0;%s_i<%s_length;%s_i++)\n", field.name, field.name, field.name, field.name));
				sb.append(String.format("\t\t\t{\n"));
				for (int i = 0; i < field.indexKeys.length + 1; i++)
				{
					sb.append(String.format("\t\t\t\t%s_list.push(bytes.readInt());\n", field.name));
				}
				sb.append(String.format("\t\t\t}\n"));
				sb.append(String.format("\t\t\tpos=bytes.position;\n"));
				sb.append(String.format("\t\t\t_%sKind=new %s(pool,%s_length,%s_list);\n", field.name, getFieldAsTypeName(field), field.name, field.name));
				sb.append(String.format("\t\t\tbytes.position=pos;\n"));
			}
			else if (field.repeted && !field.isEnumType())
			{
				sb.append(String.format("\t\t\tvar %s_list:Vector.<int>=new Vector.<int>();\n", field.name));
				sb.append(String.format("\t\t\tvar %s_length:int=bytes.readInt();\n", field.name));
				sb.append(String.format("\t\t\tfor(var %s_i:int=0;%s_i<%s_length;%s_i++)\n", field.name, field.name, field.name, field.name));
				sb.append(String.format("\t\t\t{\n"));
				sb.append(String.format("\t\t\t\t%s_list.push(bytes.readInt());\n", field.name));
				sb.append(String.format("\t\t\t}\n"));
				sb.append(String.format("\t\t\tpos=bytes.position;\n"));
				sb.append(String.format("\t\t\t_%sKind=new %s(pool,%s_list);\n", field.name, getFieldAsTypeName(field), field.name));
				sb.append(String.format("\t\t\tbytes.position=pos;\n"));
			}
			else if ((field.repeted || field.slice) && field.isEnumType())
			{
				sb.append(String.format("\t\t\tvar %s_list:Vector.<int>=new Vector.<int>();\n", field.name));
				sb.append(String.format("\t\t\tvar %s_length:int=bytes.readInt();\n", field.name));
				sb.append(String.format("\t\t\tfor(var %s_i:int=0;%s_i<%s_length;%s_i++)\n", field.name, field.name, field.name, field.name));
				sb.append(String.format("\t\t\t{\n"));
				sb.append(String.format("\t\t\t\t%s_list.push(bytes.readInt());\n", field.name));
				sb.append(String.format("\t\t\t}\n"));
				sb.append(String.format("\t\t\tpos=bytes.position;\n"));
				sb.append(String.format("\t\t\t_%sKind=new %s(%s_list);\n", field.name, getFieldAsTypeName(field), field.name));
				sb.append(String.format("\t\t\tbytes.position=pos;\n"));
			}
			else if (field.slice && field.isBaseType())
			{
				sb.append(String.format("\t\t\tvar %s_list:Vector.<int>=new Vector.<int>();\n", field.name));
				sb.append(String.format("\t\t\tvar %s_length:int=bytes.readInt();\n", field.name));
				sb.append(String.format("\t\t\tfor(var %s_i:int=0;%s_i<%s_length;%s_i++)\n", field.name, field.name, field.name, field.name));
				sb.append(String.format("\t\t\t{\n"));
				sb.append(String.format("\t\t\t\t%s_list.push(bytes.readInt());\n", field.name));
				sb.append(String.format("\t\t\t}\n"));
				sb.append(String.format("\t\t\tpos=bytes.position;\n"));
				sb.append(String.format("\t\t\t_%sKind=new %s(pool,%s_list);\n", field.name, getFieldAsTypeName(field), field.name));
				sb.append(String.format("\t\t\tbytes.position=pos;\n"));
			}
			else
			{
				sb.append(String.format("\t\t\t_%sKind=bytes.readInt();\n", field.name));
			}
		}
		sb.append(String.format("\t\t}\n"));
		sb.append(String.format("\t\t\n"));

		//
		if (isMain)
		{
			String fileName = "";
			String filePath = classTable.getInputURL();
			if (filePath != null)
			{
				String[] parts = filePath.split("\\\\|/");
				fileName = parts[parts.length - 1];
			}

			sb.append(String.format("\t\t/**\n"));
			sb.append(String.format("\t\t * 获取原始字节流\n"));
			sb.append(String.format("\t\t */\n"));
			sb.append(String.format("\t\tprotected override function getBytes():ByteStream\n"));
			sb.append(String.format("\t\t{\n"));
			sb.append(String.format("\t\t\treturn ConfigPool.getFile(\"%s\");\n", fileName));
			sb.append(String.format("\t\t}\n"));
			sb.append(String.format("\t\t\n"));

			sb.append(String.format("\t\t/**\n"));
			sb.append(String.format("\t\t * 读取对象\n"));
			sb.append(String.format("\t\t */\n"));
			sb.append(String.format("\t\tprotected override function readObject(typeID:int,bytes:ByteStream):*\n"));
			sb.append(String.format("\t\t{\n"));
			sb.append(String.format("\t\t\tswitch(typeID)\n"));
			sb.append(String.format("\t\t\t{\n"));
			for (Class curr : classTable.getAllClass())
			{
				sb.append(String.format("\t\t\t\tcase %s:\n", classTable.getClassID(curr.name)));
				sb.append(String.format("\t\t\t\t\treturn new %s(bytes,this);\n", curr.name));
				sb.append(String.format("\t\t\t\t\tbreak;\n"));
			}
			sb.append(String.format("\t\t\t}\n"));
			sb.append(String.format("\t\t\treturn null;\n"));
			sb.append(String.format("\t\t}\n"));
			sb.append(String.format("\t\t\n"));

			sb.append(String.format("\t\tprivate static var _instance:%s;\n", type.name));
			sb.append(String.format("\t\t\n"));

			sb.append(String.format("\t\t/**\n"));
			sb.append(String.format("\t\t * 获取单例\n"));
			sb.append(String.format("\t\t */\n"));
			sb.append(String.format("\t\tprivate static function get instance():%s\n", classTable.getMainClass().name));
			sb.append(String.format("\t\t{\n"));
			sb.append(String.format("\t\t\tif(!_instance)\n"));
			sb.append(String.format("\t\t\t{\n"));
			sb.append(String.format("\t\t\t\t_instance=new %s(null,null);\n", type.name));
			sb.append(String.format("\t\t\t}\n"));
			sb.append(String.format("\t\t\treturn _instance.root;\n"));
			sb.append(String.format("\t\t}\n"));
			sb.append(String.format("\t\t\n"));
		}

		// 字段列表
		for (ClassField field : type.fields)
		{
			if (field.comment != null)
			{
				sb.append(String.format("%s", formatComment(field.comment, "\t\t")));
			}

			sb.append(String.format("\t\tpublic %s function get %s():%s\n", isMain ? "static" : "", field.name, getFieldAsTypeName(field)));
			sb.append(String.format("\t\t{\n"));
			String fieldName = String.format("%s_%sKind", isMain ? "instance." : "", field.name);
			if (field.repeted && field.hasIndex() && field.isExtendType())
			{
				sb.append(String.format("\t\t\treturn %s;\n", fieldName));
			}
			else if (field.repeted && !field.isEnumType())
			{
				sb.append(String.format("\t\t\treturn %s;\n", fieldName));
			}
			else if ((field.repeted || field.slice) && field.isEnumType())
			{
				sb.append(String.format("\t\t\treturn %s;\n", fieldName));
			}
			else if (field.slice && field.isBaseType())
			{
				sb.append(String.format("\t\t\treturn %s;\n", fieldName));
			}
			else if (field.isEnumType())
			{
				sb.append(String.format("\t\t\treturn %s.get%s(%s);\n", field.type, field.type, fieldName));
			}
			else
			{
				sb.append(String.format("\t\t\treturn %s__pool__.getValue(%s,%s);\n", isMain ? "instance." : "", classTable.getClassID(field.type), fieldName));
			}
			sb.append(String.format("\t\t}\n"));
			sb.append(String.format("\t\t\n"));
		}

		sb.append(String.format("\t}\n"));
		sb.append(String.format("}"));

		writeByteToFile(folder, currPack, type.name, sb.toString());
	}

	/**
	 * 输出入口类
	 * 
	 * @throws CoreException
	 * @throws UnsupportedEncodingException
	 */
	private void writePoolType() throws UnsupportedEncodingException, CoreException
	{
		String filePath = classTable.getInputURL();
		if (filePath == null)
		{
			return;
		}

		String[] parts = filePath.split("\\\\|/");

		String fileName = parts[parts.length - 1];

		String typeName = fileName.replaceAll("\\.", "_");

		StringBuilder sb = new StringBuilder();

		sb.append(String.format("package %s\n", currPack));
		sb.append(String.format("{\n"));

		sb.append(corePack.isEmpty() == false ? String.format("\timport %s.*;\n", corePack) : "");
		sb.append(String.format("\t\n"));

		sb.append(String.format("\tpublic class %s extends ByteFile\n", typeName));
		sb.append(String.format("\t{\n"));

		sb.append(String.format("\t\t/**\n"));
		sb.append(String.format("\t\t * 获取原始字节流\n"));
		sb.append(String.format("\t\t */\n"));
		sb.append(String.format("\t\tprotected override function getBytes():ByteStream\n"));
		sb.append(String.format("\t\t{\n"));
		sb.append(String.format("\t\t\treturn ConfigPool.getFile(\"%s\");\n", fileName));
		sb.append(String.format("\t\t}\n"));
		sb.append(String.format("\t\t\n"));

		sb.append(String.format("\t\t/**\n"));
		sb.append(String.format("\t\t * 读取对象\n"));
		sb.append(String.format("\t\t */\n"));
		sb.append(String.format("\t\tprotected override function readObject(typeID:int,bytes:ByteStream):*\n"));
		sb.append(String.format("\t\t{\n"));
		sb.append(String.format("\t\t\tswitch(typeID)\n"));
		sb.append(String.format("\t\t\t{\n"));
		for (Class curr : classTable.getAllClass())
		{
			sb.append(String.format("\t\t\t\tcase %s:\n", classTable.getClassID(curr.name)));
			sb.append(String.format("\t\t\t\t\treturn new %s(bytes,this);\n", curr.name));
			sb.append(String.format("\t\t\t\t\tbreak;\n"));
		}
		sb.append(String.format("\t\t\t}\n"));
		sb.append(String.format("\t\t\treturn null;\n"));
		sb.append(String.format("\t\t}\n"));
		sb.append(String.format("\t\t\n"));

		sb.append(String.format("\t\tprivate static var _instance:%s;\n", typeName));
		sb.append(String.format("\t\t\n"));

		sb.append(String.format("\t\t/**\n"));
		sb.append(String.format("\t\t * 获取单例\n"));
		sb.append(String.format("\t\t */\n"));
		sb.append(String.format("\t\tprivate static function get instance():%s\n", classTable.getMainClass().name));
		sb.append(String.format("\t\t{\n"));
		sb.append(String.format("\t\t\tif(!_instance)\n", fileName));
		sb.append(String.format("\t\t\t{\n"));
		sb.append(String.format("\t\t\t\t_instance=new %s();\n", typeName));
		sb.append(String.format("\t\t\t}\n"));
		sb.append(String.format("\t\t\treturn _instance.root;\n", fileName));
		sb.append(String.format("\t\t}\n"));
		sb.append(String.format("\t\t\n"));

		for (ClassField field : classTable.getMainClass().fields)
		{
			if (field.comment != null)
			{
				sb.append(String.format("%s", formatComment(field.comment, "\t\t")));
			}
			sb.append(String.format("\t\tpublic static function get %s():%s\n", field.name, getFieldAsTypeName(field)));
			sb.append(String.format("\t\t{\n"));
			sb.append(String.format("\t\t\treturn instance.%s;\n", field.name));
			sb.append(String.format("\t\t}\n"));
			sb.append(String.format("\t\t\n"));
		}

		sb.append(String.format("\t}\n"));
		sb.append(String.format("}"));

		writeByteToFile(folder, currPack, typeName, sb.toString());
	}

	/**
	 * 写入文本文件
	 * 
	 * @param folder
	 * @param packName
	 * @param typeName
	 * @param content
	 * @throws CoreException
	 * @throws UnsupportedEncodingException
	 */
	private void writeByteToFile(IFolder folder, String packName, String typeName, String content) throws CoreException, UnsupportedEncodingException
	{
		IFile file = null;

		String[] segments = packName.split("\\.");
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

		file = folder.getFile(typeName + ".as");
		byte[] bytes = content.getBytes("utf8");
		if (!file.exists())
		{
			file.create(new ByteArrayInputStream(bytes), true, null);
		}
		else
		{
			file.setContents(new ByteArrayInputStream(bytes), IFile.FORCE, null);
		}

		file.setDerived(true, null);

		writedFiles.add(file);
	}

	/**
	 * 获取字段的AS类名
	 * 
	 * @param field
	 * @return
	 */
	private String getFieldAsTypeName(ClassField field)
	{
		if (field.repeted)
		{
			if (field.isExtendType())
			{
				if (!field.hasIndex())
				{
					return getListTypeName(field.type);
				}
				else
				{
					return getMapTypeName(field.type, field.indexKeys);
				}
			}
			else if (field.isEnumType())
			{
				return getListTypeName(field.type);
			}
			else
			{
				return getListTypeName(field.type);
			}
		}

		if (field.slice)
		{
			if (field.isBaseType() || field.isEnumType())
			{
				return getListTypeName(field.type);
			}
		}

		return field.type;
	}

	/**
	 * 格式化注释内容
	 * 
	 * @param comment
	 * @return
	 */
	private String formatComment(String comment, String prefix)
	{
		comment = comment.trim();

		StringBuilder sb = new StringBuilder();
		sb.append(prefix + "/**\n");

		if (comment.charAt(0) == '/' && comment.charAt(1) == '*')
		{
			comment = comment.substring(2, comment.length() - 2);

			String[] lines = comment.split("\\r\\n|\\n\\r|\\n|\\r");
			for (String line : lines)
			{
				line = line.trim().replaceFirst("\\*+", "").trim();
				if (!line.isEmpty())
				{
					sb.append(prefix + " * " + line + "\n");
				}
			}
		}
		else if (comment.charAt(0) == '/' && comment.charAt(1) == '/')
		{
			String[] lines = comment.split("\\r\\n|\\n");
			for (String line : lines)
			{
				line = line.trim().replaceFirst("//", "");
				if (!line.isEmpty())
				{
					sb.append(prefix + " * " + line + "\n");
				}
			}
		}

		sb.append(prefix + " */\n");
		return sb.toString();
	}
}
