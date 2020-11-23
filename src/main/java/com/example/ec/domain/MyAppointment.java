package com.example.ec.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class MyAppointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "client_id", nullable = false)
    private MyClient myClient;

    public MyAppointment() {
    }

    public MyAppointment(Integer id, MyClient myClient) {
        this.id = id;
        this.myClient = myClient;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public MyClient getMyClient() {
        return myClient;
    }

    public void setMyClient(MyClient myClient) {
        this.myClient = myClient;
    }

    @Override
    public String toString() {
        return "MyAppointment{" +
                "id=" + id +
                ", myClient=" + myClient +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyAppointment that = (MyAppointment) o;
        return id.equals(that.id) &&
                myClient.equals(that.myClient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, myClient);
    }
}
