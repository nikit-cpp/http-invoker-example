package com.studytrails.tutorials.springremotinghttpinvokerserver;

import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.support.HttpRequestHandlerServlet;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * Created by Nikita on 15.03.2016.
 */
@Configuration
public class ServletConfig extends SpringBootServletInitializer {
    @Bean
    DispatcherServlet dispatcherServlet() {
        return new DispatcherServlet();
    }

    // httpinvoker servlet
    /*@Bean
    HttpRequestHandlerServlet httpRequestHandlerServlet() {
        return new HttpRequestHandlerServlet();
    }*/

    @Bean
    public ServletRegistrationBean greetingRegistration() {
        ServletRegistrationBean registration = new ServletRegistrationBean(new HttpRequestHandlerServlet(), "/springremotinghttpinvokerserver/greetingService.http");
        registration.setName(Constants.GREETING_EXPORTER_BEAN_NAME);
        registration.setLoadOnStartup(1);

        return registration;
    }

    @Bean
    public ServletRegistrationBean goodbyeRegistration() {
        ServletRegistrationBean registration = new ServletRegistrationBean(new HttpRequestHandlerServlet(), "/springremotinghttpinvokerserver/goodbyeService.http");
        registration.setName(Constants.GOODBYE_EXPORTER_BEAN_NAME);
        registration.setLoadOnStartup(1);

        return registration;
    }
}
