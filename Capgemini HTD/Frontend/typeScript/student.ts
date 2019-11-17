class Student {
    constructor(
   public name: String,
   public age: number,
   public marks: number,
   public degree ?: string){      //optional

    }
// printDetails(){      //method
//     console.log(`Name is ${this.name} age is ${this.age} Marks are ${this.marks} and degree is ${this.degree}`);
// }
}

let student1 = new student('Mayuri', 23, 87 ,'BE');         //object

console.log(student1);
//student1.printDetails();

let student2: student = {
    name: 'Sneha',
    age: 23,                     //2nd way to create object
    marks: 63,
    degree: 'BE'
}

console.log(student2);

let students: student[] = [
    new student('sakshi', 23, 25),             //array
    {
        name: 'Pranjali',
        age: 24,
        marks: 96,
        degree: 'BE'
    },

    student2,
    student1
];


for (let student of students){
    console.log(student);
}


class Graduate extends Student{

}















