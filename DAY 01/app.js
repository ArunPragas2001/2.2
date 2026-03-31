var http = require('http');

http.createServer(function(req, res) {
    res.write("Web services");
    res.end();
}).listen(8080);