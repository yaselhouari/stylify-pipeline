package com.example.ec.web;

import com.example.ec.domain.MyService;
import com.example.ec.service.MyServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/services")
public class MyServiceController {
    @Autowired
    MyServiceService myService;

    @GetMapping("/services")
    public Iterable<MyService> getAllServices() {
        return myService.lookup();
    }

    @RequestMapping(value = "/byPackage/{packageId}", method = RequestMethod.GET)
    public Iterable<MyService> getServicesByPackageId(@PathVariable(value="packageId") Integer packageId) {
        return myService.getServicesByPackageId(packageId);
    }
}
