var fs  = require('fs');
var sys = require('sys');
var Png = require('png').Png;
var Buffer = require('buffer').Buffer;

var WIDTH = 1000, HEIGHT = 1000;

var rgb = new Buffer(WIDTH*HEIGHT*3);

for (var i=0; i<HEIGHT; i++) {
    for (var j=0; j<WIDTH; j++) {
        rgb[i*WIDTH*3 + j*3 + 0] = 255*j/WIDTH*Math.random();
        rgb[i*WIDTH*3 + j*3 + 1] = 255*i/HEIGHT*Math.random();
        rgb[i*WIDTH*3 + j*3 + 2] = 0xff/2;
    }
}

var png = new Png(rgb, WIDTH, HEIGHT, 'rgb');

fs.writeFileSync('./png-gradient.png', png.encodeSync().toString('binary'), 'binary');

