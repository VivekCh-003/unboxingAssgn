package com.example.unboxingAssgn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PayrollController {

    @GetMapping("/payroll")
    public String payroll(){
        return "payroll/payroll";
    }

    @GetMapping("/payroll/payrollView")
    public String payrollView(){
        return "payroll/payrollView";
    }

    @GetMapping("/payroll/payrollWrite")
    public String payrollWrite(){
        return "payroll/payrollWrite";
    }
}
