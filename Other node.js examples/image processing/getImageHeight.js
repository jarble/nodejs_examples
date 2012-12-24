var im = require('imagemagick');

var identify = function () {

      im.identify('kittens.png', function(err, features){

         doSomething(features) // call doSomething function passing features a parameter.
		//console.log(stuff);
      })

}(); // this is the first function so it should self-execute.

var doSomething = function (features) {

       var toObtain = features;

       console.log(toObtain) //or whatever you want to do with toObtain variable
       stuff = toObtain;
};

//doSomething();
var stuff = "Ha!";
