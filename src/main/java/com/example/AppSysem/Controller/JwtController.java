package com.example.AppSysem.Controller;

import com.example.AppSysem.Entity.JwtRequest;
import com.example.AppSysem.Entity.JwtResponse;
import com.example.AppSysem.Entity.Users;
import com.example.AppSysem.Services.JwtService;
import com.example.AppSysem.Services.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController

@CrossOrigin("*")
public class JwtController {

    @Autowired
    private JwtService jwtService;
    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @PostMapping("/authenticate")
    public JwtResponse createJwtToken(@RequestBody JwtRequest jwtRequest)throws Exception{

      return jwtService.createJwtToken(jwtRequest);

    }

    @GetMapping("/current-user")
    public Users getCurrentUser(Principal principal){

        return  ((Users) this.userDetailsService.loadUserByUsername(principal.getName()));

    }


}
