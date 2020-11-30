package com.example.ec.service;

import com.example.ec.entities.MyDisplayService;
import com.example.ec.entities.MyDisplayServicePackage;
import com.example.ec.repo.MyDisplayServicePackageRepository;
import com.example.ec.repo.MyDisplayServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyDisplayServiceService {
    @Autowired
    MyDisplayServiceRepository serviceRepository;
    @Autowired
    MyDisplayServicePackageRepository servicePackageRepository;

    public Iterable<MyDisplayService> lookup() {
        return serviceRepository.findAll();
    }

    public Iterable<MyDisplayService> getDisplayServicesByPackageId(Integer packageId) {
        Optional<MyDisplayServicePackage> myServicePackage = servicePackageRepository.findById(packageId);
        return serviceRepository.findByMyDisplayServicePackage(myServicePackage);
    }

    public MyDisplayService create(MyDisplayService myService) {
        return serviceRepository.save(myService);
    }
}
