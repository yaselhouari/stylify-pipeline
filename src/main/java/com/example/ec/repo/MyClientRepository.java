package com.example.ec.repo;

import com.example.ec.entities.MyClient;
import org.springframework.data.repository.CrudRepository;

public interface MyClientRepository extends CrudRepository<MyClient, Integer> {
    MyClient findByUsername(String username);
}
