import { Component, OnInit } from '@angular/core';
import { Product } from '../product';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {

  products: Product[] = [
    {
      name: 'laptops',
      imageURL: 'https://cdn.pixabay.com/photo/2014/05/02/21/47/workstation-336369__340.jpg',
      price: 50000,
      details: 'very good'
    },
    {
      name: 'watch',
      imageURL: 'https://cdn.pixabay.com/photo/2017/02/03/22/38/pocket-watch-2036304__340.jpg',
      price: 3000,
      details: 'very good'
    },
    {
      name: 'car',
      imageURL: 'https://cdn.pixabay.com/photo/2012/05/29/00/43/car-49278__340.jpg',
      price: 400000,
      details: 'very good'
    },
    {
      name: 'mobiles',
      imageURL: 'https://cdn.pixabay.com/photo/2016/12/19/08/39/mobile-phone-1917737__340.jpg',
      price: 15690,
      details:  'good'
    }
  ]

  constructor() { }

  ngOnInit() {
  }

}
