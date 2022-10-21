package com.diandiocann.demo;

import org.springframework.stereotype.Component;

@Component
public class SadFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "You are sad today";
    }
}
