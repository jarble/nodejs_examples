function createCar(color, doors, mpg) {
    var tempcar = new Object;
    tempcar.color = color;
    tempcar.doors = doors;
    tempcar.mpg = mpg;
    tempcar.showColor = function () {
        console.log(this.color);
    };
    return tempcar;
}

myArray.prototype.height; 
myArray.prototype.width;
function myArray(){
	return newObj;
}
var car1 = createCar("red", 4, 23);
var car2 = createCar("blue", 3, 25);
car1.showColor();
//abort();
car2.showColor();

function abort()
{
   throw new Error('This is not an error. This is just to abort javascript');
}
