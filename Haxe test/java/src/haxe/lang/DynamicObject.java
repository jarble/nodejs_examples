package haxe.lang;
import haxe.root.*;
@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class DynamicObject extends haxe.lang.HxObject
{
	public    DynamicObject()
	{
		super();
		haxe.lang.DynamicObject.__hx_ctor(this);
	}
	
	
	public static   void __hx_ctor(haxe.lang.DynamicObject __temp_me8)
	{
		java.lang.Object __temp_expr100 = null;
	}
	
	
	public static   java.lang.Object __hx_createEmpty()
	{
		return new haxe.lang.DynamicObject(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static   java.lang.Object __hx_create(haxe.root.Array arr)
	{
		return new haxe.lang.DynamicObject();
	}
	
	
	public    DynamicObject(haxe.lang.EmptyObject empty)
	{
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public    DynamicObject(haxe.root.Array<java.lang.String> __hx_hashes, haxe.root.Array<java.lang.Object> __hx_dynamics, haxe.root.Array<java.lang.String> __hx_hashes_f, haxe.root.Array<java.lang.Object> __hx_dynamics_f)
	{
		this.__hx_hashes = __hx_hashes;
		this.__hx_dynamics = __hx_dynamics;
		this.__hx_hashes_f = __hx_hashes_f;
		this.__hx_dynamics_f = __hx_dynamics_f;
	}
	
	
	@Override public   java.lang.String toString()
	{
		haxe.lang.Function ts = ((haxe.lang.Function) (haxe.lang.Runtime.getField(this, "toString", false)) );
		if (( ts != null )) 
		{
			return haxe.lang.Runtime.toString(ts.__hx_invoke0_o());
		}
		
		haxe.root.StringBuf ret = new haxe.root.StringBuf();
		ret.add("{");
		boolean first = true;
		{
			int _g = 0;
			haxe.root.Array<java.lang.String> _g1 = haxe.root.Reflect.fields(this);
			while (( _g < _g1.length ))
			{
				java.lang.String f = _g1.__get(_g);
				 ++ _g;
				if (first) 
				{
					first = false;
				}
				 else 
				{
					ret.add(",");
				}
				
				ret.add(" ");
				ret.add(f);
				ret.add(" : ");
				ret.add(haxe.root.Reflect.field(this, f));
			}
			
		}
		
		if ( ! (first) ) 
		{
			ret.add(" ");
		}
		
		ret.add("}");
		return ret.toString();
	}
	
	
	@Override public   boolean __hx_deleteField(java.lang.String field)
	{
		int res = haxe.lang.FieldLookup.findHash(field, this.__hx_hashes);
		if (( res >= 0 )) 
		{
			this.__hx_hashes.splice(res, 1);
			this.__hx_dynamics.splice(res, 1);
			return true;
		}
		 else 
		{
			res = haxe.lang.FieldLookup.findHash(field, this.__hx_hashes_f);
			if (( res >= 0 )) 
			{
				this.__hx_hashes_f.splice(res, 1);
				this.__hx_dynamics_f.splice(res, 1);
				return true;
			}
			
		}
		
		return false;
	}
	
	
	public  haxe.root.Array<java.lang.String> __hx_hashes;
	
	public  haxe.root.Array<java.lang.Object> __hx_dynamics;
	
	public  haxe.root.Array<java.lang.String> __hx_hashes_f;
	
	public  haxe.root.Array<java.lang.Object> __hx_dynamics_f;
	
	@Override public   java.lang.Object __hx_lookupField(java.lang.String field, boolean throwErrors, boolean isCheck)
	{
		int res = haxe.lang.FieldLookup.findHash(field, this.__hx_hashes);
		if (( res >= 0 )) 
		{
			return this.__hx_dynamics.__get(res);
		}
		 else 
		{
			res = haxe.lang.FieldLookup.findHash(field, this.__hx_hashes_f);
			if (( res >= 0 )) 
			{
				return haxe.lang.Runtime.toDouble(this.__hx_dynamics_f.__get(res));
			}
			
		}
		
		if (isCheck) 
		{
			return haxe.lang.Runtime.undefined;
		}
		 else 
		{
			return null;
		}
		
	}
	
	
	@Override public   double __hx_lookupField_f(java.lang.String field, boolean throwErrors)
	{
		int res = haxe.lang.FieldLookup.findHash(field, this.__hx_hashes_f);
		if (( res >= 0 )) 
		{
			return haxe.lang.Runtime.toDouble(this.__hx_dynamics_f.__get(res));
		}
		 else 
		{
			res = haxe.lang.FieldLookup.findHash(field, this.__hx_hashes);
			if (( res >= 0 )) 
			{
				return haxe.lang.Runtime.toDouble(this.__hx_dynamics.__get(res));
			}
			
		}
		
		return 0.0;
	}
	
	
	@Override public   java.lang.Object __hx_lookupSetField(java.lang.String field, java.lang.Object value)
	{
		int res = haxe.lang.FieldLookup.findHash(field, this.__hx_hashes);
		if (( res >= 0 )) 
		{
			return this.__hx_dynamics.__set(res, ((java.lang.Object) (value) ));
		}
		 else 
		{
			int res2 = haxe.lang.FieldLookup.findHash(field, this.__hx_hashes_f);
			if (( res >= 0 )) 
			{
				this.__hx_hashes_f.splice(res2, 1);
				this.__hx_dynamics_f.splice(res2, 1);
			}
			
		}
		
		this.__hx_hashes.insert( ~ (res) , field);
		this.__hx_dynamics.insert( ~ (res) , ((java.lang.Object) (value) ));
		return value;
	}
	
	
	@Override public   double __hx_lookupSetField_f(java.lang.String field, double value)
	{
		int res = haxe.lang.FieldLookup.findHash(field, this.__hx_hashes_f);
		if (( res >= 0 )) 
		{
			return haxe.lang.Runtime.toDouble(this.__hx_dynamics_f.__set(res, value));
		}
		 else 
		{
			int res2 = haxe.lang.FieldLookup.findHash(field, this.__hx_hashes);
			if (( res >= 0 )) 
			{
				this.__hx_hashes.splice(res2, 1);
				this.__hx_dynamics.splice(res2, 1);
			}
			
		}
		
		this.__hx_hashes_f.insert( ~ (res) , field);
		this.__hx_dynamics_f.insert( ~ (res) , value);
		return value;
	}
	
	
	@Override public   void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		{
			{
				java.lang.Object __temp_iterator20 = this.__hx_hashes.iterator();
				while (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(__temp_iterator20, "hasNext", null)))
				{
					java.lang.String __temp_field10 = haxe.lang.Runtime.toString(haxe.lang.Runtime.callField(__temp_iterator20, "next", null));
					baseArr.push(__temp_field10);
				}
				
			}
			
			{
				java.lang.Object __temp_iterator21 = this.__hx_hashes_f.iterator();
				while (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(__temp_iterator21, "hasNext", null)))
				{
					java.lang.String __temp_field9 = haxe.lang.Runtime.toString(haxe.lang.Runtime.callField(__temp_iterator21, "next", null));
					baseArr.push(__temp_field9);
				}
				
			}
			
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


