package com.example.ec.domain;

import javax.persistence.*;

@Entity
public class MyServiceProviderCatalog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @OneToOne
    MyServiceProvider provider;
}
