package com.studytrails.tutorials.springremotinghttpinvokerserver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;

/**
 * Created by Nikita on 15.03.2016.
 */
@Configuration
public class RemoteConfig {
    @Bean
    GreetingService greetingService() {
        return new GreetingServiceImpl();
    }

    @Bean(name = "/greetingService.http")
    HttpInvokerServiceExporter greetingExporter() {
        HttpInvokerServiceExporter httpInvokerServiceExporter = new HttpInvokerServiceExporter();
        httpInvokerServiceExporter.setService(greetingService());
        httpInvokerServiceExporter.setServiceInterface(GreetingService.class);
        return httpInvokerServiceExporter;
    }
}
