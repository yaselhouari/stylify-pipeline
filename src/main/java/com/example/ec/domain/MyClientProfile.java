package com.example.ec.domain;

import javax.persistence.*;

@Entity
public class MyClientProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @OneToOne( fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "client_id", nullable = false)
    private MyClient myClient;
}
