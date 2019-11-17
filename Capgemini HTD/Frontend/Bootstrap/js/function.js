//Anonymous function with expression
var x = function(){
    console.log('Hello from anonymous function');
}
x();                  // calling of function

//Naming function
function add(a,b){
    console.log(a+b);
}
add(20,30);               //calling function

//immediate invoke function expression
(function(){
    console.log('Life is being proceed')
    console.log('the value is ,x*y')
})(20,30);                   //passing values

//understanding "return" keyword
function div(a,b){
    return a/b;

}
console.log('division is',div(5,10));