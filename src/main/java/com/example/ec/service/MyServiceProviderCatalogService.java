package com.example.ec.service;

import com.example.ec.entities.MyServiceProviderCatalog;
import com.example.ec.repo.MyServiceProviderCatalogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyServiceProviderCatalogService {
    @Autowired
    MyServiceProviderCatalogRepository myCatalog;

    public Iterable<MyServiceProviderCatalog> lookup() {
        return myCatalog.findAll();
    }
}
