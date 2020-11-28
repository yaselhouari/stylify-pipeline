package com.example.ec.repo;

import com.example.ec.domain.MyDisplayService;
import com.example.ec.domain.MyService;
import org.springframework.data.repository.CrudRepository;

public interface MyDisplayServiceRepository extends CrudRepository<MyDisplayService, Integer> {

}
