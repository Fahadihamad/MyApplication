package com.example.AppSysem.Controller;

import com.example.AppSysem.Entity.Users;
import com.example.AppSysem.Services.JwtService;
import com.example.AppSysem.Services.UserServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.security.Principal;

@RestController()
@CrossOrigin("*")
public class UserController {
    @Autowired
    public UserServices userServices;
    @Autowired
    public JwtService jwtService;

    @PostConstruct
    public void initRolesAndUsers() {

        userServices.initRolesAndUser();
    }

    @PostMapping({"/createApplicant"})
    public Users createNewApplicant(@RequestBody Users applicant) {

        return userServices.createNewApplicant(applicant);

    }

    @PostMapping({"/createStaffs"})
    public Users createNewStaffs(@RequestBody Users staffs) {

        return userServices.createNewStaffs(staffs);
    }

    @PostMapping({"/createSponsors"})
    public Users createNewSponsors(@RequestBody Users sponsors) {

        return userServices.createNewSponsors(sponsors);
   }


//    @GetMapping("/username")
//    public Users getUser(@PathVariable("username") String username){
//
//        return this.userServices.getUser(username);
//    }
////
}