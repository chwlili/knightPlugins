package org.chw.game.ide.generator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import org.chw.game.ide.proto.Element;
import org.chw.game.ide.proto.EnumField;
import org.chw.game.ide.proto.EnumType;
import org.chw.game.ide.proto.MessageComplexField;
import org.chw.game.ide.proto.MessageField;
import org.chw.game.ide.proto.MessageSimpleField;
import org.chw.game.ide.proto.MessageType;
import org.chw.game.ide.proto.Model;
import org.chw.game.ide.proto.Type;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

public class MyGenerator implements IGenerator
{

	/**
	 * 开始生成
	 */
	public void doGenerate(Resource input, IFileSystemAccess fsa)
	{
		TreeIterator<EObject> iterator = input.getAllContents();
		while (iterator.hasNext())
		{
			EObject obj = iterator.next();
			if (obj instanceof Model)
			{
				Model model = (Model) obj;

				for (Element type : model.getElements())
				{
					if (type instanceof MessageType)
					{
						doGenerate((MessageType) type, fsa);
					}
					else if (type instanceof EnumType)
					{
						doGenerate((EnumType) type, fsa);
					}
				}
			}
		}
	}

	// ---------------------------------------------------------------------------------------------
	//
	// 生成 Message
	//
	// ---------------------------------------------------------------------------------------------

	/**
	 * 生成Message
	 * 
	 * @param type
	 * @param fsa
	 */
	private void doGenerate(MessageType type, IFileSystemAccess fsa)
	{
		String packName = getPackNameBy((Type) type);
		String typeName = getTypeShortName((Type) type);
		String typeComm = getNodeCommByPrev((EObject) type);
		HashSet<String> imports = new HashSet<String>();
		ArrayList<Field> fields = new ArrayList<Field>();

		for (MessageField field : type.getFields())
		{
			String fieldName = normalFieldName(field.getName());

			Field row = new Field();
			row.attr = field.getAttr();
			row.name = fieldName;
			row.index = field.getIndex();
			row.nativeType = "";
			row.actionType = "";
			row.comm = getNodeCommByNext(field);
			row.test = toHasFieldName(fieldName);
			fields.add(row);

			if (field instanceof MessageComplexField)
			{
				MessageComplexField complex = (MessageComplexField) field;

				if (complex.getAttr().equals("repeated"))
				{
					if (complex.getType() instanceof EnumType)
					{
						generateSimpleTypeList(fsa, "int");

						row.shortType = "int32";
						row.nativeType = "int32";
						row.actionType = getRootPackName() + "base.IntLit";

						imports.add(row.actionType);
					}
					else
					{
						generateComplexTypeList(fsa, complex.getType());

						row.shortType = getTypeShortName(complex.getType());
						row.nativeType = getTypeLongName(complex.getType());
						row.actionType = row.nativeType + "List";

						imports.add(row.nativeType);
						imports.add(row.actionType);
					}
				}
				else
				{
					if (complex.getType() instanceof EnumType)
					{
						row.nativeType = "int32";
						row.actionType = "int";
					}
					else
					{
						row.nativeType = getTypeLongName(complex.getType());
						row.actionType = row.nativeType;

						imports.add(row.actionType);
					}
				}
			}
			else
			{
				MessageSimpleField simple = (MessageSimpleField) field;
				String as3Type = simpleTypeToToAsType(simple.getType());

				if (simple.getAttr().equals("repeated"))
				{
					generateSimpleTypeList(fsa, as3Type);

					row.shortType = as3Type;
					row.nativeType = simple.getType();
					row.actionType = getRootPackName() + "base." + as3Type.substring(0, 1).toUpperCase() + as3Type.substring(1) + "List";
					imports.add(row.actionType);
				}
				else
				{
					row.nativeType = simple.getType();
					row.actionType = as3Type;
				}

				if (as3Type.equals("ByteArray"))
				{
					imports.add("flash.utils.ByteArray");
				}
			}
		}

		imports.add(getRootPackName() + "base.SerializeableData");
		ArrayList<String> importList = new ArrayList<String>();
		for (String importItem : imports)
		{
			importList.add(importItem);
		}
		Collections.sort(importList);

		// 生成SerializeableData.as
		String packName1 = getRootPackName() + "base";
		String typeName1 = "SerializeableData";
		fsa.generateFile(packName1.replace('.', '/') + "/" + typeName1 + ".as", SerializeableTemplate.getContent(packName1, typeName1));

		// 生成类型
		fsa.generateFile(packName.replace('.', '/') + "/" + typeName + ".as", generateMessage(packName, typeName, typeComm, importList, fields));

		// 处理嵌入类型
		for (Type inner : type.getTypes())
		{
			if (inner instanceof EnumType)
			{
				doGenerate((EnumType) inner, fsa);
			}
			else
			{
				doGenerate((MessageType) inner, fsa);
			}
		}
	}

	/**
	 * 消息类型模板
	 */
	private StringBuilder generateMessage(String packName, String typeName, String typeComm, ArrayList<String> imports, ArrayList<Field> fields)
	{
		StringBuilder stream = new StringBuilder();
		stream.append(String.format("package %s\n", packName));
		stream.append(String.format("{\n"));
		stream.append(String.format("\timport flash.utils.IDataInput;\n"));
		stream.append(String.format("\timport flash.utils.IDataOutput;\n"));
		stream.append(String.format("\timport flash.utils.ByteArray;\n"));
		for (String importRow : imports)
		{
			stream.append(String.format("\timport %s;\n", importRow));
		}
		stream.append(String.format("\t\n"));
		if (typeComm != null)
		{
			stream.append(String.format("\t/**\n"));
			stream.append(String.format("\t * %s\n", typeComm.replaceAll("\\n", "\n\t ")));
			stream.append(String.format("\t */\n"));
		}
		stream.append(String.format("\tpublic final class %s extends SerializeableData\n", typeName));
		stream.append(String.format("\t{\n"));
		stream.append(String.format("\t\tprivate var _dic:Object={};\n"));
		stream.append(String.format("\t\t\n"));
		stream.append(String.format("\t\t/**\n"));
		stream.append(String.format("\t\t * 内部字典对象\n"));
		stream.append(String.format("\t\t */\n"));
		stream.append(String.format("\t\tpublic function getInner():Object\n"));
		stream.append(String.format("\t\t{\n"));
		stream.append(String.format("\t\t\treturn _dic;\n"));
		stream.append(String.format("\t\t}\n"));
		stream.append(String.format("\t\t\n"));
		for (Field field : fields)
		{
			stream.append(String.format("\t\t/**\n"));
			stream.append(String.format("\t\t * %s 是否有效\n", field.name));
			stream.append(String.format("\t\t */\n"));
			stream.append(String.format("\t\tpublic function get %s():Boolean\n", field.test));
			stream.append(String.format("\t\t{\n"));
			stream.append(String.format("\t\t\treturn _dic[%s]!=null;\n", field.index));
			stream.append(String.format("\t\t}\n"));
			stream.append(String.format("\t\t\n"));
			if (field.comm != null)
			{
				stream.append(String.format("\t\t/**\n"));
				stream.append(String.format("\t\t * %s\n", field.comm.replaceAll("\\n", "\n\t\t ")));
				stream.append(String.format("\t\t */\n"));
			}
			stream.append(String.format("\t\tpublic function get %s():%s\n", field.name, field.actionType));
			stream.append(String.format("\t\t{\n"));
			stream.append(String.format("\t\t\treturn _dic[%s];\n", field.index));
			stream.append(String.format("\t\t}\n"));
			stream.append(String.format("\t\tpublic function set %s(value:%s):void\n", field.name, field.actionType));
			stream.append(String.format("\t\t{\n"));
			stream.append(String.format("\t\t\t_dic[%s]=value;\n", field.index));
			stream.append(String.format("\t\t}\n"));
			stream.append(String.format("\t\t\n"));
		}

		stream.append(String.format("\t\t\n"));
		stream.append(String.format("\t\t/**\n"));
		stream.append(String.format("\t\t * 反序列化\n"));
		stream.append(String.format("\t\t */\n"));
		stream.append(String.format("\t\tpublic override function deserialize(input:ByteArray,endPos:int=int.MAX_VALUE):void\n"));
		stream.append(String.format("\t\t{\n"));
		stream.append(String.format("\t\t\tvar tag:int=readTagFrom(input);\n"));
		stream.append(String.format("\t\t\t\n"));
		stream.append(String.format("\t\t\twhile(tag!=0)\n"));
		stream.append(String.format("\t\t\t{\n"));
		stream.append(String.format("\t\t\t\tvar fieldNum:int=getFieldNum(tag);\n"));
		stream.append(String.format("\t\t\t\t\n"));
		stream.append(String.format("\t\t\t\tswitch(fieldNum)\n"));
		stream.append(String.format("\t\t\t\t{\n"));
		for (Field field : fields)
		{
			stream.append(String.format("\t\t\t\t\tcase %s:\n", field.index));
			stream.append(String.format("\t\t\t\t\t{\n"));
			if (field.attr.equals("repeated"))
			{
				stream.append(String.format("\t\t\t\t\t\tvar items_%s:%s=_dic[%s];\n", field.index, field.actionType, field.index));
				stream.append(String.format("\t\t\t\t\t\tif(!items_%s)\n", field.index));
				stream.append(String.format("\t\t\t\t\t\t{\n"));
				stream.append(String.format("\t\t\t\t\t\t\titems_%s=_dic[%s]=new %s();\n", field.index, field.index, field.actionType));
				stream.append(String.format("\t\t\t\t\t\t}\n"));

				if (field.nativeType.equals("int32"))
				{
					stream.append(String.format("\t\t\t\t\t\titems_%s.addInt(readInt32From(input));\n", field.index));
				}
				else if (field.nativeType.equals("uint32"))
				{
					stream.append(String.format("\t\t\t\t\t\titems_%s.addInt(readUInt32From(input));\n", field.index));
				}
				else if (field.nativeType.equals("sint32"))
				{
					stream.append(String.format("\t\t\t\t\t\titems_%s.addInt(readSInt32From(input));\n", field.index));
				}
				else if (field.nativeType.equals("int64"))
				{
					stream.append(String.format("\t\t\t\t\t\titems_%s.addString(readInt64From(input));\n", field.index));
				}
				else if (field.nativeType.equals("uint64"))
				{
					stream.append(String.format("\t\t\t\t\t\titems_%s.addString(readUInt64From(input));\n", field.index));
				}
				else if (field.nativeType.equals("sint64"))
				{
					stream.append(String.format("\t\t\t\t\t\titems_%s.addString(readSInt64From(input));\n", field.index));
				}
				else if (field.nativeType.equals("float"))
				{
					stream.append(String.format("\t\t\t\t\t\titems_%s.addNumber(readFloatFrom(input));\n", field.index));
				}
				else if (field.nativeType.equals("double"))
				{
					stream.append(String.format("\t\t\t\t\t\titems_%s.addNumber(readDoubleFrom(input));\n", field.index));
				}
				else if (field.nativeType.equals("bool"))
				{
					stream.append(String.format("\t\t\t\t\t\titems_%s.addBoolean(readBoolFrom(input));\n", field.index));
				}
				else if (field.nativeType.equals("string"))
				{
					stream.append(String.format("\t\t\t\t\t\titems_%s.addString(readStringFrom(input));\n", field.index));
				}
				else if (field.nativeType.equals("bytes"))
				{
					stream.append(String.format("\t\t\t\t\t\titems_%s.addByteArray(readBytesFrom(input));\n", field.index));
				}
				else if (field.nativeType.equals("enum"))
				{
					stream.append(String.format("\t\t\t\t\t\titems_%s.addInt(readint32From(input));\n", field.index));
				}
				else if ((field.nativeType.equals("fixed32")))
				{
					stream.append(String.format("\t\t\t\t\t\titems_%s.addInt(readFixed32From(input));\n", field.index));
				}
				else if ((field.nativeType.equals("fixed64")))
				{
					stream.append(String.format("\t\t\t\t\t\titems_%s.addNumber(readFixed64From(input));\n", field.index));
				}
				else if ((field.nativeType.equals("sfixed32")))
				{
					stream.append(String.format("\t\t\t\t\t\titems_%s.addInt(readSFixed32From(input));\n", field.index));
				}
				else if ((field.nativeType.equals("sfixed64")))
				{
					stream.append(String.format("\t\t\t\t\t\titems_%s.addNumber(readSFixed64From(input));\n", field.index));
				}
				else
				{
					stream.append(String.format("\t\t\t\t\t\tvar item_%s:%s=new %s();\n", field.index, field.nativeType, field.nativeType));
					stream.append(String.format("\t\t\t\t\t\tvar item_%s_len:int=readInt32From(input);\n", field.index));
					stream.append(String.format("\t\t\t\t\t\tvar item_%s_end:int=input.position+item_%s_len;\n", field.index, field.index));
					stream.append(String.format("\t\t\t\t\t\tif(input.bytesAvailable<item_%s_len){throw new Error(\"???\");}\n", field.index));
					stream.append(String.format("\t\t\t\t\t\tif(item_%s_len>0)\n", field.index));
					stream.append(String.format("\t\t\t\t\t\t{\n"));
					stream.append(String.format("\t\t\t\t\t\t\titem_%s.deserialize(input,item_%s_end);\n", field.index, field.index));
					stream.append(String.format("\t\t\t\t\t\t}\n"));
					stream.append(String.format("\t\t\t\t\t\tinput.position=item_%s_end;\n", field.index));
					stream.append(String.format("\t\t\t\t\t\titems_%s.add%s(item_%s);\n", field.index, field.shortType, field.index));
				}
			}
			else
			{
				if (field.nativeType.equals("int32"))
				{
					stream.append(String.format("\t\t\t\t\t\t_dic[%s]=readInt32From(input);\n", field.index));
				}
				else if (field.nativeType.equals("uint32"))
				{
					stream.append(String.format("\t\t\t\t\t\t_dic[%s]=readUInt32From(input);\n", field.index));
				}
				else if (field.nativeType.equals("sint32"))
				{
					stream.append(String.format("\t\t\t\t\t\t_dic[%s]=readSInt32From(input);\n", field.index));
				}
				else if (field.nativeType.equals("int64"))
				{
					stream.append(String.format("\t\t\t\t\t\t_dic[%s]=readInt64From(input);\n", field.index));
				}
				else if (field.nativeType.equals("uint64"))
				{
					stream.append(String.format("\t\t\t\t\t\t_dic[%s]=readUInt64From(input);\n", field.index));
				}
				else if (field.nativeType.equals("sint64"))
				{
					stream.append(String.format("\t\t\t\t\t\t_dic[%s]=readSInt64From(input);\n", field.index));
				}
				else if (field.nativeType.equals("float"))
				{
					stream.append(String.format("\t\t\t\t\t\t_dic[%s]=readFloatFrom(input);\n", field.index));
				}
				else if (field.nativeType.equals("double"))
				{
					stream.append(String.format("\t\t\t\t\t\t_dic[%s]=readDoubleFrom(input);\n", field.index));
				}
				else if (field.nativeType.equals("bool"))
				{
					stream.append(String.format("\t\t\t\t\t\t_dic[%s]=readBoolFrom(input);\n", field.index));
				}
				else if (field.nativeType.equals("string"))
				{
					stream.append(String.format("\t\t\t\t\t\t_dic[%s]=readStringFrom(input);\n", field.index));
				}
				else if (field.nativeType.equals("bytes"))
				{
					stream.append(String.format("\t\t\t\t\t\t_dic[%s]=readBytesFrom(input);\n", field.index));
				}
				else if (field.nativeType.equals("enum"))
				{
					stream.append(String.format("\t\t\t\t\t\t_dic[%s]=readInt32From(input);\n", field.index));
				}
				else if ((field.nativeType.equals("fixed32")))
				{
					stream.append(String.format("\t\t\t\t\t\t_dic[%s]=readFixed32From(input);\n", field.index));
				}
				else if ((field.nativeType.equals("fixed64")))
				{
					stream.append(String.format("\t\t\t\t\t\t_dic[%s]=readFixed64From(input);\n", field.index));
				}
				else if ((field.nativeType.equals("sfixed32")))
				{
					stream.append(String.format("\t\t\t\t\t\t_dic[%s]=readSFixed32From(input);\n", field.index));
				}
				else if ((field.nativeType.equals("sfixed64")))
				{
					stream.append(String.format("\t\t\t\t\t\t_dic[%s]=readSFixed64From(input);\n", field.index));
				}
				else
				{
					stream.append(String.format("\t\t\t\t\t\tvar %s:%s=new %s();\n", field.name, field.actionType, field.actionType));
					stream.append(String.format("\t\t\t\t\t\tvar %s_len:int=readInt32From(input);\n", field.name));
					stream.append(String.format("\t\t\t\t\t\tvar %s_end:int=input.position+%s_len;\n", field.name, field.name));
					stream.append(String.format("\t\t\t\t\t\tif(input.bytesAvailable<%s_len){throw new Error(\"???\");}\n", field.name));
					stream.append(String.format("\t\t\t\t\t\tif(%s_len>0)\n", field.name));
					stream.append(String.format("\t\t\t\t\t\t{\n"));
					stream.append(String.format("\t\t\t\t\t\t\t%s.deserialize(input,%s_end);\n", field.name, field.name));
					stream.append(String.format("\t\t\t\t\t\t}\n"));
					stream.append(String.format("\t\t\t\t\t\tinput.position=%s_end;\n", field.name));
					stream.append(String.format("\t\t\t\t\t\t_dic[%s]=%s;\n", field.index, field.name));
				}
			}
			stream.append(String.format("\t\t\t\t\t\tbreak;\n"));
			stream.append(String.format("\t\t\t\t\t}\n"));
		}
		stream.append(String.format("\t\t\t\t\tdefault:\n"));
		stream.append(String.format("\t\t\t\t\t{\n"));
		stream.append(String.format("\t\t\t\t\t\tskipFieldFrom(input,tag);\n"));
		stream.append(String.format("\t\t\t\t\t}\n"));

		stream.append(String.format("\t\t\t\t}\n"));
		stream.append(String.format("\t\t\t\t\n"));
		stream.append(String.format("\t\t\t\ttag=input.position<endPos ? readTagFrom(input):0;\n"));
		stream.append(String.format("\t\t\t}\n"));
		stream.append(String.format("\t\t}\n"));
		stream.append(String.format("\t\t\n"));

		stream.append(String.format("\t\t/**\n"));
		stream.append(String.format("\t\t * 序列化\n"));
		stream.append(String.format("\t\t */\n"));
		stream.append(String.format("\t\tpublic override function serialize(output:IDataOutput):void\n"));
		stream.append(String.format("\t\t{\n"));
		for (Field field : fields)
		{
			stream.append(String.format("\t\t\tif(_dic[%s]!=null)\n", field.index));
			stream.append(String.format("\t\t\t{\n"));
			if (field.attr.equals("repeated"))
			{
				if (field.nativeType.equals("int32"))
				{
					stream.append(String.format("\t\t\t\tvar %ss:%s=_dic[%s];\n", field.name, field.actionType, field.index));
					stream.append(String.format("\t\t\t\tfor(var i%s:int=0;i%s<%ss.numInts;i%s++)\n", field.index, field.index, field.name, field.index));
					stream.append(String.format("\t\t\t\t{\n"));
					stream.append(String.format("\t\t\t\t\twriteInt32To(output,%s,%ss.getIntAt(i%s));\n", field.index, field.name, field.index));
					stream.append(String.format("\t\t\t\t}\n"));
				}
				else if (field.nativeType.equals("uint32"))
				{
					stream.append(String.format("\t\t\t\tvar %ss:%s=_dic[%s];\n", field.name, field.actionType, field.index));
					stream.append(String.format("\t\t\t\tfor(var i%s:int=0;i%s<%ss.numInts;i%s++)\n", field.index, field.index, field.name, field.index));
					stream.append(String.format("\t\t\t\t{\n"));
					stream.append(String.format("\t\t\t\t\twriteUInt32To(output,%s,%ss.getIntAt(i%s));\n", field.index, field.name, field.index));
					stream.append(String.format("\t\t\t\t}\n"));
				}
				else if (field.nativeType.equals("sint32"))
				{
					stream.append(String.format("\t\t\t\tvar %ss:%s=_dic[%s];\n", field.name, field.actionType, field.index));
					stream.append(String.format("\t\t\t\tfor(var i%s:int=0;i%s<%ss.numInts;i%s++)\n", field.index, field.index, field.name, field.index));
					stream.append(String.format("\t\t\t\t{\n"));
					stream.append(String.format("\t\t\t\t\twriteSInt32To(output,%s,%ss.getIntAt(i%s));\n", field.index, field.name, field.index));
					stream.append(String.format("\t\t\t\t}\n"));
				}
				else if (field.nativeType.equals("int64"))
				{
					stream.append(String.format("\t\t\t\tvar %ss:%s=_dic[%s];\n", field.name, field.actionType, field.index));
					stream.append(String.format("\t\t\t\tfor(var i%s:int=0;i%s<%ss.numStrings;i%s++)\n", field.index, field.index, field.name, field.index));
					stream.append(String.format("\t\t\t\t{\n"));
					stream.append(String.format("\t\t\t\t\twriteInt64To(output,%s,%ss.getStringAt(i%s));\n", field.index, field.name, field.index));
					stream.append(String.format("\t\t\t\t}\n"));
				}
				else if (field.nativeType.equals("uint64"))
				{
					stream.append(String.format("\t\t\t\tvar %ss:%s=_dic[%s];\n", field.name, field.actionType, field.index));
					stream.append(String.format("\t\t\t\tfor(var i%s:int=0;i%s<%ss.numStrings;i%s++)\n", field.index, field.index, field.name, field.index));
					stream.append(String.format("\t\t\t\t{\n"));
					stream.append(String.format("\t\t\t\t\twriteUInt64To(output,%s,%ss.getStringAt(i%s));\n", field.index, field.name, field.index));
					stream.append(String.format("\t\t\t\t}\n"));
				}
				else if (field.nativeType.equals("sint64"))
				{
					stream.append(String.format("\t\t\t\tvar %ss:%s=_dic[%s];\n", field.name, field.actionType, field.index));
					stream.append(String.format("\t\t\t\tfor(var i%s:int=0;i%s<%ss.numStrings;i%s++)\n", field.index, field.index, field.name, field.index));
					stream.append(String.format("\t\t\t\t{\n"));
					stream.append(String.format("\t\t\t\t\twriteSInt64To(output,%s,%ss.getStringAt(i%s));\n", field.index, field.name, field.index));
					stream.append(String.format("\t\t\t\t}\n"));
				}
				else if (field.nativeType.equals("float"))
				{
					stream.append(String.format("\t\t\t\tvar %ss:%s=_dic[%s];\n", field.name, field.actionType, field.index));
					stream.append(String.format("\t\t\t\tfor(var i%s:int=0;i%s<%ss.numNumbers;i%s++)\n", field.index, field.index, field.name, field.index));
					stream.append(String.format("\t\t\t\t{\n"));
					stream.append(String.format("\t\t\t\t\twriteFloatTo(output,%s,%ss.getNumberAt(i%s));\n", field.index, field.name, field.index));
					stream.append(String.format("\t\t\t\t}\n"));
				}
				else if (field.nativeType.equals("double"))
				{
					stream.append(String.format("\t\t\t\tvar %ss:%s=_dic[%s];\n", field.name, field.actionType, field.index));
					stream.append(String.format("\t\t\t\tfor(var i%s:int=0;i%s<%ss.numNumbers;i%s++)\n", field.index, field.index, field.name, field.index));
					stream.append(String.format("\t\t\t\t{\n"));
					stream.append(String.format("\t\t\t\t\twriteDoubleTo(output,%s,%ss.getNumberAt(i%s));\n", field.index, field.name, field.index));
					stream.append(String.format("\t\t\t\t}\n"));
				}
				else if (field.nativeType.equals("bool"))
				{
					stream.append(String.format("\t\t\t\tvar %ss:%s=_dic[%s];\n", field.name, field.actionType, field.index));
					stream.append(String.format("\t\t\t\tfor(var i%s:int=0;i%s<%ss.numBooleans;i%s++)\n", field.index, field.index, field.name, field.index));
					stream.append(String.format("\t\t\t\t{\n"));
					stream.append(String.format("\t\t\t\t\twriteBoolTo(output,%s,%ss.getBooleanAt(i%s));\n", field.index, field.name, field.index));
					stream.append(String.format("\t\t\t\t}\n"));
				}
				else if (field.nativeType.equals("string"))
				{
					stream.append(String.format("\t\t\t\tvar %ss:%s=_dic[%s];\n", field.name, field.actionType, field.index));
					stream.append(String.format("\t\t\t\tfor(var i%s:int=0;i%s<%ss.numStrings;i%s++)\n", field.index, field.index, field.name, field.index));
					stream.append(String.format("\t\t\t\t{\n"));
					stream.append(String.format("\t\t\t\t\twriteStringTo(output,%s,%ss.getStringAt(i%s));\n", field.index, field.name, field.index));
					stream.append(String.format("\t\t\t\t}\n"));
				}
				else if (field.nativeType.equals("bytes"))
				{
					stream.append(String.format("\t\t\t\tvar %ss:%s=_dic[%s];\n", field.name, field.actionType, field.index));
					stream.append(String.format("\t\t\t\tfor(var i%s:int=0;i%s<%ss.numByteArrays;i%s++)\n", field.index, field.index, field.name, field.index));
					stream.append(String.format("\t\t\t\t{\n"));
					stream.append(String.format("\t\t\t\t\twriteBytesTo(output,%s,%ss.getByteArrayAt(i%s));\n", field.index, field.name, field.index));
					stream.append(String.format("\t\t\t\t}\n"));
				}
				else if (field.nativeType.equals("enum"))
				{
					stream.append(String.format("\t\t\t\tvar %ss:%s=_dic[%s];\n", field.name, field.actionType, field.index));
					stream.append(String.format("\t\t\t\tfor(var i%s:int=0;i%s<%ss.numInts;i%s++)\n", field.index, field.index, field.name, field.index));
					stream.append(String.format("\t\t\t\t{\n"));
					stream.append(String.format("\t\t\t\t\twriteEnumTo(output,%s,%ss.getIntAt(i%s));\n", field.index, field.name, field.index));
					stream.append(String.format("\t\t\t\t}\n"));
				}
				else if (field.nativeType.equals("fixed32"))
				{
					stream.append(String.format("\t\t\t\tvar %ss:%s=_dic[%s];\n", field.name, field.actionType, field.index));
					stream.append(String.format("\t\t\t\tfor(var i%s:int=0;i%s<%ss.numInts;i%s++)\n", field.index, field.index, field.name, field.index));
					stream.append(String.format("\t\t\t\t{\n"));
					stream.append(String.format("\t\t\t\t\twriteFixed32To(output,%s,%ss.getIntAt(i%s));\n", field.index, field.name, field.index));
					stream.append(String.format("\t\t\t\t}\n"));
				}
				else if (field.nativeType.equals("fixed64"))
				{
					stream.append(String.format("\t\t\t\tvar %ss:%s=_dic[%s];\n", field.name, field.actionType, field.index));
					stream.append(String.format("\t\t\t\tfor(var i%s:int=0;i%s<%ss.numNumbers;i%s++)\n", field.index, field.index, field.name, field.index));
					stream.append(String.format("\t\t\t\t{\n"));
					stream.append(String.format("\t\t\t\t\twriteFixed64To(output,%s,%ss.getNumberAt(i%s));\n", field.index, field.name, field.index));
					stream.append(String.format("\t\t\t\t}\n"));
				}
				else if (field.nativeType.equals("sfixed32"))
				{
					stream.append(String.format("\t\t\t\tvar %ss:%s=_dic[%s];\n", field.name, field.actionType, field.index));
					stream.append(String.format("\t\t\t\tfor(var i%s:int=0;i%s<%ss.numInts;i%s++)\n", field.index, field.index, field.name, field.index));
					stream.append(String.format("\t\t\t\t{\n"));
					stream.append(String.format("\t\t\t\t\twriteSFixed32To(output,%s,%ss.getIntAt(i%s));\n", field.index, field.name, field.index));
					stream.append(String.format("\t\t\t\t}\n"));
				}
				else if (field.nativeType.equals("sfixed64"))
				{
					stream.append(String.format("\t\t\t\tvar %ss:%s=_dic[%s];\n", field.name, field.actionType, field.index));
					stream.append(String.format("\t\t\t\tfor(var i%s:int=0;i%s<%ss.numNumbers;i%s++)\n", field.index, field.index, field.name, field.index));
					stream.append(String.format("\t\t\t\t{\n"));
					stream.append(String.format("\t\t\t\t\twriteSFixed64To(output,%s,%ss.getNumberAt(i%s));\n", field.index, field.name, field.index));
					stream.append(String.format("\t\t\t\t}\n"));
				}
				else
				{
					stream.append(String.format("\t\t\t\tvar %ss:%s=_dic[%s];\n", field.name, field.actionType, field.index));
					stream.append(String.format("\t\t\t\tfor(var i%s:int=0;i%s<%ss.num%ss;i%s++)\n", field.index, field.index, field.name, field.shortType, field.index));
					stream.append(String.format("\t\t\t\t{\n"));
					stream.append(String.format("\t\t\t\t\twriteMessageTo(output,%s,%ss.get%sAt(i%s));\n", field.index, field.name, field.shortType, field.index));
					stream.append(String.format("\t\t\t\t}\n"));
				}
			}
			else
			{
				if (field.nativeType.equals("int32"))
				{
					stream.append(String.format("\t\t\t\twriteInt32To(output,%s,_dic[%s]);\n", field.index, field.index));
				}
				else if (field.nativeType.equals("uint32"))
				{
					stream.append(String.format("\t\t\t\twriteUInt32To(output,%s,_dic[%s]);\n", field.index, field.index));
				}
				else if (field.nativeType.equals("sint32"))
				{
					stream.append(String.format("\t\t\t\twriteSInt32To(output,%s,_dic[%s]);\n", field.index, field.index));
				}
				else if (field.nativeType.equals("int64"))
				{
					stream.append(String.format("\t\t\t\twriteInt64To(output,%s,_dic[%s]);\n", field.index, field.index));
				}
				else if (field.nativeType.equals("uint64"))
				{
					stream.append(String.format("\t\t\t\twriteUInt64To(output,%s,_dic[%s]);\n", field.index, field.index));
				}
				else if (field.nativeType.equals("sint64"))
				{
					stream.append(String.format("\t\t\t\twriteSInt64To(output,%s,_dic[%s]);\n", field.index, field.index));
				}
				else if (field.nativeType.equals("float"))
				{
					stream.append(String.format("\t\t\t\twriteFloatTo(output,%s,_dic[%s]);\n", field.index, field.index));
				}
				else if (field.nativeType.equals("double"))
				{
					stream.append(String.format("\t\t\t\twriteDoubleTo(output,%s,_dic[%s]);\n", field.index, field.index));
				}
				else if (field.nativeType.equals("bool"))
				{
					stream.append(String.format("\t\t\t\twriteBoolTo(output,%s,_dic[%s]);\n", field.index, field.index));
				}
				else if (field.nativeType.equals("string"))
				{
					stream.append(String.format("\t\t\t\twriteStringTo(output,%s,_dic[%s]);\n", field.index, field.index));
				}
				else if (field.nativeType.equals("bytes"))
				{
					stream.append(String.format("\t\t\t\twriteBytesTo(output,%s,_dic[%s]);\n", field.index, field.index));
				}
				else if (field.nativeType.equals("enum"))
				{
					stream.append(String.format("\t\t\t\twriteEnumTo(output,%s,_dic[%s]);\n", field.index, field.index));
				}
				else if (field.nativeType.equals("fixed32"))
				{
					stream.append(String.format("\t\t\t\twriteFixed32To(output,%s,_dic[%s]);\n", field.index, field.index));
				}
				else if (field.nativeType.equals("fixed64"))
				{
					stream.append(String.format("\t\t\t\twriteFixed64To(output,%s,_dic[%s]);\n", field.index, field.index));
				}
				else if (field.nativeType.equals("sfixed32"))
				{
					stream.append(String.format("\t\t\t\twriteSFixed32To(output,%s,_dic[%s]);\n", field.index, field.index));
				}
				else if (field.nativeType.equals("sfixed64"))
				{
					stream.append(String.format("\t\t\t\twriteSFixed64To(output,%s,_dic[%s]);\n", field.index, field.index));
				}
				else
				{
					stream.append(String.format("\t\t\t\twriteMessageTo(output,%s,_dic[%s]);\n", field.index, field.index));
				}
			}
			stream.append(String.format("\t\t\t}\n"));
		}
		stream.append(String.format("\t\t}\n"));
		stream.append(String.format("\t}\n"));
		stream.append(String.format("}\n"));

		return stream;
	}

	/**
	 * 生成简单类型列表
	 */
	private void generateSimpleTypeList(IFileSystemAccess fsa, String as3Type)
	{
		String importPath = "";
		if (as3Type.equals("ByteArray"))
		{
			importPath = "flash.utils.ByteArray";
		}

		String packName = getRootPackName() + "base";
		String typeName = as3Type.substring(0, 1).toUpperCase() + as3Type.substring(1);
		String fileName = packName;

		fsa.generateFile(fileName.replace('.', '/') + "/" + typeName + "List.as", generateListType(packName, importPath, typeName, as3Type));
	}

	/**
	 * 生成复杂类型列表
	 */
	private void generateComplexTypeList(IFileSystemAccess fsa, Type defType)
	{
		String packName = getPackNameBy(defType);
		String shortName = getTypeShortName(defType);
		String fileName = packName.replace('.', '/') + "/" + shortName + "List.as";

		fsa.generateFile(fileName, generateListType(packName, null, shortName, shortName));
	}

	/**
	 * 写入列表类型
	 */
	private StringBuilder generateListType(String packName, String importType, String typeName, String as3TypeName)
	{
		StringBuilder stream = new StringBuilder();
		stream.append(String.format("package %s\n", packName));
		stream.append(String.format("{\n"));
		if (importType != null && importType.isEmpty() == false)
		{
			stream.append(String.format("\timport %s;\n", importType));
		}
		stream.append(String.format("\tpublic final class %sList\n", typeName));
		stream.append(String.format("\t{\n"));
		stream.append(String.format("\t\tprivate var _list:Array=new Array();\n"));
		stream.append(String.format("\t\t\n"));
		stream.append(String.format("\t\t/**\n"));
		stream.append(String.format("\t\t * 列表元素个数\n"));
		stream.append(String.format("\t\t */\n"));
		stream.append(String.format("\t\tpublic function get num%ss():int\n", typeName));
		stream.append(String.format("\t\t{\n"));
		stream.append(String.format("\t\t\treturn _list.length;\n"));
		stream.append(String.format("\t\t}\n"));
		stream.append(String.format("\t\t\n"));
		stream.append(String.format("\t\t/**\n"));
		stream.append(String.format("\t\t * 获取指定索引处的列表元素\n"));
		stream.append(String.format("\t\t */\n"));
		stream.append(String.format("\t\tpublic function get%sAt(index:int):%s\n", typeName, as3TypeName));
		stream.append(String.format("\t\t{\n"));
		stream.append(String.format("\t\t\treturn _list[index];\n"));
		stream.append(String.format("\t\t}\n"));
		stream.append(String.format("\t\t\n"));
		stream.append(String.format("\t\t/**\n"));
		stream.append(String.format("\t\t * 添加\n"));
		stream.append(String.format("\t\t */\n"));
		stream.append(String.format("\t\tpublic function add%s(item:%s):void\n", typeName, as3TypeName));
		stream.append(String.format("\t\t{\n"));
		stream.append(String.format("\t\t\t_list.push(item);\n"));
		stream.append(String.format("\t\t}\n"));
		stream.append(String.format("\t\t\n"));
		stream.append(String.format("\t\t/**\n"));
		stream.append(String.format("\t\t * 删除\n"));
		stream.append(String.format("\t\t */\n"));
		stream.append(String.format("\t\tpublic function remove%s(value:%s):void\n", typeName, as3TypeName));
		stream.append(String.format("\t\t{\n"));
		stream.append(String.format("\t\t\tvar index:int=_list.indexOf(value);\n"));
		stream.append(String.format("\t\t\tif(index!=-1)\n"));
		stream.append(String.format("\t\t\t{\n"));
		stream.append(String.format("\t\t\t\t_list.splice(index,1);\n"));
		stream.append(String.format("\t\t\t}\n"));
		stream.append(String.format("\t\t}\n"));
		stream.append(String.format("\t\t\n"));
		stream.append(String.format("\t\t/**\n"));
		stream.append(String.format("\t\t * 清空\n"));
		stream.append(String.format("\t\t */\n"));
		stream.append(String.format("\t\tpublic function clear%ss():void\n", typeName));
		stream.append(String.format("\t\t{\n"));
		stream.append(String.format("\t\t\t_list.length=0;\n"));
		stream.append(String.format("\t\t}\n"));
		stream.append(String.format("\t}\n"));
		stream.append(String.format("}\n"));

		return stream;
	}

	// ---------------------------------------------------------------------------------------------
	//
	// 生成 Enum
	//
	// ---------------------------------------------------------------------------------------------

	/**
	 * 生成Enum
	 * 
	 * @param type
	 * @param fsa
	 */
	private void doGenerate(EnumType type, IFileSystemAccess fsa)
	{
		// 分析基本信息
		String packName = getPackNameBy((Type) type);
		String typeName = type.getName();// getTypeShortName(message as Type);
		String typeComm = getNodeCommByPrev((Type) type);

		// 分析字段列表
		ArrayList<Field> fields = new ArrayList<Field>();
		for (EnumField field : type.getFields())
		{
			Field row = new Field();
			row.name = field.getName();
			row.index = field.getIndex();
			row.comm = getNodeCommByNext(field);

			fields.add(row);
		}

		// 构建文件内容
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("package %s\n", packName));
		sb.append("{\n");
		if (typeComm != null)
		{
			sb.append("\t/**\n");
			sb.append("\t * " + typeComm.replaceAll("\\n", "\n\t ") + "\n");
			sb.append("\t */\n");
		}
		sb.append(String.format("\tpublic final class %s\n", typeName));
		sb.append(String.format("\t{\n"));
		for (Field field : fields)
		{
			if (field.comm != null)
			{
				sb.append("\t\t/**\n");
				sb.append("\t\t * " + field.comm.replaceAll("\\n", "\n\t\t ") + "\n");
				sb.append("\t\t */\n");
			}
			sb.append(String.format("\t\tpublic static const %s:int=%s;\n", field.name, field.index));
			sb.append(String.format("\t\t\n"));
		}
		sb.append(String.format("\t}\n"));
		sb.append(String.format("}\n"));

		// 输出文件内容
		fsa.generateFile(packName.replace('.', '/') + "/" + typeName + ".as", sb);

		// --输出错误码提示---
		if ((packName.endsWith("trans") && typeName.equals("ErrorCode")) == false)
		{
			return;
		}

		// 分析错误码类型
		String errorCodePack = getRootPackName();
		if (errorCodePack.endsWith("."))
		{
			errorCodePack = errorCodePack.substring(0, errorCodePack.length() - 1);
		}
		packName = errorCodePack;
		typeName = "ServerError";

		// 构建错误码内容
		StringBuilder txt = new StringBuilder();
		txt.append(String.format("package %s\n", packName));
		txt.append(String.format("{\n"));
		if (typeComm != null)
		{
			txt.append(String.format("\t/**\n"));
			txt.append(String.format("\t * %s\n", typeComm.replaceAll("\\n", "\n\t ")));
			txt.append(String.format("\t */\n"));
		}
		txt.append(String.format("\tpublic final class %s\n", typeName));
		txt.append(String.format("\t{\n"));
		txt.append(String.format("\t\tprivate static var _dic:Object;\n"));
		txt.append(String.format("\t\t\n"));
		txt.append(String.format("\t\tprivate static function init():void\n"));
		txt.append(String.format("\t\t{\n"));
		txt.append(String.format("\t\t\t_dic=new Object();\n"));
		for (Field field : fields)
		{
			txt.append(String.format("\t\t\t_dic[%s]=\">%s\";\n", field.index, field.comm == null ? "" : field.comm.replaceAll("\\n", "")));
		}
		txt.append(String.format("\t\t}\n"));
		txt.append(String.format("\t\t\n"));
		txt.append(String.format("\t\t/**\n"));
		txt.append(String.format("\t\t * 获取错误息\n"));
		txt.append(String.format("\t\t */\n"));
		txt.append(String.format("\t\tpublic static function getError(id:int):String\n"));
		txt.append(String.format("\t\t{\n"));
		txt.append(String.format("\t\t\tif(!_dic)\n"));
		txt.append(String.format("\t\t\t{\n"));
		txt.append(String.format("\t\t\t\tinit();\n"));
		txt.append(String.format("\t\t\t}\n"));
		txt.append(String.format("\t\t\t\n"));
		txt.append(String.format("\t\t\tif(_dic[id]!=null)\n"));
		txt.append(String.format("\t\t\t{\n"));
		txt.append(String.format("\t\t\t\treturn _dic[id].substring(1);\n"));
		txt.append(String.format("\t\t\t}\n"));
		txt.append(String.format("\t\t\treturn _dic[id];\n"));
		txt.append(String.format("\t\t}\n"));
		txt.append(String.format("\t}\n"));
		txt.append(String.format("}\n"));

		// 输出错误码内容
		fsa.generateFile(errorCodePack.replace('.', '/') + "/ServerError.as", txt);
	}

	// ---------------------------------------------------------------------------------------------
	//
	// 工具函数
	//
	// ---------------------------------------------------------------------------------------------

	/**
	 * 获取类型的全局包路径
	 */
	private String getPackNameBy(Type type)
	{
		EObject model = (EObject) type;
		while ((model.eContainer() != null) && !(model instanceof Model))
		{
			model = model.eContainer();
		}

		if (model instanceof Model)
		{
			return getPackNameBy((Model) model);
		}

		return "";
	}

	/**
	 * 获取包名
	 */
	private String getPackNameBy(Model pack)
	{
		String path = "";
		String uri = pack.getName();

		if (uri == null)
		{
			uri = "";
			path = "";

			return getRootPackName();
		}
		else
		{
			String[] list = uri.split("\\.");
			for (String seg : list)
			{
				path = path + "." + normalFieldName(seg);
			}

			return getRootPackName() + path.substring(1).toLowerCase();// substring(1);
		}
	}

	private String getRootPackName()
	{
		return "game.game.server.decoder.";
	}

	/**
	 * 获取类型长名称
	 */
	private String getTypeLongName(Type type)
	{
		String packName = getPackNameBy(type);
		String typeName = getTypeShortName(type);

		if (packName != null && packName.isEmpty() == false)
		{
			typeName = packName + "." + typeName;
		}

		return typeName;
	}

	/**
	 * 获取类型短名称
	 */
	private String getTypeShortName(Type type)
	{
		Type typeRef = type;
		String typeName = normalTypeName(type.getName());

		while (typeRef.eContainer() != null)
		{
			if (typeRef.eContainer() instanceof Type)
			{
				typeRef = (Type) typeRef.eContainer();
				typeName = normalTypeName(typeRef.getName()) + "$" + typeName;
			}
			else if (typeRef.eContainer() instanceof Model)
			{
				if (type instanceof MessageType)
				{
					String modelName = ((Model) typeRef.eContainer()).getName();
					if (modelName == null)
					{
						modelName = "";
					}

					String[] parts = modelName.split("\\.");
					if (parts != null && parts.length > 0)
					{
						String last = parts[parts.length - 1].toLowerCase();
						if (!last.equals("app") && !last.equals("trans"))
						{
							typeName = normalTypeName(parts[parts.length - 1].toLowerCase()) + typeName;
						}
					}
				}
				return typeName;
			}
		}

		return typeName;
	}

	/**
	 * 简单类型到AS类型
	 */
	private String simpleTypeToToAsType(String type)
	{
		if (type.equals("int32"))
		{
			return "int";
		}
		if (type.equals("uint32"))
		{
			return "int";
		}
		if (type.equals("sint32"))
		{
			return "int";
		}
		if (type.equals("int64"))
		{
			return "String";
		}
		if (type.equals("uint64"))
		{
			return "String";
		}
		if (type.equals("sint64"))
		{
			return "String";
		}
		if (type.equals("float"))
		{
			return "Number";
		}
		if (type.equals("double"))
		{
			return "Number";
		}
		if (type.equals("string"))
		{
			return "String";
		}
		if (type.equals("bool"))
		{
			return "Boolean";
		}
		if (type.equals("bytes"))
		{
			return "ByteArray";
		}
		if (type.equals("fixed32"))
		{
			return "int";
		}
		if (type.equals("fixed64"))
		{
			return "Number";
		}
		if (type.equals("sfixed32"))
		{
			return "int";
		}
		if (type.equals("sfixed64"))
		{
			return "Number";
		}

		return "*";
	}

	/**
	 * 统一文件名称
	 */
	private String normalTypeName(String uri)
	{
		/*
		 * if(uri.indexOf("_")!=-1) { var name="";
		 * 
		 * var list=uri.split("_"); for(seg:list) { if(!seg.empty) {
		 * name=name+seg.substring(0,1).toUpperCase()+seg.substring(1); } }
		 * 
		 * return name; }
		 */
		if (uri.length() > 1)
		{
			return uri.substring(0, 1).toUpperCase() + uri.substring(1);
		}
		else
		{
			return uri.toUpperCase();// substring(0,1).toUpperCase();
		}
	}

	/**
	 * 统一类型名称
	 */
	private String normalFieldName(String uri)
	{
		String name = normalTypeName(uri);

		name = name.substring(0, 1).toLowerCase() + name.substring(1);

		return name;
	}

	/**
	 * 获取Has函数名
	 */
	private String toHasFieldName(String uri)
	{
		return "has" + uri.substring(0, 1).toUpperCase() + uri.substring(1);
	}

	/**
	 * 向上获取节点注释
	 */
	private String getNodeCommByPrev(EObject semanticName)
	{
		return getNodeCommBy(semanticName, true);
	}

	/**
	 * 向下获取节点注释
	 */
	private String getNodeCommByNext(EObject semanticName)
	{
		return getNodeCommBy(semanticName, false);
	}

	/**
	 * 获取节点注释
	 */
	private String getNodeCommBy(EObject semanticNode, boolean prefix)
	{
		String nodeComm = "";
		ICompositeNode node = NodeModelUtils.findActualNodeFor(semanticNode);
		if (node != null)
		{
			INode nextNode = node.getNextSibling();
			if (prefix)
			{
				nextNode = node.getPreviousSibling();
			}

			if (nextNode != null)
			{
				nodeComm = nextNode.getText();
				if (nodeComm != null)
				{
					nodeComm = nodeComm.trim();
					if (nodeComm.startsWith("//"))
					{
						nodeComm = nodeComm.substring(2);
					}
					else if (nodeComm.startsWith("/*"))
					{
						nodeComm = nodeComm.substring(2, nodeComm.length() - 2);
					}
					else
					{
						nodeComm = null;
					}
				}
				else
				{
					nodeComm = null;
				}
			}
			else
			{
				nodeComm = null;
			}
		}
		return nodeComm;
	}

	class Field
	{
		public String attr;
		public String name;
		public String comm;
		public int index;

		public String shortType;
		public String nativeType;
		public String actionType;

		public String test;
	}
}
