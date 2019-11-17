var student = /** @class */ (function () {
    function student(name, age, marks, degree) {
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.degree = degree;
    }
    return student;
}());
var student1 = new student('Mayuri', 23, 87, 'BE'); //object
console.log(student1);
//student1.printDetails();
var student2 = {
    name: 'Sneha',
    age: 23,
    marks: 63,
    degree: 'BE'
};
console.log(student2);
var students = [
    new student('sakshi', 23, 25),
    {
        name: 'Pranjali',
        age: 24,
        marks: 96,
        degree: 'BE'
    },
    student2,
    student1
];
for (var _i = 0, students_1 = students; _i < students_1.length; _i++) {
    var student_1 = students_1[_i];
    console.log(student_1);
}
