package com.xworkz.clothes.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@ComponentScan("com.xworkz.clothes")
@Configuration
public class SpringConfigClass {
    public SpringConfigClass() {
        System.out.println("SpringConfigClass instance created");
    }
}
