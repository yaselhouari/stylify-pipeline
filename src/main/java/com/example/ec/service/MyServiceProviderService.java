package com.example.ec.service;

import com.example.ec.domain.MyClient;
import com.example.ec.domain.MyServiceProvider;
import com.example.ec.repo.MyServiceProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyServiceProviderService {
    @Autowired
    MyServiceProviderRepository myServiceProviderRepository;

    public MyServiceProviderService(MyServiceProviderRepository myServiceProviderRepository) {
        this.myServiceProviderRepository = myServiceProviderRepository;
    }

    public long total() {
        return myServiceProviderRepository.count();
    }

    public Iterable<MyServiceProvider> lookup() {
        return myServiceProviderRepository.findAll();
    }
}
