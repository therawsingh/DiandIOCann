package com.diandiocann.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach{

    @Autowired
    @Qualifier("sadFortuneService")
    private FortuneService fortuneService;

    @Value("${team}")
    private String team;

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String doWorkout() {
        return "Do basketball work";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
