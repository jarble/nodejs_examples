package sys.io;
import haxe.root.*;
@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class Process extends haxe.lang.HxObject
{
	public    Process(java.lang.String cmd, haxe.root.Array<java.lang.String> args)
	{
		super();
		sys.io.Process.__hx_ctor(this, cmd, args);
	}
	
	
	public static   void __hx_ctor(sys.io.Process __temp_me13, java.lang.String cmd, haxe.root.Array<java.lang.String> args)
	{
		java.lang.String[] pargs = new java.lang.String[((int) (( args.length + 1 )) )];
		pargs[0] = cmd;
		{
			int _g1 = 0;
			int _g = args.length;
			while (( _g1 < _g ))
			{
				int i = _g1++;
				pargs[( i + 1 )] = args.__get(i);
			}
			
		}
		
		try 
		{
			__temp_me13.proc = new java.lang.ProcessBuilder(((java.lang.String[]) (pargs) )).start();
		}
		catch (java.lang.Throwable __temp_catchallException113)
		{
			java.lang.Object __temp_catchall114 = __temp_catchallException113;
			if (( __temp_catchall114 instanceof haxe.lang.HaxeException )) 
			{
				__temp_catchall114 = ((haxe.lang.HaxeException) (__temp_catchallException113) ).obj;
			}
			
			{
				java.lang.Object e = __temp_catchall114;
				throw haxe.lang.HaxeException.wrap(e);
			}
			
		}
		
		
		java.lang.Process p = __temp_me13.proc;
		__temp_me13.stderr = new sys.io._Process.ProcessInput(((java.io.InputStream) (p.getErrorStream()) ));
		__temp_me13.stdout = new sys.io._Process.ProcessInput(((java.io.InputStream) (p.getInputStream()) ));
		__temp_me13.stdin = new haxe.java.io.NativeOutput(((java.io.OutputStream) (p.getOutputStream()) ));
	}
	
	
	public static   java.lang.Object __hx_createEmpty()
	{
		return new sys.io.Process(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static   java.lang.Object __hx_create(haxe.root.Array arr)
	{
		return new sys.io.Process(haxe.lang.Runtime.toString(arr.__get(0)), ((haxe.root.Array<java.lang.String>) (arr.__get(1)) ));
	}
	
	
	public    Process(haxe.lang.EmptyObject empty)
	{
		super();
	}
	
	
	public   void kill()
	{
		this.proc.destroy();
	}
	
	
	public   void close()
	{
		this.proc.destroy();
	}
	
	
	public   int exitCode()
	{
		(((sys.io._Process.ProcessInput) (this.stdout) )).bufferContents();
		(((sys.io._Process.ProcessInput) (this.stderr) )).bufferContents();
		try 
		{
			this.proc.waitFor();
		}
		catch (java.lang.Throwable __temp_catchallException108)
		{
			java.lang.Object __temp_catchall109 = __temp_catchallException108;
			if (( __temp_catchall109 instanceof haxe.lang.HaxeException )) 
			{
				__temp_catchall109 = ((haxe.lang.HaxeException) (__temp_catchallException108) ).obj;
			}
			
			{
				java.lang.Object e = __temp_catchall109;
				throw haxe.lang.HaxeException.wrap(e);
			}
			
		}
		
		
		return this.proc.exitValue();
	}
	
	
	public   int getPid()
	{
		if (haxe.root.Reflect.hasField(this.proc, "pid")) 
		{
			return haxe.lang.Runtime.toInt(haxe.lang.Runtime.getField(this.proc, "pid", false));
		}
		
		return -1;
	}
	
	
	public  java.lang.Process proc;
	
	public  haxe.io.Output stdin;
	
	public  haxe.io.Input stderr;
	
	public  haxe.io.Input stdout;
	
	@Override public   java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		{
			boolean __temp_executeDef110 = true;
			switch (field.hashCode())
			{
				case -892396981:
				{
					if (field.equals("stdout")) 
					{
						__temp_executeDef110 = false;
						return this.stdout = ((haxe.io.Input) (value) );
					}
					
					break;
				}
				
				
				case 3449686:
				{
					if (field.equals("proc")) 
					{
						__temp_executeDef110 = false;
						return this.proc = ((java.lang.Process) (value) );
					}
					
					break;
				}
				
				
				case -892406686:
				{
					if (field.equals("stderr")) 
					{
						__temp_executeDef110 = false;
						return this.stderr = ((haxe.io.Input) (value) );
					}
					
					break;
				}
				
				
				case 109760136:
				{
					if (field.equals("stdin")) 
					{
						__temp_executeDef110 = false;
						return this.stdin = ((haxe.io.Output) (value) );
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef110) 
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
			boolean __temp_executeDef111 = true;
			switch (field.hashCode())
			{
				case -892396981:
				{
					if (field.equals("stdout")) 
					{
						__temp_executeDef111 = false;
						return this.stdout;
					}
					
					break;
				}
				
				
				case 3291998:
				{
					if (field.equals("kill")) 
					{
						__temp_executeDef111 = false;
						return new haxe.lang.Closure(this, "kill");
					}
					
					break;
				}
				
				
				case -892406686:
				{
					if (field.equals("stderr")) 
					{
						__temp_executeDef111 = false;
						return this.stderr;
					}
					
					break;
				}
				
				
				case 94756344:
				{
					if (field.equals("close")) 
					{
						__temp_executeDef111 = false;
						return new haxe.lang.Closure(this, "close");
					}
					
					break;
				}
				
				
				case 109760136:
				{
					if (field.equals("stdin")) 
					{
						__temp_executeDef111 = false;
						return this.stdin;
					}
					
					break;
				}
				
				
				case -2123228117:
				{
					if (field.equals("exitCode")) 
					{
						__temp_executeDef111 = false;
						return new haxe.lang.Closure(this, "exitCode");
					}
					
					break;
				}
				
				
				case 3449686:
				{
					if (field.equals("proc")) 
					{
						__temp_executeDef111 = false;
						return this.proc;
					}
					
					break;
				}
				
				
				case -1249353131:
				{
					if (field.equals("getPid")) 
					{
						__temp_executeDef111 = false;
						return new haxe.lang.Closure(this, "getPid");
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef111) 
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
			boolean __temp_executeDef112 = true;
			switch (field.hashCode())
			{
				case -1249353131:
				{
					if (field.equals("getPid")) 
					{
						__temp_executeDef112 = false;
						return this.getPid();
					}
					
					break;
				}
				
				
				case 3291998:
				{
					if (field.equals("kill")) 
					{
						__temp_executeDef112 = false;
						this.kill();
						return null;
					}
					
					break;
				}
				
				
				case -2123228117:
				{
					if (field.equals("exitCode")) 
					{
						__temp_executeDef112 = false;
						return this.exitCode();
					}
					
					break;
				}
				
				
				case 94756344:
				{
					if (field.equals("close")) 
					{
						__temp_executeDef112 = false;
						this.close();
						return null;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef112) 
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
		baseArr.push("stdout");
		baseArr.push("stderr");
		baseArr.push("stdin");
		baseArr.push("proc");
		{
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


