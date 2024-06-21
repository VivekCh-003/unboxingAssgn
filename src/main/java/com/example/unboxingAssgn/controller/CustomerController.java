package com.example.unboxingAssgn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {
    @GetMapping("/customer")
    public String customer(){
        return "customer/customer";
    }

    @GetMapping("/customer/customerView")
    public String customerView(){
        return "customer/customerView";
    }

    @GetMapping("/customer/customerWrite")
    public String customerWrite(){
        return "customer/customerWrite";
    }
}
