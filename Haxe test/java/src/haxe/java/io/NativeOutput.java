package haxe.java.io;
import haxe.root.*;
@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class NativeOutput extends haxe.io.Output
{
	public    NativeOutput(java.io.OutputStream stream)
	{
		super(haxe.lang.EmptyObject.EMPTY);
		haxe.java.io.NativeOutput.__hx_ctor(this, stream);
	}
	
	
	public static   void __hx_ctor(haxe.java.io.NativeOutput __temp_me12, java.io.OutputStream stream)
	{
		__temp_me12.stream = stream;
	}
	
	
	public static   java.lang.Object __hx_createEmpty()
	{
		return new haxe.java.io.NativeOutput(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static   java.lang.Object __hx_create(haxe.root.Array arr)
	{
		return new haxe.java.io.NativeOutput(((java.io.OutputStream) (arr.__get(0)) ));
	}
	
	
	public    NativeOutput(haxe.lang.EmptyObject empty)
	{
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	@Override public   void flush()
	{
		try 
		{
			this.stream.flush();
		}
		catch (java.io.IOException e)
		{
			throw haxe.lang.HaxeException.wrap(haxe.io.Error.Custom(e));
		}
		
		
	}
	
	
	@Override public   void close()
	{
		try 
		{
			this.stream.close();
		}
		catch (java.io.IOException e)
		{
			throw haxe.lang.HaxeException.wrap(haxe.io.Error.Custom(e));
		}
		
		
	}
	
	
	@Override public   void writeByte(int c)
	{
		try 
		{
			this.stream.write(c);
		}
		catch (java.io.EOFException e)
		{
			throw haxe.lang.HaxeException.wrap(new haxe.io.Eof());
		}
		
		catch (java.io.IOException e)
		{
			throw haxe.lang.HaxeException.wrap(haxe.io.Error.Custom(e));
		}
		
		
	}
	
	
	public  java.io.OutputStream stream;
	
	@Override public   java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		{
			boolean __temp_executeDef106 = true;
			switch (field.hashCode())
			{
				case -891990144:
				{
					if (field.equals("stream")) 
					{
						__temp_executeDef106 = false;
						return this.stream = ((java.io.OutputStream) (value) );
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef106) 
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
			boolean __temp_executeDef107 = true;
			switch (field.hashCode())
			{
				case -891990144:
				{
					if (field.equals("stream")) 
					{
						__temp_executeDef107 = false;
						return this.stream;
					}
					
					break;
				}
				
				
				case 97532676:
				{
					if (field.equals("flush")) 
					{
						__temp_executeDef107 = false;
						return new haxe.lang.Closure(this, "flush");
					}
					
					break;
				}
				
				
				case -1406851705:
				{
					if (field.equals("writeByte")) 
					{
						__temp_executeDef107 = false;
						return new haxe.lang.Closure(this, "writeByte");
					}
					
					break;
				}
				
				
				case 94756344:
				{
					if (field.equals("close")) 
					{
						__temp_executeDef107 = false;
						return new haxe.lang.Closure(this, "close");
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef107) 
			{
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			 else 
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public   void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		baseArr.push("stream");
		{
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


