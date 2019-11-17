import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  styleUrls: ['./add-employee.component.css']
})
export class AddEmployeeComponent implements OnInit {

  constructor(private employeeServive : EmployeeService) { }
submitForm(form: NgForm){
  console.log(form.value);
  this.employeeServive.postData(form.value).subscribe(responce => {
    console.log(responce);
    form.reset();
  }, err =>{
    console.log(err);
  });
  }

  ngOnInit() {
  }

}
