package com.example.ec.apis;

import com.example.ec.entities.MyClient;
import com.example.ec.service.MyClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clients")
public class MyClientController {
    @Autowired
    MyClientService myService;

    @GetMapping
    public Iterable<MyClient> getAllClients() {
        return myService.lookup();
    }
}
