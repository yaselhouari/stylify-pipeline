package com.example.ec.repo;

import com.example.ec.domain.MyService;
import com.example.ec.domain.MyServicePackage;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface MyServiceRepository extends CrudRepository<MyService, Integer> {
    Iterable<MyService> findByMyServicePackage(Optional<MyServicePackage> myServicePackage);
}
