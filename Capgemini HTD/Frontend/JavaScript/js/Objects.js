
//Literal way of object creaction
var student = {
    name : 'Mayuri wagh',
    age : 23,
    degree : 'BE',
    mobileNumber : 7710859052,
};

console.log(student.name);
console.log(student.age);
console.log(student.degree);
console.log(student.mobileNumber);

//add info to the object
student.selectedCompany  = 'capgemini';
console.log(student.selectedCompany);

//using object constructor
var laptop = new Object();
laptop.brand = 'hp';
laptop.ram = '4GB';
laptop.price = 36000;

console.log(laptop);       //to display o/p

console.log(Object.keys(laptop));      //shows only keys

console.log(Object.keys(laptop).length);      //shows length-