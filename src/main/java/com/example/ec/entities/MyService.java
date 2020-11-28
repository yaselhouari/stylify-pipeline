package com.example.ec.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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

    @ManyToMany
    @JoinTable(
            name = "MyAppointment",
            joinColumns = @JoinColumn(name = "my_client_id"),
            inverseJoinColumns = @JoinColumn(name = "my_service_id")
    )
    private List<MyClient> myClients = new ArrayList<MyClient>();

    public MyServiceProvider getMyServiceProvider() {
        return myServiceProvider;
    }

    public void setMyServiceProvider(MyServiceProvider myServiceProvider) {
        this.myServiceProvider = myServiceProvider;
    }

    @ManyToOne
    @JoinColumn(name = "my_service_provider_id")
    private MyServiceProvider myServiceProvider;

    public void addClient(MyClient myClient) {
        myClients.add(myClient);
    }

    public MyService() {

    }

    public MyService(Integer id, String title, String description, String price, String duration) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.duration = duration;
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



    @Override
    public String toString() {
        return "MyService{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
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
                title.equals(myService.title) &&
                description.equals(myService.description) &&
                price.equals(myService.price) &&
                duration.equals(myService.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, price, duration);
    }
}
