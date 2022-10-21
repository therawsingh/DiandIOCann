package com.diandiocann.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("cricketCoachCH")
@Scope("prototype")
public class CricketCoach implements Coach{

    private FortuneService fortuneService;

    @Autowired
    public CricketCoach(@Qualifier("happyFortuneService") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String doWorkout() {
        return "Do cricket work";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
