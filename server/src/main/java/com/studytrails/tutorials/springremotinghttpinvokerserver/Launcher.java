package com.studytrails.tutorials.springremotinghttpinvokerserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Nikita on 15.03.2016.
 */
@SpringBootApplication
@ComponentScan(basePackages={
        "com.studytrails.tutorials.*"
})
public class Launcher {

    public static void main(String[] args) {
        SpringApplication.run(Launcher.class, args);
    }

}