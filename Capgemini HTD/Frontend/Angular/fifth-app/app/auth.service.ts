import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { LoginResponce } from './login-responce';
import { observable, Observable } from 'rxjs';
import { LoginComponent } from './login/login.component';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  isLoggedIn(): boolean{
    const user: LoginResponce = JSON.parse(localStorage.getItem('Token'));
    if( user && user.registered){
      return true;
    } else { 
      return false
    }
    
  }

  constructor(private http: HttpClient) { }

  register(data) {
    return this.http.post(
      'https://identitytoolkit.googleapis.com/v1/accounts:signUp?key=AIzaSyDTdSRJMWcFNqLhk1M4uGGiPGSBJisQQCc',
      { ...data, returnSecureToken: true }

    );
  }

  login(data: Observable<LoginComponent>){
    return this.http.post<LoginResponce>(
      'https://identitytoolkit.googleapis.com/v1/accounts:signInWithPassword?key=AIzaSyDTdSRJMWcFNqLhk1M4uGGiPGSBJisQQCc',
      {...data, returnSecureToken: true}
    );
  }
}
