var PNG = require('png-js');
var async = require('async');

var theArr = new Array();
async.series([
function(callback){
	getArray("kittens.png", theArr, callback);
},
function(callback){
	console.log(theArr.length);
}
]);
//console.log(theArr.length);

//console.log(extractPixels("kittens.png").length);

function getArray(imageName, theVariable, theCallback){

var thePixels = new Array;
async.series([function(callback){
	firstStep(imageName, callback);
},
function(callback){
	//console.log(thePixels.length);
	theVariable = thePixels;
	theCallback();
}
]);

function firstStep(imagePath, callback){
PNG.decode(imagePath, function(pixels) {
    // pixels is a 1d array of decoded pixel data
    var newArr = pixels;
    for(var i = 0; i < pixels.length; i++){
		newArr[i] = pixels.length;
		//console.log(pixels[i]);
	}
	thePixels = pixels;
	theArr = newArr;
	callback();
});
}
}
