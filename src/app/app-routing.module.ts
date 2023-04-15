import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { LoginComponent } from './pages/login/login.component';
import { SignupComponent } from './pages/signup/signup.component';
import { UserDetailsComponent } from './pages/user-details/user-details.component';
import { UserDashboardComponent } from './user-dashboard/user-dashboard.component';
import { AdmindashboardComponent } from './dashboard/admindashboard/admindashboard.component';
import { StaffdashboardComponent } from './dashboard/staffdashboard/staffdashboard.component';
import { SponsordashboardComponent } from './dashboard/sponsordashboard/sponsordashboard.component';
import { UserHomeComponent } from './pages/user-home/user-home.component';
import { MasjidReqComponent } from './pages/user-forms/masjid-req/masjid-req.component';
import { MadrasaReqComponent } from './pages/user-forms/madrasa-req/madrasa-req.component';
import { AdminprofileComponent } from './dashboard/admindashboard/adminprofile/adminprofile.component';

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
      },
      {
        path:'userhome',
        component:UserHomeComponent
      },
      {
        path:'masjidreq',
        component:MasjidReqComponent
      },
      {
        path:'madrasareq',
        component:MadrasaReqComponent
      }
    ]

  },
  {
    path:'admindashh',
    component:AdmindashboardComponent,
    children:[
      {
        path:'',
        component:AdminprofileComponent
      }
    ]
  },
  {
    path:'stafdashboard',
    component:StaffdashboardComponent,
    children:[
      {
        path:'',
        component:UserDashboardComponent
      }
    ]
  },
  {
    path:'sponsordashh',
    component:SponsordashboardComponent,
    children:[
      {
        path:'',
        component:UserDashboardComponent
      }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
