#it might be possible to re-write this in Haxe (so that redundant #code won't need to be written.)





"""
Type python stuff.py to run this program from the command line.

"""

import sys
import subprocess
"""
this prints the command line args
"""

def main():
	if(len(sys.argv) == 1):
		#print len(sys.argv);
		print("No command-line arguments!")
	if(len(sys.argv) > 1):
		#print len(sys.argv);
		print("Call the function " + sys.argv[1]);
	print "Command line arguments: " + "\n".join(sys.argv);
main();	

"""
print getCommandOutput([ 'node', 'stuff.js' ]);
"""

def getCommandOutput(command):
	cmd = command
	output = subprocess.Popen( cmd, stdout=subprocess.PIPE ).communicate()[0]
	return output
"""
import subprocess
cmd = [ 'node', 'stuff.js' ]
output = subprocess.Popen( cmd, stdout=subprocess.PIPE ).communicate()[0]
print output
"""

"""

now find out how to get the output of a terminal command


"""
