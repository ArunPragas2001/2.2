var fs = require('fs');
var in_data = fs.readFileSync('./hello.txt');
console.log(`Sync in file content: ${in_data}`);
console.log('Programme ended.');