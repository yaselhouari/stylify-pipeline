package com.example.ec.service;

import com.example.ec.domain.*;
import com.example.ec.repo.ServicePackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Tour  Service
 *
 * Created by Mary Ellen Bowman
 */
@Service
public class ServicePackageService {
    @Autowired
    private ServicePackageRepository servicePackageRepository;



    public ServicePackage createServicePackage(Integer id, String name, String description) {

        return servicePackageRepository.save(new ServicePackage(id, name, description));
    }

    public long total() {
        return servicePackageRepository.count();
    }
}

