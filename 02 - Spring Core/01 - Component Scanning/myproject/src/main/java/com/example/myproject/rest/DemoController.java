package com.example.myproject.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.util.Coach;

@RestController
public class DemoController {
    
    private Coach myCoach;
    @Autowired
    public DemoController(Coach myCoach) {
        this.myCoach = myCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}