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

    @Bean
    GoodbyeService goodbyeService() {
        return new GoodbyeServiceImpl();
    }

    @Bean(name = Constants.GREETING_EXPORTER_BEAN_NAME)
    HttpInvokerServiceExporter greetingExporter() {
        HttpInvokerServiceExporter httpInvokerServiceExporter = new HttpInvokerServiceExporter();
        httpInvokerServiceExporter.setService(greetingService());
        httpInvokerServiceExporter.setServiceInterface(GreetingService.class);
        return httpInvokerServiceExporter;
    }

    @Bean(name = Constants.GOODBYE_EXPORTER_BEAN_NAME)
    HttpInvokerServiceExporter goodbyeExporter() {
        HttpInvokerServiceExporter httpInvokerServiceExporter = new HttpInvokerServiceExporter();
        httpInvokerServiceExporter.setService(goodbyeService());
        httpInvokerServiceExporter.setServiceInterface(GoodbyeService.class);
        return httpInvokerServiceExporter;
    }
}
