import { BrowserModule } from '@angular/platform-browser';
import { NgModule, Component } from '@angular/core';
import {RouterModule} from '@angular/router'

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { ContactUsComponent } from './contact-us/contact-us.component';
import { AboutComponent } from './about/about.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { BikesComponent } from './bikes/bikes.component';
import { CarsComponent } from './cars/cars.component';
import { PlanesComponent } from './planes/planes.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    ContactUsComponent,
    AboutComponent,
    LoginComponent,
    RegisterComponent,
    PageNotFoundComponent,
    BikesComponent,
    CarsComponent,
    PlanesComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
     {path: '', component: HomeComponent},
     {path: 'about', component: AboutComponent, children: [
       {path: 'cars', component: CarsComponent},
       {path: 'bikes', component: BikesComponent},
       {path: 'planes', component: PlanesComponent}
     ]},
{path: 'contact-us', component: ContactUsComponent},
{path: 'register', component: RegisterComponent},
{path: 'login', component: LoginComponent},
{path: '**', component: PageNotFoundComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
