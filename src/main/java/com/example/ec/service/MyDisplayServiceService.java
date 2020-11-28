package com.example.ec.service;

import com.example.ec.domain.MyDisplayService;
import com.example.ec.domain.MyService;
import com.example.ec.repo.MyDisplayServicePackageRepository;
import com.example.ec.repo.MyDisplayServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyDisplayServiceService {
    @Autowired
    MyDisplayServiceRepository serviceRepository;
    @Autowired
    MyDisplayServicePackageRepository servicePackageRepository;

    public Iterable<MyDisplayService> lookup() {
        return serviceRepository.findAll();
    }

    /*public Iterable<MyService> getServicesByPackageId(Integer packageId) {
        Optional<MyServicePackage> myServicePackage= servicePackageRepository.findById(packageId);
        return serviceRepository.findByMyServicePackage(myServicePackage);
    }*/

    public MyDisplayService create(MyDisplayService myService) {
        return serviceRepository.save(myService);
    }
}
