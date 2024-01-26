package com.example.myproject.common;

public class SwimCoach implements Coach {
    public SwimCoach(){
        System.out.println("In Constructor: "+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        // TODO Auto-generated method stub
        return "Swim 1000 meter as wam up";
    }
}
