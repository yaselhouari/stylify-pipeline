package com.example.ec.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class MyServiceProviderDocument implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "my_service_provider_id")
    private MyServiceProvider myServiceProvider;

    @Column
    String startTime;

    @Column
    String endTime;

    @Column
    String type;


    public MyServiceProviderDocument() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public MyServiceProvider getMyServiceProvider() {
        return myServiceProvider;
    }

    public void setMyServiceProvider(MyServiceProvider myServiceProvider) {
        this.myServiceProvider = myServiceProvider;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String from) {
        this.startTime = from;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String to) {
        this.endTime = to;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "MyServiceProviderSchedule{" +
                "id=" + id +
                ", myServiceProvider=" + myServiceProvider +
                ", from='" + startTime + '\'' +
                ", to='" + endTime + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyServiceProviderDocument that = (MyServiceProviderDocument) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(myServiceProvider, that.myServiceProvider) &&
                Objects.equals(startTime, that.startTime) &&
                Objects.equals(endTime, that.endTime) &&
                Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, myServiceProvider, startTime, endTime, type);
    }
}
