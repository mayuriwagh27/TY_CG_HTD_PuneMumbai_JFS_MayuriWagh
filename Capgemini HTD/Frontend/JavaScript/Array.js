//var x = [123, 'Mayuri', {name = 'Shahrukh khan'}];
//console.log(x[2]);

var colors = ['yellow', 'black', 'red', 'blue'];
console.log(colors);

colors.pop();
console.log(colors);

colors.push('voilet','gray');
console.log(colors);

colors.shift();
console.log(colors);

colors.unshift('purple','white');
console.log(colors);

colors.splice(2,2);
console.log(colors);

colors.splice(2,1, 'indigo','orange', 'indian black');
console.log(colors);

//forEach loop
colors.forEach(function(value){
    console.log(value);
})

//filter method
var myArray = [1,2,3,4,5,6,7,8,9];
var x = myArray.filter(function(value){
    return value > 3;
});
console.log(x);

//filter method for unique values
var m = [1,2,3,4,1,2,3,4];
var x = m.filter(function(value, index,array){
return array.indexOf(value) === index;
});
console.log(x);

// //for of loop
// for (var i of m){
//     console.log(i);
// }

//for in loop to acess array
for (var j in m){        //returns index number
    console.log("The value is: "+m[j] +  " and the index is: "+j);
}

//for in loop to acess objects
var movie ={
    name: '3 idiots',
    actor: 'aamir khan',
    actress: 'kareena kapoor',
};
for (var key in movie){
    console.log(movie[key])

}


// //callback function
// function test(cb){
//     console.log('test function is started');
//     cb();         //calling the function
//     console.log('test function is ended');
// }

// test(function(){
//     console.log('callback function is being executed');   //callback
// });

// //set Timeout function
// setTimeout(function(){
//     console.log('5 seconds done');
// }, 5000);

















