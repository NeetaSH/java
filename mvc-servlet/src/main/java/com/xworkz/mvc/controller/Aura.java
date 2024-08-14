package com.xworkz.mvc.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Component
public class Aura {
    public Aura() {
        System.out.println("aura instance created");
    }
    @RequestMapping("validate")
    public String validate(){
        System.out.println("validate method running");
        return "Response.jsp";
    }
    @RequestMapping("validateAndSave")
    public String validateAndSave(){
        System.out.println("validate and save method");
        return "Response.jsp";
    }

}
