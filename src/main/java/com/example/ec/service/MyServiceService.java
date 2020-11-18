package com.example.ec.service;

import com.example.ec.domain.MyService;
import com.example.ec.domain.MyServicePackage;
import com.example.ec.repo.MyServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyServiceService {
    @Autowired
    MyServiceRepository serviceRepository;

    public Iterable<MyService> lookup() {
        return serviceRepository.findAll();
    }
}
