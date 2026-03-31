const express = require('express');n
const app = express();

app.get('/', (_req, res) => {
  res.send('<html><body><h1>Hello World</h1></body></html>');
});

app.post('/submit-data', (_req, res) => {
  res.send('POST Request');
});

app.put('/update-data', (_req, res) => {
  res.send('PUT Request');
});

app.delete('/delete-data', (_req, res) => {
  res.send('DELETE Request');
});

app.listen(5000, () => {
  console.log('Node server is running on port 5000..');
});