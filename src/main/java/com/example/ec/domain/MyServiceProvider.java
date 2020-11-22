package com.example.ec.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class MyServiceProvider {
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

    @JsonIgnore
    @OneToOne(mappedBy = "myServiceProvider", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private MyServiceProviderCatalog myServiceProviderCatalog;

    @JsonIgnore
    @OneToOne(mappedBy = "myServiceProvider", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private MyServiceProviderProfile myServiceProviderProfile;

    public MyServiceProvider() {
    }

    public MyServiceProvider(Integer id, String firstName, String lastName, String gender, String mobile, String email, String birthDate, String location, String username, String password, String status, MyServiceProviderCatalog myServiceProviderCatalog) {
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
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public MyServiceProviderCatalog getMyServiceProviderCatalog() {
        return myServiceProviderCatalog;
    }

    public void setMyServiceProviderCatalog(MyServiceProviderCatalog myServiceProviderCatalog) {
        this.myServiceProviderCatalog = myServiceProviderCatalog;
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
                location.equals(that.location) &&
                username.equals(that.username) &&
                password.equals(that.password) &&
                status.equals(that.status) &&
                myServiceProviderCatalog.equals(that.myServiceProviderCatalog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, gender, mobile, email, birthDate, location, username, password, status, myServiceProviderCatalog);
    }
}
