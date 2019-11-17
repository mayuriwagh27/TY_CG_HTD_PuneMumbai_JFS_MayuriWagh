let person ={
    name : 'Mayuri',
    age :23
};                        //for objects
let student ={
    ...person,
    UID : 1235,
    Marks : 50.52
};
console.log(student)

let mumbaiCR = ['wagh'];
let puneCR = ['tarte'];             //for array
let bangloreCR = ['shinde'];
let canadaCR = ['kajalekar'];

let CRS=[
    ...mumbaiCR,
    ...bangloreCR,
    ...canadaCR,
    ...puneCR,
    'Tiger',
];
console.log(CRS);

let[name1,name2,name3, ...restValues]=CRS;
console.log(name1);
console.log(name2);
console.log(name3);
console.log(restValues);
