package com.example.ec.web;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/services")
public class ServiceController {
    @GetMapping("/services")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String getAll() {
        return "Hello, services";
    }
}
