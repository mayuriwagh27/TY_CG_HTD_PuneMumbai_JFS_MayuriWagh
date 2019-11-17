import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-binding',
  templateUrl: './binding.component.html',
  styleUrls: ['./binding.component.css']
})
export class BindingComponent implements OnInit {
  inputdata;
flag=true;
  name='Mayuri';
imgURL='https://cdn.pixabay.com/photo/2019/10/11/09/23/lake-4541454__340.jpg'

  constructor() {
    setInterval(()=>{
      this.flag=!this.flag;
    },1000)
   }

   eventOccured(myInput){
     console.log(myInput.value);
     console.log('key up event occured');
   }

  ngOnInit() {
  }

}
