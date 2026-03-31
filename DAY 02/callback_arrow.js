function execute(x, y, callback){
    let result = x * y; 
    setTimeout(() => {
        console.log("Processing done...");
        callback(result); 
        
    }, 3000);
}

execute(4, 5, function(div){
    console.log("Answer is: " + (div / 2));
});