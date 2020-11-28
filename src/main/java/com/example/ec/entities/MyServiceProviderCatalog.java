package com.example.ec.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class MyServiceProviderCatalog  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String description;

    @JsonIgnore
    @OneToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "provider_id", nullable = false)
    private MyServiceProvider myServiceProvider;

    public MyServiceProviderCatalog() {
    }

    public MyServiceProviderCatalog(Integer id, String description, MyServiceProvider myServiceProvider) {
        this.id = id;
        this.description = description;
        this.myServiceProvider = myServiceProvider;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MyServiceProvider getMyServiceProvider() {
        return myServiceProvider;
    }

    public void setMyServiceProvider(MyServiceProvider myServiceProvider) {
        this.myServiceProvider = myServiceProvider;
    }

    @Override
    public String toString() {
        return "MyServiceProviderCatalog{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", myServiceProvider=" + myServiceProvider +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyServiceProviderCatalog that = (MyServiceProviderCatalog) o;
        return id.equals(that.id) &&
                description.equals(that.description) &&
                myServiceProvider.equals(that.myServiceProvider);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, myServiceProvider);
    }
}
