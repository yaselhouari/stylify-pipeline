package com.example.ec.repo;

import com.example.ec.entities.MyDisplayService;
import com.example.ec.entities.MyDisplayServicePackage;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface MyDisplayServiceRepository extends CrudRepository<MyDisplayService, Integer> {
    Iterable<MyDisplayService> findByMyDisplayServicePackage(Optional<MyDisplayServicePackage> myServicePackage);
}
