const http = require('http');
const studentIdToSearch = 'S002';

const options = {
    hostname: 'localhost',
    port: 3000,
    path: `/?id=${studentIdToSearch}`,
    method: 'GET'
};

const req = http.request(options, (res) => {
    let data = '';

    res.on('data', (chunk) => {
        data += chunk;
    });

    res.on('end', () => {
        console.log(`Response from server for ID ${studentIdToSearch}: ${data}`);
    });
});

req.on('error', (e) => {
    console.error(`Error: ${e.message}`);
});

req.end();