import { Component, OnInit } from '@angular/core';
import { Bike } from '../bike';

@Component({
  selector: 'app-bikes',
  templateUrl: './bikes.component.html',
  styleUrls: ['./bikes.component.css']
})
export class BikesComponent implements OnInit {
bikes: Bike[] = [
  {
    brand: 'Royal Ebfield',
    imgURL: 'https://cdn.pixabay.com/photo/2019/05/24/16/38/bullet-ride-4226666__340.jpg',
    model: 'classic 350',
    price:  160000,
    specs: 'Very good bike'
  },

  {
    brand: 'TVS',
    imgURL: 'https://cdn.pixabay.com/photo/2017/12/29/05/58/sport-3046819__340.jpg',
    model: 'R15',
    price:  260000,
    specs: ' good bike'
  },
  {
    brand: 'DUKE',
    imgURL: 'https://cdn.pixabay.com/photo/2019/04/19/10/29/motorcycle-4139052__340.jpg',
    model: 'duke 200',
    price:  26200,
    specs: ' great bike'
  }
  

];
selectedBike: Bike = this.bikes[0];

  constructor() { }
  selectBike(bike){
    this.selectedBike = bike;
  }

  ngOnInit() {
  }

}
