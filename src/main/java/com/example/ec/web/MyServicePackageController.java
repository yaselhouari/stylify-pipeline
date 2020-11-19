package com.example.ec.web;

import com.example.ec.domain.MyService;
import com.example.ec.domain.MyServicePackage;
import com.example.ec.service.MyServicePackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/service_packages")
public class MyServicePackageController {
    @Autowired
    MyServicePackageService myServicePackageService;

    @GetMapping("/service_packages")
    public Iterable<MyServicePackage> getServicePackages() {
        return myServicePackageService.lookup();
    }

    @RequestMapping(value = "/service_packages/byGender/{gender}", method = RequestMethod.GET)
    public Iterable<MyService> getServicesByPackageId(@PathVariable(value="gender") String gender) {
        return myServicePackageService.getServicePackageByGender(gender);
    }
}
