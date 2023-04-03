import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-user-details',
  templateUrl: './user-details.component.html',
  styleUrls: ['./user-details.component.css']
})
export class UserDetailsComponent implements OnInit {

  user={
    userName:"fahad",
    password:"pola"
  }

  date= new Date()

  full_name:String="fahad hamad ramadhan"
   
  ngOnInit():void{

  }
}
