package haxe.root;
import haxe.root.*;
@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class Fun_8b120a1d<T> extends haxe.lang.Function
{
	public    Fun_8b120a1d(haxe.root.Array<haxe.root.Array> _g, haxe.root.Array<java.lang.Object> i)
	{
		super(0, 0);
		this._g = _g;
		this.i = i;
	}
	
	
	@Override public   java.lang.Object __hx_invoke0_o()
	{
		T[] __temp_stmt30 = ((haxe.root.Array<T>) (((haxe.root.Array) (this._g.__get(0)) )) ).__a;
		int __temp_stmt31 = 0;
		{
			int __temp_arrIndex17 = 0;
			int __temp_arrVal15 = haxe.lang.Runtime.toInt(this.i.__get(__temp_arrIndex17));
			int __temp_arrRet16 = __temp_arrVal15++;
			int __temp_expr32 = haxe.lang.Runtime.toInt(this.i.__set(__temp_arrIndex17, __temp_arrVal15));
			__temp_stmt31 = __temp_arrRet16;
		}
		
		return __temp_stmt30[__temp_stmt31];
	}
	
	
	public  haxe.root.Array<haxe.root.Array> _g;
	
	public  haxe.root.Array<java.lang.Object> i;
	
}


