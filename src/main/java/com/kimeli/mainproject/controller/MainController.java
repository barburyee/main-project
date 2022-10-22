package com.kimeli.mainproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/register")
    public String showRegistrationForm(){
        return "register_form";
    }
}
