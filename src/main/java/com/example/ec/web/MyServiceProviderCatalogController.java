package com.example.ec.web;

import com.example.ec.domain.MyServiceProviderCatalog;
import com.example.ec.service.MyServiceProviderCatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyServiceProviderCatalogController {
    @Autowired
    MyServiceProviderCatalogService myCatalogService;

    @GetMapping("catalogs")
    public Iterable<MyServiceProviderCatalog> getAll() {
        return myCatalogService.lookup();
    }

}
