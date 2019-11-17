import { Component, OnInit, Input } from '@angular/core';
import { BikesComponent } from '../bikes/bikes.component';
import { Bike } from '../bikes';

@Component({
  selector: 'app-bike-details',
  templateUrl: './bike-details.component.html',
  styleUrls: ['./bike-details.component.css']
})
export class BikeDetailsComponent implements OnInit {
@Input() bike : Bike;
  constructor() { }

  ngOnInit() {
  }

}
