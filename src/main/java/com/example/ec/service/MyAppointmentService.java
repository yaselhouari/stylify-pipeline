package com.example.ec.service;

import com.example.ec.domain.MyAppointment;
import com.example.ec.repo.MyAppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyAppointmentService {
    @Autowired
    MyAppointmentRepository myAppointmentRepository;

    public Iterable<MyAppointment> lookup() {
        return this.myAppointmentRepository.findAll();
    }
}
