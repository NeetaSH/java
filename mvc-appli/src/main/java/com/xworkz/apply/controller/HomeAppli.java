package com.xworkz.apply.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/")
@Controller
public class HomeAppli {
    public HomeAppli() {
        System.out.println("instance created for home appli");
    }
@GetMapping("/appli")
    public String appliances(@RequestParam String brandName , @RequestParam String clothType , @RequestParam String price , Model model){
        System.out.println("appliances method running");
        model.addAttribute("brandName" , brandName);
        model.addAttribute("clothType" , clothType);
    System.out.println( model.addAttribute("price" , price));
        return "Resp.jsp";
    }
}
