package com.example.ec.apis;

import com.example.ec.domain.MyDisplayService;
import com.example.ec.domain.MyService;
import com.example.ec.service.MyDisplayServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/services")
public class MyDisplayServiceController {
    @Autowired
    MyDisplayServiceService myService;

    @GetMapping
    public Iterable<MyDisplayService> getAllServices() {
        return myService.lookup();
    }

    /*@GetMapping("/packageId/{packageId}")
    public Iterable<MyService> getServicesByPackageId(@PathVariable Integer packageId) {
        return myService.getServicesByPackageId(packageId);
    }*/
}
