package com.example.ec.repo;

import com.example.ec.domain.MyClient;
import org.springframework.data.repository.CrudRepository;

public interface MyClientRepository extends CrudRepository<MyClient, Integer> {
}
