			var scannerclass = {
					createEvent : function(title) {
						cordova.exec(successCallback, // success callback function
						errorCallback, // error callback function
						'ScannerClass', // mapped to our native Java class called "scannerclass"
						'addScannerEntry', // with this action name
						[ { // and this array of custom arguments to create our entry
							"title" : title
						} ]
					);
					}
				}
				module.exports = scannerclass;