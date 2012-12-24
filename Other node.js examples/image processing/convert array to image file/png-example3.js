function generatePNGImageFrom1DArray(WIDTH, HEIGHT, array, imageName){
var fs  = require('fs');
var sys = require('sys');
var Png = require('png').Png;
var Buffer = require('buffer').Buffer;

var rgb = new Buffer(WIDTH*HEIGHT*3);

for (var i=0; i<HEIGHT; i++) {
    for (var j=0; j<WIDTH; j++) {
        rgb[i*WIDTH*3 + j*3 + 0] = array[i*WIDTH*3 + j*3 + 0];
        rgb[i*WIDTH*3 + j*3 + 1] = array[i*WIDTH*3 + j*3 + 1];
        rgb[i*WIDTH*3 + j*3 + 2] = array[i*WIDTH*3 + j*3 + 2];
    }
}

var png = new Png(rgb, WIDTH, HEIGHT, 'rgb');

fs.writeFileSync(imageName, png.encodeSync().toString('binary'), 'binary');	
}

//generatePNGImageFrom1DArray(2, 2, [255, 255, 255, 255, 255, 255, 255, 255, 255, 0, 0, 255], './png-gradientBlue.png');
