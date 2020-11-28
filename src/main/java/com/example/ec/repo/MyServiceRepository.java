package com.example.ec.repo;

import com.example.ec.entities.MyService;
import org.springframework.data.repository.CrudRepository;

public interface MyServiceRepository extends CrudRepository<MyService, Integer> {
}
