import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import { Product } from '../product';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-edit-product',
  templateUrl: './edit-product.component.html',
  styleUrls: ['./edit-product.component.css']
})
export class EditProductComponent implements OnInit {

  constructor(public productService: ProductService) {
    this.productService.getData();
   }

   selectedProduct: Product = {
     productName: null,
     productCat: null,
     price: null,
     imgURL: null,
     detail: null
   };

   deleteProduct(product: Product) {
     this.productService.deleteData(product).subscribe(res => {
       console.log(res);
       console.log('deleted one product');
       this.productService.getData();
     }, err => {
       console.log(err);
     });
   }

   selectproduct(product: Product) {
     this.selectedProduct = product;
   }
   addForm(form: NgForm) {
     this.productService.postData(form.value).subscribe(res => {
       console.log(res);
     }, err => {
       console.log(err);
    });
   }

  ngOnInit() {
  }

}
