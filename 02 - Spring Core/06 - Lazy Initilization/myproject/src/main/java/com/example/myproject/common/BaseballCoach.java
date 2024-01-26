package com.example.myproject.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{
    
    public BaseballCoach(){
        System.out.println("in constructor : "+ getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Spends 30 mins in batting practice";
    }
    
}
