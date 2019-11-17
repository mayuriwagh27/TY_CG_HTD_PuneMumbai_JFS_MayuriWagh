import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BindingComponent } from './binding/binding.component';
import { HomeComponent } from './home/home.component';
import { HeaderComponent } from './header/header.component';
import { TwoWayBindingComponent } from './two-way-binding/two-way-binding.component';
 import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { StructuralDirectiveComponent } from './structural-directive/structural-directive.component';
import { ProductsComponent } from './products/products.component';
import { ColorDirective } from 'color.directive';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { BikesComponent } from './bikes/bikes.component';
import { BikeDetailsComponent } from './bike-details/bike-details.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';

@NgModule({
  declarations: [
    AppComponent,
    BindingComponent,
    HomeComponent,
    HeaderComponent,
    TwoWayBindingComponent,
    StructuralDirectiveComponent,
    ProductsComponent,
    ColorDirective,
    ParentComponent,
    ChildComponent,
    BikesComponent,
    BikeDetailsComponent,
    LoginComponent,
    RegisterComponent
  
    
  ],
  imports: [
    BrowserModule,
     FormsModule,
     AppRoutingModule,
     ReactiveFormsModule
   
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
