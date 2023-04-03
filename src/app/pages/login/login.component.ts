import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { LoginServiceService } from 'src/app/services/login-service.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {


  LoginData={
    userName:"",
    password:""
  }

  constructor(private snack:MatSnackBar,private login:LoginServiceService){

  }

  ngOnInit(): void {
    
  }

  formSubmit(){

    console.log("login button clicked");

    if(this.LoginData.password.trim()=="" || this.LoginData.password==null){
      this.snack.open("Password is required !!",'',{
        duration:3000,
      });

      return;
    }
      this.login.generateToken(this.LoginData).subscribe(
        (data:any)=>{
          console.log("succesfull");
          console.log(data);

          //login

          this.login.loginUser(data.token);
          this.login.getCurrentUser().subscribe(
            (users:any)=>{
              this.login.setUser(users);
              console.log(users);
            }
          )
        },
        (error)=>{
          console.log("error");
          console.log(error);

        }
      )
    
      }

}
