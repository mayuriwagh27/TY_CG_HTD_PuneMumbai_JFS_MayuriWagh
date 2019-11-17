import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CarsComponent } from './cars/cars.component';
import { HomeComponent } from './home/home.component';
import { BikesComponent } from './bikes/bikes.component';
import { MoviesComponent } from './movies/movies.component';
import { MobilesComponent } from './mobiles/mobiles.component';
import { LaptopsComponent } from './laptops/laptops.component';


const routes: Routes = [
  {path: 'cars', component: CarsComponent},
  {path: '', component: HomeComponent},
  {path: 'bikes', component: BikesComponent},
  {path: 'movies', component: MoviesComponent},
  {path: 'mobiles', component: MobilesComponent},
  {path: 'laptops', component: LaptopsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
