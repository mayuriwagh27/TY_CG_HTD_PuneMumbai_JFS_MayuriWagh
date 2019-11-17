import { Component, OnInit, Input, Output } from '@angular/core';
import { EventEmitter } from 'events';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit {

  childData = 'This is data from child';

@Input() dataFromParent;

@Output() childEvent = new EventEmitter();

constructor() { }

  ngOnInit() {
    this.childEvent.emit(this.childData);
  }

}
