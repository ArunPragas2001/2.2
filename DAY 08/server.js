const http = require('http');
const url = require('url');

const students = [
    ['S001', 'Alice Johnson', 3.8],
    ['S002', 'Bob Smith', 3.5],
    ['S003', 'Charlie Davis', 3.9]
];

function searchStudent(id) {
    const student = students.find(s => s[0] === id);
    if (student) {
        return `Student Name: ${student[1]}, GPA: ${student[2]}`;
    } else {
        return '404 student not found';
    }
}

http.createServer((req, res) => {
    const queryObject = url.parse(req.url, true).query;
    const studentId = queryObject.id;

    res.writeHead(200, { 'Content-Type': 'text/html' });

    if (studentId) {
        const result = searchStudent(studentId);
        res.end(result);
    } else {
        res.end('Please provide a student ID!');
    }
}).listen(3000);
console.log('Server is running on http://localhost:3000');