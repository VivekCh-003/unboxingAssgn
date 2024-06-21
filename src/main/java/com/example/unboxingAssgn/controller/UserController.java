package com.example.unboxingAssgn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/user")
    public String User(){
        return "user/user";
    }

    @GetMapping("/user/userView")
    public String userView(){
        return "user/userView";
    }

    @GetMapping("/user/userWrite")
    public String userWrite(){
        return "user/userWrite";
    }
}
