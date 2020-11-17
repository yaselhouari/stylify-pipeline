package com.example.ec.service;

import com.example.ec.domain.AService;
import com.example.ec.domain.AServicePackage;
import com.example.ec.repo.AServicePackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AServicePackageService {
    private AServicePackageRepository servicePackageRepository;

    @Autowired
    public AServicePackageService(AServicePackageRepository servicePackageRepository) {
        this.servicePackageRepository = servicePackageRepository;
    }

    public AServicePackage createServicePackage(Integer id, String name, String description) {
        return servicePackageRepository.findById(id)
                .orElse(servicePackageRepository.save(new AServicePackage(id, name, description)));
    }

    public Iterable<AServicePackage> lookup() {
        return servicePackageRepository.findAll();
    }

    public long total() {
        return servicePackageRepository.count();
    }
}
