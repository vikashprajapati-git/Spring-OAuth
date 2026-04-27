package com.spring.oauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcomeMessage() {
        return "Welcome to Spring OAuth";
    }

    @GetMapping("/home")
    public String homePage(){
        return "Welcome to Spring OAuth Home page";
    }

}
