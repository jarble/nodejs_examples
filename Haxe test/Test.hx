package ;
import JavascriptFunctions;
class Test{
//function name: multiplyFractions
//requires functions: simplifyFraction
//is defined: false
//description: Multiply the first fraction by the second fraction.

//function name: simplifyFraction
//requires functions: greatestCommonFactor
//is defined: false
//description: Divide the numerator and denominator by the greatest common factor.

//function name: greatestCommonFactor
//requires functions: false
//is defined: false
//description: Get the greatest common factor of two numbers.
//http://stackoverflow.com/questions/4201860/how-to-find-gcf-lcm-on-a-set-of-numbers
	static function greatestCommonFactor(){
				/*
		private static long gcd(long[] input)
{
    long result = input[0];
    for(int i = 1; i < input.length; i++) result = gcd(result, input[i]);
    return result;
}
*/
	}
	
	static function greatestCommonFactorForTwoVars(a, z){
		/*
		private static long gcd(long a, long b)
{
    while (b > 0)
    {
        long temp = b;
        b = a % b; // % is remainder
        a = temp;
    }
    return a;
}
*/
	}
//function name: saveImage
//requires functions: false
//is defined: false
//description: Save an image to the absolute file path.
	static function saveImage(absoluteFilePath){
		
	}
//function name: getFileText
//requires functions: false
//is defined: false
//description: Return the text of the file, given the absolute file path.
//https://www.google.com/#hl=en&tbo=d&output=search&sclient=psy-ab&q=haxe+get+file+text&oq=haxe+get+file+text&gs_l=hp.3...4676.7402.0.7512.18.17.0.0.0.0.177.1477.14j3.17.0.les%3Beqn%2Ccconf%3D1-2%2Cmin_length%3D2%2Crate_low%3D0-035%2Crate_high%3D0-035%2Csecond_pass%3Dfalse%2Cnum_suggestions%3D2%2Cignore_bad_origquery%3Dtrue..0.0...1c.1.-XWCy7ZjDys&pbx=1&bav=on.2,or.r_gc.r_pw.r_cp.r_qf.&fp=fb98fb50523c2b9f&bpcl=38897761&biw=1366&bih=631
	static function getFileText(absoluteFilePath){
		
	}

//function name: getRandomFromNestedParentheses
//requires functions: false
//is defined: false
//description: Generate a random string from a string with nested parentheses.
	static function getRandomFromNestedParentheses(theParentheses){
		
	}
	
	static function printCommandLineArgs(){
		trace(detectTargetLanguage());
		#if js
			return untyped __js__("process.argv");
		#else
			return Sys.args();
		#end
	}
	
    static function main() {
		printCommandLineArgs();
		JavascriptFunctions.printStuff();
		//var javascriptmodule = untyped __js__("require(\"javascriptmodule\")");
		//untyped __js__("require(\"javascriptmodule\").exec(\"google-chrome\")");
        trace("Hello World ! This code is compiled to " + detectTargetLanguage() + "!");
        trace(getWrappingNumber(5, 1, 4));
        //Find out how to do a for loop in haxe
        //use a while loop instead
        var a = new Array();
        a  = [1,2,3,4];
        enlarge1DArray(a);
        //nestedFunction();
        
        function nestedFunction(){
			trace("This is a nested function!");
		}
    }

//function name: addFractions
//requires functions: getLeastCommonMultiple
//is defined: false
//description: Add the two fractions.
//http://stackoverflow.com/questions/4201860/how-to-find-gcf-lcm-on-a-set-of-numbers

//function name: getLeastCommonMultiple
//requires functions: false
//is defined: false
//description: Get the least common multiple of the two values.

//function name: getWrappingArray
//requires functions: getWrappingNumber
//is defined: false
//description: Get the array with the specified wrapping coordinates.

//function name: getWrappingNumber
//requires functions: false
//is defined: true
//description: Get the wrapping number for the parameters num, min, max.
static function getWrappingNumber(number, minimum, maximum){
	trace("Calling getWrappingNumber.");
	var num = number;
    var offsetNum = num - minimum;
    var scale = (maximum - minimum + 1);
    return Math.round((scale) * (((offsetNum / (scale)) - Math.floor((offsetNum / (scale))))) + minimum);
}

//function name: enlarge2DArray
//requires functions: enlarge1DArray
//is defined: false
//description: Magnify a 2D array to twice its width and height.

//function name: enlarge1DArray
//requires functions: false
//is defined: false
//description: Magnify a 1D array to twice its length.
	static function enlarge1DArray(array){
		var i = 0;
		while(i < array.length){
			i++;
			trace("i is " + i);
		}
		//http://haxe.org/ref/syntax
		//http://haxe.org/api/array
		//while(){ //figure out how arrays work in Haxe
			
		//}
	}

//function name: getShellOutput
//requires functions: detectTargetLanguage
//is defined: false
//description: Get the output of a shell command.
	static function getShellOutput(theString){
		trace("Calling getShellOutput for the string " + theString);
		if(detectTargetLanguage() == "Javascript"){
			
		}
	}
    
//function name: detectTargetLanguage
//requires functions: false
//is defined: true
//description: Detect the target language.
    static function detectTargetLanguage(){
		#if java
			return "Java";
		#elseif js
			return "Javascript";
		#elseif neko
			return "Neko";
		#else
			#error
		#end
	}
}
