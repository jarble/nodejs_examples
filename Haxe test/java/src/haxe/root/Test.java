package haxe.root;
import haxe.root.*;
@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class Test extends haxe.lang.HxObject
{
	public static void main(String[] args)
	{
		Sys._args = args;
		main();
	}
	public    Test()
	{
		super();
	}
	
	
	public static   void greatestCommonFactor()
	{
		{
		}
		
	}
	
	
	public static   void greatestCommonFactorForTwoVars(java.lang.Object a, java.lang.Object z)
	{
		{
		}
		
	}
	
	
	public static   void saveImage(java.lang.Object absoluteFilePath)
	{
		{
		}
		
	}
	
	
	public static   void getFileText(java.lang.Object absoluteFilePath)
	{
		{
		}
		
	}
	
	
	public static   void getRandomFromNestedParentheses(java.lang.Object theParentheses)
	{
		{
		}
		
	}
	
	
	public static   haxe.root.Array<java.lang.String> printCommandLineArgs()
	{
		haxe.Log.trace.__hx_invoke2_o(0.0, 0.0, haxe.root.Test.detectTargetLanguage(), new haxe.lang.DynamicObject(new haxe.root.Array<java.lang.String>(new java.lang.String[]{"className", "fileName", "methodName"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{"Test", "Test.hx", "printCommandLineArgs"}), new haxe.root.Array<java.lang.String>(new java.lang.String[]{"lineNumber"}), new haxe.root.Array(new java.lang.Object[]{((java.lang.Object) (68) )})));
		return haxe.root.Sys.args();
	}
	
	
	public static   void main()
	{
		haxe.root.Test.printCommandLineArgs();
		haxe.Log.trace.__hx_invoke2_o(0.0, 0.0, ( ( "Hello World ! This code is compiled to " + haxe.root.Test.detectTargetLanguage() ) + "!" ), new haxe.lang.DynamicObject(new haxe.root.Array<java.lang.String>(new java.lang.String[]{"className", "fileName", "methodName"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{"Test", "Test.hx", "main"}), new haxe.root.Array<java.lang.String>(new java.lang.String[]{"lineNumber"}), new haxe.root.Array(new java.lang.Object[]{((java.lang.Object) (80) )})));
		haxe.Log.trace.__hx_invoke2_o(haxe.root.Test.getWrappingNumber(5, 1, 4), 0.0, haxe.lang.Runtime.undefined, new haxe.lang.DynamicObject(new haxe.root.Array<java.lang.String>(new java.lang.String[]{"className", "fileName", "methodName"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{"Test", "Test.hx", "main"}), new haxe.root.Array<java.lang.String>(new java.lang.String[]{"lineNumber"}), new haxe.root.Array(new java.lang.Object[]{((java.lang.Object) (81) )})));
		haxe.root.Array<java.lang.Object> a = new haxe.root.Array<java.lang.Object>();
		a = new haxe.root.Array(new java.lang.Object[]{1, 2, 3, 4});
		haxe.root.Test.enlarge1DArray(a);
		haxe.lang.Function nestedFunction = ( (( haxe.root.Fun_b99d6d7e.__hx_current != null )) ? (haxe.root.Fun_b99d6d7e.__hx_current) : (haxe.root.Fun_b99d6d7e.__hx_current = ((haxe.root.Fun_b99d6d7e) (new haxe.root.Fun_b99d6d7e()) )) );
	}
	
	
	public static   int getWrappingNumber(int number, int minimum, int maximum)
	{
		haxe.Log.trace.__hx_invoke2_o(0.0, 0.0, "Calling getWrappingNumber.", new haxe.lang.DynamicObject(new haxe.root.Array<java.lang.String>(new java.lang.String[]{"className", "fileName", "methodName"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{"Test", "Test.hx", "getWrappingNumber"}), new haxe.root.Array<java.lang.String>(new java.lang.String[]{"lineNumber"}), new haxe.root.Array(new java.lang.Object[]{((java.lang.Object) (115) )})));
		int num = number;
		int offsetNum = ( num - minimum );
		int scale = ( ( maximum - minimum ) + 1 );
		return ((int) (java.lang.Math.round(( ( scale * (( ( ((double) (offsetNum) ) / scale ) - ((int) (java.lang.Math.floor(( ((double) (offsetNum) ) / scale ))) ) )) ) + minimum ))) );
	}
	
	
	public static   void enlarge1DArray(java.lang.Object array)
	{
		int i = 0;
		while (( haxe.lang.Runtime.compare(i, ((int) (haxe.lang.Runtime.getField_f(array, "length", true)) )) < 0 ))
		{
			i++;
			haxe.Log.trace.__hx_invoke2_o(0.0, 0.0, ( "i is " + i ), new haxe.lang.DynamicObject(new haxe.root.Array<java.lang.String>(new java.lang.String[]{"className", "fileName", "methodName"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{"Test", "Test.hx", "enlarge1DArray"}), new haxe.root.Array<java.lang.String>(new java.lang.String[]{"lineNumber"}), new haxe.root.Array(new java.lang.Object[]{((java.lang.Object) (135) )})));
		}
		
	}
	
	
	public static   void getShellOutput(java.lang.String theString)
	{
		haxe.Log.trace.__hx_invoke2_o(0.0, 0.0, ( "Calling getShellOutput for the string " + theString ), new haxe.lang.DynamicObject(new haxe.root.Array<java.lang.String>(new java.lang.String[]{"className", "fileName", "methodName"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{"Test", "Test.hx", "getShellOutput"}), new haxe.root.Array<java.lang.String>(new java.lang.String[]{"lineNumber"}), new haxe.root.Array(new java.lang.Object[]{((java.lang.Object) (149) )})));
		if (haxe.lang.Runtime.valEq(haxe.root.Test.detectTargetLanguage(), "Javascript")) 
		{
			{
			}
			
		}
		
	}
	
	
	public static   java.lang.String detectTargetLanguage()
	{
		return "Java";
	}
	
	
	public static   java.lang.Object __hx_createEmpty()
	{
		return new haxe.root.Test(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static   java.lang.Object __hx_create(haxe.root.Array arr)
	{
		return new haxe.root.Test();
	}
	
	
	public    Test(haxe.lang.EmptyObject empty)
	{
		super();
	}
	
	
}


