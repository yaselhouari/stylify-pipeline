package com.example.ec.apis;

import com.example.ec.domain.MyService;
import com.example.ec.service.MyServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/services")
public class MyServiceController {
    @Autowired
    MyServiceService myService;

    @GetMapping
    public Iterable<MyService> getAllServices() {
        return myService.lookup();
    }

    @GetMapping("/packageId/{packageId}")
    public Iterable<MyService> getServicesByPackageId(@PathVariable Integer packageId) {
        return myService.getServicesByPackageId(packageId);
    }
}
