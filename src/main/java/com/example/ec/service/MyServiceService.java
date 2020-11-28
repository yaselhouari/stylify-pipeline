package com.example.ec.service;

import com.example.ec.entities.MyService;
import com.example.ec.repo.MyDisplayServicePackageRepository;
import com.example.ec.repo.MyServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyServiceService {
    @Autowired
    MyServiceRepository serviceRepository;
    @Autowired
    MyDisplayServicePackageRepository servicePackageRepository;

    public Iterable<MyService> lookup() {
        return serviceRepository.findAll();
    }

    /*public Iterable<MyService> getServicesByPackageId(Integer packageId) {
        Optional<MyServicePackage> myServicePackage= servicePackageRepository.findById(packageId);
        return serviceRepository.findByMyServicePackage(myServicePackage);
    }*/

    public MyService create(MyService myService) {
        return serviceRepository.save(myService);
    }
}
