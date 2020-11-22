package com.example.ec.apis;

import com.example.ec.domain.MyServiceProviderCatalog;
import com.example.ec.service.MyServiceProviderCatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("catalogs")
public class MyServiceProviderCatalogController {
    @Autowired
    MyServiceProviderCatalogService myCatalogService;

    @GetMapping
    public Iterable<MyServiceProviderCatalog> getAll() {
        return myCatalogService.lookup();
    }

}
