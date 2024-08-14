package com.xworkz.mvc.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("get root config");
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("get servlet config class");
        Class[] spring = {SpringMvcConfig.class};
        return spring;
    }

    @Override
    protected String[] getServletMappings() {
        String[] web = {"/"};
        return web;
    }
}
