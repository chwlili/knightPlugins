
package org.chw.game.ide.generator

import org.eclipse.xtext.generator.IFileSystemAccess

class SerializeableTypeWriter 
{
	/**
	 * 生成资源
	 */
	def static void generate(IFileSystemAccess fsa,String packName,String typeName) 
	{
		fsa.generateFile(packName.replace('.','/')+"/"+typeName+".as",generateContent(packName,typeName));
	}
	
	
	/**
	 * 生成内容
	 */
	def static generateContent(String packName,String typeName)
	'''
		package «packName»
		{
			import flash.display.BitmapData;
			import flash.geom.Rectangle;
			import flash.utils.ByteArray;
			import flash.utils.Endian;
			import flash.utils.IDataInput;
			import flash.utils.IDataOutput;
			
			public class «typeName»
			{
				//
				private const VARINT:int=0;
				private const FIXED64:int=1;
				private const BYTES:int=2;
				private const START_GROUP:int=3;
				private const END_GROUP:int=4;
				private const FIXED32:int=5;
				private const zlibBitmap:Boolean=true;
						
				protected var _tags:Array=[];
				
				/**
				 * 从字节流反序列化 
				 * @param input
				 * 
				 */		
				public function deserialize(input:ByteArray,endPos:int=int.MAX_VALUE):void
				{
					
				}
				
				/**
				 * 序列化 
				 * @return 
				 * 
				 */		
				public function serialize(output:IDataOutput):void
				{
					
				}
				
				/**
				 * 转换为字节数组
				 * @return 
				 * 
				 */		
				public function toByteArray():ByteArray
				{
					var bytes:ByteArray=new ByteArray();
					var tmp:ByteArray;
					var swap:ByteArray=new ByteArray();
					
					serialize(bytes);
					bytes.position=0;			
					
					while(_tags.length>0)
					{
						var last:int=_tags.pop();
						writeRawVarint32To(swap,makeTag(last,2));
						writeRawVarint32To(swap,bytes.length);
						
						bytes.position=0;
						writeRawBytesTo(swap,bytes);
						
						bytes.length=0;
						tmp=bytes;
						bytes=swap;
						swap=tmp;
					}
					
					return bytes;
				}
				
				
				/**
				 * 跳过字段 
				 * @param tag
				 * @return 
				 * 
				 */		
				protected function skipFieldFrom(input:IDataInput,tag:int):void
				{
					var mask:int=(1<<3)-1;
					var type:int=tag & mask;
					
					switch(type)
					{
						case VARINT:
						{
							//varint
							for(var i:int=0;i<10;i++)
							{
								if(readRawByteFrom(input)>=0)
								{
									return;
								}
							}
							break;
						}
						case FIXED64:
						{
							//64-bit
							readRawLittleEndian64From(input);
							break;
						}
						case BYTES:
						{
							//定长
							readRawBytesFrom(input,readRawVarint32From(input));
							break;
						}
						case START_GROUP:
						{
							//start group
							throw new Error("未实现start group");
							/*
							var innerTag:int;
							while(true)
							{
							innerTag=readTagFrom(input);
							if(innerTag==0 || skipFieldFrom(input,innerTag)==false)
							{
							break;
							}
							}
							if(innerTag!=WireFormat.makeTag(WireFormat.getTagFieldNumber(tag),WireFormat.WIRETYPE_END_GROUP))
							{
							throw new Error("END-GROUP TAG 未找到！");
							}*/
							break;
						}
						case END_GROUP:
						{
							//end group
							throw new Error("未实现end group");
							break;
						}
						case FIXED32:
						{
							//32-bit
							readRawLittleEndian32From(input);
							break;
						}
					}
				}
				
				/**
				 * 获取字段的序号 
				 * @param tag
				 * @return 
				 * 
				 */		
				protected function getFieldNum(tag:int):int
				{
					return tag>>3;
				}
				
				
				//-------------------------------------------------------------------------
				//
				// 基本数据类型的读取
				//
				//-------------------------------------------------------------------------
				
				/**
				 * ZigZag32解码 
				 * @param n
				 * @return 
				 * 
				 */		
				protected function decodeZigZag32(n:uint):int
				{
					return (n>>>1) ^ -(n & 1);
				}
				
				/**
				 * ZigZag64解码 
				 * @param n
				 * @return 
				 * 
				 */		
				/*protected function decodeZigZag64(n:BigInteger):BigInteger
				{
					var nA:BigInteger=n.shiftRight(1);
					var nB:BigInteger=n.and(BigInteger.ONE);
					return nA.xor(nB);
				}*/
				
				/**
				 * 读取一个Tag 
				 * @return 
				 * 
				 */		
				protected function readTagFrom(input:IDataInput):int
				{
					if(input.bytesAvailable!=0)
					{
						return readRawVarint32From(input);
					}
					else
					{
						return 0;
					}
				}
				
				
				/**
				 * 读取一个字节 
				 * @return 
				 * 
				 */		
				protected function readRawByteFrom(input:IDataInput):int
				{
					return input.readByte();
				}
				
				/**
				 * 读取一个32位的Varint 
				 * @return 
				 * 
				 */		
				protected function readRawVarint32From(input:IDataInput):int
				{
					var tmp:int=readRawByteFrom(input);
					
					if(tmp>=0)
					{
						return tmp;
					}
					
					var result:int=tmp & 0x7F;
					
					if((tmp=readRawByteFrom(input))>=0)
					{
						result |= tmp<<7;
					}
					else
					{
						result |= ( tmp & 0x7F )<<7;
						
						if((tmp=readRawByteFrom(input))>=0)
						{
							result |= tmp<<14;
						}
						else
						{
							result |= (tmp & 0x7F )<<14;
							
							if((tmp=readRawByteFrom(input))>=0)
							{
								result |= tmp<<21;
							}
							else
							{
								result |= (tmp&0x7F)<<21;
								
								if((tmp=readRawByteFrom(input))>=0)
								{
									result |= tmp<<28;
								}
								else
								{
									result |= (tmp&0xfF)<<28;
									
									for(var i:int=0;i<5;i++)
									{
										if(readRawByteFrom(input)>=0)
										{
											return result;
										}
									}
									throw new Error("读取Varint32时遇到无效的Varint！");
								}
							}
						}
					}
					return result;
				}
				
				/**
				 * 读取一个64位的Varint 
				 * @return 
				 * 
				 */		
				public function readRawVarint64From(input:IDataInput):String
				{
					var key:String="";
					var step:int=0;
					
					while(step<10)
					{
						var byte:uint=input.readUnsignedByte();
						var byteChar:String=(byte & 0x7F).toString(2);
						while(byteChar.length<7)
						{
							byteChar="0"+byteChar;
						}
						key=byteChar+key;
						
						if((byte & 0x80)==0)
						{
							break;
						}
						
						step++;
					}
					
					var id:String="";
					if(key.length>=32)
					{
						id=parseInt(key.substr(key.length-32),2).toString(16);
						while(id.length<8)
						{
							id="0"+id;
						}
					}
					if(key.length>32)
					{
						id=parseInt(key.substr(0,key.length-32),2).toString(16)+id;
					}
					if(id.length%2!=0)
					{
						id="0"+id;
					}
					
					return id;
				}
				
				/**
				 * 读取一个32位的浮点数 
				 * @return 
				 * 
				 */		
				protected function readRawLittleEndian32From(input:IDataInput):Number
				{
					var endian:String=input.endian;
					input.endian=Endian.LITTLE_ENDIAN;
					var result:Number=input.readFloat();
					input.endian=endian;
					
					return result;
				}
				
				/**
				 * 读取一个64位的浮点数 
				 * @return 
				 * 
				 */		
				protected function readRawLittleEndian64From(input:IDataInput):Number
				{
					var endian:String=input.endian;
					input.endian=Endian.LITTLE_ENDIAN;
					var result:Number=input.readDouble();
					input.endian=endian;
					
					return result;
				}
				
				/**
				 * 读取一个字节流 
				 * @param size
				 * @return 
				 * 
				 */		
				protected function readRawBytesFrom(input:IDataInput,size:uint):ByteArray
				{
					var bytes:ByteArray=new ByteArray();
					
					if(size!=0)
					{
						input.readBytes(bytes,0,size);
					}
					
					return bytes;
				}
				
				
				//------------------------------------------------------------------------------------------------------
				//
				//  反序列化读取
				//
				//-------------------------------------------------------------------------------------------------------
				
				/**
				 * 读取一个32位的int 
				 * @return 
				 * 
				 */		
				protected function readInt32From(input:IDataInput):int
				{
					return readRawVarint32From(input);
				}
				
				/**
				 * 读取一个32位的无符号int 
				 * @return 
				 * 
				 */		
				protected function readUInt32From(input:IDataInput):int
				{
					return readRawVarint32From(input);
				}
				
				/**
				 * 读取一个32位的有符号int 
				 * @return 
				 * 
				 */		
				protected function readSInt32From(input:IDataInput):int
				{
					return decodeZigZag32(readRawVarint32From(input));
				}
				
				
				
				/**
				 * 读取一个64位的int 
				 * @return 
				 * 
				 */		
				protected function readInt64From(input:IDataInput):String
				{
					return readRawVarint64From(input);
				}
				
				/**
				 * 读取一个64位的无符号int 
				 * @return 
				 * 
				 */		
				protected function readUInt64From(input:IDataInput):String
				{
					return readRawVarint64From(input);
				}
				
				/**
				 * 读取一个64位的有符号int 
				 * @return 
				 * 
				 */		
				protected function readSInt64From(input:IDataInput):String
				{
					//return decodeZigZag64(readRawVarint64From(input));
					return readRawVarint64From(input);
				}
				
				
				
				
				/**
				 * 读取一个32位的浮点数
				 * @return 
				 * 
				 */		
				protected function readFloatFrom(input:IDataInput):Number
				{
					return readRawLittleEndian32From(input);
				}
				
				/**
				 * 读取一个Fixed32数值
				 * @return 
				 * 
				 */		
				protected function readFixed32From(input:IDataInput):Number
				{
					return readRawLittleEndian32From(input);
				}
				
				/**
				 * 读取一个SFixed32数值 
				 * @return 
				 * 
				 */		
				protected function readSFixed32From(input:IDataInput):Number
				{
					return readRawLittleEndian32From(input);
				}
				
				
				
				
				
				/**
				 * 读取一个64位的浮点数 
				 * @return 
				 * 
				 */		
				protected function readDoubleFrom(input:IDataInput):Number
				{
					return readRawLittleEndian64From(input);
				}
				
				/**
				 * 读取一个Fixed64数值 
				 * @return 
				 * 
				 */		
				protected function readFixed64From(input:IDataInput):Number
				{
					return readRawLittleEndian64From(input);
				}
				
				/**
				 * 读取一个SFixed64数值 
				 * @return 
				 * 
				 */		
				protected function readSFixed64From(input:IDataInput):Number
				{
					return readRawLittleEndian64From(input);
				}
				
				
				
				/**
				 * 读取一个布尔值 
				 * @return 
				 * 
				 */		
				protected function readBoolFrom(input:IDataInput):Boolean
				{
					return readRawVarint32From(input) !=0;
				}
				
				
				
				/**
				 * 读取一个枚举值 
				 * @return 
				 * 
				 */		
				protected function readEnumFrom(input:IDataInput):int
				{
					return readRawVarint32From(input);
				}
				
				
				
				/**
				 * 读取一个字符串 
				 * @return 
				 * 
				 */		
				protected function readStringFrom(input:IDataInput):String
				{
					return input.readUTFBytes(readRawVarint32From(input));
				}
				
				
				
				/**
				 * 读取一个字节流 
				 * @return 
				 * 
				 */		
				protected function readBytesFrom(input:IDataInput):ByteArray
				{
					return readRawBytesFrom(input,readRawVarint32From(input));
				}
				
				
				
				/**
				 * 读取一个位图 
				 * @param input
				 * @return 
				 * 
				 */		
				protected function readBitmapFrom(input:IDataInput):BitmapData
				{
					var bytes:ByteArray=readRawBytesFrom(input,readRawVarint32From(input));
					bytes.position=0;
					
					var w:uint=bytes.readUnsignedInt();
					var h:uint=bytes.readUnsignedInt();
					var zlibed:Boolean=bytes.readBoolean();
					var datas:ByteArray=new ByteArray();
					bytes.readBytes(datas);
					if(zlibed)
					{
						datas.uncompress();
					}
					
					datas.position=0;
					var bitmap:BitmapData=new BitmapData(w,h,true,0xff000000);
					bitmap.setPixels(new Rectangle(0,0,w,h),datas);
					
					return bitmap;
				}
				
				
				//----------------------------------------------------------------------------------------------------------------------------
				//
				//  序列化
				//
				//----------------------------------------------------------------------------------------------------------------------------
				
				
				//-------------------------------------------------------------------------
				//
				// 静态函数
				//
				//-------------------------------------------------------------------------
				
				/**
				 * 对一个32位int值进行ZigZag编码 
				 * @param n
				 * @return 
				 * 
				 */		
				protected function encodeZigZag32(n:int):int
				{
					return (n<<1)^(n>>31);
				}
				
				/**
				 * 对一个64位int值进行ZigZag编码 
				 * @param n
				 * @return 
				 * 
				 */		
				/*protected function encodeZigZag64(n:BigInteger):BigInteger
				{
					var nA:BigInteger=n.shiftLeft(1);
					var nB:BigInteger=n.shiftRight(63);
					return nA.xor(nB);
				}*/
				
				/**
				 * 生成一个Tag 
				 * @param fieldNumber
				 * @param wireType
				 * 
				 */		
				protected function makeTag(fieldNumber:int,wireType:int):int
				{
					return (fieldNumber<<3)|wireType;
				}
				
				//-------------------------------------------------------------------------
				//
				// 基本数据类型的写入
				//
				//-------------------------------------------------------------------------
				
				/**
				 * 写入一个字节 
				 * @param value
				 * 
				 */		
				public function writeRawByteTo(output:IDataOutput,value:int):void
				{
					output.writeByte(value);
				}
				
				/**
				 * 写入一个字节数组 
				 * @param value
				 * @param offset
				 * @param length
				 * 
				 */		
				public function writeRawBytesTo(output:IDataOutput,value:ByteArray):void
				{
					output.writeBytes(value,0,value.length);
				}
				
				/**
				 * 写入一个字节数组的部分字节 
				 * @param value
				 * @param offset
				 * @param length
				 * 
				 */		
				public function writeRawBytesPartialTo(output:IDataOutput,value:ByteArray,offset:uint=0,length:uint=0):void
				{
					output.writeBytes(value,offset,length);
				}
				
				/**
				 * 写入一个TAG 
				 * @param fieldNumber
				 * @param wireType
				 * 
				 */		
				public function writeTagTo(output:IDataOutput,fieldNumber:int,wireType:int):void
				{
					writeRawVarint32To(output,makeTag(fieldNumber,wireType));
				}
				
				/**
				 * 写入一个32位的Varint 
				 * @param value
				 * 
				 */		
				public function writeRawVarint32To(output:IDataOutput,value:int):void
				{
					while(true)
					{
						if((value & ~0x7F)==0)
						{
							writeRawByteTo(output,value);
							return;
						}
						else
						{
							writeRawByteTo(output,(value & 0x7F)|0x80);
							value>>>=7;
						}
					}
				}
				
				/**
				 * 写入一个64位的Varint 
				 * @param value
				 * 
				 */		
				public function writeRawVarint64To(output:IDataOutput,value:String):void
				{
					if(value.length%2!=0)
					{
						value="0"+value;
					}
					
					var i:int=0;
					var bits:String="";
					
					while(i<value.length)
					{
						var byte:uint=parseInt(value.substr(i,2),16);
						var byteBits:String=byte.toString(2);;
						while(byteBits.length<8)
						{
							byteBits="0"+byteBits;
						}
						bits+=byteBits;
						
						i++;
						i++;
					}
					
					var index:int=bits.indexOf("1");
					if(index!=-1)
					{
						bits=bits.substr(index);
					}
					
					var r:int=bits.length;
					
					while(r>0)
					{
						var left:int=Math.max(0,r-7);
						var right:int=r;
						
						var val:uint=parseInt(bits.substring(left,right),2);
						if(r>7)
						{
							val|=0x80;
						}
						writeRawByteTo(output,val);
						r-=7;
					}
				}
				
				/**
				 * 以低位在前的方式写入一个32位浮点数 
				 * @param value
				 * 
				 */		
				public function writeRawLittleEndian32To(output:IDataOutput,value:Number):void
				{
					var endian:String=output.endian;
					output.endian=Endian.LITTLE_ENDIAN;
					output.writeFloat(value);
					output.endian=endian;
				}
				
				/**
				 * 以低位在前的方式写入一个64位浮点数 
				 * @param value
				 * 
				 */		
				public function writeRawLittleEndian64To(output:IDataOutput,value:Number):void
				{
					var endian:String=output.endian;
					output.endian=Endian.LITTLE_ENDIAN;
					output.writeDouble(value);
					output.endian=endian;
				}
				
				//-------------------------------------------------------------------------
				//
				// protobuf数据类型的写入
				//
				//-------------------------------------------------------------------------
				
				
				/**
				 * 写入一个布尔值 
				 * @param fieldNumber
				 * @param value
				 * 
				 */		
				public function writeBoolTo(output:IDataOutput,fieldNumber:int,value:Boolean):void
				{
					writeTagTo(output,fieldNumber,VARINT);
					writeRawByteTo(output,value ? 1 : 0 );
				}
				
				
				/**
				 * 写入一个枚举值 
				 * @param fieldNumber
				 * @param value
				 * 
				 */		
				public function writeEnumTo(output:IDataOutput,fieldNumber:int,value:int):void
				{
					writeTagTo(output,fieldNumber,VARINT);
					writeRawVarint32To(output,value);
				}
				
				
				/**
				 * 写入一个定长字符串 
				 * @param fieldNumber
				 * @param value
				 * 
				 */		
				public function writeStringTo(output:IDataOutput,fieldNumber:int,value:String):void
				{	
					var bytes:ByteArray=new ByteArray();
					bytes.writeUTFBytes(value);
					bytes.position=0;
					
					writeTagTo(output,fieldNumber,BYTES);	
					writeRawVarint32To(output,bytes.length);
					writeRawBytesTo(output,bytes);
				}
				
				/**
				 * 写入一个写长字节数组 
				 * @param fieldNumber
				 * @param value
				 * 
				 */		
				public function writeBytesTo(output:IDataOutput,fieldNumber:int,value:ByteArray):void
				{
					writeTagTo(output,fieldNumber,BYTES);
					
					value.position=0;
					writeRawVarint32To(output,value.length);
					writeRawBytesTo(output,value);
				}
				
				/**
				 * 写入一个位图的数据 
				 * @param output
				 * @param fieldNumber
				 * @param value
				 * 
				 */		
				public function writeBitmapTo(output:IDataOutput,fieldNumber:int,value:BitmapData):void
				{
					var bytes:ByteArray=new ByteArray();
					bytes.writeUnsignedInt(value.width);
					bytes.writeUnsignedInt(value.height);
					bytes.writeBoolean(zlibBitmap);
					
					var datas:ByteArray=value.getPixels(value.rect);
					if(zlibBitmap)
					{
						datas.compress();
						datas.position=0;
					}
					bytes.writeBytes(datas);
					
					writeTagTo(output,fieldNumber,BYTES);
					bytes.position=0;
					writeRawVarint32To(output,bytes.length);
					writeRawBytesTo(output,bytes);
				}
				
				
				/**
				 * 写入一个子消息 
				 * @param output
				 * @param fieldNumber
				 * @param value
				 * 
				 */		
				public function writeMessageTo(output:IDataOutput,fieldNumber:int,value:SerializeableData):void
				{
					var bytes:ByteArray=new ByteArray();
					value.serialize(bytes);
					
					bytes.position=0;
					writeTagTo(output,fieldNumber,BYTES);
					writeRawVarint32To(output,bytes.length);
					writeRawBytesTo(output,bytes);
				}
				
				
				/**
				 * 写入一个32位int 
				 * @param fieldNumber
				 * @param value
				 * 
				 */		
				public function writeInt32To(output:IDataOutput,fieldNumber:int,value:int):void
				{
					writeTagTo(output,fieldNumber,VARINT);
					writeRawVarint32To(output,value);
				}
				
				/**
				 * 写入一个无符号的32位int 
				 * @param fieldNumber
				 * @param value
				 * 
				 */		
				public function writeUInt32To(output:IDataOutput,fieldNumber:int,value:uint):void
				{
					writeTagTo(output,fieldNumber,VARINT);
					writeRawVarint32To(output,value);
				}
				
				/**
				 * 写入一个有符号的32位int 
				 * @param fieldNumber
				 * @param value
				 * 
				 */		
				public function writeSInt32To(output:IDataOutput,fieldNumber:int,value:int):void
				{
					writeTagTo(output,fieldNumber,VARINT);
					writeRawVarint32To(output,encodeZigZag32(value));
				}
				
				
				
				/**
				 * 写入一个64位int 
				 * @param fieldNumber
				 * @param value
				 * 
				 */		
				public function writeInt64To(output:IDataOutput,fieldNumber:int,value:String):void
				{
					writeTagTo(output,fieldNumber,VARINT);
					writeRawVarint64To(output,value);
				}
				
				/**
				 * 写入一个无符号的64位int 
				 * @param fieldNumber
				 * @param value
				 * 
				 */		
				public function writeUInt64To(output:IDataOutput,fieldNumber:int,value:String):void
				{
					writeTagTo(output,fieldNumber,VARINT);
					writeRawVarint64To(output,value);
				}
				
				/**
				 * 写入一个有符号的64位int 
				 * @param fieldNumber
				 * @param value
				 * 
				 */		
				public function writeSInt64To(output:IDataOutput,fieldNumber:int,value:String):void
				{
					writeTagTo(output,fieldNumber,VARINT);
					//writeRawVarint64To(output,encodeZigZag64(value));
					writeRawVarint64To(output,value);
				}
				
				
				
				
				
				/**
				 * 写入一个32位浮点数 
				 * @param fieldNumber
				 * @param value
				 * 
				 */		
				public function writeFloatTo(output:IDataOutput,fieldNumber:int,value:Number):void
				{
					writeTagTo(output,fieldNumber,FIXED32);
					writeRawLittleEndian32To(output,value);
				}
				
				/**
				 * 写入一个Fixed32数 
				 * @param fieldNumber
				 * @param value
				 * 
				 */		
				public function writeFixed32To(output:IDataOutput,fieldNumber:int,value:Number):void
				{
					writeTagTo(output,fieldNumber,FIXED32);
					writeRawLittleEndian32To(output,value);
				}
				
				/**
				 * 写入一个SFixed32数 
				 * @param fieldNumber
				 * @param value
				 * 
				 */		
				public function writeSFixed32To(output:IDataOutput,fieldNumber:int,value:Number):void
				{
					writeTagTo(output,fieldNumber,FIXED32);
					writeRawLittleEndian32To(output,value);
				}
				
				
				
				
				
				/**
				 * 写入一个64位浮点数 
				 * @param fieldNumber
				 * @param vlaue
				 * 
				 */		
				public function writeDoubleTo(output:IDataOutput,fieldNumber:int,value:Number):void
				{
					writeTagTo(output,fieldNumber,FIXED64);
					writeRawLittleEndian64To(output,value);
				}
				
				/**
				 * 写入一个Fixed64数 
				 * @param fieldNumber
				 * @param value
				 * 
				 */		
				public function writeFixed64To(output:IDataOutput,fieldNumber:int,value:Number):void
				{
					writeTagTo(output,fieldNumber,FIXED64);
					writeRawLittleEndian64To(output,value);
				}
				
				/**
				 * 写入一个SFixed64数 
				 * @param fieldNumber
				 * @param value
				 * 
				 */		
				public function writeSFixed64To(output:IDataOutput,fieldNumber:int,value:Number):void
				{
					writeTagTo(output,fieldNumber,FIXED64);
					writeRawLittleEndian64To(output,value);
				}
			}
		}
	'''
}