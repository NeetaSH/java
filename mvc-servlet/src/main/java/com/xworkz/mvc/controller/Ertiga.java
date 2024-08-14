package com.xworkz.mvc.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Component
public class Ertiga {

    public Ertiga() {
        System.out.println("ertiga instance created");
    }
@RequestMapping("read")
    public String read(){
        System.out.println("read method running");
        return "Response.jsp";
    }
    @RequestMapping("delete")
    public String delete(){
        System.out.println("delete method rinnung");
        return "Response.jsp";
    }
}
