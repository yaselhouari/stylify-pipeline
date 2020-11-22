package com.example.ec.apis;

import com.example.ec.domain.MyServiceProviderProfile;
import com.example.ec.service.MyServiceProviderProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service_provider_profiles")
public class MyServiceProviderProfileController {
    @Autowired
    MyServiceProviderProfileService myProviderProfileService;

    @GetMapping
    public Iterable<MyServiceProviderProfile> getAll() {
        return myProviderProfileService.lookup();
    }
}
