var im = require('imagemagick');
var async = require('async');

var toObtain = false;


var b;
async.series([

function (callback) {
	firstStep(callback); //firstStep accepts a function as a parameter and calls the function when it finishes running.
},

function (callback) {
	//it works properly now!
    console.log("Starting the second step in the series");
    console.log("Value of b: " + b);
}]);


function firstStep(theCallback){
	async.series([

    function (next) { // step one - call the function that sets toObtain
        im.identify('kittens.png', function (err, features) {
            if (err) throw err;
            console.log("Invoking the function firstStep");
            toObtain = features;
            console.log("features: " + toObtain.toString);
            //console.log(toObtain);
            b = toObtain.height;
            next(); // invoke the callback provided by async
        });
    },

    function (next) { // step two - display it
        console.log('the value of toObtain is: %s',toObtain.toString());
        theCallback();
    }]);
}
