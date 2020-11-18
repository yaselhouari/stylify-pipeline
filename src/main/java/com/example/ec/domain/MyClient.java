package com.example.ec.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

public class MyClient {
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

    public MyClient() {
    }

    public MyClient(Integer id, String firstName, String lastName, String gender, String mobile, String email, String birthDate, String location) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.mobile = mobile;
        this.email = email;
        this.birthDate = birthDate;
        this.location = location;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyClient myClient = (MyClient) o;
        return id.equals(myClient.id) &&
                firstName.equals(myClient.firstName) &&
                lastName.equals(myClient.lastName) &&
                gender.equals(myClient.gender) &&
                mobile.equals(myClient.mobile) &&
                email.equals(myClient.email) &&
                birthDate.equals(myClient.birthDate) &&
                location.equals(myClient.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, gender, mobile, email, birthDate, location);
    }
}
