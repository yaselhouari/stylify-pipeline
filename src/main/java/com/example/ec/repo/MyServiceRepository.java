package com.example.ec.repo;

import com.example.ec.domain.MyService;
import org.springframework.data.repository.CrudRepository;

public interface MyServiceRepository extends CrudRepository<MyService, Integer> {
    Iterable<MyService> findByPackageId(Integer id);
}
