package com.example.ec.service;

import com.example.ec.domain.*;
import com.example.ec.repo.MyDisplayServicePackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Tour  Service
 *
 * Created by Mary Ellen Bowman
 */
@Service
public class MyDisplayServicePackageService {
    @Autowired
    private MyDisplayServicePackageRepository myDisplayServicePackageRepository;

    public Iterable<MyDisplayServicePackage> lookup() {
        return myDisplayServicePackageRepository.findAll();
    }

    public Iterable<MyDisplayServicePackage> getServicePackageByGender(String gender) {
        return myDisplayServicePackageRepository.findByGender(gender);
    }

    public MyDisplayServicePackage createServicePackage(MyDisplayServicePackage myDisplayServicePackage) {
        return myDisplayServicePackageRepository.save(myDisplayServicePackage);
    }

    public void deleteServicePackage(MyDisplayServicePackage service) {
        myDisplayServicePackageRepository.delete(service);
    }

    public MyDisplayServicePackage editServicePackage(MyDisplayServicePackage myDisplayServicePackage) {
        return myDisplayServicePackageRepository.save(myDisplayServicePackage);
    }
}

