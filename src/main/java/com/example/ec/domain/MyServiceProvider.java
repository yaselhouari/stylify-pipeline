package com.example.ec.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class MyServiceProvider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    String firstName;

    @Column
    String lastName;

    @Column
    String gender;

    @Column
    String mobile;

    @Column
    String email;

    @Column
    String birthDate;

    @Column
    String location;

    public MyServiceProvider() {
    }

    public MyServiceProvider(Integer id, String firstName, String lastName, String gender, String mobile, String email, String birthDate, String location) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.mobile = mobile;
        this.email = email;
        this.birthDate = birthDate;
        this.location = location;
    }

    @Override
    public String toString() {
        return "MyServiceProvider{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyServiceProvider that = (MyServiceProvider) o;
        return id.equals(that.id) &&
                firstName.equals(that.firstName) &&
                lastName.equals(that.lastName) &&
                gender.equals(that.gender) &&
                mobile.equals(that.mobile) &&
                email.equals(that.email) &&
                birthDate.equals(that.birthDate) &&
                location.equals(that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, gender, mobile, email, birthDate, location);
    }
}
