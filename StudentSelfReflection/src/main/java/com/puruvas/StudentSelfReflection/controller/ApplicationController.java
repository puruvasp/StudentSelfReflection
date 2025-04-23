package com.puruvas.StudentSelfReflection.controller;



import com.puruvas.StudentSelfReflection.model.Application;
import com.puruvas.StudentSelfReflection.services.ApplicationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/application")
public class ApplicationController {

    @Autowired
    private ApplicationServices applicationServices;

    @GetMapping("/all")
    public List<Application> getAllUsers() {
    return applicationServices.getAllUsers();
    }

    @PostMapping("/create")

    public Application saveData(@RequestBody Application application)
    {

        Application savedApplication = applicationServices.createUser(application);
        return savedApplication;

    }
}
