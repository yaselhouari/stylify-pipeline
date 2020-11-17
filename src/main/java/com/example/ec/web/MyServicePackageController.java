package com.example.ec.web;

import com.example.ec.service.MyServicePackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyServicePackageController {
    @Autowired
    MyServicePackageService myServicePackageService;

    @GetMapping("/service_packages")
    public long getServicePackages() {
        return myServicePackageService.total();
    }
}
