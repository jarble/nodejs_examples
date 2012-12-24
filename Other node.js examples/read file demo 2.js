var fs = require('fs');
var array = fs.readFileSync('test.txt').toString().split("\n");
for(i in array) {
    console.log(array[i]);
}

printLah(); //this prints "Haha" for some reason

function printLah(){
		console.log("Hahah!");
}


function printLah(){
		console.log("Haha");
}
