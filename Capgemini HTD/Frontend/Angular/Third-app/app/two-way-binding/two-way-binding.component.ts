import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-two-way-binding',
  templateUrl: './two-way-binding.component.html',
  styleUrls: ['./two-way-binding.component.css']
})
export class TwoWayBindingComponent implements OnInit {

  name: String = null;
  mobile: number = null;

  constructor() { }
  
  printForm(){
    console.log(this.name);
    console.log(this.mobile);
  }

  ngOnInit() {
  }

}
