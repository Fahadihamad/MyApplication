import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { LoginComponent } from './pages/login/login.component';
import { SignupComponent } from './pages/signup/signup.component';
import { UserDetailsComponent } from './pages/user-details/user-details.component';
import { UserDashboardComponent } from './user-dashboard/user-dashboard.component';

const routes: Routes = [
  {
    path:'',
    component:HomeComponent

  },
  {
    path:'sign',
    component:SignupComponent
    
  },
  {
      path:'login',
      component:LoginComponent
  },
  

  {
    path:'userdashh',
    component:UserDashboardComponent,
    children:[
      {
        path:'',
        component:UserDetailsComponent
      }
    ]

  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
