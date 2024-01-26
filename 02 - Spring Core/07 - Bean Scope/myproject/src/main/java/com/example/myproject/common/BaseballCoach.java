package com.example.myproject.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Spends 30 mins in batting practice";
    }
    
}
