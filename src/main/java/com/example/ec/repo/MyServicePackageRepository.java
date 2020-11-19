package com.example.ec.repo;

import com.example.ec.domain.MyService;
import com.example.ec.domain.MyServicePackage;
import org.springframework.data.repository.CrudRepository;

public interface MyServicePackageRepository extends CrudRepository<MyServicePackage, Integer> {
    Iterable<MyServicePackage> findByGender(String gender);
}
