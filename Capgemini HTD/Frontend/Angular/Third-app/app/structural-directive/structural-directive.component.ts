import { Component, OnInit } from '@angular/core';
import { Student } from '../student';

@Component({
  selector: 'app-structural-directive',
  templateUrl: './structural-directive.component.html',
  styleUrls: ['./structural-directive.component.css']
})
export class StructuralDirectiveComponent implements OnInit {
  flag = false;
  person: 'Mayuri';
  students: Student[] = [
    {
id: 1,
name: 'Mayuri',
age: 23,
degree: 'BE'

 },
 {
  id: 2,
  name: 'Sakshi',
  age: 18,
  degree: 'Bsc'
  
   },
   {
    id: 3,
    name: 'Pranjali',
    age: 25,
    degree: 'BE'
    
     },
     {
      id: 4,
      name: 'Chetana',
      age: 23,
      degree: 'BE'
      
       },
       {
        id: 5,
        name: 'Rakshita',
        age: 23,
        degree: 'BE'
        
         }
  ]

  constructor() {
    setTimeout(() => {
      this.flag = true;
    }, 2000);
   }

   deleteStudent(student: Student){
const index = this.students.indexOf(student);
this.students.splice(index, 1);
   }

  ngOnInit() {
  }

}
