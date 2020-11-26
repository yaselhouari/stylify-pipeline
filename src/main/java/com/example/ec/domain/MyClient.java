package com.example.ec.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class MyClient  implements Serializable {

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
    @OneToOne(mappedBy = "myClient", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private MyClientProfile myClientProfile;

    @ManyToMany(mappedBy = "myClients")
    private List<MyServiceProvider> myServiceProviders = new ArrayList<MyServiceProvider>();

    public void addServiceProvider(MyServiceProvider myServiceProvider) {
        myServiceProviders.add(myServiceProvider);
    }

    public MyClient() {
    }

    public MyClient(Integer id, String firstName, String lastName, String gender, String mobile, String email, String birthDate, String location, String username, String password, String status, MyClientProfile myClientProfile) {
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
        this.myClientProfile = myClientProfile;
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

    public MyClientProfile getMyClientProfile() {
        return myClientProfile;
    }

    public void setMyClientProfile(MyClientProfile myClientProfile) {
        this.myClientProfile = myClientProfile;
    }

    @Override
    public String toString() {
        return "MyClient{" +
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
                ", myClientProfile=" + myClientProfile +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyClient myClient = (MyClient) o;
        return Objects.equals(id, myClient.id) &&
                Objects.equals(firstName, myClient.firstName) &&
                Objects.equals(lastName, myClient.lastName) &&
                Objects.equals(gender, myClient.gender) &&
                Objects.equals(mobile, myClient.mobile) &&
                Objects.equals(email, myClient.email) &&
                Objects.equals(birthDate, myClient.birthDate) &&
                Objects.equals(location, myClient.location) &&
                Objects.equals(username, myClient.username) &&
                Objects.equals(password, myClient.password) &&
                Objects.equals(status, myClient.status) &&
                Objects.equals(myClientProfile, myClient.myClientProfile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, gender, mobile, email, birthDate, location, username, password, status, myClientProfile);
    }
}
