package com.example.myproject.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.myproject.common.Coach;

@RestController
public class DemoController {
    
    private Coach myCoach;
    
    /*      Constructor Injection 
    @Autowired
    public DemoController(Coach myCoach) {
        this.myCoach = myCoach;
    }
    */
    /*  Setter Injection
    @Autowired
    public void setCoach(Coach theCoach){
        myCoach = theCoach;
    }
    */
    // Qualifier req. when multiple interface are there like
    // BaseballCoach , TennisCoach etc
    // in this we use qualifier in constructor and setter both injection
    @Autowired
    public DemoController(@Qualifier("tennisCoach") Coach theCoach){
        myCoach = theCoach;
    }

    // we use Qualifier in setter just put "@Qualifier("tennisCoach")"
    // before <- Coach theCoach like DemoController Constructor

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
