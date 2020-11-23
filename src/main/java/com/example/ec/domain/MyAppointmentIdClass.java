package com.example.ec.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class MyAppointmentIdClass implements Serializable {
    private Integer client_id;
    private Integer provider_id;
}
