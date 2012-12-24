package haxe.io;
import haxe.root.*;
@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class BytesInput extends haxe.io.Input
{
	public    BytesInput(haxe.io.Bytes b, java.lang.Object pos, java.lang.Object len)
	{
		super(haxe.lang.EmptyObject.EMPTY);
		haxe.io.BytesInput.__hx_ctor(this, b, pos, len);
	}
	
	
	public static   void __hx_ctor(haxe.io.BytesInput __temp_me6, haxe.io.Bytes b, java.lang.Object pos, java.lang.Object len)
	{
		if (( pos == null )) 
		{
			pos = 0;
		}
		
		if (( len == null )) 
		{
			len = ( ((int) (b.length) ) - haxe.lang.Runtime.toInt(pos) );
		}
		
		if (( ( ( haxe.lang.Runtime.compare(pos, 0) < 0 ) || ( haxe.lang.Runtime.compare(len, 0) < 0 ) ) || ( ( haxe.lang.Runtime.toInt(pos) + haxe.lang.Runtime.toInt(len) ) > b.length ) )) 
		{
			throw haxe.lang.HaxeException.wrap(haxe.io.Error.OutsideBounds);
		}
		
		__temp_me6.b = b.b;
		__temp_me6.pos = haxe.lang.Runtime.toInt(pos);
		__temp_me6.len = haxe.lang.Runtime.toInt(len);
	}
	
	
	public static   java.lang.Object __hx_createEmpty()
	{
		return new haxe.io.BytesInput(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static   java.lang.Object __hx_create(haxe.root.Array arr)
	{
		return new haxe.io.BytesInput(((haxe.io.Bytes) (arr.__get(0)) ), arr.__get(1), arr.__get(2));
	}
	
	
	public    BytesInput(haxe.lang.EmptyObject empty)
	{
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	@Override public   int readBytes(haxe.io.Bytes buf, int pos, int len)
	{
		if (( ( ( pos < 0 ) || ( len < 0 ) ) || ( ( pos + len ) > buf.length ) )) 
		{
			throw haxe.lang.HaxeException.wrap(haxe.io.Error.OutsideBounds);
		}
		
		int avail = this.len;
		if (( len > avail )) 
		{
			len = avail;
		}
		
		if (( len == 0 )) 
		{
			throw haxe.lang.HaxeException.wrap(new haxe.io.Eof());
		}
		
		java.lang.System.arraycopy(this.b, this.pos, buf.b, pos, len);
		this.pos += len;
		this.len -= len;
		return len;
	}
	
	
	@Override public   int readByte()
	{
		if (( this.len == 0 )) 
		{
			throw haxe.lang.HaxeException.wrap(new haxe.io.Eof());
		}
		
		this.len--;
		return ( this.b[this.pos++] & 255 );
	}
	
	
	public  int len;
	
	public  int pos;
	
	public  byte[] b;
	
	@Override public   double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		{
			boolean __temp_executeDef79 = true;
			switch (field.hashCode())
			{
				case 111188:
				{
					if (field.equals("pos")) 
					{
						__temp_executeDef79 = false;
						return this.pos = ((int) (value) );
					}
					
					break;
				}
				
				
				case 107029:
				{
					if (field.equals("len")) 
					{
						__temp_executeDef79 = false;
						return this.len = ((int) (value) );
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef79) 
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
			boolean __temp_executeDef80 = true;
			switch (field.hashCode())
			{
				case 98:
				{
					if (field.equals("b")) 
					{
						__temp_executeDef80 = false;
						return this.b = ((byte[]) (value) );
					}
					
					break;
				}
				
				
				case 107029:
				{
					if (field.equals("len")) 
					{
						__temp_executeDef80 = false;
						return this.len = haxe.lang.Runtime.toInt(value);
					}
					
					break;
				}
				
				
				case 111188:
				{
					if (field.equals("pos")) 
					{
						__temp_executeDef80 = false;
						return this.pos = haxe.lang.Runtime.toInt(value);
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef80) 
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
			boolean __temp_executeDef81 = true;
			switch (field.hashCode())
			{
				case 98:
				{
					if (field.equals("b")) 
					{
						__temp_executeDef81 = false;
						return this.b;
					}
					
					break;
				}
				
				
				case -1140063115:
				{
					if (field.equals("readBytes")) 
					{
						__temp_executeDef81 = false;
						return new haxe.lang.Closure(this, "readBytes");
					}
					
					break;
				}
				
				
				case 111188:
				{
					if (field.equals("pos")) 
					{
						__temp_executeDef81 = false;
						return this.pos;
					}
					
					break;
				}
				
				
				case -868060226:
				{
					if (field.equals("readByte")) 
					{
						__temp_executeDef81 = false;
						return new haxe.lang.Closure(this, "readByte");
					}
					
					break;
				}
				
				
				case 107029:
				{
					if (field.equals("len")) 
					{
						__temp_executeDef81 = false;
						return this.len;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef81) 
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
			boolean __temp_executeDef82 = true;
			switch (field.hashCode())
			{
				case 111188:
				{
					if (field.equals("pos")) 
					{
						__temp_executeDef82 = false;
						return this.pos;
					}
					
					break;
				}
				
				
				case 107029:
				{
					if (field.equals("len")) 
					{
						__temp_executeDef82 = false;
						return this.len;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef82) 
			{
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			 else 
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public   void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		baseArr.push("b");
		baseArr.push("pos");
		baseArr.push("len");
		{
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


