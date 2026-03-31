var arr = [2, 4, 3];
var arr1 = [3, 4, 5, 6];

function mapping(arr) {
    for (var i = 0; i < arr.length; i++) {
        for (var j = 0; j <= i; j++) {
            console.log(arr[i] + arr[j]);
        }
    }
}

let map = (array, callback) => {
    callback(array);
};

console.log("Output for arr:");
map(arr, mapping);

console.log("\nOutput for arr1:");
map(arr1, mapping);