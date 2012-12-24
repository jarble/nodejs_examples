var fs = require('fs');
fs.writeFile("test.txt", "Hey there!, WOO!", function(err) {
    if(err) {
        console.log(err);
    } else {
        console.log("The file was saved! BOOHAH!");
    }
}); 
