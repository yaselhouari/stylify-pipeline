package com.example.ec.service;

import com.example.ec.entities.MyClient;
import com.example.ec.repo.MyClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyClientService {
    @Autowired
    MyClientRepository clientRepository;

    public MyClientService(MyClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public long total() {
        return clientRepository.count();
    }

    public Iterable<MyClient> lookup() {
        return clientRepository.findAll();
    }
}
