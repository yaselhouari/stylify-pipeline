package com.example.ec.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class MyService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    Integer packageId;

    @Column
    String title;

    @Column
    String description;

    @Column
    String gender;

    @Column
    String price;

    @Column
    String duration;

    public MyService() {
    }

    public MyService(Integer id, Integer packageId, String title, String description, String gender, String price, String duration) {
        this.id = id;
        this.packageId = packageId;
        this.title = title;
        this.description = description;
        this.gender = gender;
        this.price = price;
        this.duration = duration;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPackageId() {
        return packageId;
    }

    public void setPackageId(Integer packageId) {
        this.packageId = packageId;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    @Override
    public String toString() {
        return "MyService{" +
                "id=" + id +
                ", packageId=" + packageId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", gender='" + gender + '\'' +
                ", price='" + price + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyService myService = (MyService) o;
        return id.equals(myService.id) &&
                packageId.equals(myService.packageId) &&
                title.equals(myService.title) &&
                description.equals(myService.description) &&
                gender.equals(myService.gender) &&
                price.equals(myService.price) &&
                duration.equals(myService.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, packageId, title, description, gender, price, duration);
    }
}
