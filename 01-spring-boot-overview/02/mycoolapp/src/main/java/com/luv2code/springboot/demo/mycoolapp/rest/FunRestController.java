package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String hello(){
        return "Hello World";
    }

    // make new endpoint "workout" for checking devtools
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run after adding dependacy devtools in pom.xml file";
    }
}
