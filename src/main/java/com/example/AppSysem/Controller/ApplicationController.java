package com.example.AppSysem.Controller;

import com.example.AppSysem.Entity.Application;
import com.example.AppSysem.Services.ApplicationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ApplicationController {

    public ApplicationService applicationService;

    @PostMapping("/createApplication")
    public Application createNewApplication(@RequestBody Application application){

        return applicationService.createNewApplication(application);
    }
    @GetMapping("/getAllApplication")
    public List<Application> getAllAplications(){

        return applicationService.getApplication();
    }

}
