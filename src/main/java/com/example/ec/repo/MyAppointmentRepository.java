package com.example.ec.repo;

import com.example.ec.domain.MyAppointment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.CrudRepositoryExtensionsKt;

public interface MyAppointmentRepository extends CrudRepository<MyAppointment, Integer> {
}
