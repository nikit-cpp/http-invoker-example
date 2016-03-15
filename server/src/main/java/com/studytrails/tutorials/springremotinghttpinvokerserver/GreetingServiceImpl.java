package com.studytrails.tutorials.springremotinghttpinvokerserver;

public class GreetingServiceImpl implements GreetingService{

    @Override
    public String getGreeting(String name) {
        return "Hello " + name + "!";
    }

}