const express = require('express');
const app = express();

app.get('/', (req, res) => {
    res.send([1, 2, 3, 4, 5, 6]);
});

app.get('/:id', (req, res) => {
    res.send(req.params.id);
});

const port = process.env.PORT||3000;
app.listen(port, ()=> console.log(`Listening on port ${port}`));