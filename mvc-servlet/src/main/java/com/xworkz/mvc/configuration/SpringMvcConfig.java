package com.xworkz.mvc.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@ComponentScan("com.xworkz.mvc")
@Component
public class SpringMvcConfig {
    public SpringMvcConfig() {
        System.out.println("car class");
    }
}
