//it might be possible to re-write this in Haxe (so that redundant code won't need to be written.)
//Search for haxe command line arguments on Google.




//type "Java Stuff" (without quotes) to run this program from the command line.

import java.io.IOException;

public class Stuff{
	public static void main(String[] args){
		//System.out.println(args.length);
		//printArray(args);
		//get the text that corresponds to the command
		//System.out.print(getCommandText("node stuff.js"));
		//System.out.print(getCommandText("node stuff.js"));
		if(args.length == 0){
			System.out.println("args.length is 0.");
			System.out.print(getCommandText("node stuff.js generateRandomString(\"(w|g|p|i)oo (l|d|s)oo\")"));
		}
		else{
			System.out.println("print the output of the function " + args[0] + " with its parameters. " + args[0] + " is the first element in args.");
			if(args[0] == )
		}
		//console.log(args.toString());
	}
	
	public static void printArray(Object[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
	}
	
	public static String getCommandText(String theCommand){
		 try
    {
        final Process p = Runtime.getRuntime().exec(theCommand);
        final ProcessResultReader stderr = new ProcessResultReader(p.getErrorStream(), "STDERR");
        final ProcessResultReader stdout = new ProcessResultReader(p.getInputStream(), "STDOUT");
        stderr.start();
        stdout.start();
        final int exitValue = p.waitFor();
        if (exitValue == 0)
        {
            return stdout.toString();
        }
        else
        {
            System.err.print(stderr.toString());
        }
    }
    catch (final IOException e)
    {
        throw new RuntimeException(e);
    }
    catch (final InterruptedException e)
    {
        throw new RuntimeException(e);
    }
		throw new RuntimeException("It doesn't work!");
	}
}
