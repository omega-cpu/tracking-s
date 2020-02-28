package com.example.tracking;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@ComponentScan
public class HomeController {

    @GetMapping("/index")
    public String goHome(){

        return "index";
    }

    @GetMapping("/login")
    public String login(){

        return "login";
    }

    @GetMapping("/logout")
    public String logout(){

        return "login";
    }
    
}