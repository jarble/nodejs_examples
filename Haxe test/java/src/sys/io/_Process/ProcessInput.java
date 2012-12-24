package sys.io._Process;
import haxe.root.*;
@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class ProcessInput extends haxe.java.io.NativeInput
{
	public    ProcessInput(java.io.InputStream stream)
	{
		super(haxe.lang.EmptyObject.EMPTY);
		sys.io._Process.ProcessInput.__hx_ctor(this, stream);
	}
	
	
	public static   void __hx_ctor(sys.io._Process.ProcessInput __temp_me14, java.io.InputStream stream)
	{
		haxe.java.io.NativeInput.__hx_ctor(__temp_me14, stream);
	}
	
	
	public static   java.lang.Object __hx_createEmpty()
	{
		return new sys.io._Process.ProcessInput(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static   java.lang.Object __hx_create(haxe.root.Array arr)
	{
		return new sys.io._Process.ProcessInput(((java.io.InputStream) (arr.__get(0)) ));
	}
	
	
	public    ProcessInput(haxe.lang.EmptyObject empty)
	{
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	@Override public   void close()
	{
		if (( this.chained != null )) 
		{
			this.chained.close();
		}
		
		try 
		{
			this.stream.close();
		}
		catch (java.io.IOException e)
		{
			throw haxe.lang.HaxeException.wrap(haxe.io.Error.Custom(e));
		}
		
		
	}
	
	
	@Override public   int readBytes(haxe.io.Bytes s, int pos, int len)
	{
		if (( this.chained != null )) 
		{
			return this.chained.readBytes(s, pos, len);
		}
		
		int ret = -1;
		try 
		{
			ret = this.stream.read(s.b, pos, len);
		}
		catch (java.io.EOFException e)
		{
			throw haxe.lang.HaxeException.wrap(new haxe.io.Eof());
		}
		
		catch (java.io.IOException e)
		{
			throw haxe.lang.HaxeException.wrap(haxe.io.Error.Custom(e));
		}
		
		
		if (( ret == -1 )) 
		{
			throw haxe.lang.HaxeException.wrap(new haxe.io.Eof());
		}
		
		return ret;
	}
	
	
	@Override public   int readByte()
	{
		if (( this.chained != null )) 
		{
			return this.chained.readByte();
		}
		
		try 
		{
			return this.stream.read();
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
	
	
	public   void bufferContents()
	{
		if (( this.chained != null )) 
		{
			return ;
		}
		
		haxe.io.Bytes b = this.readAll(null);
		this.chained = new haxe.io.BytesInput(b, null, null);
	}
	
	
	public  haxe.io.BytesInput chained;
	
	@Override public   java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		{
			boolean __temp_executeDef115 = true;
			switch (field.hashCode())
			{
				case 738801440:
				{
					if (field.equals("chained")) 
					{
						__temp_executeDef115 = false;
						return this.chained = ((haxe.io.BytesInput) (value) );
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef115) 
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
			boolean __temp_executeDef116 = true;
			switch (field.hashCode())
			{
				case 738801440:
				{
					if (field.equals("chained")) 
					{
						__temp_executeDef116 = false;
						return this.chained;
					}
					
					break;
				}
				
				
				case 94756344:
				{
					if (field.equals("close")) 
					{
						__temp_executeDef116 = false;
						return new haxe.lang.Closure(this, "close");
					}
					
					break;
				}
				
				
				case 640488314:
				{
					if (field.equals("bufferContents")) 
					{
						__temp_executeDef116 = false;
						return new haxe.lang.Closure(this, "bufferContents");
					}
					
					break;
				}
				
				
				case -1140063115:
				{
					if (field.equals("readBytes")) 
					{
						__temp_executeDef116 = false;
						return new haxe.lang.Closure(this, "readBytes");
					}
					
					break;
				}
				
				
				case -868060226:
				{
					if (field.equals("readByte")) 
					{
						__temp_executeDef116 = false;
						return new haxe.lang.Closure(this, "readByte");
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef116) 
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
			int __temp_hash118 = field.hashCode();
			boolean __temp_executeDef117 = true;
			switch (__temp_hash118)
			{
				case -868060226:case -1140063115:case 94756344:
				{
					if (( (( ( __temp_hash118 == -868060226 ) && field.equals("readByte") )) || ( (( ( __temp_hash118 == -1140063115 ) && field.equals("readBytes") )) || field.equals("close") ) )) 
					{
						__temp_executeDef117 = false;
						return haxe.lang.Runtime.slowCallField(this, field, dynargs);
					}
					
					break;
				}
				
				
				case 640488314:
				{
					if (field.equals("bufferContents")) 
					{
						__temp_executeDef117 = false;
						this.bufferContents();
						return null;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef117) 
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
		baseArr.push("chained");
		{
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


