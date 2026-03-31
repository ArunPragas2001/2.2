var fs = require('fs');
var out_data = 'Output line 1.\r\nOutput line 2.\r\nOutput last line.';
fs.writeFile('./async_output.txt', out_data, function (err){
    if(err) console.error(err);
    console.log(`Async output file content: ${out_data}`);
});
console.log('Programme ended.');