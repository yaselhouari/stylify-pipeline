package com.example.ec.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class MyDisplayService implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    String title;


    @Column
    String description;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "my_display_service_package_id")
    MyDisplayServicePackage myDisplayServicePackage;

    public MyDisplayService() {
    }

    public MyDisplayServicePackage getMyDisplayServicePackage() {
        return myDisplayServicePackage;
    }

    public void setMyDisplayServicePackage(MyDisplayServicePackage myDisplayServicePackage) {
        this.myDisplayServicePackage = myDisplayServicePackage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "MyDisplayService{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", myDisplayServicePackage=" + myDisplayServicePackage +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDisplayService that = (MyDisplayService) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(title, that.title) &&
                Objects.equals(description, that.description) &&
                Objects.equals(myDisplayServicePackage, that.myDisplayServicePackage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, myDisplayServicePackage);
    }
}
