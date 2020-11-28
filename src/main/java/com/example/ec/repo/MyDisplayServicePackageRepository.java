package com.example.ec.repo;

import com.example.ec.domain.MyDisplayServicePackage;
import org.springframework.data.repository.CrudRepository;

public interface MyDisplayServicePackageRepository extends CrudRepository<MyDisplayServicePackage, Integer> {
    Iterable<MyDisplayServicePackage> findByGender(String gender);
}
