//--------Marvin Dickson Mendia Calizaya-------
package com.example.SpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnvironmentContoller
{
    @Autowired
    private Environment environment;
    @GetMapping("/environment")
    public String env(){
        return  "estoy en el ambiente: "+environment.getActiveProfiles()[0];
    }
}