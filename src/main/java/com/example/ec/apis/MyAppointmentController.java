package com.example.ec.apis;

import com.example.ec.domain.MyAppointment;
import com.example.ec.service.MyAppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appointments")
public class MyAppointmentController {
    @Autowired
    MyAppointmentService myService;

    @GetMapping
    public Iterable<MyAppointment> getAll() {
        return myService.lookup();
    }
}
