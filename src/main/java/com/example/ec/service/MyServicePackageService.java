package com.example.ec.service;

import com.example.ec.domain.*;
import com.example.ec.repo.MyServicePackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Tour  Service
 *
 * Created by Mary Ellen Bowman
 */
@Service
public class MyServicePackageService {
    @Autowired
    private MyServicePackageRepository myServicePackageRepository;

    public Iterable<MyServicePackage> lookup() {
        return myServicePackageRepository.findAll();
    }

    public Iterable<MyServicePackage> getServicePackageByGender(String gender) {
        return myServicePackageRepository.findByGender(gender);
    }

    public MyServicePackage createServicePackage(MyServicePackage myServicePackage) {
        return myServicePackageRepository.save(myServicePackage);
    }

    public void deleteServicePackage(MyServicePackage service) {
        myServicePackageRepository.delete(service);
    }

    public MyServicePackage editServicePackage(MyServicePackage myServicePackage) {
        return myServicePackageRepository.save(myServicePackage);
    }
}

