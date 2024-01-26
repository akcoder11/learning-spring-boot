package com.example.myproject.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @GetMapping("/")
    public String funController(){
        return "This is my Spring Boot Project";
    }

    // Now I'll create Endpoints
    @GetMapping("/newendpoint")
    public String dummyEndPoint(){
        return "This is new end point created after adding dev tool in pom.xml file";
    }

    // injecting custome properties
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;
    @GetMapping("/defineprop")
    public String defineProp(){
        return "Coach Name="+coachName+" Team Name="+teamName;
    }

    //just another endpoint for checking automatically loading 
    @GetMapping("/newendpoint2")
    public String dummyEndPoint2(){
        return "Lets see will it automatically reload";//it works devtool is awesom thanks
    }
    // trying properties 
    // web properties changing in another port 8080 to 7070
    

}
