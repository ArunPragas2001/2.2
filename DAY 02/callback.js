function test(a, b, callback) {
    var result = a + b;
    callback(result);
}

test(15, 25, function(resultdata) {
    console.log(resultdata / 2);
});