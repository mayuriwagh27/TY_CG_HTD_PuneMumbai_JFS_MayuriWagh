import { Component, OnInit, Input } from '@angular/core';
import { Mobile } from '../mobiles';

@Component({
  selector: 'app-mobile-details',
  templateUrl: './mobile-details.component.html',
  styleUrls: ['./mobile-details.component.css']
})
export class MobileDetailsComponent implements OnInit {
  @Input() mobile : Mobile;
  constructor() { }

  ngOnInit() {
  }

}
