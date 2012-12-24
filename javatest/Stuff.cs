//it might be possible to re-write this in Haxe (so that redundant code won't need to be written.)
//Search for haxe command line arguments on Google.




// mcs proc.cs
// Outputs the files in the directory where the program is located
 
// defines classes which we're going to use
using System;
using System.Diagnostics;
 
class Stuff {
 
	static void Main () // starting point of the program
	{
		// sets up our process, the first argument is the command 
		// and the second holds the arguments passed to the command
		ProcessStartInfo ps = new ProcessStartInfo ("ls", "./");
		ps.UseShellExecute = false;
 
		// we need to redirect the standard output so we read it
		// internally in out program
		ps.RedirectStandardOutput = true;
 
		// starts the process
		using (Process p = Process.Start (ps)) {
 
			// we read the output to a string
			string output = p.StandardOutput.ReadToEnd ();
 
			// waits for the process to exit
			// Must come *after* StandardOutput is "empty"
			// so that we don't deadlock because the intermediate
			// kernel pipe is full.
			p.WaitForExit ();
 
			// finally output the string
			Console.WriteLine (output);
		}
	}
}
