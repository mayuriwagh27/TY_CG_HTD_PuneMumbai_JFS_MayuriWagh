import { Component, OnInit } from '@angular/core';
import { Car } from '../cars';

@Component({
  selector: 'app-cars',
  templateUrl: './cars.component.html',
  styleUrls: ['./cars.component.css']
})
export class CarsComponent implements OnInit {

  cars: Car[] = [
    {
      brand: 'Lamborgini',
      imgURL: 'https://cdn.pixabay.com/photo/2019/07/16/03/07/black-4340959__340.jpg',
      model: 'classic 350',
      price:  150000,
      specs: `The Lamborghini Swift has 1 Lamborghini Engine and 1 Lamborghini Engine on offer. The Diesel
       engine is 5000 cc while the Petrol engine is 5000 cc. Depending upon the variant and fuel type the
        Swift has a mileage of 3.0 to 5.0 kmpl. The Swift is a 5 seater Hatchback and has a length of 5000.`
    },
  
    {
      brand: 'Maruthi',
      imgURL: 'https://cdn.pixabay.com/photo/2016/02/13/13/11/cuba-1197800__340.jpg',
      model: '1645',
      price:  260000,
      specs: `The Maruti Swift has 1 Diesel Engine and 1 Petrol Engine on offer. The Diesel engine is 1248
       cc while the Petrol engine is 1197 cc. Depending upon the variant and fuel type the Swift has a 
       mileage of 22.0 to 28.4 kmpl. The Swift is a 5 seater Hatchback and has a length of 3840mm.`
    },
    {
      brand: 'Suzuki',
      imgURL: 'https://cdn.pixabay.com/photo/2015/05/28/23/12/auto-788747__340.jpg',
      model: '1885',
      price:  65200,
      specs: `The Suzuki has 1 kerosine Engine and 1 Diesel Engine on offer. The Diesel engine is 1248 cc
       while the kersine engine is 466 cc. Depending upon the variant and fuel type the Swift has a 
       mileage of 22.0 to 28.4 kmpl. The Suzuki is a 5 seater Hatchback and has a length of 3840mm.`
    }
    

  ];
  selectedCar : Car = this.cars[0];

  constructor() {}
  selectCar(Car){
    this.selectedCar = Car;
   }

  ngOnInit() {
  }

}
