package com.example.ec.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
public class MyDisplayServicePackage implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    String name;

    @Column
    String description;

    @Column
    String gender;

    @Column
    String icon;

    @JsonIgnore
    @OneToMany(
            mappedBy = "myDisplayServicePackage",
            orphanRemoval = true,
            fetch = FetchType.EAGER

    )
    private List<MyDisplayService> myServices = new ArrayList<>();

    public MyDisplayServicePackage() {
    }

    public MyDisplayServicePackage(Integer id, String name, String description, String gender, String icon) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.gender = gender;
        this.icon = icon;
    }

    public List<MyDisplayService> getMyServices() {
        return myServices;
    }

    public void setMyServices(List<MyDisplayService> myServices) {
        this.myServices = myServices;
    }

    public MyDisplayServicePackage(int id) {
        this.id = id;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "MyDisplayServicePackage{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", gender='" + gender + '\'' +
                ", icon='" + icon + '\'' +
                ", myServices=" + myServices +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDisplayServicePackage that = (MyDisplayServicePackage) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(description, that.description) &&
                Objects.equals(gender, that.gender) &&
                Objects.equals(icon, that.icon) &&
                Objects.equals(myServices, that.myServices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, gender, icon, myServices);
    }
}
