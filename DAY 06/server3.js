var express = require('express');
var app = express();

app.get('/', function (_req, res) {
    res.sendFile(__dirname + "/index2.html");
});

app.get('/process_get', function (req, res) {
    var response = { 
        fname: req.query.fname,
        lname: req.query.lname
    };
    console.log(response);
    res.json(response);
});

var server = app.listen(5000, function () {
    console.log('Node server is running on port 5000..');
});