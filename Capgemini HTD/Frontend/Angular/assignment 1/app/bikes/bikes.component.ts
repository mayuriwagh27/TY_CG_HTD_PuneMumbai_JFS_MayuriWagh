import { Component, OnInit, Input } from '@angular/core';
import { Bike } from '../bikes';

@Component({
  selector: 'app-bikes',
  templateUrl: './bikes.component.html',
  styleUrls: ['./bikes.component.css']
})
export class BikesComponent implements OnInit {
  bikes: Bike[] = [
    {
      brand: 'Royal Enfield',
      imgURL: 'https://cdn.pixabay.com/photo/2019/05/24/16/38/bullet-ride-4226666__340.jpg',
      model: 'classic 350',
      price:  160000,
      specs: `The Ferrari 812 Superfast, replacement for the F12berlinetta, is one of the few exotic cars
       still equipped with a V12. The front-mounted 6.5L engine produces 800 horsepower and 530 lb. ft of
        torque and barely weighs 1600 kilos. Performance is mind-blowing (0-100 km/h in 2.9 seconds) and 
        the engine sound is exquisite.`
    },
  
    {
      brand: 'TVS',
      imgURL: 'https://cdn.pixabay.com/photo/2017/12/29/05/58/sport-3046819__340.jpg',
      model: 'R15',
      price:  260000,
      specs: `Specs overview. Engine. 2.5-liter five-cylinder. Horsepower. 394. Acceleration (0—60 mph) 
      3.9 seconds. Torque (lb-ft @ rpm) 354. Transmission. Seven-speed S tronic® dual-clutch automatic
       transmission and quattro® all-wheel drive. Top speed. 155 mph 7. Valvetrain. 20-valve DOHC with 
       Audi valvelift. Combined mpg.`
    },
    {
      brand: 'DUKE',
      imgURL: 'https://cdn.pixabay.com/photo/2019/04/19/10/29/motorcycle-4139052__340.jpg',
      model: 'duke 200',
      price:  26200,
      specs: `The Mercedes-Benz E-Class has 2 Diesel Engine and 2 Petrol Engine on offer. Depending upon 
      the variant and fuel type the E-Class has a mileage of 10.98 to 18.0 kmpl. The E-Class is a 5 seater
       Sedan and has a length of 4988mm, width of 1907mm and a wheelbase of 2939mm.`
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
