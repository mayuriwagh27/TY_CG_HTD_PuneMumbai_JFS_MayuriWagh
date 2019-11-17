import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Subscription } from 'rxjs';
import { Employee } from './employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  employees: Employee[]=[];
  
api ='https://mayuri-6663e.firebaseio.com/';

  constructor(private http : HttpClient) { }

  postData(data){         // To post data into database
    return this.http.post(`${this.api}employees.json`, data);
  }
getData(){                  //To get data
  this.http.get(`${this.api}employees.json`).subscribe(data => {
    console.log(data);
    const employeeArray = [];
    for ( const key in data){
      if (data.hasOwnProperty(key)){
        employeeArray.push({...data[key], pk: key})
      }
    } 
    this.employees = employeeArray;
    console.log(this.employees);
  });
 
}
deletedata(data){
  return this.http.delete(`${this.api}employees/${data.pk}.json`)
}

putData(data){
  return this.http.put(`${this.api}employees/${data.pk}.json`,data);
}
}
