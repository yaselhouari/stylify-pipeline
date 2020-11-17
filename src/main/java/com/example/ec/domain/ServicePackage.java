package com.example.ec.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ServicePackage {
    @Id
    @GeneratedValue
    private Integer id;

    @Column
    String name;

    @Column
    String description;

    public ServicePackage(Integer id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public ServicePackage() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
