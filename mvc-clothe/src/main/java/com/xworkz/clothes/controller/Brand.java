package com.xworkz.clothes.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/")
@Controller
public class Brand {
    public Brand() {
        System.out.println("puma instance created");
    }

@GetMapping("/new")
    public String newClothes(@RequestParam String brandName , @RequestParam String clothType , @RequestParam String price , Model model){
        System.out.println("new clothes method running ");
        model.addAttribute("brandName",brandName);
        model.addAttribute("clothType" ,clothType);
        model.addAttribute("price" ,price);
        return "Resp.jsp";
    }

}
