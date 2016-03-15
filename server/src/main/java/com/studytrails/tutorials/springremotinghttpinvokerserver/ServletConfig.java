package com.studytrails.tutorials.springremotinghttpinvokerserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.context.support.HttpRequestHandlerServlet;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * Created by Nikita on 15.03.2016.
 */
@Configuration
public class ServletConfig extends SpringBootServletInitializer implements ServletContextAware {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        super.onStartup(servletContext);
    }

    @Bean
    DispatcherServlet dispatcherServlet() {
        return new DispatcherServlet();
    }

    @Bean
    HttpRequestHandlerServlet httpRequestHandlerServlet() {
        return new HttpRequestHandlerServlet();
    }

    @Bean
    public ServletRegistrationBean httpInvokerServlet(HttpRequestHandlerServlet servlet) {
        ServletRegistrationBean registration = new ServletRegistrationBean(servlet, "*.http");
        registration.setName("/greetingService.http");
        registration.setLoadOnStartup(1);

        return registration;
    }


    @Override
    public void setServletContext(ServletContext servletContext) {
        // set filters
    }

}
