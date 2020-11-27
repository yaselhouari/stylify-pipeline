package com.example.ec.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class MyRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;

    public MyRole() {
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

    @Override
    public String toString() {
        return "MyRole{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyRole myRole = (MyRole) o;
        return Objects.equals(id, myRole.id) &&
                Objects.equals(name, myRole.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
