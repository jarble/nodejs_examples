package haxe.io;
import haxe.root.*;
@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class Input extends haxe.lang.HxObject
{
	public    Input()
	{
		super();
	}
	
	
	public static   java.lang.Object __hx_createEmpty()
	{
		return new haxe.io.Input(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static   java.lang.Object __hx_create(haxe.root.Array arr)
	{
		return new haxe.io.Input();
	}
	
	
	public    Input(haxe.lang.EmptyObject empty)
	{
		super();
	}
	
	
	public   java.lang.String readString(int len)
	{
		haxe.io.Bytes b = haxe.io.Bytes.alloc(len);
		this.readFullBytes(b, 0, len);
		return b.toString();
	}
	
	
	public   int readInt32()
	{
		int ch1 = this.readByte();
		int ch2 = this.readByte();
		int ch3 = this.readByte();
		int ch4 = this.readByte();
		return ( (this.bigEndian) ? (((int) (( ( (( ( ch1 << 8 ) | ch2 )) << 16 ) | (( ( ch3 << 8 ) | ch4 )) )) )) : (((int) (( ( (( ( ch4 << 8 ) | ch3 )) << 16 ) | (( ( ch2 << 8 ) | ch1 )) )) )) );
	}
	
	
	public   int readUInt30()
	{
		int ch1 = this.readByte();
		int ch2 = this.readByte();
		int ch3 = this.readByte();
		int ch4 = this.readByte();
		if (( (( (this.bigEndian) ? (ch1) : (ch4) )) >= 64 )) 
		{
			throw haxe.lang.HaxeException.wrap(haxe.io.Error.Overflow);
		}
		
		return ( (this.bigEndian) ? (( ( ( ch4 | ( ch3 << 8 ) ) | ( ch2 << 16 ) ) | ( ch1 << 24 ) )) : (( ( ( ch1 | ( ch2 << 8 ) ) | ( ch3 << 16 ) ) | ( ch4 << 24 ) )) );
	}
	
	
	public   int readInt31()
	{
		int ch1 = 0;
		int ch2 = 0;
		int ch3 = 0;
		int ch4 = 0;
		if (this.bigEndian) 
		{
			ch4 = this.readByte();
			ch3 = this.readByte();
			ch2 = this.readByte();
			ch1 = this.readByte();
		}
		 else 
		{
			ch1 = this.readByte();
			ch2 = this.readByte();
			ch3 = this.readByte();
			ch4 = this.readByte();
		}
		
		if (( ( (( ch4 & 128 )) == 0 ) != (( (( ch4 & 64 )) == 0 )) )) 
		{
			throw haxe.lang.HaxeException.wrap(haxe.io.Error.Overflow);
		}
		
		return ( ( ( ch1 | ( ch2 << 8 ) ) | ( ch3 << 16 ) ) | ( ch4 << 24 ) );
	}
	
	
	public   int readUInt24()
	{
		int ch1 = this.readByte();
		int ch2 = this.readByte();
		int ch3 = this.readByte();
		return ( (this.bigEndian) ? (( ( ch3 | ( ch2 << 8 ) ) | ( ch1 << 16 ) )) : (( ( ch1 | ( ch2 << 8 ) ) | ( ch3 << 16 ) )) );
	}
	
	
	public   int readInt24()
	{
		int ch1 = this.readByte();
		int ch2 = this.readByte();
		int ch3 = this.readByte();
		int n = ( (this.bigEndian) ? (( ( ch3 | ( ch2 << 8 ) ) | ( ch1 << 16 ) )) : (( ( ch1 | ( ch2 << 8 ) ) | ( ch3 << 16 ) )) );
		if (( (( n & 8388608 )) != 0 )) 
		{
			return ( n - 16777216 );
		}
		
		return n;
	}
	
	
	public   int readUInt16()
	{
		int ch1 = this.readByte();
		int ch2 = this.readByte();
		return ( (this.bigEndian) ? (( ch2 | ( ch1 << 8 ) )) : (( ch1 | ( ch2 << 8 ) )) );
	}
	
	
	public   int readInt16()
	{
		int ch1 = this.readByte();
		int ch2 = this.readByte();
		int n = ( (this.bigEndian) ? (( ch2 | ( ch1 << 8 ) )) : (( ch1 | ( ch2 << 8 ) )) );
		if (( (( n & 32768 )) != 0 )) 
		{
			return ( n - 65536 );
		}
		
		return n;
	}
	
	
	public   int readInt8()
	{
		int n = this.readByte();
		if (( n >= 128 )) 
		{
			return ( n - 256 );
		}
		
		return n;
	}
	
	
	public   double readDouble()
	{
		if (( this.helper == null )) 
		{
			this.helper = java.nio.ByteBuffer.allocateDirect(8);
		}
		
		java.nio.ByteBuffer helper = this.helper;
		helper.order(( (this.bigEndian) ? (java.nio.ByteOrder.BIG_ENDIAN) : (java.nio.ByteOrder.LITTLE_ENDIAN) ));
		helper.put(0, ((byte) (this.readByte()) ));
		helper.put(1, ((byte) (this.readByte()) ));
		helper.put(2, ((byte) (this.readByte()) ));
		helper.put(3, ((byte) (this.readByte()) ));
		helper.put(4, ((byte) (this.readByte()) ));
		helper.put(5, ((byte) (this.readByte()) ));
		helper.put(6, ((byte) (this.readByte()) ));
		helper.put(7, ((byte) (this.readByte()) ));
		return helper.getDouble(0);
	}
	
	
	public   double readFloat()
	{
		if (( this.helper == null )) 
		{
			this.helper = java.nio.ByteBuffer.allocateDirect(8);
		}
		
		java.nio.ByteBuffer helper = this.helper;
		helper.order(( (this.bigEndian) ? (java.nio.ByteOrder.BIG_ENDIAN) : (java.nio.ByteOrder.LITTLE_ENDIAN) ));
		helper.put(0, ((byte) (this.readByte()) ));
		helper.put(1, ((byte) (this.readByte()) ));
		helper.put(2, ((byte) (this.readByte()) ));
		helper.put(3, ((byte) (this.readByte()) ));
		return ((double) (helper.getFloat(0)) );
	}
	
	
	public   java.lang.String readLine()
	{
		haxe.root.StringBuf buf = new haxe.root.StringBuf();
		int last = 0;
		java.lang.String s = null;
		try 
		{
			while (( (last = this.readByte()) != 10 ))
			{
				buf.addChar(last);
			}
			
			s = buf.toString();
			if (haxe.lang.Runtime.eq(haxe.lang.StringExt.charCodeAt(s, ( s.length() - 1 )), 13)) 
			{
				s = haxe.lang.StringExt.substr(s, 0, -1);
			}
			
		}
		catch (java.lang.Throwable __temp_catchallException72)
		{
			java.lang.Object __temp_catchall73 = __temp_catchallException72;
			if (( __temp_catchall73 instanceof haxe.lang.HaxeException )) 
			{
				__temp_catchall73 = ((haxe.lang.HaxeException) (__temp_catchallException72) ).obj;
			}
			
			if (( __temp_catchall73 instanceof haxe.io.Eof )) 
			{
				haxe.io.Eof e = ((haxe.io.Eof) (__temp_catchall73) );
				{
					s = buf.toString();
					if (( s.length() == 0 )) 
					{
						throw haxe.lang.HaxeException.wrap(e);
					}
					
				}
				
			}
			 else 
			{
				throw haxe.lang.HaxeException.wrap(__temp_catchallException72);
			}
			
		}
		
		
		return s;
	}
	
	
	public   java.lang.String readUntil(int end)
	{
		haxe.root.StringBuf buf = new haxe.root.StringBuf();
		int last = 0;
		while (( (last = this.readByte()) != end ))
		{
			buf.addChar(last);
		}
		
		return buf.toString();
	}
	
	
	public   haxe.io.Bytes read(int nbytes)
	{
		haxe.io.Bytes s = haxe.io.Bytes.alloc(nbytes);
		int p = 0;
		while (( nbytes > 0 ))
		{
			int k = this.readBytes(s, p, nbytes);
			if (( k == 0 )) 
			{
				throw haxe.lang.HaxeException.wrap(haxe.io.Error.Blocked);
			}
			
			p += k;
			nbytes -= k;
		}
		
		return s;
	}
	
	
	public   void readFullBytes(haxe.io.Bytes s, int pos, int len)
	{
		while (( len > 0 ))
		{
			int k = this.readBytes(s, pos, len);
			pos += k;
			len -= k;
		}
		
	}
	
	
	public   haxe.io.Bytes readAll(java.lang.Object bufsize)
	{
		if (( bufsize == null )) 
		{
			bufsize = 16384;
		}
		
		haxe.io.Bytes buf = null;
		haxe.root.Array<haxe.io.Bytes> total = new haxe.root.Array<haxe.io.Bytes>(new haxe.io.Bytes[]{});
		int tlen = 0;
		int pos = 0;
		try 
		{
			while (true)
			{
				if (( ( buf == null ) || ( haxe.lang.Runtime.compare(pos, bufsize) >= 0 ) )) 
				{
					pos = 0;
					buf = haxe.io.Bytes.alloc(haxe.lang.Runtime.toInt(bufsize));
					total.push(buf);
				}
				
				int len = this.readBytes(buf, pos, ( haxe.lang.Runtime.toInt(bufsize) - ((int) (pos) ) ));
				tlen += len;
				pos += len;
				if (( len == 0 )) 
				{
					throw haxe.lang.HaxeException.wrap(haxe.io.Error.Blocked);
				}
				
			}
			
		}
		catch (java.lang.Throwable __temp_catchallException74)
		{
			java.lang.Object __temp_catchall75 = __temp_catchallException74;
			if (( __temp_catchall75 instanceof haxe.lang.HaxeException )) 
			{
				__temp_catchall75 = ((haxe.lang.HaxeException) (__temp_catchallException74) ).obj;
			}
			
			if (( __temp_catchall75 instanceof haxe.io.Eof )) 
			{
				haxe.io.Eof e = ((haxe.io.Eof) (__temp_catchall75) );
				{
					{
					}
					
				}
				
			}
			 else 
			{
				throw haxe.lang.HaxeException.wrap(__temp_catchallException74);
			}
			
		}
		
		
		byte[] ret = new byte[((int) (tlen) )];
		int idx = 0;
		{
			int _g = 0;
			while (( _g < total.length ))
			{
				haxe.io.Bytes buf1 = total.__get(_g);
				 ++ _g;
				int len = buf1.b.length;
				if (( len > tlen )) 
				{
					len = tlen;
				}
				
				java.lang.System.arraycopy(buf1.b, 0, ret, idx, len);
				idx += len;
				tlen -= len;
			}
			
		}
		
		return haxe.io.Bytes.ofData(ret);
	}
	
	
	public   boolean setEndian(boolean b)
	{
		this.bigEndian = b;
		return b;
	}
	
	
	public   void close()
	{
		{
		}
		
	}
	
	
	public   int readBytes(haxe.io.Bytes s, int pos, int len)
	{
		int k = len;
		byte[] b = s.b;
		if (( ( ( pos < 0 ) || ( len < 0 ) ) || ( ( pos + len ) > s.length ) )) 
		{
			throw haxe.lang.HaxeException.wrap(haxe.io.Error.OutsideBounds);
		}
		
		while (( k > 0 ))
		{
			b[pos] = ((byte) (this.readByte()) );
			pos++;
			k--;
		}
		
		return len;
	}
	
	
	public   int readByte()
	{
		throw haxe.lang.HaxeException.wrap("Not implemented");
	}
	
	
	public  java.nio.ByteBuffer helper;
	
	public  boolean bigEndian;
	
	@Override public   java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		{
			boolean __temp_executeDef76 = true;
			switch (field.hashCode())
			{
				case 573260987:
				{
					if (field.equals("bigEndian")) 
					{
						__temp_executeDef76 = false;
						if (handleProperties) 
						{
							this.setEndian(haxe.lang.Runtime.toBool(value));
							return value;
						}
						 else 
						{
							return this.bigEndian = haxe.lang.Runtime.toBool(value);
						}
						
					}
					
					break;
				}
				
				
				case -1220931666:
				{
					if (field.equals("helper")) 
					{
						__temp_executeDef76 = false;
						return this.helper = ((java.nio.ByteBuffer) (value) );
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef76) 
			{
				return super.__hx_setField(field, value, handleProperties);
			}
			 else 
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public   java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		{
			boolean __temp_executeDef77 = true;
			switch (field.hashCode())
			{
				case 573260987:
				{
					if (field.equals("bigEndian")) 
					{
						__temp_executeDef77 = false;
						return this.bigEndian;
					}
					
					break;
				}
				
				
				case -500196025:
				{
					if (field.equals("readString")) 
					{
						__temp_executeDef77 = false;
						return new haxe.lang.Closure(this, "readString");
					}
					
					break;
				}
				
				
				case -1220931666:
				{
					if (field.equals("helper")) 
					{
						__temp_executeDef77 = false;
						return this.helper;
					}
					
					break;
				}
				
				
				case -1133927784:
				{
					if (field.equals("readInt32")) 
					{
						__temp_executeDef77 = false;
						return new haxe.lang.Closure(this, "readInt32");
					}
					
					break;
				}
				
				
				case -868060226:
				{
					if (field.equals("readByte")) 
					{
						__temp_executeDef77 = false;
						return new haxe.lang.Closure(this, "readByte");
					}
					
					break;
				}
				
				
				case -482759603:
				{
					if (field.equals("readUInt30")) 
					{
						__temp_executeDef77 = false;
						return new haxe.lang.Closure(this, "readUInt30");
					}
					
					break;
				}
				
				
				case -1140063115:
				{
					if (field.equals("readBytes")) 
					{
						__temp_executeDef77 = false;
						return new haxe.lang.Closure(this, "readBytes");
					}
					
					break;
				}
				
				
				case -1133927785:
				{
					if (field.equals("readInt31")) 
					{
						__temp_executeDef77 = false;
						return new haxe.lang.Closure(this, "readInt31");
					}
					
					break;
				}
				
				
				case 94756344:
				{
					if (field.equals("close")) 
					{
						__temp_executeDef77 = false;
						return new haxe.lang.Closure(this, "close");
					}
					
					break;
				}
				
				
				case -482759630:
				{
					if (field.equals("readUInt24")) 
					{
						__temp_executeDef77 = false;
						return new haxe.lang.Closure(this, "readUInt24");
					}
					
					break;
				}
				
				
				case 182645405:
				{
					if (field.equals("setEndian")) 
					{
						__temp_executeDef77 = false;
						return new haxe.lang.Closure(this, "setEndian");
					}
					
					break;
				}
				
				
				case -1133927813:
				{
					if (field.equals("readInt24")) 
					{
						__temp_executeDef77 = false;
						return new haxe.lang.Closure(this, "readInt24");
					}
					
					break;
				}
				
				
				case 1080375339:
				{
					if (field.equals("readAll")) 
					{
						__temp_executeDef77 = false;
						return new haxe.lang.Closure(this, "readAll");
					}
					
					break;
				}
				
				
				case -482759659:
				{
					if (field.equals("readUInt16")) 
					{
						__temp_executeDef77 = false;
						return new haxe.lang.Closure(this, "readUInt16");
					}
					
					break;
				}
				
				
				case 682499622:
				{
					if (field.equals("readFullBytes")) 
					{
						__temp_executeDef77 = false;
						return new haxe.lang.Closure(this, "readFullBytes");
					}
					
					break;
				}
				
				
				case -1133927842:
				{
					if (field.equals("readInt16")) 
					{
						__temp_executeDef77 = false;
						return new haxe.lang.Closure(this, "readInt16");
					}
					
					break;
				}
				
				
				case 3496342:
				{
					if (field.equals("read")) 
					{
						__temp_executeDef77 = false;
						return new haxe.lang.Closure(this, "read");
					}
					
					break;
				}
				
				
				case -867862305:
				{
					if (field.equals("readInt8")) 
					{
						__temp_executeDef77 = false;
						return new haxe.lang.Closure(this, "readInt8");
					}
					
					break;
				}
				
				
				case -1122843800:
				{
					if (field.equals("readUntil")) 
					{
						__temp_executeDef77 = false;
						return new haxe.lang.Closure(this, "readUntil");
					}
					
					break;
				}
				
				
				case -934168313:
				{
					if (field.equals("readDouble")) 
					{
						__temp_executeDef77 = false;
						return new haxe.lang.Closure(this, "readDouble");
					}
					
					break;
				}
				
				
				case -867777878:
				{
					if (field.equals("readLine")) 
					{
						__temp_executeDef77 = false;
						return new haxe.lang.Closure(this, "readLine");
					}
					
					break;
				}
				
				
				case -1136761242:
				{
					if (field.equals("readFloat")) 
					{
						__temp_executeDef77 = false;
						return new haxe.lang.Closure(this, "readFloat");
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef77) 
			{
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			 else 
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public   java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		{
			boolean __temp_executeDef78 = true;
			switch (field.hashCode())
			{
				case -868060226:
				{
					if (field.equals("readByte")) 
					{
						__temp_executeDef78 = false;
						return this.readByte();
					}
					
					break;
				}
				
				
				case -500196025:
				{
					if (field.equals("readString")) 
					{
						__temp_executeDef78 = false;
						return this.readString(haxe.lang.Runtime.toInt(dynargs.__get(0)));
					}
					
					break;
				}
				
				
				case -1140063115:
				{
					if (field.equals("readBytes")) 
					{
						__temp_executeDef78 = false;
						return this.readBytes(((haxe.io.Bytes) (dynargs.__get(0)) ), haxe.lang.Runtime.toInt(dynargs.__get(1)), haxe.lang.Runtime.toInt(dynargs.__get(2)));
					}
					
					break;
				}
				
				
				case -1133927784:
				{
					if (field.equals("readInt32")) 
					{
						__temp_executeDef78 = false;
						return this.readInt32();
					}
					
					break;
				}
				
				
				case 94756344:
				{
					if (field.equals("close")) 
					{
						__temp_executeDef78 = false;
						this.close();
						return null;
					}
					
					break;
				}
				
				
				case -482759603:
				{
					if (field.equals("readUInt30")) 
					{
						__temp_executeDef78 = false;
						return this.readUInt30();
					}
					
					break;
				}
				
				
				case 182645405:
				{
					if (field.equals("setEndian")) 
					{
						__temp_executeDef78 = false;
						return this.setEndian(haxe.lang.Runtime.toBool(dynargs.__get(0)));
					}
					
					break;
				}
				
				
				case -1133927785:
				{
					if (field.equals("readInt31")) 
					{
						__temp_executeDef78 = false;
						return this.readInt31();
					}
					
					break;
				}
				
				
				case 1080375339:
				{
					if (field.equals("readAll")) 
					{
						__temp_executeDef78 = false;
						return this.readAll(dynargs.__get(0));
					}
					
					break;
				}
				
				
				case -482759630:
				{
					if (field.equals("readUInt24")) 
					{
						__temp_executeDef78 = false;
						return this.readUInt24();
					}
					
					break;
				}
				
				
				case 682499622:
				{
					if (field.equals("readFullBytes")) 
					{
						__temp_executeDef78 = false;
						this.readFullBytes(((haxe.io.Bytes) (dynargs.__get(0)) ), haxe.lang.Runtime.toInt(dynargs.__get(1)), haxe.lang.Runtime.toInt(dynargs.__get(2)));
						return null;
					}
					
					break;
				}
				
				
				case -1133927813:
				{
					if (field.equals("readInt24")) 
					{
						__temp_executeDef78 = false;
						return this.readInt24();
					}
					
					break;
				}
				
				
				case 3496342:
				{
					if (field.equals("read")) 
					{
						__temp_executeDef78 = false;
						return this.read(haxe.lang.Runtime.toInt(dynargs.__get(0)));
					}
					
					break;
				}
				
				
				case -482759659:
				{
					if (field.equals("readUInt16")) 
					{
						__temp_executeDef78 = false;
						return this.readUInt16();
					}
					
					break;
				}
				
				
				case -1122843800:
				{
					if (field.equals("readUntil")) 
					{
						__temp_executeDef78 = false;
						return this.readUntil(haxe.lang.Runtime.toInt(dynargs.__get(0)));
					}
					
					break;
				}
				
				
				case -1133927842:
				{
					if (field.equals("readInt16")) 
					{
						__temp_executeDef78 = false;
						return this.readInt16();
					}
					
					break;
				}
				
				
				case -867777878:
				{
					if (field.equals("readLine")) 
					{
						__temp_executeDef78 = false;
						return this.readLine();
					}
					
					break;
				}
				
				
				case -867862305:
				{
					if (field.equals("readInt8")) 
					{
						__temp_executeDef78 = false;
						return this.readInt8();
					}
					
					break;
				}
				
				
				case -1136761242:
				{
					if (field.equals("readFloat")) 
					{
						__temp_executeDef78 = false;
						return this.readFloat();
					}
					
					break;
				}
				
				
				case -934168313:
				{
					if (field.equals("readDouble")) 
					{
						__temp_executeDef78 = false;
						return this.readDouble();
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef78) 
			{
				return super.__hx_invokeField(field, dynargs);
			}
			 else 
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public   void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		baseArr.push("bigEndian");
		baseArr.push("helper");
		{
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


