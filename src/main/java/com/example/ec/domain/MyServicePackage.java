package com.example.ec.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class MyServicePackage {
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

    public MyServicePackage() {
    }

    public MyServicePackage(Integer id, String name, String description, String gender, String icon) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.gender = gender;
        this.icon = icon;
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
        return "MyServicePackage{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", gender='" + gender + '\'' +
                ", icon='" + icon + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyServicePackage that = (MyServicePackage) o;
        return id.equals(that.id) &&
                name.equals(that.name) &&
                description.equals(that.description) &&
                gender.equals(that.gender) &&
                icon.equals(that.icon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, gender, icon);
    }
}
