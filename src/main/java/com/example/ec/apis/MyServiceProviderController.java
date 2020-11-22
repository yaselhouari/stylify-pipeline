package com.example.ec.apis;

import com.example.ec.domain.MyServiceProvider;
import com.example.ec.service.MyServiceProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service_providers")
public class MyServiceProviderController {
    @Autowired
    MyServiceProviderService myService;

    @GetMapping
    public Iterable<MyServiceProvider> getAllServices() {
        return myService.lookup();
    }
}
