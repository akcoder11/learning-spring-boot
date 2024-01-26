package com.example.myproject;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        
        return "Practice fast bowlong for 15 min";
    }
    
}
