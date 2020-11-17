package com.example.ec.repo;

import com.example.ec.domain.ServicePackage;
import com.example.ec.domain.TourPackage;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ServicePackageRepository extends CrudRepository<ServicePackage, Integer> {
    //Optional<TourPackage> findByName(String name);
}
