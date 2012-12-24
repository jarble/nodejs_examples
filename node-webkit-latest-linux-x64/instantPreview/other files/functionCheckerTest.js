		var functionChecker = require("functionChecker2.js");
		var str = __filename.toString();
		console.log(str);
		functionChecker.getFunctions(__filename);
		
		//function name: printToCanvas
		//requires functions: false
		//is defined: false
		//description: Print a 2D array to canvas.

		//function name: printToCanvas1
		//requires functions: printToCanvas
		//is defined: false
		//description: Print a 2D array to canvas.
