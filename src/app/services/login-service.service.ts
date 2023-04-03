import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import baseUrl from './helper';

@Injectable({
  providedIn: 'root'
})
export class LoginServiceService {

  constructor(private http:HttpClient) { }

  //current user: which is logged
  public getCurrentUser(){

    return this.http.get(`${baseUrl}/current-user`)
  }

  //generate token

  public generateToken(LoginData:any){

    return this.http.post(`${baseUrl}/authenticate`,LoginData);
  }

  //login user: set token in local storage

  public loginUser(token:any){
    localStorage.setItem('token',token);
    return true;
   }

   ///isLogin: user is logged or not

   public isLoggedIn(){
    let tokenStr=localStorage.getItem('token');

    if(tokenStr==undefined || tokenStr=="" || tokenStr==null){

      return false;
    }else{
      return true;
    }
    
   }

   // logout: remove token from local storage
   public logout(){
    localStorage.removeItem('token');
    localStorage.removeItem('users')

    return true;
   }
   
   // get token
   public getToken(){
    return localStorage.getItem('token');
   }
   
   // set userdetails
   public setUser(users: any){
    localStorage.setItem('users',JSON.stringify(users));
   }

   //gtUsers
   public getUsers(){
    let userStr = localStorage.getItem("users");
    if(userStr != null){
      return JSON.parse(userStr);
    }else{
      this.logout();
      return null;
    }
   }

   //get user roles
   public getUserRoles(){
    let users = this.getUsers();
    return users.role[0].roleName;
   }
}
