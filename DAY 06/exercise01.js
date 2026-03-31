function calculateArea(len, callback){
    area = len ** 2;
    callback(area);
}

calculateArea(5, function(data){
    console.log(data);
});