package com.example.myproject.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        // TODO Auto-generated method stub
        return "Practice fast bowlong for 15 min";
    }
    
}
