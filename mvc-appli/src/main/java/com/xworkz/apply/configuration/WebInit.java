package com.xworkz.apply.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("running getRootConfigClasses ");
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("running getServletConfigClasses ");
        return new Class[]{SpringConfigClass.class};
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("running getServletMappings ");
        return new String[]{"/"};
    }
}
