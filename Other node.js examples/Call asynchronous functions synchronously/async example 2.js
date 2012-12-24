https://github.com/caolan/async#series

var async=require("async");


doStuff("First function call");
doStuff("Second function call");
console.log("Hi!");

var k;
function doStuff(message){
async.series([
    function(callback){
		console.log("k = " + k);
		console.log(message);
        console.log("a"); 
        callback();
    },
    function(callback){ 
        console.log("b");
        k = 3;
        callback();
    },
    function(callback){
		console.log("It works, yay!");
	}
]);

}
