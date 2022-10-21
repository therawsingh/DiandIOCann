package com.diandiocann.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BasketballCoach basketballCoach = context.getBean("basketballCoach", BasketballCoach.class);
        CricketCoach cricketCoach = context.getBean("cricketCoachCH", CricketCoach.class);
        Coach trackCoach = context.getBean("trackCoach", Coach.class);

        System.out.println(cricketCoach.getDailyFortune());
        System.out.println(cricketCoach.doWorkout());
        System.out.println(basketballCoach.doWorkout());
        System.out.println(basketballCoach.getDailyFortune());
        System.out.println(basketballCoach.getTeam());
        System.out.println(trackCoach.getDailyFortune());
        System.out.println(trackCoach.doWorkout());

        CricketCoach cricketCoach2 = context.getBean("cricketCoachCH", CricketCoach.class);

        System.out.println(cricketCoach == cricketCoach2);

        context.close();
        System.out.println("All beans have been destroyed");

    }

}
