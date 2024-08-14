package com.xworkz.apply.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@ComponentScan("com.xworkz.apply")
@Configuration
public class SpringConfigClass {
    public SpringConfigClass() {
        System.out.println("instance created for SpringConfigClass");
    }
}
