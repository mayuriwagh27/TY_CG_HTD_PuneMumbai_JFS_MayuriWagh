import { Component, OnInit } from '@angular/core';
import { Laptop } from '../laptops';

@Component({
  selector: 'app-laptops',
  templateUrl: './laptops.component.html',
  styleUrls: ['./laptops.component.css']
})
export class LaptopsComponent implements OnInit {
  laptops: Laptop[] = [
    {
      brand: 'Asus',
      imgURL: 'https://cdn.pixabay.com/photo/2014/09/27/13/44/notebook-463485__340.jpg',
      price:  32000,
      specs: `ASUS Laptop X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating 
      System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM
       socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel 
       with 45% NTSC. Graphic Storage.`
    },
  
    {
      brand: 'hp',
      imgURL: 'https://cdn.pixabay.com/photo/2015/07/26/17/29/mixer-861431__340.jpg',
     
      price:  34000,
      specs: `ASUS Laptop X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating 
      System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM
       socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel 
       with 45% NTSC. Graphic Storage.`
    },
    {
      brand: 'Dell',
      imgURL: 'https://cdn.pixabay.com/photo/2017/08/10/07/32/dell-2619501__340.jpg',
      
      price:  26200,
      specs: `ASUS Laptop X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating 
      System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM 
      socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel
       with 45% NTSC. Graphic Storage.`
    }
    
  
  ];
  selectedLaptop: Laptop = this.laptops[0];
 
  constructor() { }
  selectLaptop(laptop){
    this.selectedLaptop = laptop;
  }
  ngOnInit() {
  }

}
