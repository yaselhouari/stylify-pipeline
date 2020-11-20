package com.example.ec.web;

import com.example.ec.domain.MyService;
import com.example.ec.domain.MyServicePackage;
import com.example.ec.service.MyServicePackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@RequestMapping("/service_packages")
public class MyServicePackageController {
    @Autowired
    MyServicePackageService myServicePackageService;

    @GetMapping
    public Iterable<MyServicePackage> getServicePackages() {
        return myServicePackageService.lookup();
    }

    @GetMapping("/gender/{gender}")
    public Iterable<MyServicePackage> getServicesByByGender(@PathVariable  String gender) throws UnknownHostException {
        return myServicePackageService.getServicePackageByGender(gender);
    }

}
