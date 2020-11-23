package com.example.ec.repo;

import com.example.ec.domain.MyAppointment;
import org.springframework.data.repository.CrudRepository;

public interface MyAppointmentRepository extends CrudRepository<MyAppointment, Integer> {
}
