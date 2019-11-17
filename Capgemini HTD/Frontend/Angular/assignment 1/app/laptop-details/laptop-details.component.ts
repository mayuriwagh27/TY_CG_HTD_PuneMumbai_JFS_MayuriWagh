import { Component, OnInit, Input } from '@angular/core';
import { Laptop } from '../laptops';

@Component({
  selector: 'app-laptop-details',
  templateUrl: './laptop-details.component.html',
  styleUrls: ['./laptop-details.component.css']
})
export class LaptopDetailsComponent implements OnInit {
  @Input() laptop : Laptop;
  constructor() { }

  ngOnInit() {
  }

}
