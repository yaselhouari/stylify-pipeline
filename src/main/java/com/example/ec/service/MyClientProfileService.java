package com.example.ec.service;

import com.example.ec.entities.MyClientProfile;
import com.example.ec.repo.MyClientProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyClientProfileService {
    @Autowired
    MyClientProfileRepository myClientProfileRepository;

    public Iterable<MyClientProfile> lookup() {
        return myClientProfileRepository.findAll();
    }
}
