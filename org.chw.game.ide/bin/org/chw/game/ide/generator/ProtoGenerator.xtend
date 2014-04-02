package org.chw.game.ide.generator

import java.util.ArrayList
import java.util.Collections
import java.util.HashSet
import org.chw.game.ide.proto.EnumType
import org.chw.game.ide.proto.MessageComplexField
import org.chw.game.ide.proto.MessageSimpleField
import org.chw.game.ide.proto.MessageType
import org.chw.game.ide.proto.Model
import org.chw.game.ide.proto.Type
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.chw.game.ide.ProtoRuntimeModule

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

class ProtoGenerator implements IGenerator 
{
	
	/**
	 * 生成资源
	 */
	override void doGenerate(Resource resource, IFileSystemAccess fsa) 
	{
		for(model:resource.allContents.filter(typeof(Model)).toIterable)
		{
			for(message:model.elements)
			{
				if(message instanceof Type)
				{
					generateMessage(message as Type,fsa);
				}
			}
		}
	}
	
	/**
	 * 生成消息
	 */
	def void generateMessage(Type message, IFileSystemAccess fsa)
	{
		if(message instanceof MessageType)
		{
			var packName=getPackNameBy(message as Type);
			var typeName=getTypeShortName(message as Type);
			var typeComm=getNodeCommByPrev(message);
			var imports=new HashSet<String>();
			var fields=new ArrayList<Field>();
			
			var msg=message as MessageType;
			for(field:msg.fields)
			{
				var fieldName=normalFieldName(field.name);
				
				var row=new Field();
				row.attr=field.attr;
				row.name=fieldName;
				row.index=field.index;
				row.nativeType="";
				row.actionType="";
				row.comm=getNodeCommByNext(field);
				row.test=toHasFieldName(fieldName);
				fields.add(row);
				
				if(field instanceof MessageComplexField)
				{
					var complex=field as MessageComplexField;
					
					if(complex.attr.equals("repeated"))
					{
						if(complex.type instanceof EnumType)
						{
							generateSimpleTypeList(fsa,"int");
							
							row.shortType="int32";
							row.nativeType="int32";
							row.actionType=getRootPackName+"base.IntLit";
							imports.add(row.actionType);
							//row.actionType="IntList";
							//imports.add(getRootPackName+"base.IntLit");
						}
						else
						{
							generateComplexTypeList(fsa,complex.type);
							
							row.shortType=getTypeShortName(complex.type);
							row.nativeType=getTypeLongName(complex.type);
							row.actionType=row.nativeType+"List";
							imports.add(row.nativeType);
							imports.add(row.actionType);
							
							//row.nativeType=getTypeShortName(complex.type);
							//row.actionType=row.nativeType+"List";
							
							//var importURI=getTypeLongName(complex.type);
							//imports.add(importURI);
							//imports.add(importURI+"List");
						}
					}
					else
					{
						if(complex.type instanceof EnumType)
						{
							row.nativeType="int32";
							row.actionType="int";
						}
						else
						{
							row.nativeType=getTypeLongName(complex.type);
							row.actionType=row.nativeType;
							imports.add(row.actionType);
							//row.nativeType=getTypeShortName(complex.type);
							//row.actionType=row.nativeType;
							//imports.add(getTypeLongName(complex.type));
						}
					}
				}
				else
				{
					var simple=field as MessageSimpleField;
					var as3Type=simpleTypeToToAsType(simple.type);
					
					if(simple.attr.equals("repeated"))
					{
						generateSimpleTypeList(fsa,as3Type);
						
						row.shortType=as3Type;
						row.nativeType=simple.type;
						row.actionType=getRootPackName()+"base."+as3Type.substring(0,1).toUpperCase+as3Type.substring(1)+"List";
						imports.add(row.actionType);
						//row.actionType=as3Type.substring(0,1).toUpperCase+as3Type.substring(1)+"List";
						//imports.add(getRootPackName()+"base."+row.actionType);
					}
					else
					{
						row.nativeType=simple.type;
						row.actionType=as3Type;
					}
					
					if(as3Type.equals("ByteArray"))
					{
						imports.add("flash.utils.ByteArray");
					}
				}
			}
			
			imports.add(getRootPackName()+"base.SerializeableData");
			
			//SerializeableTypeWriter::generate(fsa,getRootPackName()+"base","SerializeableData");
			var packName1=getRootPackName()+"base";
			var typeName1="SerializeableData";
			fsa.generateFile(packName1.replace('.','/')+"/"+typeName+".as",SerializeableTemplate.getContent(packName1,typeName1));
			
			var importList=new ArrayList<String>();
			for(importItem:imports)
			{
				importList.add(importItem);
			}
			Collections::sort(importList);
			
			
			fsa.generateFile(packName.replace('.','/')+"/"+typeName+".as",write(packName,typeName,typeComm,importList,fields));
			
			for(inner:msg.types)
			{
				generateMessage(inner,fsa);
			}
		}
		else
		{
			var packName=getPackNameBy(message as Type);
			var typeName=message.name;//getTypeShortName(message as Type);
			var typeComm=getNodeCommByPrev(message);
			var fields=new ArrayList<Field>();
			
			var msg=message as EnumType;
			for(field:msg.fields)
			{
				var row=new Field();
				row.name=field.name;
				row.index=field.index;
				row.comm=getNodeCommByNext(field);
				
				fields.add(row);
			}
			
			fsa.generateFile(packName.replace('.','/')+"/"+typeName+".as",write(packName,typeName,typeComm,fields));
			
			if(packName.endsWith("trans") && typeName.equals("ErrorCode"))
			{
				var errorCodePack=getRootPackName();
				if(errorCodePack.endsWith("."))
				{
					errorCodePack=errorCodePack.substring(0,errorCodePack.length-1);
				}
				fsa.generateFile(errorCodePack.replace('.','/')+"/ServerError.as",generateErrorCode(errorCodePack,"ServerError",typeComm,fields));
			}
		}
	}
	
	def String getRootPackName()
	{
		return "game.game.server.decoder.";
	}
	
	/**
	 * 获取包名
	 */
	def String getPackNameBy(Model pack)
	{
		var path="";
		var uri=pack.name;
		
		if(uri==null)
		{
			uri="";
			path="";
			
			return getRootPackName();
		}
		else
		{
			var list=uri.split("\\.");
			for(seg:list)
			{
				path=path+"."+normalFieldName(seg);
			}
			
			return getRootPackName()+path.substring(1).toLowerCase();//substring(1);
		}
	}
	
	/**
	 * 获取类型的全局包路径
	 */
	def String getPackNameBy(Type type)
	{
		var model=type as EObject;
		while((model.eContainer!=null) && !(model instanceof Model))
		{
			model=model.eContainer;
		}
		
		if(model instanceof Model)
		{
			return getPackNameBy(model as Model);
		}
		
		return "";
	}
	
	/**
	 * 获取类型长名称
	 */
	def String getTypeLongName(Type type)
	{
		var packName=getPackNameBy(type);
		var typeName=getTypeShortName(type);
		
		if(packName!=null && packName.empty==false)
		{
			typeName=packName+"."+typeName;
		}
		
		return typeName;
	}
	
	/**
	 * 获取类型短名称
	 */
	def String getTypeShortName(Type type)
	{
		var typeRef=type;
		var typeName=normalTypeName(type.name);
		
		while(typeRef.eContainer!=null)
		{
			if(typeRef.eContainer instanceof Type)
			{
				typeRef=typeRef.eContainer as Type;
				typeName=normalTypeName(typeRef.name)+"$"+typeName;
			}
			else if(typeRef.eContainer instanceof Model)
			{
				if(type instanceof MessageType)
				{
					var modelName=(typeRef.eContainer as Model).name;
					if(modelName==null)
					{
						modelName="";
					}
					
					var parts=modelName.split("\\.");
					if(parts!=null && parts.size>0)
					{
						var last=parts.get(parts.size-1).toLowerCase();
						if(!last.equals("app") && !last.equals("trans"))
						{
							typeName=normalTypeName(parts.get(parts.size-1).toLowerCase())+typeName;
						}
					}
				}
				return typeName;
			}
		}
		
		return typeName;
	}
	
	/**
	 * 向上获取节点注释
	 */
	def String getNodeCommByPrev(EObject semanticName)
	{
		return getNodeCommBy(semanticName,true);
	}
	
	/**
	 * 向下获取节点注释
	 */
	def String getNodeCommByNext(EObject semanticName)
	{
		return getNodeCommBy(semanticName,false);
	}
	
	/**
	 * 获取节点注释
	 */
	def String getNodeCommBy(EObject semanticNode,boolean prefix)
	{
		var nodeComm="";
		var node=NodeModelUtils::findActualNodeFor(semanticNode);
		if(node!=null)
		{
			var nextNode=node.nextSibling;
			if(prefix)
			{
				nextNode=node.previousSibling;
			}
			
			if(nextNode!=null)
			{
				nodeComm=nextNode.text;
				if(nodeComm!=null)
				{
					nodeComm=nodeComm.trim();
					if(nodeComm.startsWith("//"))
					{
						nodeComm=nodeComm.substring(2);
					}
					else if(nodeComm.startsWith("/*"))
					{
						nodeComm=nodeComm.substring(2,nodeComm.length-2);
					}
					else
					{
						nodeComm=null;
					}
				}
				else
				{
					nodeComm=null;
				}
			}
			else
			{
				nodeComm=null;
			}
		}
		return nodeComm;
	}
	
	/**
	 * 统一文件路径
	 */
	def String normalPath(String uri)
	{
		var path="";
		var list=uri.split("\\.");
		for(segment:list)
		{
			var part=normalFieldName(segment);
			var seg=part.substring(0,1).toLowerCase()+part.substring(1);
			path=path+"/"+seg;
		}
		if(!path.empty)
		{
			path=path.substring(1);
		}
		return path;
	}
	
	/**
	 * 统一文件名称
	 */
	def String normalTypeName(String uri)
	{
		/*
		if(uri.indexOf("_")!=-1)
		{
			var name="";
			
			var list=uri.split("_");
			for(seg:list)
			{
				if(!seg.empty)
				{
					name=name+seg.substring(0,1).toUpperCase()+seg.substring(1);
				}
			}
			
			return name;
		}
		*/
		if(uri.length>1)
		{
			return uri.substring(0,1).toUpperCase()+uri.substring(1);
		}
		else
		{
			return uri.toUpperCase();//substring(0,1).toUpperCase();
		}
	}
	
	/**
	 * 统一类型名称
	 */
	def String normalFieldName(String uri)
	{
		var name=normalTypeName(uri);
		
		name=name.substring(0,1).toLowerCase()+name.substring(1);
		
		return name;
	}
	
	/**
	 * 获取Has函数名
	 */
	def String toHasFieldName(String uri)
	{
		return "has"+uri.substring(0,1).toUpperCase()+uri.substring(1);
	}
	
	
	/**
	 * 消息类型模板
	 */
	def write(String packName,String typeName,String typeComm,ArrayList<String> imports,ArrayList<Field> fields)
	'''
		package «packName»
		{
			import flash.utils.IDataInput;
			import flash.utils.IDataOutput;
			import flash.utils.ByteArray;
			«FOR importRow:imports»
			import «importRow»;
			«ENDFOR»
			
			«IF typeComm!=null»
			/**
			 * «typeComm»
			 */
			«ENDIF»
			public final class «typeName» extends SerializeableData
			{
				private var _dic:Object={};
				
				/**
				 * 内部字典对象
				 */
				public function getInner():Object
				{
					return _dic;
				}
				
				«FOR field:fields»
				/**
				 * «field.name» 是否有效
				 */
				public function get «field.test»():Boolean
				{
					return _dic[«field.index»]!=null;
				}
				
				«IF field.comm!=null»
				/**
				 * «field.comm»
				 */
				 «ENDIF»
				public function get «field.name»():«field.actionType»
				{
					return _dic[«field.index»];
				}
				public function set «field.name»(value:«field.actionType»):void
				{
					_dic[«field.index»]=value;
				}
				
				«ENDFOR»
				
				/**
				 * 反序列化
				 */
				public override function deserialize(input:ByteArray,endPos:int=int.MAX_VALUE):void
				{
					var tag:int=readTagFrom(input);
					
					while(tag!=0)
					{
						var fieldNum:int=getFieldNum(tag);
						
						switch(fieldNum)
						{
							«FOR field:fields»
							case «field.index»:
							{
								«IF field.attr.equals("repeated")»
									var items_«field.index»:«field.actionType»=_dic[«field.index»];
									if(!items_«field.index»)
									{
										items_«field.index»=_dic[«field.index»]=new «field.actionType»();
									}
									«IF field.nativeType.equals("int32")»
										items_«field.index».addInt(readInt32From(input));
									«ELSEIF field.nativeType.equals("uint32")»
										items_«field.index».addInt(readUInt32From(input));
									«ELSEIF field.nativeType.equals("sint32")»
										items_«field.index».addInt(readSInt32From(input));
									«ELSEIF field.nativeType.equals("int64")»
										items_«field.index».addString(readInt64From(input));
									«ELSEIF field.nativeType.equals("uint64")»
										items_«field.index».addString(readUInt64From(input));
									«ELSEIF field.nativeType.equals("sint64")»
										items_«field.index».addString(readSInt64From(input));
									«ELSEIF field.nativeType.equals("float")»
										items_«field.index».addNumber(readFloatFrom(input));
									«ELSEIF field.nativeType.equals("double")»
										items_«field.index».addNumber(readDoubleFrom(input));
									«ELSEIF field.nativeType.equals("bool")»
										items_«field.index».addBoolean(readBoolFrom(input));
									«ELSEIF field.nativeType.equals("string")»
										items_«field.index».addString(readStringFrom(input));
									«ELSEIF field.nativeType.equals("bytes")»
										items_«field.index».addByteArray(readBytesFrom(input));
									«ELSEIF field.nativeType.equals("enum")»
										items_«field.index».addInt(readint32From(input));
									«ELSE»
										var item_«field.index»:«field.nativeType»=new «field.nativeType»();
										var item_«field.index»_len:int=readInt32From(input);
										var item_«field.index»_end:int=input.position+item_«field.index»_len;
										if(item_«field.index»_len>0)
										{
											item_«field.index».deserialize(input,item_«field.index»_end);
										}
										input.position=item_«field.index»_end;
										items_«field.index».add«field.shortType»(item_«field.index»);
									«ENDIF»
									break;
								«ELSE»
									«IF field.nativeType.equals("int32")»
										_dic[«field.index»]=readInt32From(input);
										break;
									«ELSEIF field.nativeType.equals("uint32")»
										_dic[«field.index»]=readUInt32From(input);
										break;
									«ELSEIF field.nativeType.equals("sint32")»
										_dic[«field.index»]=readSInt32From(input);
										break;
									«ELSEIF field.nativeType.equals("int64")»
										_dic[«field.index»]=readInt64From(input);
										break;
									«ELSEIF field.nativeType.equals("uint64")»
										_dic[«field.index»]=readUInt64From(input);
										break;
									«ELSEIF field.nativeType.equals("sint64")»
										_dic[«field.index»]=readSInt64From(input);
										break;
									«ELSEIF field.nativeType.equals("float")»
										_dic[«field.index»]=readFloatFrom(input);
										break;
									«ELSEIF field.nativeType.equals("double")»
										_dic[«field.index»]=readDoubleFrom(input);
										break;
									«ELSEIF field.nativeType.equals("bool")»
										_dic[«field.index»]=readBoolFrom(input);
										break;
									«ELSEIF field.nativeType.equals("string")»
										_dic[«field.index»]=readStringFrom(input);
										break;
									«ELSEIF field.nativeType.equals("bytes")»
										_dic[«field.index»]=readBytesFrom(input);
										break;
									«ELSEIF field.nativeType.equals("enum")»
										_dic[«field.index»]=readInt32From(input);
										break;
									«ELSE»
										var «field.name»:«field.actionType»=new «field.actionType»();
										var «field.name»_len:int=readInt32From(input);
										var «field.name»_end:int=input.position+«field.name»_len;
										if(«field.name»_len>0)
										{
											«field.name».deserialize(input,«field.name»_end);
										}
										input.position=«field.name»_end;
										_dic[«field.index»]=«field.name»;
										break;
									«ENDIF»
								«ENDIF»
							}
							«ENDFOR»
							default:
							{
								skipFieldFrom(input,tag);
							}
						}
						
						tag=input.position<endPos ? readTagFrom(input):0;
					}
				}
				
				/**
				 * 序列化
				 */
				public override function serialize(output:IDataOutput):void
				{
					«FOR field:fields»
					if(_dic[«field.index»]!=null)
					{
						«IF field.attr.equals("repeated")»
							«IF field.nativeType.equals("int32")»
							var «field.name»s:«field.actionType»=_dic[«field.index»];
							for(var i«field.index»:int=0;i«field.index»<«field.name»s.numInts;i«field.index»++)
							{
								writeInt32To(output,«field.index»,«field.name»s.getIntAt(i«field.index»));
							}
							«ELSEIF field.nativeType.equals("uint32")»
							var «field.name»s:«field.actionType»=_dic[«field.index»];
							for(var i«field.index»:int=0;i«field.index»<«field.name»s.numInts;i«field.index»++)
							{
								writeUInt32To(output,«field.index»,«field.name»s.getIntAt(i«field.index»));
							}
							«ELSEIF field.nativeType.equals("sint32")»
							var «field.name»s:«field.actionType»=_dic[«field.index»];
							for(var i«field.index»:int=0;i«field.index»<«field.name»s.numInts;i«field.index»++)
							{
								writeSInt32To(output,«field.index»,«field.name»s.getIntAt(i«field.index»));
							}
							«ELSEIF field.nativeType.equals("int64")»
							var «field.name»s:«field.actionType»=_dic[«field.index»];
							for(var i«field.index»:int=0;i«field.index»<«field.name»s.numStrings;i«field.index»++)
							{
								writeInt64To(output,«field.index»,«field.name»s.getStringAt(i«field.index»));
							}
							«ELSEIF field.nativeType.equals("uint64")»
							var «field.name»s:«field.actionType»=_dic[«field.index»];
							for(var i«field.index»:int=0;i«field.index»<«field.name»s.numStrings;i«field.index»++)
							{
								writeUInt64To(output,«field.index»,«field.name»s.getStringAt(i«field.index»));
							}
							«ELSEIF field.nativeType.equals("sint64")»
							var «field.name»s:«field.actionType»=_dic[«field.index»];
							for(var i«field.index»:int=0;i«field.index»<«field.name»s.numStrings;i«field.index»++)
							{
								writeSInt64To(output,«field.index»,«field.name»s.getStringAt(i«field.index»));
							}
							«ELSEIF field.nativeType.equals("float")»
							var «field.name»s:«field.actionType»=_dic[«field.index»];
							for(var i«field.index»:int=0;i«field.index»<«field.name»s.numNumbers;i«field.index»++)
							{
								writeFloatTo(output,«field.index»,«field.name»s.getNumberAt(i«field.index»));
							}
							«ELSEIF field.nativeType.equals("double")»
							var «field.name»s:«field.actionType»=_dic[«field.index»];
							for(var i«field.index»:int=0;i«field.index»<«field.name»s.numNumbers;i«field.index»++)
							{
								writeDoubleTo(output,«field.index»,«field.name»s.getNumberAt(i«field.index»));
							}
							«ELSEIF field.nativeType.equals("bool")»
							var «field.name»s:«field.actionType»=_dic[«field.index»];
							for(var i«field.index»:int=0;i«field.index»<«field.name»s.numBooleans;i«field.index»++)
							{
								writeBoolTo(output,«field.index»,«field.name»s.getBooleanAt(i«field.index»));
							}
							«ELSEIF field.nativeType.equals("string")»
							var «field.name»s:«field.actionType»=_dic[«field.index»];
							for(var i«field.index»:int=0;i«field.index»<«field.name»s.numStrings;i«field.index»++)
							{
								writeStringTo(output,«field.index»,«field.name»s.getStringAt(i«field.index»));
							}
							«ELSEIF field.nativeType.equals("bytes")»
							var «field.name»s:«field.actionType»=_dic[«field.index»];
							for(var i«field.index»:int=0;i«field.index»<«field.name»s.numByteArrays;i«field.index»++)
							{
								writeBytesTo(output,«field.index»,«field.name»s.getByteArrayAt(i«field.index»));
							}
							«ELSEIF field.nativeType.equals("enum")»
							var «field.name»s:«field.actionType»=_dic[«field.index»];
							for(var i«field.index»:int=0;i«field.index»<«field.name»s.numInts;i«field.index»++)
							{
								writeEnumTo(output,«field.index»,«field.name»s.getIntAt(i«field.index»));
							}
							«ELSE»
							var «field.name»s:«field.actionType»=_dic[«field.index»];
							for(var i«field.index»:int=0;i«field.index»<«field.name»s.num«field.shortType»s;i«field.index»++)
							{
								writeMessageTo(output,«field.index»,«field.name»s.get«field.shortType»At(i«field.index»));
							}
							«ENDIF»
						«ELSE»
							«IF field.nativeType.equals("int32")»
								writeInt32To(output,«field.index»,_dic[«field.index»]);
							«ELSEIF field.nativeType.equals("uint32")»
								writeUInt32To(output,«field.index»,_dic[«field.index»]);
							«ELSEIF field.nativeType.equals("sint32")»
								writeSInt32To(output,«field.index»,_dic[«field.index»]);
							«ELSEIF field.nativeType.equals("int64")»
								writeInt64To(output,«field.index»,_dic[«field.index»]);
							«ELSEIF field.nativeType.equals("uint64")»
								writeUInt64To(output,«field.index»,_dic[«field.index»]);
							«ELSEIF field.nativeType.equals("sint64")»
								writeSInt64To(output,«field.index»,_dic[«field.index»]);
							«ELSEIF field.nativeType.equals("float")»
								writeFloatTo(output,«field.index»,_dic[«field.index»]);
							«ELSEIF field.nativeType.equals("double")»
								writeDoubleTo(output,«field.index»,_dic[«field.index»]);
							«ELSEIF field.nativeType.equals("bool")»
								writeBoolTo(output,«field.index»,_dic[«field.index»]);
							«ELSEIF field.nativeType.equals("string")»
								writeStringTo(output,«field.index»,_dic[«field.index»]);
							«ELSEIF field.nativeType.equals("bytes")»
								writeBytesTo(output,«field.index»,_dic[«field.index»]);
							«ELSEIF field.nativeType.equals("enum")»
								writeEnumTo(output,«field.index»,_dic[«field.index»]);
							«ELSE»
								writeMessageTo(output,«field.index»,_dic[«field.index»]);
							«ENDIF»
						«ENDIF»
					}
					«ENDFOR»
				}
			}
		}
	'''
	
	/**
	 * 枚举类型模板
	 */
	def write(String packName,String typeName,String typeComm,ArrayList<Field> fields)
	'''
		package «packName»
		{
			«IF typeComm!=null»
			/**
			 * «typeComm»
			 */
			«ENDIF»
			public final class «typeName»
			{
				«FOR field:fields»
				«IF field.comm!=null»
				/**
				 * «field.comm»
				 */
				«ENDIF»
				public static const «field.name»:int=«field.index»;
				
				«ENDFOR»
			}
		}
	'''
	
	def generateErrorCode(String packName,String typeName,String typeComm,ArrayList<Field> fields)
	'''
		package «packName»
		{
			«IF typeComm!=null»
			/**
			 * «typeComm»
			 */
			«ENDIF»
			public final class «typeName»
			{
				private static var _dic:Object;
				
				private static function init():void
				{
					_dic=new Object();
					«FOR field:fields»
					_dic[«field.index»]="«field.comm»";
					«ENDFOR»
				}
				
				/**
				 * 获取错误息
				 */
				public static function getError(id:int):String
				{
					if(!_dic)
					{
						init();
					}
					
					return _dic[id];
				}
			}
		}
	'''
	
	//-------------------------------------------------------------------------------------------------------------------------
	
	/**
	 * 简单类型到AS类型
	 */
	def simpleTypeToToAsType(String type)
	{
		switch(type)
		{
			case "int32":"int"
			case "uint32":"int"
			case "sint32":"int"
			case "int64":"String"
			case "uint64":"String"
			case "sint64":"String"
			case "float":"Number"
			case "double":"Number"
			case "string":"String"
			case "bool":"Boolean"
			case "bytes":"ByteArray"
		}
	}
	
	/**
	 * 生成简单类型列表
	 */
	def generateSimpleTypeList(IFileSystemAccess fsa,String as3Type)
	{
		var importPath="";
		if(as3Type.equals("ByteArray"))
		{
			importPath="flash.utils.ByteArray"
		}
		
		var packName=getRootPackName()+"base";
		var typeName=as3Type.substring(0,1).toUpperCase()+as3Type.substring(1);
		var fileName=packName;
		
		fsa.generateFile(fileName.replace('.','/')+"/"+typeName+"List.as",write(packName,importPath,typeName,as3Type));
	}
	
	/**
	 * 生成复杂类型列表
	 */
	def generateComplexTypeList(IFileSystemAccess fsa,Type defType)
	{
		var packName=getPackNameBy(defType);
		var shortName=getTypeShortName(defType);
		var fileName=packName.replace('.','/')+"/"+shortName+"List.as";
		
		fsa.generateFile(fileName,write(packName,null,shortName,shortName));
	}
	
	/**
	 * 写入列表类型
	 */
	def write(String packName,String importType,String typeName,String as3TypeName)
	'''
		package «packName»
		{
			«IF importType!=null && !importType.isEmpty»
			import «importType»;
			
			«ENDIF»
			public final class «typeName»List
			{
				private var _list:Array=new Array();
				
				/**
				 * 列表元素个数
				 */
				public function get num«typeName»s():int
				{
					return _list.length;
				}
				
				/**
				 * 获取指定索引处的列表元素
				 */
				public function get«typeName»At(index:int):«as3TypeName»
				{
					return _list[index];
				}
				
				/**
				 * 添加
				 */
				public function add«typeName»(item:«as3TypeName»):void
				{
					_list.push(item);
				}
				
				/**
				 * 删除
				 */
				public function remove«typeName»(value:«as3TypeName»):void
				{
					var index:int=_list.indexOf(value);
					if(index!=-1)
					{
						_list.splice(index,1);
					}
				}
				
				/**
				 * 清空
				 */
				public function clear«typeName»s():void
				{
					_list.length=0;
				}
			}
		}
	'''
}
