package com.example.ec.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class MyService implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    String title;


    @Column
    String description;

    @Column
    String price;

    @Column
    String duration;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "package_id", nullable = true)
    private MyServicePackage myServicePackage;

    public MyService() {

    }

    public MyService(Integer id, String title, String description, String price, String duration, MyServicePackage myServicePackage) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.duration = duration;
        this.myServicePackage = myServicePackage;
    }

    public MyService(String title, String description, String price, String duration) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.duration = duration;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public MyServicePackage getMyServicePackage() {
        return myServicePackage;
    }

    public void setMyServicePackage(MyServicePackage myServicePackage) {
        this.myServicePackage = myServicePackage;
    }

    @Override
    public String toString() {
        return "MyService{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price='" + price + '\'' +
                ", duration='" + duration + '\'' +
                ", myServicePackage=" + myServicePackage +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyService myService = (MyService) o;
        return id.equals(myService.id) &&
                title.equals(myService.title) &&
                description.equals(myService.description) &&
                price.equals(myService.price) &&
                duration.equals(myService.duration) &&
                myServicePackage.equals(myService.myServicePackage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, price, duration, myServicePackage);
    }
}
