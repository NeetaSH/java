package com.xworkz.mvc.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Component
public class Kia {

    public Kia() {
        System.out.println("kia instance created");
    }
    @RequestMapping("saveKia")
    public String saveKia(){
        System.out.println("save kia running ");
        return "Response.jsp";
    }
    @RequestMapping("updateKia")
    public String updateKia(){
        System.out.println("update kia running");
        return "Response.jsp";
    }
}
