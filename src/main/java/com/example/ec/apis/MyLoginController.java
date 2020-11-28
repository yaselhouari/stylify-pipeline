package com.example.ec.apis;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class MyLoginController {
    @RequestMapping
    public String login() {
        return "login";
    }
}
