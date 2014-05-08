package game.game.server.decoder.base
{
	import flash.utils.ByteArray;
	import flash.utils.Endian;
	import flash.utils.IDataInput;
	import flash.utils.IDataOutput;
	
	public class SerializeableData
	{
		//
		private const VARINT:int=0;
		private const FIXED64:int=1;
		private const BYTES:int=2;
		private const START_GROUP:int=3;
		private const END_GROUP:int=4;
		private const FIXED32:int=5;
				
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
                    while(input.readByte()>=0x80)
                    {
                    }
					break;
				}
                case FIXED32:
                {
                    //32-bit
                    input.readInt();
                    break;
                }
				case FIXED64:
				{
					//64-bit
                    input.readInt();
                    input.readInt();
					break;
				}
				case BYTES:
				{
					//定长
					readRawBytesFrom(input,readUInt32From(input));
					break;
				}
                default:
                {
                    throw new Error("Invalid wire type: " + type);
                }
			}
		}
		
		
		//-------------------------------------------------------------------------
		//
		// ZigZag32
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
         * 对一个32位int值进行ZigZag编码 
         * @param n
         * @return 
         * 
         */		
        protected function encodeZigZag32(n:int):int
        {
            return (n<<1)^(n>>31);
        }
        
        
        //-------------------------------------------------------------------------
        //
        // ZigZag64
        //
        //-------------------------------------------------------------------------
        
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
        
        
        
        
        //----------------------------------------------------------------------
        //
        //  tag
        //
        //----------------------------------------------------------------------
        
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
         * 写入一个TAG 
         * @param fieldNumber
         * @param wireType
         * 
         */		
        protected function writeTagTo(output:IDataOutput,fieldNumber:int,wireType:int):void
        {
            writeRawVarint32To(output,makeTag(fieldNumber,wireType));
        }
		
        
        //----------------------------------------------------------------------
        //
        //  32位变长
        //
        //----------------------------------------------------------------------
        
		/**
		 * 读取一个32位的Varint 
		 * @return 
		 * 
		 */		
		protected function readRawVarint32From(input:IDataInput):uint
		{
            var low:uint=0;
            
            var byte:uint=0;
            
            var i:int=0;
            var left:int=0;
            while(i<5)
            {
                byte=input.readUnsignedByte();
                low|=(byte&0x7F)<<left;
                if(byte<0x80)
                {
                    return low;
                }
                
                i++;
                left+=7;
            }
            
            while(byte>=0x80)
            {
                byte=input.readUnsignedByte();
            }
            
            return low;
		}
        
        /**
         * 写入一个32位的Varint 
         * @param value
         * 
         */		
        protected function writeRawVarint32To(output:IDataOutput,value:int):void
        {
            while(true)
            {
                if((value & ~0x7F)==0)
                {
                    output.writeByte(value);
                    return;
                }
                else
                {
                    output.writeByte((value & 0x7F)|0x80);
                    value>>>=7;
                }
            }
        }
        
        
        //----------------------------------------------------------------------
        //
        //  64位变长
        //
        //----------------------------------------------------------------------
        
		/**
		 * 读取一个64位的Varint
		 * @return
		 *
		 */
        protected function readRawVarint64From(input:IDataInput):String
		{
			var low:uint=0;
			var high:uint=0;
			
            var byte:uint=0;
            
            var i:int=0;
            var left:int=0;
            
            i=0;
            left=0;
            while(i<4)
            {
                byte=input.readUnsignedByte();
                low|=(byte&0x7F)<<left;
                if(byte<0x80)
                {
                    return low.toString(16);
                }
                
                i++;
                left+=7;
            }
            
            byte=input.readUnsignedByte();
            low|=(byte&0x7F)<<left;
            high|=(byte&0x7F)>>>4;
            
            var lowHex:String=low.toString(16);
            if(high>0 || byte>=0x80)
            {
                while(lowHex.length<8)
                {
                    lowHex="0"+lowHex;
                }
            }
            
            if(byte<0x80)
            {
                if(high>0)
                {
                    return high.toString(16)+lowHex;
                }
                else
                {
                    return lowHex;
                }
            }
            
            i=0;
            left=3;
            while(i<5)
            {
                byte=input.readUnsignedByte();
                high|=(byte&0x7F)<<left;
                if(byte<0x80)
                {
                    return high.toString(16)+lowHex;
                }
                
                i++;
                left+=7;
            }
            
            while(byte>=0x80)
            {
                byte=input.readByte();
            }
            
			return high.toString(16)+lowHex;
		}
        
        /**
         * 写入一个64位的Varint 
         * @param value
         * 
         */		
        protected function writeRawVarint64To(output:IDataOutput,value:String):void
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
                output.writeByte(val);
                r-=7;
            }
        }
        
        
        //----------------------------------------------------------------------
        //
        //  32位浮点
        //
        //----------------------------------------------------------------------
        
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
         * 以低位在前的方式写入一个32位浮点数 
         * @param value
         * 
         */		
        protected function writeRawLittleEndian32To(output:IDataOutput,value:Number):void
        {
            var endian:String=output.endian;
            output.endian=Endian.LITTLE_ENDIAN;
            output.writeFloat(value);
            output.endian=endian;
        }
        
        
        //----------------------------------------------------------------------
        //
        //  64位浮点
        //
        //----------------------------------------------------------------------
        
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
         * 以低位在前的方式写入一个64位浮点数 
         * @param value
         * 
         */		
        protected function writeRawLittleEndian64To(output:IDataOutput,value:Number):void
        {
            var endian:String=output.endian;
            output.endian=Endian.LITTLE_ENDIAN;
            output.writeDouble(value);
            output.endian=endian;
        }
        
        
        //----------------------------------------------------------------------
        //
        //  bytes
        //
        //----------------------------------------------------------------------
        
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
        
        /**
         * 写入一个字节数组 
         * @param value
         * @param offset
         * @param length
         * 
         */		
        protected function writeRawBytesTo(output:IDataOutput,value:ByteArray):void
        {
            output.writeBytes(value,0,value.length);
        }
		
        
        
        
        //--------------------------------------------------------------------------------------------------------
       
        
        
        
        //----------------------------------------------------------------------
        //
        //  bool
        //
        //----------------------------------------------------------------------
        
        /**
         * 读取一个布尔值 
         * @return 
         * 
         */		
        protected function readBoolFrom(input:IDataInput):Boolean
        {
            return readUInt32From(input)!=0;
        }
        
        /**
         * 写入一个布尔值 
         * @param fieldNumber
         * @param value
         * 
         */		
        protected function writeBoolTo(output:IDataOutput,fieldNumber:int,value:Boolean):void
        {
            writeTagTo(output,fieldNumber,VARINT);
            output.writeByte(value ? 1 : 0);
        }
        
        
        //----------------------------------------------------------------------
        //
        //  enum
        //
        //----------------------------------------------------------------------
        
        /**
         * 读取一个枚举值 
         * @return 
         * 
         */		
        protected function readEnumFrom(input:IDataInput):int
        {
            return readUInt32From(input);
        }
        
        
        /**
         * 写入一个枚举值 
         * @param fieldNumber
         * @param value
         * 
         */		
        protected function writeEnumTo(output:IDataOutput,fieldNumber:int,value:int):void
        {
            writeTagTo(output,fieldNumber,VARINT);
            writeRawVarint32To(output,value);
        }
        
        
        //----------------------------------------------------------------------
        //
        //  fixed32
        //
        //----------------------------------------------------------------------
        
        /**
         * 读取一个Fixed32数值
         * @return 
         * 
         */		
        protected function readFixed32From(input:IDataInput):uint
        {
            return input.readUnsignedInt();
        }
        
        /**
         * 写入一个Fixed32数 
         * @param fieldNumber
         * @param value
         * 
         */		
        protected function writeFixed32To(output:IDataOutput,fieldNumber:int,value:Number):void
        {
            writeTagTo(output,fieldNumber,FIXED32);
            writeRawLittleEndian32To(output,value);
        }
        
        
        //----------------------------------------------------------------------
        //
        //  sfixed32
        //
        //----------------------------------------------------------------------
        
        /**
         * 读取一个SFixed32数值 
         * @return 
         * 
         */		
        protected function readSFixed32From(input:IDataInput):int
        {
            return input.readInt();
        }
        
        /**
         * 写入一个SFixed32数 
         * @param fieldNumber
         * @param value
         * 
         */		
        protected function writeSFixed32To(output:IDataOutput,fieldNumber:int,value:Number):void
        {
            writeTagTo(output,fieldNumber,FIXED32);
            writeRawLittleEndian32To(output,value);
        }
        
        
        //----------------------------------------------------------------------
        //
        //  int32
        //
        //----------------------------------------------------------------------
        
		/**
		 * 读取一个32位的int 
		 * @return 
		 * 
		 */		
		protected function readInt32From(input:IDataInput):int
		{
			return int(readUInt32From(input));
		}
        
        
        /**
         * 写入一个32位int 
         * @param fieldNumber
         * @param value
         * 
         */		
        protected function writeInt32To(output:IDataOutput,fieldNumber:int,value:int):void
        {
            writeTagTo(output,fieldNumber,VARINT);
            writeRawVarint32To(output,value);
        }
        
        
        //----------------------------------------------------------------------
        //
        //  uint32
        //
        //----------------------------------------------------------------------
        
		/**
		 * 读取一个32位的无符号int 
		 * @return 
		 * 
		 */		
		protected function readUInt32From(input:IDataInput):uint
		{
			return readRawVarint32From(input);
		}
        
        /**
         * 写入一个无符号的32位int 
         * @param fieldNumber
         * @param value
         * 
         */		
        protected function writeUInt32To(output:IDataOutput,fieldNumber:int,value:uint):void
        {
            writeTagTo(output,fieldNumber,VARINT);
            writeRawVarint32To(output,value);
        }
        
        
        //----------------------------------------------------------------------
        //
        //  sint32
        //
        //----------------------------------------------------------------------
        
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
         * 写入一个有符号的32位int 
         * @param fieldNumber
         * @param value
         * 
         */		
        protected function writeSInt32To(output:IDataOutput,fieldNumber:int,value:int):void
        {
            writeTagTo(output,fieldNumber,VARINT);
            writeRawVarint32To(output,encodeZigZag32(value));
        }
        
        
        //----------------------------------------------------------------------
        //
        //  fixed64
        //
        //----------------------------------------------------------------------
        
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
         * 写入一个Fixed64数 
         * @param fieldNumber
         * @param value
         * 
         */		
        protected function writeFixed64To(output:IDataOutput,fieldNumber:int,value:Number):void
        {
            writeTagTo(output,fieldNumber,FIXED64);
            writeRawLittleEndian64To(output,value);
        }
        
        
        //----------------------------------------------------------------------
        //
        //  sfixed64
        //
        //----------------------------------------------------------------------
        
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
         * 写入一个SFixed64数 
         * @param fieldNumber
         * @param value
         * 
         */		
        protected function writeSFixed64To(output:IDataOutput,fieldNumber:int,value:Number):void
        {
            writeTagTo(output,fieldNumber,FIXED64);
            writeRawLittleEndian64To(output,value);
        }
        
        
        //----------------------------------------------------------------------
        //
        //  int64
        //
        //----------------------------------------------------------------------
        
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
         * 写入一个64位int 
         * @param fieldNumber
         * @param value
         * 
         */		
        protected function writeInt64To(output:IDataOutput,fieldNumber:int,value:String):void
        {
            writeTagTo(output,fieldNumber,VARINT);
            writeRawVarint64To(output,value);
        }
        
        
        //----------------------------------------------------------------------
        //
        //  uint64
        //
        //----------------------------------------------------------------------
        
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
         * 写入一个无符号的64位int 
         * @param fieldNumber
         * @param value
         * 
         */		
        protected function writeUInt64To(output:IDataOutput,fieldNumber:int,value:String):void
        {
            writeTagTo(output,fieldNumber,VARINT);
            writeRawVarint64To(output,value);
        }
        
        
        //----------------------------------------------------------------------
        //
        //  sint64
        //
        //----------------------------------------------------------------------
        
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
         * 写入一个有符号的64位int 
         * @param fieldNumber
         * @param value
         * 
         */		
        protected function writeSInt64To(output:IDataOutput,fieldNumber:int,value:String):void
        {
            writeTagTo(output,fieldNumber,VARINT);
            //writeRawVarint64To(output,encodeZigZag64(value));
            writeRawVarint64To(output,value);
        }
        
        
        //----------------------------------------------------------------------
        //
        //  float
        //
        //----------------------------------------------------------------------
        
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
         * 写入一个32位浮点数 
         * @param fieldNumber
         * @param value
         * 
         */		
        protected function writeFloatTo(output:IDataOutput,fieldNumber:int,value:Number):void
        {
            writeTagTo(output,fieldNumber,FIXED32);
            writeRawLittleEndian32To(output,value);
        }
        
        //----------------------------------------------------------------------
        //
        //  double
        //
        //----------------------------------------------------------------------
        
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
         * 写入一个64位浮点数 
         * @param fieldNumber
         * @param vlaue
         * 
         */		
        protected function writeDoubleTo(output:IDataOutput,fieldNumber:int,value:Number):void
        {
            writeTagTo(output,fieldNumber,FIXED64);
            writeRawLittleEndian64To(output,value);
        }
        
        //----------------------------------------------------------------------
        //
        //  String
        //
        //----------------------------------------------------------------------
        
		/**
		 * 读取一个字符串 
		 * @return 
		 * 
		 */		
        protected function readStringFrom(input:IDataInput):String
		{
			return input.readUTFBytes(readUInt32From(input));
		}
        
        /**
         * 写入一个定长字符串 
         * @param fieldNumber
         * @param value
         * 
         */		
        protected function writeStringTo(output:IDataOutput,fieldNumber:int,value:String):void
        {	
            var bytes:ByteArray=new ByteArray();
            bytes.writeUTFBytes(value);
            bytes.position=0;
            
            writeTagTo(output,fieldNumber,BYTES);	
            writeRawVarint32To(output,bytes.length);
            writeRawBytesTo(output,bytes);
        }
        
        //----------------------------------------------------------------------
        //
        //  Bytes
        //
        //----------------------------------------------------------------------
        
		/**
		 * 读取一个字节流 
		 * @return 
		 * 
		 */		
		protected function readBytesFrom(input:IDataInput):ByteArray
		{
			return readRawBytesFrom(input,readUInt32From(input));
		}
        
        /**
         * 写入一个写长字节数组 
         * @param fieldNumber
         * @param value
         * 
         */		
        protected function writeBytesTo(output:IDataOutput,fieldNumber:int,value:ByteArray):void
        {
            writeTagTo(output,fieldNumber,BYTES);
            
            value.position=0;
            writeRawVarint32To(output,value.length);
            writeRawBytesTo(output,value);
        }
        
        //----------------------------------------------------------------------
        //
        //  message
        //
        //----------------------------------------------------------------------
        
        /**
         * 写入一个子消息 
         * @param output
         * @param fieldNumber
         * @param value
         * 
         */		
        protected function writeMessageTo(output:IDataOutput,fieldNumber:int,value:SerializeableData):void
        {
            var bytes:ByteArray=new ByteArray();
            value.serialize(bytes);
            
            bytes.position=0;
            writeTagTo(output,fieldNumber,BYTES);
            writeRawVarint32To(output,bytes.length);
            writeRawBytesTo(output,bytes);
        }
	}
}
