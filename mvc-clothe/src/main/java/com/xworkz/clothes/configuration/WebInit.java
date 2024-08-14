package com.xworkz.clothes.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("running get Root Config Classes");
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("running get Servlet Config Classes ");
        return new Class[] {SpringConfigClass.class};
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("running get Servlet Mappings");
        return new String[]{"/"};
    }
}
