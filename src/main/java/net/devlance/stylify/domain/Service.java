package net.devlance.stylify.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Time;

@Entity
public class Service {

    @Id
    @GeneratedValue
    Integer id;
    @Column
    String title;

    @Column
    String gender;

    @Column
    String description;

    @Column
    double price;

    @Column
    String duration;

    public Service(Integer id, String title, String gender, String description, double price, String duration) {
        this.id = id;
        this.title = title;
        this.gender = gender;
        this.description = description;
        this.price = price;
        this.duration = duration;
    }

    public Service() {

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
