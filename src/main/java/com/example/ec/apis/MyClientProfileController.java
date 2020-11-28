package com.example.ec.apis;

import com.example.ec.entities.MyClientProfile;
import com.example.ec.service.MyClientProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("client_profiles")
public class MyClientProfileController {
    @Autowired
    MyClientProfileService myClientProfileService;

    @GetMapping
    public Iterable<MyClientProfile> getAll() {
        return myClientProfileService.lookup();
    }
}
