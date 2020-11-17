package com.example.ec.domain;

import javax.persistence.*;

@Entity
@Table(name="service_package")
public class AServicePackage {



    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    private Integer id;

    @Column
    private String name;

    @Column
    private String description;



    public AServicePackage() {

    }

    public AServicePackage(Integer id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
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
