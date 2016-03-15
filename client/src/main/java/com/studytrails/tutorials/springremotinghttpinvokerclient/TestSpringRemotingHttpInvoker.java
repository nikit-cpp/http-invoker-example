package com.studytrails.tutorials.springremotinghttpinvokerclient;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.studytrails.tutorials.springremotinghttpinvokerserver.GreetingService;

public class TestSpringRemotingHttpInvoker {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-client.xml");
        GreetingService greetingService = context.getBean(GreetingService.class);
        String greetingMessage = greetingService.getGreeting("Alpha");
        System.out.println("The greeting message is : " + greetingMessage);
    }
}