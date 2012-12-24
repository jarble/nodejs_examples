package haxe.io;
import haxe.root.*;
@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class Bytes extends haxe.lang.HxObject
{
	public    Bytes(int length, byte[] b)
	{
		super();
		haxe.io.Bytes.__hx_ctor(this, length, b);
	}
	
	
	public static   void __hx_ctor(haxe.io.Bytes __temp_me5, int length, byte[] b)
	{
		__temp_me5.length = length;
		__temp_me5.b = b;
	}
	
	
	public static   haxe.io.Bytes alloc(int length)
	{
		return new haxe.io.Bytes(length, new byte[((int) (length) )]);
	}
	
	
	public static   haxe.io.Bytes ofString(java.lang.String s)
	{
		try 
		{
			byte[] b = s.getBytes("UTF-8");
			return new haxe.io.Bytes(b.length, b);
		}
		catch (java.lang.Throwable __temp_catchallException70)
		{
			java.lang.Object __temp_catchall71 = __temp_catchallException70;
			if (( __temp_catchall71 instanceof haxe.lang.HaxeException )) 
			{
				__temp_catchall71 = ((haxe.lang.HaxeException) (__temp_catchallException70) ).obj;
			}
			
			{
				java.lang.Object e = __temp_catchall71;
				throw haxe.lang.HaxeException.wrap(e);
			}
			
		}
		
		
	}
	
	
	public static   haxe.io.Bytes ofData(byte[] b)
	{
		return new haxe.io.Bytes(b.length, b);
	}
	
	
	public static   java.lang.Object __hx_createEmpty()
	{
		return new haxe.io.Bytes(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static   java.lang.Object __hx_create(haxe.root.Array arr)
	{
		return new haxe.io.Bytes(haxe.lang.Runtime.toInt(arr.__get(0)), ((byte[]) (arr.__get(1)) ));
	}
	
	
	public    Bytes(haxe.lang.EmptyObject empty)
	{
		super();
	}
	
	
	public final   byte[] getData()
	{
		return this.b;
	}
	
	
	public   java.lang.String toHex()
	{
		haxe.root.StringBuf s = new haxe.root.StringBuf();
		haxe.root.Array chars = new haxe.root.Array(new java.lang.Object[]{});
		java.lang.String str = "0123456789abcdef";
		{
			int _g1 = 0;
			int _g = str.length();
			while (( _g1 < _g ))
			{
				int i = _g1++;
				chars.push(haxe.lang.StringExt.charCodeAt(str, i));
			}
			
		}
		
		{
			int _g1 = 0;
			int _g = this.length;
			while (( _g1 < _g ))
			{
				int i = _g1++;
				int c = ( this.b[i] & 255 );
				s.addChar(haxe.lang.Runtime.toInt(chars.__get(( c >> 4 ))));
				s.addChar(haxe.lang.Runtime.toInt(chars.__get(( c & 15 ))));
			}
			
		}
		
		return s.toString();
	}
	
	
	@Override public   java.lang.String toString()
	{
		try 
		{
			return new java.lang.String(this.b, 0, this.length, "UTF-8");
		}
		catch (java.lang.Throwable __temp_catchallException61)
		{
			java.lang.Object __temp_catchall62 = __temp_catchallException61;
			if (( __temp_catchall62 instanceof haxe.lang.HaxeException )) 
			{
				__temp_catchall62 = ((haxe.lang.HaxeException) (__temp_catchallException61) ).obj;
			}
			
			{
				java.lang.Object e = __temp_catchall62;
				throw haxe.lang.HaxeException.wrap(e);
			}
			
		}
		
		
	}
	
	
	public   java.lang.String readString(int pos, int len)
	{
		if (( ( ( pos < 0 ) || ( len < 0 ) ) || ( ( pos + len ) > this.length ) )) 
		{
			throw haxe.lang.HaxeException.wrap(haxe.io.Error.OutsideBounds);
		}
		
		try 
		{
			return new java.lang.String(this.b, pos, len, "UTF-8");
		}
		catch (java.lang.Throwable __temp_catchallException63)
		{
			java.lang.Object __temp_catchall64 = __temp_catchallException63;
			if (( __temp_catchall64 instanceof haxe.lang.HaxeException )) 
			{
				__temp_catchall64 = ((haxe.lang.HaxeException) (__temp_catchallException63) ).obj;
			}
			
			{
				java.lang.Object e = __temp_catchall64;
				throw haxe.lang.HaxeException.wrap(e);
			}
			
		}
		
		
	}
	
	
	public   int compare(haxe.io.Bytes other)
	{
		byte[] b1 = this.b;
		byte[] b2 = other.b;
		int len = ( (( this.length < other.length )) ? (this.length) : (other.length) );
		{
			int _g = 0;
			while (( _g < len ))
			{
				int i = _g++;
				if (( b1[i] != b2[i] )) 
				{
					return ( b1[i] - b2[i] );
				}
				
			}
			
		}
		
		return ( this.length - other.length );
	}
	
	
	public   haxe.io.Bytes sub(int pos, int len)
	{
		if (( ( ( pos < 0 ) || ( len < 0 ) ) || ( ( pos + len ) > this.length ) )) 
		{
			throw haxe.lang.HaxeException.wrap(haxe.io.Error.OutsideBounds);
		}
		
		byte[] newarr = new byte[((int) (len) )];
		java.lang.System.arraycopy(this.b, pos, newarr, 0, len);
		return new haxe.io.Bytes(len, newarr);
	}
	
	
	public   void blit(int pos, haxe.io.Bytes src, int srcpos, int len)
	{
		if (( ( ( ( ( pos < 0 ) || ( srcpos < 0 ) ) || ( len < 0 ) ) || ( ( pos + len ) > this.length ) ) || ( ( srcpos + len ) > src.length ) )) 
		{
			throw haxe.lang.HaxeException.wrap(haxe.io.Error.OutsideBounds);
		}
		
		java.lang.System.arraycopy(src.b, srcpos, this.b, pos, len);
	}
	
	
	public final   void set(int pos, int v)
	{
		this.b[pos] = ((byte) (v) );
	}
	
	
	public final   int get(int pos)
	{
		return ( this.b[pos] & 255 );
	}
	
	
	public  byte[] b;
	
	public  int length;
	
	@Override public   double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		{
			boolean __temp_executeDef65 = true;
			switch (field.hashCode())
			{
				case -1106363674:
				{
					if (field.equals("length")) 
					{
						__temp_executeDef65 = false;
						return this.length = ((int) (value) );
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef65) 
			{
				return super.__hx_setField_f(field, value, handleProperties);
			}
			 else 
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public   java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		{
			boolean __temp_executeDef66 = true;
			switch (field.hashCode())
			{
				case -1106363674:
				{
					if (field.equals("length")) 
					{
						__temp_executeDef66 = false;
						return this.length = haxe.lang.Runtime.toInt(value);
					}
					
					break;
				}
				
				
				case 98:
				{
					if (field.equals("b")) 
					{
						__temp_executeDef66 = false;
						return this.b = ((byte[]) (value) );
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef66) 
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
			boolean __temp_executeDef67 = true;
			switch (field.hashCode())
			{
				case -1106363674:
				{
					if (field.equals("length")) 
					{
						__temp_executeDef67 = false;
						return this.length;
					}
					
					break;
				}
				
				
				case -75605984:
				{
					if (field.equals("getData")) 
					{
						__temp_executeDef67 = false;
						return new haxe.lang.Closure(this, "getData");
					}
					
					break;
				}
				
				
				case 98:
				{
					if (field.equals("b")) 
					{
						__temp_executeDef67 = false;
						return this.b;
					}
					
					break;
				}
				
				
				case 110507680:
				{
					if (field.equals("toHex")) 
					{
						__temp_executeDef67 = false;
						return new haxe.lang.Closure(this, "toHex");
					}
					
					break;
				}
				
				
				case 102230:
				{
					if (field.equals("get")) 
					{
						__temp_executeDef67 = false;
						return new haxe.lang.Closure(this, "get");
					}
					
					break;
				}
				
				
				case -1776922004:
				{
					if (field.equals("toString")) 
					{
						__temp_executeDef67 = false;
						return new haxe.lang.Closure(this, "toString");
					}
					
					break;
				}
				
				
				case 113762:
				{
					if (field.equals("set")) 
					{
						__temp_executeDef67 = false;
						return new haxe.lang.Closure(this, "set");
					}
					
					break;
				}
				
				
				case -500196025:
				{
					if (field.equals("readString")) 
					{
						__temp_executeDef67 = false;
						return new haxe.lang.Closure(this, "readString");
					}
					
					break;
				}
				
				
				case 3026677:
				{
					if (field.equals("blit")) 
					{
						__temp_executeDef67 = false;
						return new haxe.lang.Closure(this, "blit");
					}
					
					break;
				}
				
				
				case 950484197:
				{
					if (field.equals("compare")) 
					{
						__temp_executeDef67 = false;
						return new haxe.lang.Closure(this, "compare");
					}
					
					break;
				}
				
				
				case 114240:
				{
					if (field.equals("sub")) 
					{
						__temp_executeDef67 = false;
						return new haxe.lang.Closure(this, "sub");
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef67) 
			{
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			 else 
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public   double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		{
			boolean __temp_executeDef68 = true;
			switch (field.hashCode())
			{
				case -1106363674:
				{
					if (field.equals("length")) 
					{
						__temp_executeDef68 = false;
						return this.length;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef68) 
			{
				return super.__hx_getField_f(field, throwErrors, handleProperties);
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
			boolean __temp_executeDef69 = true;
			switch (field.hashCode())
			{
				case 102230:
				{
					if (field.equals("get")) 
					{
						__temp_executeDef69 = false;
						return this.get(haxe.lang.Runtime.toInt(dynargs.__get(0)));
					}
					
					break;
				}
				
				
				case -75605984:
				{
					if (field.equals("getData")) 
					{
						__temp_executeDef69 = false;
						return this.getData();
					}
					
					break;
				}
				
				
				case 113762:
				{
					if (field.equals("set")) 
					{
						__temp_executeDef69 = false;
						this.set(haxe.lang.Runtime.toInt(dynargs.__get(0)), haxe.lang.Runtime.toInt(dynargs.__get(1)));
						return null;
					}
					
					break;
				}
				
				
				case 110507680:
				{
					if (field.equals("toHex")) 
					{
						__temp_executeDef69 = false;
						return this.toHex();
					}
					
					break;
				}
				
				
				case 3026677:
				{
					if (field.equals("blit")) 
					{
						__temp_executeDef69 = false;
						this.blit(haxe.lang.Runtime.toInt(dynargs.__get(0)), ((haxe.io.Bytes) (dynargs.__get(1)) ), haxe.lang.Runtime.toInt(dynargs.__get(2)), haxe.lang.Runtime.toInt(dynargs.__get(3)));
						return null;
					}
					
					break;
				}
				
				
				case -1776922004:
				{
					if (field.equals("toString")) 
					{
						__temp_executeDef69 = false;
						return this.toString();
					}
					
					break;
				}
				
				
				case 114240:
				{
					if (field.equals("sub")) 
					{
						__temp_executeDef69 = false;
						return this.sub(haxe.lang.Runtime.toInt(dynargs.__get(0)), haxe.lang.Runtime.toInt(dynargs.__get(1)));
					}
					
					break;
				}
				
				
				case -500196025:
				{
					if (field.equals("readString")) 
					{
						__temp_executeDef69 = false;
						return this.readString(haxe.lang.Runtime.toInt(dynargs.__get(0)), haxe.lang.Runtime.toInt(dynargs.__get(1)));
					}
					
					break;
				}
				
				
				case 950484197:
				{
					if (field.equals("compare")) 
					{
						__temp_executeDef69 = false;
						return this.compare(((haxe.io.Bytes) (dynargs.__get(0)) ));
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef69) 
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
		baseArr.push("length");
		baseArr.push("b");
		{
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


