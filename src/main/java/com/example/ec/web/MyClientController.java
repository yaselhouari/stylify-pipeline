package com.example.ec.web;

import com.example.ec.domain.MyClient;
import com.example.ec.domain.MyService;
import com.example.ec.service.MyClientService;
import com.example.ec.service.MyServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClientController {
    @Autowired
    MyClientService myService;

    @GetMapping("/clients")
    public Iterable<MyClient> getAllServices() {
        return myService.lookup();
    }
}