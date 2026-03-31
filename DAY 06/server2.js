var express = require('express');
var bodyParser = require("body-parser");
var app = express();

app.use(bodyParser.urlencoded({ extended: false }));

app.get('/', function (req, res) {
  res.sendFile(__dirname + '/index.html');
});

app.post('/submit-student-data', function (req, res) {
  var name = req.body.firstName + ' ' + req.body.lastName;
  res.send(name + ' Submitted Successfully!');
});

var server = app.listen(5000, function () {
  console.log('Node server is running on port 5000..');
});