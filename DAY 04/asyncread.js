var fs = require('fs');
var in_data;
fs.readFile('./hello.txt', function(err, data){
    if(err) return console.error(err);
    in_data = data;
    console.log(`Async in file content: ${in_data}`);
});
console.log('Programme ended.');