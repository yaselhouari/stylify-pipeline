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



    public MyServicePackage createServicePackage(Integer id, String name, String description, String gender, String icon) {
        return myServicePackageRepository.save(new MyServicePackage(id, name, description, gender, icon));
    }

    public long total() {
        return myServicePackageRepository.count();
    }

    public Iterable<MyServicePackage> lookup() {
        return myServicePackageRepository.findAll();
    }

    public Iterable<MyServicePackage> getServicePackageByGender(String gender) {
        return myServicePackageRepository.findByGender(gender);
    }
}

