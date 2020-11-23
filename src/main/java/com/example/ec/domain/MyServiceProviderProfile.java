package com.example.ec.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class MyServiceProviderProfile  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @JsonIgnore
    @OneToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "provider_id", nullable = false)
    private MyServiceProvider myServiceProvider;

    public MyServiceProviderProfile() {

    }

    public MyServiceProviderProfile(String id, MyServiceProvider myServiceProvider) {
        this.id = id;
        this.myServiceProvider = myServiceProvider;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MyServiceProvider getMyServiceProvider() {
        return myServiceProvider;
    }

    public void setMyServiceProvider(MyServiceProvider myServiceProvider) {
        this.myServiceProvider = myServiceProvider;
    }

    @Override
    public String toString() {
        return "MyServiceProviderProfile{" +
                "id='" + id + '\'' +
                ", myServiceProvider=" + myServiceProvider +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyServiceProviderProfile that = (MyServiceProviderProfile) o;
        return id.equals(that.id) &&
                myServiceProvider.equals(that.myServiceProvider);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, myServiceProvider);
    }
}
