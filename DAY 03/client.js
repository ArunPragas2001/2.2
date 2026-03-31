const http = require('http');
const fs = require('fs');
const url = require('url');

const options = {
    host: 'localhost',
    port: 8081,
    path: '/test.html'
};

const callback = function(response) {
    let body = '';

    response.on('data', function(data) {
        body = body + data;
    });
    
    response.on('end', function() {
        console.log('Response from server: ');
        console.log(body);
    });
};

const req = http.request(options, callback);
req.end();
