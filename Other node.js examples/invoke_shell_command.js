console.log("Opening Firefox!");
var sys = require('sys')
var exec = require('child_process').exec;
function puts(error, stdout, stderr) { sys.puts(stdout) }
exec("firefox http://www.minecraft.net", puts);