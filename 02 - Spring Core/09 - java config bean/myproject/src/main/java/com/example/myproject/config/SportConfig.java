package com.example.myproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.myproject.common.Coach;
import com.example.myproject.common.SwimCoach;

@Configuration
public class SportConfig {
    @Bean("aquatic")
    // aqatic is custom bean id and by defaut will swimCoach in demoCont.
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
