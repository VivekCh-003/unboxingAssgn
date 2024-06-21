////package com.example.unboxingAssgn.controller;
////
////import org.springframework.stereotype.Controller;
////import org.springframework.web.bind.annotation.GetMapping;
////
////@Controller
////public class loginController {
////
////    @GetMapping("/login")
////    public String login(){
////        return "login";
////    }
////
////    @GetMapping("/home")
////    public String home(){
////        return "home";
////    }
////
////    @GetMapping("/customer")
////    public String customer(){
////        return "customer/customer";
////    }
////
////    @GetMapping("/denied")
////    public String denied(){
////        return "denied";
////    }
////
////    @GetMapping("/payroll")
////    public String payroll(){
////        return "payroll/payroll";
////    }
////
////    @GetMapping("/billing")
////    public String billing(){
////        return "billing/billing";
////    }
////
////    @GetMapping("/user")
////    public String User(){
////        return "user/user";
////    }
////
////    @GetMapping("/billingView")
////    public String billingView(){
////        return "billing/billingView";
////    }
////
////    @GetMapping("/billingWrite")
////    public String billingWrite(){
////        return "billing/billingWrite";
////    }
////
////    @GetMapping("/customerView")
////    public String customerView(){
////        return "customer/customerView";
////    }
////
////    @GetMapping("/customerWrite")
////    public String customerWrite(){
////        return "customer/customerWrite";
////    }
////
////    @GetMapping("/payrollView")
////    public String payrollView(){
////        return "payroll/payrollView";
////    }
////
////    @GetMapping("/payrollWrite")
////    public String payrollWrite(){
////        return "payroll/payrollWrite";
////    }
////
////    @GetMapping("/userView")
////    public String userView(){
////        return "user/userView";
////    }
////
////    @GetMapping("/userWrite")
////    public String userWrite(){
////        return "user/userWrite";
////    }
////}
//
//
//package com.example.unboxingAssgn.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//
//@Controller
//public class loginController {
//
//    @GetMapping("/login")
//    public String login(){
//        return "login";
//    }
//
//    @GetMapping("/home")
//    public String home(){
//        return "home";
//    }
//
//    @GetMapping("/customer")
//    public String customer(){
//        return "customer/customer";
//    }
//
//    @GetMapping("/denied")
//    public String denied(){
//        return "denied";
//    }
//
//    @GetMapping("/payroll")
//    public String payroll(){
//        return "payroll/payroll";
//    }
//
//    @GetMapping("/billing")
//    public String billing(){
//        return "billing/billing";
//    }
//
//    @GetMapping("/user")
//    public String User(){
//        return "user/user";
//    }
//
//    @GetMapping("/billingView")
//    public String billingView(){
//        return "billing/billingView";
//    }
//
//    @GetMapping("/billingWrite")
//    public String billingWrite(){
//        return "billing/billingWrite";
//    }
//
//    @GetMapping("/customerView")
//    public String customerView(){
//        return "customer/customerView";
//    }
//
//    @GetMapping("/customerWrite")
//    public String customerWrite(){
//        return "customer/customerWrite";
//    }
//
//    @GetMapping("/payrollView")
//    public String payrollView(){
//        return "payroll/payrollView";
//    }
//
//    @GetMapping("/payrollWrite")
//    public String payrollWrite(){
//        return "payroll/payrollWrite";
//    }
//
//    @GetMapping("/userView")
//    public String userView(){
//        return "user/userView";
//    }
//
//    @GetMapping("/userWrite")
//    public String userWrite(){
//        return "user/userWrite";
//    }
//}


package com.example.unboxingAssgn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class loginController {

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/home")
    public String home(){
        return "home";
    }


    @GetMapping("/denied")
    public String denied(){
        return "denied";
    }
}
