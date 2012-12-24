package haxe.root;
import haxe.root.*;
@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class Fun_a3fcd0d6 extends haxe.lang.Function
{
	public    Fun_a3fcd0d6(haxe.root.Array<java.lang.Object> i, haxe.root.Array<java.lang.Object> len)
	{
		super(0, 0);
		this.i = i;
		this.len = len;
	}
	
	
	@Override public   java.lang.Object __hx_invoke0_o()
	{
		return ( haxe.lang.Runtime.toInt(this.i.__get(0)) < haxe.lang.Runtime.toInt(this.len.__get(0)) );
	}
	
	
	public  haxe.root.Array<java.lang.Object> i;
	
	public  haxe.root.Array<java.lang.Object> len;
	
}


