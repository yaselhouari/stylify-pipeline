package com.example.ec.web;

import com.example.ec.domain.MyClient;
import com.example.ec.domain.MyServiceProvider;
import com.example.ec.service.MyClientService;
import com.example.ec.service.MyServiceProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyServiceProviderController {
    @Autowired
    MyServiceProviderService myService;

    @GetMapping("/service_providers")
    public Iterable<MyServiceProvider> getAllServices() {
        return myService.lookup();
    }
}
