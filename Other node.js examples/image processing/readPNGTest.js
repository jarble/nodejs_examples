var PNG = require('png-js');
PNG.decode('some.png', function(pixels) {
    // pixels is a 1d array of decoded pixel data
});
