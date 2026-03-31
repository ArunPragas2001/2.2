const http = require('http');
const fs = require('fs');
const url = require('url');

http.createServer(function(request, response) {

    const pathname = url.parse(request.url).pathname;
    console.log(`Request for ${pathname} received!`);

    fs.readFile(pathname.substring(1), function(err, data) {

        if (err) {
            console.log(err.stack);
            response.writeHead(404, { 'Content-Type': 'text/html' });
            response.end('<h1>404 Not Found</h1>');
        } else {
            response.writeHead(200, { 'Content-Type': 'text/html' });
            response.end(data);
        }

    });

}).listen(8081);

console.log('Server running at http://127.0.0.1:8081/');
