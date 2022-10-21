package com.diandiocann.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TrackCoach implements Coach{

    private FortuneService fortuneService;

    @Autowired
    public void setFortuneService(@Qualifier("sadFortuneService") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String doWorkout() {
        return "Track coach says do workout";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @PostConstruct
    public void postCons(){
        System.out.println("Track bean has been constructed");
    }

    @PreDestroy
    public void preDest(){
        System.out.println("Track bean is about to be destroyed");
    }

}
