package haxe.root;
import haxe.root.*;
@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class Sys extends haxe.lang.HxObject
{
	public    Sys()
	{
		super();
	}
	
	
	public static  java.lang.String[] _args;
	
	public static  haxe.root.Hash<java.lang.String> _env;
	
	public static  java.lang.String _sysName;
	
	public static   void print(java.lang.Object v)
	{
		java.lang.System.out.print(v);
	}
	
	
	public static   void println(java.lang.Object v)
	{
		java.lang.System.out.println(v);
	}
	
	
	public static   haxe.root.Array<java.lang.String> args()
	{
		if (( haxe.root.Sys._args == null )) 
		{
			return new haxe.root.Array<java.lang.String>(new java.lang.String[]{});
		}
		
		return haxe.java.Lib.array(haxe.root.Sys._args);
	}
	
	
	public static   java.lang.String getEnv(java.lang.String s)
	{
		return java.lang.System.getenv(s);
	}
	
	
	public static   void putEnv(java.lang.String s, java.lang.String v)
	{
		throw haxe.lang.HaxeException.wrap("Not implemented in this platform");
	}
	
	
	public static   haxe.root.Hash<java.lang.String> environment()
	{
		if (( haxe.root.Sys._env != null )) 
		{
			return haxe.root.Sys._env;
		}
		
		haxe.root.Hash<java.lang.String> _env = haxe.root.Sys._env = new haxe.root.Hash<java.lang.String>();
		{
			java.lang.Object __temp_iterator19 = ((java.lang.Object) (haxe.lang.Runtime.callField(java.lang.System.getenv().entrySet(), "iterator", null)) );
			while (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(__temp_iterator19, "hasNext", null)))
			{
				java.util.Map.Entry<java.lang.String, java.lang.String> mv = ((java.util.Map.Entry<java.lang.String, java.lang.String>) (haxe.lang.Runtime.callField(__temp_iterator19, "next", null)) );
				_env.set(mv.getKey(), mv.getValue());
			}
			
		}
		
		return _env;
	}
	
	
	public static   void sleep(double seconds)
	{
		try 
		{
			java.lang.Thread.sleep(((long) (( seconds * 1000 )) ));
		}
		catch (java.lang.Throwable __temp_catchallException55)
		{
			java.lang.Object __temp_catchall56 = __temp_catchallException55;
			if (( __temp_catchall56 instanceof haxe.lang.HaxeException )) 
			{
				__temp_catchall56 = ((haxe.lang.HaxeException) (__temp_catchallException55) ).obj;
			}
			
			{
				java.lang.Object e = __temp_catchall56;
				throw haxe.lang.HaxeException.wrap(e);
			}
			
		}
		
		
	}
	
	
	public static   boolean setTimeLocale(java.lang.String loc)
	{
		return false;
	}
	
	
	public static   java.lang.String getCwd()
	{
		return haxe.lang.StringExt.substr(new java.io.File(haxe.lang.Runtime.toString(".")).getAbsolutePath(), 0, -1);
	}
	
	
	public static   void setCwd(java.lang.String s)
	{
		throw haxe.lang.HaxeException.wrap("not implemented");
	}
	
	
	public static   java.lang.String systemName()
	{
		if (( haxe.root.Sys._sysName != null )) 
		{
			return haxe.root.Sys._sysName;
		}
		
		java.lang.String sname = java.lang.System.getProperty("os.name", null).toLowerCase();
		if (( haxe.lang.StringExt.indexOf(sname, "win", null) >= 0 )) 
		{
			return haxe.root.Sys._sysName = "Windows";
		}
		
		if (( haxe.lang.StringExt.indexOf(sname, "mac", null) >= 0 )) 
		{
			return haxe.root.Sys._sysName = "Mac";
		}
		
		if (( haxe.lang.StringExt.indexOf(sname, "nux", null) >= 0 )) 
		{
			return haxe.root.Sys._sysName = "Linux";
		}
		
		if (( haxe.lang.StringExt.indexOf(sname, "nix", null) >= 0 )) 
		{
			return haxe.root.Sys._sysName = "BSD";
		}
		
		return haxe.root.Sys._sysName = java.lang.System.getProperty("os.name", null);
	}
	
	
	public static   int command(java.lang.String cmd, haxe.root.Array<java.lang.String> args)
	{
		sys.io.Process proc = new sys.io.Process(cmd, ( (( args == null )) ? (new haxe.root.Array<java.lang.String>(new java.lang.String[]{})) : (args) ));
		int ret = proc.exitCode();
		proc.close();
		return ret;
	}
	
	
	public static   void exit(int code)
	{
		java.lang.System.exit(code);
	}
	
	
	public static   double time()
	{
		return ( ((double) (java.lang.System.currentTimeMillis()) ) / 1000 );
	}
	
	
	public static   double cpuTime()
	{
		return ( ((double) (java.lang.System.nanoTime()) ) / 1000 );
	}
	
	
	public static   java.lang.String executablePath()
	{
		return haxe.root.Sys.getCwd();
	}
	
	
	public static   int getChar(boolean echo)
	{
		throw haxe.lang.HaxeException.wrap("Not implemented");
	}
	
	
	public static   haxe.io.Input stdin()
	{
		java.io.InputStream _in = ((java.io.InputStream) (haxe.lang.Runtime.getField(java.lang.System.class, "in", false)) );
		return new haxe.java.io.NativeInput(((java.io.InputStream) (_in) ));
	}
	
	
	public static   haxe.io.Output stdout()
	{
		return new haxe.java.io.NativeOutput(((java.io.OutputStream) (java.lang.System.out) ));
	}
	
	
	public static   haxe.io.Output stderr()
	{
		return new haxe.java.io.NativeOutput(((java.io.OutputStream) (java.lang.System.err) ));
	}
	
	
	public static   java.lang.Object __hx_createEmpty()
	{
		return new haxe.root.Sys(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static   java.lang.Object __hx_create(haxe.root.Array arr)
	{
		return new haxe.root.Sys();
	}
	
	
	public    Sys(haxe.lang.EmptyObject empty)
	{
		super();
	}
	
	
}


