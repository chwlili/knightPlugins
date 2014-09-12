package org.chw.game.builder;

import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;

public class AsFileWriter
{
	private IFolder folder;
	private TypeDef[] types;

	private String currPack;
	private String corePack;

	private HashMap<String, Integer> typeIDMap;

	private HashMap<String, String> listTypeNameTable = new HashMap<String, String>();
	private HashMap<String, HashMap<String[], String>> mapTypeNameTable = new HashMap<String, HashMap<String[], String>>();

	/**
	 * 构造函数
	 * 
	 * @param folder
	 * @param topPackName
	 * @param types
	 */
	public AsFileWriter(IFolder folder, String topPackName, String corePackName, String codePackName, TypeDef[] types)
	{
		this.folder = folder;
		this.types = types;

		if (topPackName == null)
		{
			topPackName = "";
		}
		if (corePackName == null)
		{
			corePackName = "";
		}
		if (codePackName == null)
		{
			codePackName = "";
		}

		if (!topPackName.isEmpty() && !corePackName.isEmpty())
		{
			corePackName = topPackName + "." + corePackName;
		}
		else if (corePackName.isEmpty())
		{
			corePackName = topPackName;
		}

		if (!topPackName.isEmpty() && !codePackName.isEmpty())
		{
			codePackName = topPackName + "." + codePackName;
		}
		else if (codePackName.isEmpty())
		{
			codePackName = topPackName;
		}

		if (types.length > 0)
		{
			String typePackName = types[0].getPackName();
			if (typePackName == null)
			{
				typePackName = "";
			}

			if (!codePackName.isEmpty() && !typePackName.isEmpty())
			{
				codePackName = codePackName + "." + typePackName;
			}
			else if (codePackName.isEmpty())
			{
				codePackName = typePackName;
			}
		}

		this.corePack = corePackName;
		this.currPack = codePackName;
	}

	public int getTypeID(String type)
	{
		return typeIDMap.get(type);
	}

	public String getListTypeName(String type)
	{
		return listTypeNameTable.get(type);
	}

	public String getMapTypeName(String type, String[] keys)
	{
		return mapTypeNameTable.get(type).get(keys);
	}

	// 输出所有类型
	public void writeAllType() throws UnsupportedEncodingException, CoreException
	{
		HashMap<String, TypeDef> name2Type = new HashMap<String, TypeDef>();

		HashSet<String> listType1 = new HashSet<String>();
		HashSet<TypeDef> listTypes2 = new HashSet<TypeDef>();

		HashSet<String> mapType1 = new HashSet<String>();
		HashMap<String, HashSet<String[]>> mapType2 = new HashMap<String, HashSet<String[]>>();

		typeIDMap = new HashMap<String, Integer>();
		typeIDMap.put("int", 1);
		typeIDMap.put("uint", 2);
		typeIDMap.put("Boolean", 3);
		typeIDMap.put("Number", 4);
		typeIDMap.put("String", 5);

		for (int i = 0; i < types.length; i++)
		{
			typeIDMap.put(types[i].getName(), i + 10);
		}

		for (TypeDef type : types)
		{
			name2Type.put(type.getName(), type);
		}

		for (TypeDef type : types)
		{
			for (int i = 0; i < type.getFieldLength(); i++)
			{
				TypeFieldDef field = type.getFieldAt(i);
				if (field.repeted)
				{
					if (field.isExtendType())
					{
						if (field.indexKeys != null)
						{
							if (!mapType2.containsKey(field.type))
							{
								mapType2.put(field.type, new HashSet<String[]>());
							}
							mapType2.get(field.type).add(field.indexKeys);
						}
						else
						{
							listTypes2.add(name2Type.get(field.type));
						}
					}
					else
					{
						if (field.indexKeys != null)
						{
							mapType1.add(field.type);
						}
						else
						{
							listType1.add(field.type);
						}
					}
				}
			}
		}

		// 字节流类、数据池类
		writeByteStreamClass();
		writeDataPoolClass();

		// 所有列表类型
		for (String type : listType1)
		{
			writeListType(type);
		}
		for (TypeDef type : listTypes2)
		{
			writeListType(type);
		}

		// 所有字典类型
		for (String type : mapType2.keySet())
		{
			String[][] keys = mapType2.get(type).toArray(new String[][] {});
			Arrays.sort(keys, new Comparator<String[]>()
			{
				@Override
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
				writeMapType(name2Type.get(type), i, keys[i]);
			}
		}

		// 输出所有类
		for (TypeDef type : types)
		{
			writeTypeClass(type);
		}

		// 输出所有的入口类型
		for (TypeDef type : types)
		{
			if (type.getFilePath() != null && type.getFilePath().isEmpty() == false)
			{
				writePoolType(type);
			}
		}
	}

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
		sb.append(String.format("\t\t * 当前位置\n"));
		sb.append(String.format("\t\t */\n"));
		sb.append(String.format("\t\tpublic function get position():uint\n", typeName));
		sb.append(String.format("\t\t{\n"));
		sb.append(String.format("\t\t\treturn _bytes.position;\n"));
		sb.append(String.format("\t\t}\n"));
		sb.append(String.format("\t\tpublic function set position(value:uint):void\n", typeName));
		sb.append(String.format("\t\t{\n"));
		sb.append(String.format("\t\t\t_bytes.position=value;\n"));
		sb.append(String.format("\t\t}\n"));
		sb.append(String.format("\t\t\n"));

		sb.append(String.format("\t\t/**\n"));
		sb.append(String.format("\t\t * 读取INT\n"));
		sb.append(String.format("\t\t */\n"));
		sb.append(String.format("\t\tpublic function readInt():int\n", typeName));
		sb.append(String.format("\t\t{\n"));
		sb.append(String.format("\t\t\treturn _bytes.readInt();\n"));
		sb.append(String.format("\t\t}\n"));
		sb.append(String.format("\t\t\n"));

		sb.append(String.format("\t\t/**\n"));
		sb.append(String.format("\t\t * 读取Float\n"));
		sb.append(String.format("\t\t */\n"));
		sb.append(String.format("\t\tpublic function readFloat():Number\n", typeName));
		sb.append(String.format("\t\t{\n"));
		sb.append(String.format("\t\t\treturn _bytes.readFloat();\n"));
		sb.append(String.format("\t\t}\n"));
		sb.append(String.format("\t\t\n"));

		sb.append(String.format("\t\t/**\n"));
		sb.append(String.format("\t\t * 读取UTF\n"));
		sb.append(String.format("\t\t */\n"));
		sb.append(String.format("\t\tpublic function readUTFBytes(length:int):String\n", typeName));
		sb.append(String.format("\t\t{\n"));
		sb.append(String.format("\t\t\treturn _bytes.readUTFBytes(length);\n"));
		sb.append(String.format("\t\t}\n"));

		sb.append(String.format("\t}\n"));
		sb.append(String.format("}"));

		writeByteToFile(folder, corePack, typeName, sb.toString());
	}

	/**
	 * 输出核心类文件
	 * 
	 * @param folder
	 * @param packName
	 * @throws UnsupportedEncodingException
	 * @throws CoreException
	 */
	private void writeDataPoolClass() throws UnsupportedEncodingException, CoreException
	{
		StringBuilder sb = new StringBuilder();

		String typeName = "DataPool";

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

		// 私有变量
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
		sb.append(String.format("\t\t\tif(pool!=null && pool[index]==null)\n"));
		sb.append(String.format("\t\t\t{\n"));
		sb.append(String.format("\t\t\t\tvar flagIndex:int=_id2Index[id];\n"));
		sb.append(String.format("\t\t\t\tvar totalCount:int=_totalCounts[flagIndex];\n"));
		sb.append(String.format("\t\t\t\tvar pageSize:int=_pageSizes[flagIndex];\n"));
		sb.append(String.format("\t\t\t\tvar pageBegins:Vector.<int>=_pageBeginLists[flagIndex];\n"));
		sb.append(String.format("\t\t\t\n"));
		sb.append(String.format("\t\t\t\tvar bytes:ByteStream=getBytes();\n"));
		sb.append(String.format("\t\t\t\tvar pageIndex:int=Math.floor(index/pageSize);\n"));
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
		sb.append(String.format("\t\t\treturn _root;\n"));
		sb.append(String.format("\t\t}\n"));

		sb.append(String.format("\t}\n"));
		sb.append(String.format("}"));

		writeByteToFile(folder, corePack, typeName, sb.toString());
	}

	/**
	 * 输出原生列表类型
	 * 
	 * @param folder
	 * @param packName
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

		sb.append(String.format("\t\tprivate var _pool:DataPool;\n"));
		sb.append(String.format("\t\tprivate var _indexList:Vector.<int>;\n"));
		sb.append(String.format("\t\t\n"));

		sb.append(String.format("\t\t/**\n"));
		sb.append(String.format("\t\t * 构造函数\n"));
		sb.append(String.format("\t\t */\n"));
		sb.append(String.format("\t\tpublic function %s(pool:DataPool,indexList:Vector.<int>)\n", typeName));
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
		sb.append(String.format("\t\t\treturn _pool.getValue(%s,_indexList[index]);\n", typeIDMap.get(type)));
		sb.append(String.format("\t\t}\n"));

		sb.append(String.format("\t}\n"));

		sb.append(String.format("}\n"));

		writeByteToFile(folder, corePack, typeName, sb.toString());

		// 记录List类型
		listTypeNameTable.put(type, typeName);
	}

	/**
	 * 输出自定义列表类型
	 * 
	 * @param folder
	 * @param packName
	 * @param typeName
	 * @throws CoreException
	 * @throws UnsupportedEncodingException
	 */
	private void writeListType(TypeDef type) throws CoreException, UnsupportedEncodingException
	{
		StringBuilder sb = new StringBuilder();

		String typeName = type.getName() + "List";

		sb.append(String.format("package %s\n", currPack));
		sb.append(String.format("{\n"));

		sb.append(String.format("\timport %s.*;\n", corePack));
		sb.append(String.format("\t\n"));

		sb.append(String.format("\tinternal class %s\n", typeName));
		sb.append(String.format("\t{\n"));

		sb.append(String.format("\t\tprivate var _pool:DataPool;\n"));
		sb.append(String.format("\t\tprivate var _indexList:Vector.<int>;\n"));
		sb.append(String.format("\t\t\n"));

		sb.append(String.format("\t\t/**\n"));
		sb.append(String.format("\t\t * 构造函数\n"));
		sb.append(String.format("\t\t */\n"));
		sb.append(String.format("\t\tpublic function %s(pool:DataPool,indexList:Vector.<int>)\n", typeName));
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
		sb.append(String.format("\t\tpublic function getAt(index:int):%s\n", type.getName()));
		sb.append(String.format("\t\t{\n"));
		sb.append(String.format("\t\t\treturn _pool.getValue(%s,_indexList[index]);\n", typeIDMap.get(type.getName())));
		sb.append(String.format("\t\t}\n"));

		sb.append(String.format("\t}\n"));

		sb.append(String.format("}\n"));

		writeByteToFile(folder, currPack, typeName, sb.toString());

		// 记录List类型
		listTypeNameTable.put(type.getName(), typeName);
	}

	/**
	 * 输出字典类型
	 * 
	 * @param folder
	 * @param packName
	 * @param type
	 * @throws CoreException
	 * @throws UnsupportedEncodingException
	 */
	private void writeMapType(TypeDef type, int index, String[] keys) throws CoreException, UnsupportedEncodingException
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

		String typeName = type.getName() + "Map" + (index > 0 ? index : "");

		sb.append(String.format("package %s\n", currPack));
		sb.append(String.format("{\n"));

		sb.append(String.format("\timport %s.*;\n", corePack));
		sb.append(String.format("\timport flash.utils.Dictionary;\n", corePack));
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
		sb.append(String.format("\tinternal class %s\n", typeName));
		sb.append(String.format("\t{\n"));

		sb.append(String.format("\t\tprivate var _pool:DataPool;\n"));
		sb.append(String.format("\t\tprivate var _indexList:Vector.<int>=new Vector.<int>();\n"));
		sb.append(String.format("\t\tprivate var _table:Dictionary=new Dictionary();\n", type.getName()));
		sb.append(String.format("\t\t\n"));

		sb.append(String.format("\t\t/**\n"));
		sb.append(String.format("\t\t * 构造函数\n"));
		sb.append(String.format("\t\t */\n"));
		sb.append(String.format("\t\tpublic function %s(pool:DataPool,count:int,values:Vector.<int>)\n", typeName));
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
			String fieldType = type.getFieldBy(fieldName).type;
			sb.append(String.format("\t\t\t\t//主键：%s\n", fieldName));
			if (i < keys.length - 1)
			{
				sb.append(String.format("\t\t\t\tvar key_%s:%s=_pool.getValue(%s,values[begin+%s]);\n", (i + 1), fieldType, typeIDMap.get(fieldType), i));
				sb.append(String.format("\t\t\t\tif(dic[key_%s]==null)\n", (i + 1)));
				sb.append(String.format("\t\t\t\t{\n"));
				sb.append(String.format("\t\t\t\t\tdic[key_%s]=new Dictionary();\n", (i + 1)));
				sb.append(String.format("\t\t\t\t}\n"));
				sb.append(String.format("\t\t\t\tdic=dic[key_%s];\n", (i + 1)));
				sb.append(String.format("\t\t\t\t\n"));
			}
			else
			{
				sb.append(String.format("\t\t\t\tvar key_%s:%s=_pool.getValue(%s,values[begin+%s]);\n", (i + 1), fieldType, typeIDMap.get(fieldType), i));
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
		sb.append(String.format("\t\tpublic function getAt(index:int):%s\n", type.getName()));
		sb.append(String.format("\t\t{\n"));
		sb.append(String.format("\t\t\treturn _pool.getValue(%s,_indexList[index]);\n", typeIDMap.get(type.getName())));
		sb.append(String.format("\t\t}\n"));
		sb.append(String.format("\t\t\n"));

		sb.append(String.format("\t\t/**\n"));
		sb.append(String.format("\t\t * 按主键获取\n"));
		sb.append(String.format("\t\t */\n"));
		sb.append(String.format("\t\tpublic function getBy("));
		for (int i = 0; i < keys.length; i++)
		{
			sb.append(i > 0 ? "," : "");
			sb.append(keys[i] + ":" + type.getFieldBy(keys[i]).type);
		}
		sb.append(String.format("):%s\n", type.getName()));
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
		sb.append(String.format("\t\t\treturn _pool.getValue(%s,_table%s);\n", typeIDMap.get(type.getName()), depths));
		sb.append(String.format("\t\t}\n"));

		sb.append(String.format("\t}\n"));

		sb.append(String.format("}\n"));

		writeByteToFile(folder, currPack, typeName, sb.toString());

		// 记录Map类型的名称
		if (!mapTypeNameTable.containsKey(type.getName()))
		{
			mapTypeNameTable.put(type.getName(), new HashMap<String[], String>());
		}
		mapTypeNameTable.get(type.getName()).put(keys, typeName);
	}

	/**
	 * 输出自定义类型
	 * 
	 * @param types
	 * @param type
	 * @throws UnsupportedEncodingException
	 * @throws CoreException
	 */
	private void writeTypeClass(TypeDef type) throws UnsupportedEncodingException, CoreException
	{
		StringBuilder sb = new StringBuilder();

		sb.append(String.format("package %s\n", currPack));
		sb.append(String.format("{\n"));

		sb.append(String.format("\timport %s.*;\n", corePack));
		sb.append(String.format("\t\n"));

		if (type.getComment() != null)
		{
			sb.append(String.format("%s", formatComment(type.getComment(), "\t")));
		}
		sb.append(String.format("\tinternal class %s\n", type.getName()));
		sb.append(String.format("\t{\n"));

		// 私有变量
		sb.append(String.format("\t\tprivate var __pool__:DataPool;\n"));
		sb.append(String.format("\t\t\n"));
		for (TypeFieldDef field : type.fields)
		{
			if (field.repeted && field.indexKeys != null)
			{
				sb.append(String.format("\t\tprivate var _%sKind:%s;\n", field.name, getFieldAsTypeName(field)));
			}
			else if (field.repeted && field.indexKeys == null)
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
		sb.append(String.format("\t\tpublic function %s(bytes:ByteStream,pool:DataPool)\n", type.getName()));
		sb.append(String.format("\t\t{\n"));
		sb.append(String.format("\t\t\t__pool__=pool;\n"));
		sb.append(String.format("\t\t\t\n"));
		sb.append(String.format("\t\t\tvar pos:int=bytes.position;\n"));
		for (TypeFieldDef field : type.fields)
		{
			sb.append(String.format("\t\t\t\n"));
			sb.append(String.format("\t\t\t//%s\n", field.name));
			if (field.repeted && field.indexKeys != null)
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
			else if (field.repeted && field.indexKeys == null)
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

		// 字段列表
		for (TypeFieldDef field : type.fields)
		{
			if (field.comment != null)
			{
				sb.append(String.format("%s", formatComment(field.comment, "\t\t")));
			}
			sb.append(String.format("\t\tpublic function get %s():%s\n", field.name, getFieldAsTypeName(field)));
			sb.append(String.format("\t\t{\n"));
			if (field.repeted && field.indexKeys == null)
			{
				sb.append(String.format("\t\t\treturn _%sKind;\n", field.name));
			}
			else if (field.repeted && field.indexKeys != null)
			{
				sb.append(String.format("\t\t\treturn _%sKind;\n", field.name));
			}
			else
			{
				sb.append(String.format("\t\t\treturn __pool__.getValue(%s,_%sKind);\n", typeIDMap.get(field.type), field.name));
			}
			sb.append(String.format("\t\t}\n"));
			sb.append(String.format("\t\t\n"));
		}

		sb.append(String.format("\t}\n"));
		sb.append(String.format("}"));

		writeByteToFile(folder, currPack, type.getName(), sb.toString());
	}

	/**
	 * 输出数据池类型
	 * 
	 * @throws CoreException
	 * @throws UnsupportedEncodingException
	 */
	private void writePoolType(TypeDef type) throws UnsupportedEncodingException, CoreException
	{
		String filePath = type.getFilePath();

		String[] parts = filePath.split("\\\\|/");

		String fileName = parts[parts.length - 1];

		String typeName = fileName.replaceAll("\\.", "_");

		StringBuilder sb = new StringBuilder();

		sb.append(String.format("package %s\n", currPack));
		sb.append(String.format("{\n"));

		sb.append(String.format("\timport %s.*;\n", corePack));
		sb.append(String.format("\t\n"));

		if (type.getComment() != null)
		{
			sb.append(String.format("%s", formatComment(type.getComment(), "\t")));
		}
		sb.append(String.format("\tpublic class %s extends DataPool\n", typeName));
		sb.append(String.format("\t{\n"));

		sb.append(String.format("\t\t/**\n"));
		sb.append(String.format("\t\t * 获取原始字节流\n"));
		sb.append(String.format("\t\t */\n"));
		sb.append(String.format("\t\tprotected override function getBytes():ByteStream\n"));
		sb.append(String.format("\t\t{\n"));
		sb.append(String.format("\t\t\treturn DataPool.getFile(\"%s\");\n", fileName));
		sb.append(String.format("\t\t}\n"));
		sb.append(String.format("\t\t\n"));

		sb.append(String.format("\t\t/**\n"));
		sb.append(String.format("\t\t * 读取对象\n"));
		sb.append(String.format("\t\t */\n"));
		sb.append(String.format("\t\tprotected override function readObject(typeID:int,bytes:ByteStream):*\n"));
		sb.append(String.format("\t\t{\n"));
		sb.append(String.format("\t\t\tswitch(typeID)\n"));
		sb.append(String.format("\t\t\t{\n"));
		for (TypeDef curr : types)
		{
			sb.append(String.format("\t\t\t\tcase %s:\n", typeIDMap.get(curr.getName())));
			sb.append(String.format("\t\t\t\t\treturn new %s(bytes,this);\n", curr.getName()));
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
		sb.append(String.format("\t\tprivate static function get instance():%s\n", type.getName()));
		sb.append(String.format("\t\t{\n"));
		sb.append(String.format("\t\t\tif(!_instance)\n", fileName));
		sb.append(String.format("\t\t\t{\n"));
		sb.append(String.format("\t\t\t\t_instance=new %s();\n", typeName));
		sb.append(String.format("\t\t\t\t_instance.initRange();\n", typeName));
		sb.append(String.format("\t\t\t}\n"));
		sb.append(String.format("\t\t\treturn _instance.root;\n", fileName));
		sb.append(String.format("\t\t}\n"));
		sb.append(String.format("\t\t\n"));

		for (int i = 0; i < type.getFieldLength(); i++)
		{
			TypeFieldDef field = type.getFieldAt(i);

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
	}

	/**
	 * 获取字段的AS类名
	 * 
	 * @param field
	 * @return
	 */
	private String getFieldAsTypeName(TypeFieldDef field)
	{
		if (field.repeted)
		{
			if (field.indexKeys == null)
			{
				return getListTypeName(field.type);
			}
			else
			{
				return getMapTypeName(field.type, field.indexKeys);
			}
		}
		else
		{
			return field.type;
		}
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
