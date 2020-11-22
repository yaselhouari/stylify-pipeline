package com.example.ec.service;

import com.example.ec.domain.MyServiceProviderProfile;
import com.example.ec.repo.MyServiceProviderProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyServiceProviderProfileService {
    @Autowired
    MyServiceProviderProfileRepository myServiceProviderProfile;

    public Iterable<MyServiceProviderProfile> lookup() {
        return myServiceProviderProfile.findAll();
    }
}
