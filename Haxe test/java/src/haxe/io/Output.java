package haxe.io;
import haxe.root.*;
@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class Output extends haxe.lang.HxObject
{
	static 
	{
		haxe.io.Output.LN2 = java.lang.Math.log(2);
	}
	public    Output()
	{
		super();
	}
	
	
	public static  double LN2;
	
	public static   java.lang.Object __hx_createEmpty()
	{
		return new haxe.io.Output(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static   java.lang.Object __hx_create(haxe.root.Array arr)
	{
		return new haxe.io.Output();
	}
	
	
	public    Output(haxe.lang.EmptyObject empty)
	{
		super();
	}
	
	
	public   void writeString(java.lang.String s)
	{
		haxe.io.Bytes b = haxe.io.Bytes.ofString(s);
		this.writeFullBytes(b, 0, b.length);
	}
	
	
	public   void writeInput(haxe.io.Input i, java.lang.Object bufsize)
	{
		if (( bufsize == null )) 
		{
			bufsize = 4096;
		}
		
		haxe.io.Bytes buf = haxe.io.Bytes.alloc(haxe.lang.Runtime.toInt(bufsize));
		try 
		{
			while (true)
			{
				int len = i.readBytes(buf, 0, haxe.lang.Runtime.toInt(bufsize));
				if (( len == 0 )) 
				{
					throw haxe.lang.HaxeException.wrap(haxe.io.Error.Blocked);
				}
				
				int p = 0;
				while (( len > 0 ))
				{
					int k = this.writeBytes(buf, p, len);
					if (( k == 0 )) 
					{
						throw haxe.lang.HaxeException.wrap(haxe.io.Error.Blocked);
					}
					
					p += k;
					len -= k;
				}
				
			}
			
		}
		catch (java.lang.Throwable __temp_catchallException85)
		{
			java.lang.Object __temp_catchall86 = __temp_catchallException85;
			if (( __temp_catchall86 instanceof haxe.lang.HaxeException )) 
			{
				__temp_catchall86 = ((haxe.lang.HaxeException) (__temp_catchallException85) ).obj;
			}
			
			if (( __temp_catchall86 instanceof haxe.io.Eof )) 
			{
				haxe.io.Eof e = ((haxe.io.Eof) (__temp_catchall86) );
				{
					{
					}
					
				}
				
			}
			 else 
			{
				throw haxe.lang.HaxeException.wrap(__temp_catchallException85);
			}
			
		}
		
		
	}
	
	
	public   void prepare(int nbytes)
	{
		{
		}
		
	}
	
	
	public   void writeInt32(int x)
	{
		if (this.bigEndian) 
		{
			this.writeByte(haxe.Int32.toInt(((int) (( ((int) (x) ) >>> 24 )) )));
			this.writeByte(( haxe.Int32.toInt(((int) (( ((int) (x) ) >>> 16 )) )) & 255 ));
			this.writeByte(( haxe.Int32.toInt(((int) (( ((int) (x) ) >>> 8 )) )) & 255 ));
			this.writeByte(haxe.Int32.toInt(((int) (( ((int) (x) ) & ((int) (255) ) )) )));
		}
		 else 
		{
			this.writeByte(haxe.Int32.toInt(((int) (( ((int) (x) ) & ((int) (255) ) )) )));
			this.writeByte(( haxe.Int32.toInt(((int) (( ((int) (x) ) >>> 8 )) )) & 255 ));
			this.writeByte(( haxe.Int32.toInt(((int) (( ((int) (x) ) >>> 16 )) )) & 255 ));
			this.writeByte(haxe.Int32.toInt(((int) (( ((int) (x) ) >>> 24 )) )));
		}
		
	}
	
	
	public   void writeUInt30(int x)
	{
		if (( ( x < 0 ) || ( x >= 1073741824 ) )) 
		{
			throw haxe.lang.HaxeException.wrap(haxe.io.Error.Overflow);
		}
		
		if (this.bigEndian) 
		{
			this.writeByte(( x >>> 24 ));
			this.writeByte(( ( x >> 16 ) & 255 ));
			this.writeByte(( ( x >> 8 ) & 255 ));
			this.writeByte(( x & 255 ));
		}
		 else 
		{
			this.writeByte(( x & 255 ));
			this.writeByte(( ( x >> 8 ) & 255 ));
			this.writeByte(( ( x >> 16 ) & 255 ));
			this.writeByte(( x >>> 24 ));
		}
		
	}
	
	
	public   void writeInt31(int x)
	{
		if (( ( x < -1073741824 ) || ( x >= 1073741824 ) )) 
		{
			throw haxe.lang.HaxeException.wrap(haxe.io.Error.Overflow);
		}
		
		if (this.bigEndian) 
		{
			this.writeByte(( x >>> 24 ));
			this.writeByte(( ( x >> 16 ) & 255 ));
			this.writeByte(( ( x >> 8 ) & 255 ));
			this.writeByte(( x & 255 ));
		}
		 else 
		{
			this.writeByte(( x & 255 ));
			this.writeByte(( ( x >> 8 ) & 255 ));
			this.writeByte(( ( x >> 16 ) & 255 ));
			this.writeByte(( x >>> 24 ));
		}
		
	}
	
	
	public   void writeUInt24(int x)
	{
		if (( ( x < 0 ) || ( x >= 16777216 ) )) 
		{
			throw haxe.lang.HaxeException.wrap(haxe.io.Error.Overflow);
		}
		
		if (this.bigEndian) 
		{
			this.writeByte(( x >> 16 ));
			this.writeByte(( ( x >> 8 ) & 255 ));
			this.writeByte(( x & 255 ));
		}
		 else 
		{
			this.writeByte(( x & 255 ));
			this.writeByte(( ( x >> 8 ) & 255 ));
			this.writeByte(( x >> 16 ));
		}
		
	}
	
	
	public   void writeInt24(int x)
	{
		if (( ( x < -8388608 ) || ( x >= 8388608 ) )) 
		{
			throw haxe.lang.HaxeException.wrap(haxe.io.Error.Overflow);
		}
		
		this.writeUInt24(( x & 16777215 ));
	}
	
	
	public   void writeUInt16(int x)
	{
		if (( ( x < 0 ) || ( x >= 65536 ) )) 
		{
			throw haxe.lang.HaxeException.wrap(haxe.io.Error.Overflow);
		}
		
		if (this.bigEndian) 
		{
			this.writeByte(( x >> 8 ));
			this.writeByte(( x & 255 ));
		}
		 else 
		{
			this.writeByte(( x & 255 ));
			this.writeByte(( x >> 8 ));
		}
		
	}
	
	
	public   void writeInt16(int x)
	{
		if (( ( x < -32768 ) || ( x >= 32768 ) )) 
		{
			throw haxe.lang.HaxeException.wrap(haxe.io.Error.Overflow);
		}
		
		this.writeUInt16(( x & 65535 ));
	}
	
	
	public   void writeInt8(int x)
	{
		if (( ( x < -128 ) || ( x >= 128 ) )) 
		{
			throw haxe.lang.HaxeException.wrap(haxe.io.Error.Overflow);
		}
		
		this.writeByte(( x & 255 ));
	}
	
	
	public   void writeDouble(double x)
	{
		if (( this.helper == null )) 
		{
			this.helper = java.nio.ByteBuffer.allocateDirect(8);
		}
		
		java.nio.ByteBuffer helper = this.helper;
		helper.order(( (this.bigEndian) ? (java.nio.ByteOrder.BIG_ENDIAN) : (java.nio.ByteOrder.LITTLE_ENDIAN) ));
		helper.putDouble(0, x);
		this.writeByte(((int) (helper.get(0)) ));
		this.writeByte(((int) (helper.get(1)) ));
		this.writeByte(((int) (helper.get(2)) ));
		this.writeByte(((int) (helper.get(3)) ));
		this.writeByte(((int) (helper.get(4)) ));
		this.writeByte(((int) (helper.get(5)) ));
		this.writeByte(((int) (helper.get(6)) ));
		this.writeByte(((int) (helper.get(7)) ));
	}
	
	
	public   void writeFloat(double x)
	{
		if (( this.helper == null )) 
		{
			this.helper = java.nio.ByteBuffer.allocateDirect(8);
		}
		
		java.nio.ByteBuffer helper = this.helper;
		helper.order(( (this.bigEndian) ? (java.nio.ByteOrder.BIG_ENDIAN) : (java.nio.ByteOrder.LITTLE_ENDIAN) ));
		helper.putFloat(0, ((float) (x) ));
		this.writeByte(((int) (helper.get(0)) ));
		this.writeByte(((int) (helper.get(1)) ));
		this.writeByte(((int) (helper.get(2)) ));
		this.writeByte(((int) (helper.get(3)) ));
	}
	
	
	public   void writeFullBytes(haxe.io.Bytes s, int pos, int len)
	{
		while (( len > 0 ))
		{
			int k = this.writeBytes(s, pos, len);
			pos += k;
			len -= k;
		}
		
	}
	
	
	public   void write(haxe.io.Bytes s)
	{
		int l = s.length;
		int p = 0;
		while (( l > 0 ))
		{
			int k = this.writeBytes(s, p, l);
			if (( k == 0 )) 
			{
				throw haxe.lang.HaxeException.wrap(haxe.io.Error.Blocked);
			}
			
			p += k;
			l -= k;
		}
		
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
	
	
	public   void flush()
	{
		{
		}
		
	}
	
	
	public   int writeBytes(haxe.io.Bytes s, int pos, int len)
	{
		int k = len;
		byte[] b = s.b;
		if (( ( ( pos < 0 ) || ( len < 0 ) ) || ( ( pos + len ) > s.length ) )) 
		{
			throw haxe.lang.HaxeException.wrap(haxe.io.Error.OutsideBounds);
		}
		
		while (( k > 0 ))
		{
			this.writeByte(((int) (b[pos]) ));
			pos++;
			k--;
		}
		
		return len;
	}
	
	
	public   void writeByte(int c)
	{
		throw haxe.lang.HaxeException.wrap("Not implemented");
	}
	
	
	public  java.nio.ByteBuffer helper;
	
	public  boolean bigEndian;
	
	@Override public   java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		{
			boolean __temp_executeDef87 = true;
			switch (field.hashCode())
			{
				case 573260987:
				{
					if (field.equals("bigEndian")) 
					{
						__temp_executeDef87 = false;
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
						__temp_executeDef87 = false;
						return this.helper = ((java.nio.ByteBuffer) (value) );
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef87) 
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
			boolean __temp_executeDef88 = true;
			switch (field.hashCode())
			{
				case 573260987:
				{
					if (field.equals("bigEndian")) 
					{
						__temp_executeDef88 = false;
						return this.bigEndian;
					}
					
					break;
				}
				
				
				case 1412235472:
				{
					if (field.equals("writeString")) 
					{
						__temp_executeDef88 = false;
						return new haxe.lang.Closure(this, "writeString");
					}
					
					break;
				}
				
				
				case -1220931666:
				{
					if (field.equals("helper")) 
					{
						__temp_executeDef88 = false;
						return this.helper;
					}
					
					break;
				}
				
				
				case -656596181:
				{
					if (field.equals("writeInput")) 
					{
						__temp_executeDef88 = false;
						return new haxe.lang.Closure(this, "writeInput");
					}
					
					break;
				}
				
				
				case -1406851705:
				{
					if (field.equals("writeByte")) 
					{
						__temp_executeDef88 = false;
						return new haxe.lang.Closure(this, "writeByte");
					}
					
					break;
				}
				
				
				case -318370553:
				{
					if (field.equals("prepare")) 
					{
						__temp_executeDef88 = false;
						return new haxe.lang.Closure(this, "prepare");
					}
					
					break;
				}
				
				
				case -662729780:
				{
					if (field.equals("writeBytes")) 
					{
						__temp_executeDef88 = false;
						return new haxe.lang.Closure(this, "writeBytes");
					}
					
					break;
				}
				
				
				case -656594449:
				{
					if (field.equals("writeInt32")) 
					{
						__temp_executeDef88 = false;
						return new haxe.lang.Closure(this, "writeInt32");
					}
					
					break;
				}
				
				
				case 97532676:
				{
					if (field.equals("flush")) 
					{
						__temp_executeDef88 = false;
						return new haxe.lang.Closure(this, "flush");
					}
					
					break;
				}
				
				
				case 1429671894:
				{
					if (field.equals("writeUInt30")) 
					{
						__temp_executeDef88 = false;
						return new haxe.lang.Closure(this, "writeUInt30");
					}
					
					break;
				}
				
				
				case 94756344:
				{
					if (field.equals("close")) 
					{
						__temp_executeDef88 = false;
						return new haxe.lang.Closure(this, "close");
					}
					
					break;
				}
				
				
				case -656594450:
				{
					if (field.equals("writeInt31")) 
					{
						__temp_executeDef88 = false;
						return new haxe.lang.Closure(this, "writeInt31");
					}
					
					break;
				}
				
				
				case 182645405:
				{
					if (field.equals("setEndian")) 
					{
						__temp_executeDef88 = false;
						return new haxe.lang.Closure(this, "setEndian");
					}
					
					break;
				}
				
				
				case 1429671867:
				{
					if (field.equals("writeUInt24")) 
					{
						__temp_executeDef88 = false;
						return new haxe.lang.Closure(this, "writeUInt24");
					}
					
					break;
				}
				
				
				case 113399775:
				{
					if (field.equals("write")) 
					{
						__temp_executeDef88 = false;
						return new haxe.lang.Closure(this, "write");
					}
					
					break;
				}
				
				
				case -656594478:
				{
					if (field.equals("writeInt24")) 
					{
						__temp_executeDef88 = false;
						return new haxe.lang.Closure(this, "writeInt24");
					}
					
					break;
				}
				
				
				case 1188045309:
				{
					if (field.equals("writeFullBytes")) 
					{
						__temp_executeDef88 = false;
						return new haxe.lang.Closure(this, "writeFullBytes");
					}
					
					break;
				}
				
				
				case 1429671838:
				{
					if (field.equals("writeUInt16")) 
					{
						__temp_executeDef88 = false;
						return new haxe.lang.Closure(this, "writeUInt16");
					}
					
					break;
				}
				
				
				case -659427907:
				{
					if (field.equals("writeFloat")) 
					{
						__temp_executeDef88 = false;
						return new haxe.lang.Closure(this, "writeFloat");
					}
					
					break;
				}
				
				
				case -656594507:
				{
					if (field.equals("writeInt16")) 
					{
						__temp_executeDef88 = false;
						return new haxe.lang.Closure(this, "writeInt16");
					}
					
					break;
				}
				
				
				case 978263184:
				{
					if (field.equals("writeDouble")) 
					{
						__temp_executeDef88 = false;
						return new haxe.lang.Closure(this, "writeDouble");
					}
					
					break;
				}
				
				
				case -1406653784:
				{
					if (field.equals("writeInt8")) 
					{
						__temp_executeDef88 = false;
						return new haxe.lang.Closure(this, "writeInt8");
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef88) 
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
			boolean __temp_executeDef89 = true;
			switch (field.hashCode())
			{
				case -1406851705:
				{
					if (field.equals("writeByte")) 
					{
						__temp_executeDef89 = false;
						this.writeByte(haxe.lang.Runtime.toInt(dynargs.__get(0)));
						return null;
					}
					
					break;
				}
				
				
				case 1412235472:
				{
					if (field.equals("writeString")) 
					{
						__temp_executeDef89 = false;
						this.writeString(haxe.lang.Runtime.toString(dynargs.__get(0)));
						return null;
					}
					
					break;
				}
				
				
				case -662729780:
				{
					if (field.equals("writeBytes")) 
					{
						__temp_executeDef89 = false;
						return this.writeBytes(((haxe.io.Bytes) (dynargs.__get(0)) ), haxe.lang.Runtime.toInt(dynargs.__get(1)), haxe.lang.Runtime.toInt(dynargs.__get(2)));
					}
					
					break;
				}
				
				
				case -656596181:
				{
					if (field.equals("writeInput")) 
					{
						__temp_executeDef89 = false;
						this.writeInput(((haxe.io.Input) (dynargs.__get(0)) ), dynargs.__get(1));
						return null;
					}
					
					break;
				}
				
				
				case 97532676:
				{
					if (field.equals("flush")) 
					{
						__temp_executeDef89 = false;
						this.flush();
						return null;
					}
					
					break;
				}
				
				
				case -318370553:
				{
					if (field.equals("prepare")) 
					{
						__temp_executeDef89 = false;
						this.prepare(haxe.lang.Runtime.toInt(dynargs.__get(0)));
						return null;
					}
					
					break;
				}
				
				
				case 94756344:
				{
					if (field.equals("close")) 
					{
						__temp_executeDef89 = false;
						this.close();
						return null;
					}
					
					break;
				}
				
				
				case -656594449:
				{
					if (field.equals("writeInt32")) 
					{
						__temp_executeDef89 = false;
						this.writeInt32(haxe.lang.Runtime.toInt(dynargs.__get(0)));
						return null;
					}
					
					break;
				}
				
				
				case 182645405:
				{
					if (field.equals("setEndian")) 
					{
						__temp_executeDef89 = false;
						return this.setEndian(haxe.lang.Runtime.toBool(dynargs.__get(0)));
					}
					
					break;
				}
				
				
				case 1429671894:
				{
					if (field.equals("writeUInt30")) 
					{
						__temp_executeDef89 = false;
						this.writeUInt30(haxe.lang.Runtime.toInt(dynargs.__get(0)));
						return null;
					}
					
					break;
				}
				
				
				case 113399775:
				{
					if (field.equals("write")) 
					{
						__temp_executeDef89 = false;
						this.write(((haxe.io.Bytes) (dynargs.__get(0)) ));
						return null;
					}
					
					break;
				}
				
				
				case -656594450:
				{
					if (field.equals("writeInt31")) 
					{
						__temp_executeDef89 = false;
						this.writeInt31(haxe.lang.Runtime.toInt(dynargs.__get(0)));
						return null;
					}
					
					break;
				}
				
				
				case 1188045309:
				{
					if (field.equals("writeFullBytes")) 
					{
						__temp_executeDef89 = false;
						this.writeFullBytes(((haxe.io.Bytes) (dynargs.__get(0)) ), haxe.lang.Runtime.toInt(dynargs.__get(1)), haxe.lang.Runtime.toInt(dynargs.__get(2)));
						return null;
					}
					
					break;
				}
				
				
				case 1429671867:
				{
					if (field.equals("writeUInt24")) 
					{
						__temp_executeDef89 = false;
						this.writeUInt24(haxe.lang.Runtime.toInt(dynargs.__get(0)));
						return null;
					}
					
					break;
				}
				
				
				case -659427907:
				{
					if (field.equals("writeFloat")) 
					{
						__temp_executeDef89 = false;
						this.writeFloat(haxe.lang.Runtime.toDouble(dynargs.__get(0)));
						return null;
					}
					
					break;
				}
				
				
				case -656594478:
				{
					if (field.equals("writeInt24")) 
					{
						__temp_executeDef89 = false;
						this.writeInt24(haxe.lang.Runtime.toInt(dynargs.__get(0)));
						return null;
					}
					
					break;
				}
				
				
				case 978263184:
				{
					if (field.equals("writeDouble")) 
					{
						__temp_executeDef89 = false;
						this.writeDouble(haxe.lang.Runtime.toDouble(dynargs.__get(0)));
						return null;
					}
					
					break;
				}
				
				
				case 1429671838:
				{
					if (field.equals("writeUInt16")) 
					{
						__temp_executeDef89 = false;
						this.writeUInt16(haxe.lang.Runtime.toInt(dynargs.__get(0)));
						return null;
					}
					
					break;
				}
				
				
				case -1406653784:
				{
					if (field.equals("writeInt8")) 
					{
						__temp_executeDef89 = false;
						this.writeInt8(haxe.lang.Runtime.toInt(dynargs.__get(0)));
						return null;
					}
					
					break;
				}
				
				
				case -656594507:
				{
					if (field.equals("writeInt16")) 
					{
						__temp_executeDef89 = false;
						this.writeInt16(haxe.lang.Runtime.toInt(dynargs.__get(0)));
						return null;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef89) 
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


