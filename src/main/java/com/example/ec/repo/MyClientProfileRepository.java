package com.example.ec.repo;

import com.example.ec.entities.MyClientProfile;
import org.springframework.data.repository.CrudRepository;

public interface MyClientProfileRepository extends CrudRepository<MyClientProfile, Integer> {
}
