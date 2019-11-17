import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Product } from './product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  api = 'https://suraj-29c9f.firebaseio.com/';
  products: Product[] = [];

  constructor(private http: HttpClient) { }

  postData(data) {
    return this.http.post(`${this.api}products.json`, data);
  }

  getData() {
    this.http.get(`${this.api}products.json`).subscribe(data => {
      console.log(data);
      const productArray = [];
      for (const key in data) {
        if (data.hasOwnProperty(key)) {
          productArray.push({...data[key], pk: key});
        }
      }
      this.products = productArray;
      console.log(this.products);
    });
  }
  deleteData(data) {
    return this.http.delete(`${this.api}products/${data.pk}.json`);
  }
  putData(data) {
    return this.http.put(`${this.api}products/${data.pk}.json`, data);
 }  }
