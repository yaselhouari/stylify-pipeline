package com.example.ec.service;

import com.example.ec.domain.AService;
import com.example.ec.domain.AServicePackage;
import com.example.ec.repo.AServicePackageRepository;
import com.example.ec.repo.AServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AServiceService {
    private AServiceRepository serviceRepository;
    private AServicePackageRepository servicePackageRepository;

    @Autowired
    public AServiceService(AServiceRepository serviceRepository, AServicePackageRepository servicePackageRepository) {
        this.serviceRepository = serviceRepository;
        this.servicePackageRepository = servicePackageRepository;
    }

    public AService createService(Integer id, String title, String gender, String description, double price, String duration) {
        return serviceRepository.save( new AService(id, title, gender, description, price, duration));
    }

    public long total() {
        return serviceRepository.count();
    }
}
