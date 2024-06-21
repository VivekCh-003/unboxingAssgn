package com.example.unboxingAssgn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BillingController {
    @GetMapping("/billing")
    public String billing(){
        return "billing/billing.html";
    }

    @GetMapping("/billing/billingView")
    public String billingView(){
        return "billing/billingView.html";
    }

    @GetMapping("/billing/billingWrite")
    public String billingWrite(){
        return "billing/billingWrite.html";
    }
}
