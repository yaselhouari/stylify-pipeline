package com.example.ec.apis;

import com.example.ec.domain.MyClient;
import com.example.ec.service.MyClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClientController {
    @Autowired
    MyClientService myService;

    public Iterable<MyClient> getAllServices() {
        return myService.lookup();
    }
}
