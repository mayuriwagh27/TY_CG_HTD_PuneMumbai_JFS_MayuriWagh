import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { BindingComponent } from './binding/binding.component';
import { HomeComponent } from './home/home.component';
import { HeaderComponent } from './header/header.component';
import { TwoWayBindingComponent } from './two-way-binding/two-way-binding.component';
import { StructuralDirectiveComponent } from './structural-directive/structural-directive.component';
import { ProductsComponent } from './products/products.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { BikesComponent } from './bikes/bikes.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';


const routes: Routes = [
  {path: 'data-binding', component: BindingComponent },
  {path: '', component: HomeComponent},
  {path: 'header', component: HeaderComponent},
  {path: 'two-way-binding', component: TwoWayBindingComponent},
  {path: 'structural-directive', component: StructuralDirectiveComponent},
  {path: 'products', component: ProductsComponent},
  {path: 'parent', component: ParentComponent},
  {path: 'child', component: ChildComponent},
  {path: 'bikes', component: BikesComponent},
  {path: 'login', component: LoginComponent},
  {path: 'register', component: RegisterComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
