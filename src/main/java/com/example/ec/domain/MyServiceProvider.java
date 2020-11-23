package com.example.ec.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
public class MyServiceProvider  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String gender;
    @Column
    private String mobile;
    @Column
    private String email;
    @Column
    private String birthDate;
    @Column
    private String location;
    @Column
    private String username;
    @Column
    private String password;
    @Column
    private String status;

    @OneToOne(mappedBy = "myServiceProvider", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private MyServiceProviderCatalog myServiceProviderCatalog;

    @OneToOne(mappedBy = "myServiceProvider", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private MyServiceProviderProfile myServiceProviderProfile;


    public MyServiceProvider() {
    }

    public MyServiceProvider(Integer id, String firstName, String lastName, String gender, String mobile, String email, String birthDate, String location, String username, String password, String status, MyServiceProviderCatalog myServiceProviderCatalog, MyServiceProviderProfile myServiceProviderProfile) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.mobile = mobile;
        this.email = email;
        this.birthDate = birthDate;
        this.location = location;
        this.username = username;
        this.password = password;
        this.status = status;
        this.myServiceProviderCatalog = myServiceProviderCatalog;
        this.myServiceProviderProfile = myServiceProviderProfile;
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
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", status='" + status + '\'' +
                ", myServiceProviderCatalog=" + myServiceProviderCatalog +
                ", myServiceProviderProfile=" + myServiceProviderProfile +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyServiceProvider that = (MyServiceProvider) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(gender, that.gender) &&
                Objects.equals(mobile, that.mobile) &&
                Objects.equals(email, that.email) &&
                Objects.equals(birthDate, that.birthDate) &&
                Objects.equals(location, that.location) &&
                Objects.equals(username, that.username) &&
                Objects.equals(password, that.password) &&
                Objects.equals(status, that.status) &&
                Objects.equals(myServiceProviderCatalog, that.myServiceProviderCatalog) &&
                Objects.equals(myServiceProviderProfile, that.myServiceProviderProfile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, gender, mobile, email, birthDate, location, username, password, status, myServiceProviderCatalog, myServiceProviderProfile);
    }
}
