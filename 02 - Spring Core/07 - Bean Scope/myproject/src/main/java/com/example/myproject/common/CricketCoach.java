package com.example.myproject.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
// SCOPE_PROTOTYPE craeate diff bean
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        // TODO Auto-generated method stub
        return "Practice fast bowlong for 15 min";
    }
    
}
