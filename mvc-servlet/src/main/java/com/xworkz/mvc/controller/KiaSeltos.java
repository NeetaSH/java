package com.xworkz.mvc.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Component


public class KiaSeltos {
    public KiaSeltos() {
        System.out.println("kia seltose instance created");
    }
    @RequestMapping("readSeltos")
    public String readSeltos(){
        System.out.println("read seltos method running");
        return "Response.jsp";
    }
    @RequestMapping("deleteSeltos")
    public String deleteSeltos(){
        System.out.println("delete seltos method running");
        return "Response.jsp";
    }
}
