package com.xworkz.mvc.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/")
@Component
public class Venue {
    public Venue() {
        System.out.println("venue instance created");
    }
      @RequestMapping("send")
    public String onSave(){
        System.out.println("on save method");
        return "Response.jsp";
    }

    @RequestMapping("update")
    public String update(){
        System.out.println("update method");
        return "Response.jsp";
    }
}
