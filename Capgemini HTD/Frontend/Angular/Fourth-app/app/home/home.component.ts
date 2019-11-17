import { Component, OnInit, OnDestroy } from '@angular/core';
import { Subscription, interval } from 'rxjs';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit, OnDestroy {

  mySubscription: Subscription;         //mysubscription is a variable contains a subscription function

  constructor() { 
    this.mySubscription = interval(1000).subscribe(data =>{
      console.log(data);
    });
  }

  ngOnInit() {
  }
  ngOnDestroy(){
    this.mySubscription.unsubscribe();
  }

}
