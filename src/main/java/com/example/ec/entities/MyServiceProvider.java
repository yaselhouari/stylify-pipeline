package com.example.ec.entities;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

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

    @OneToMany(
            mappedBy = "myServiceProvider",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.EAGER

    )
    private List<MyService> myServices = new ArrayList<MyService>();

    @OneToOne(mappedBy = "myServiceProvider", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private MyServiceProviderSchedule myServiceProviderSchedule;

    @OneToMany(mappedBy = "myServiceProvider",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private Set<MyServiceProviderDocument> myServiceProviderDocuments = new HashSet<>();

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

    public Set<MyServiceProviderDocument> getMyServiceProviderDocuments() {
        return myServiceProviderDocuments;
    }

    public void setMyServiceProviderDocuments(Set<MyServiceProviderDocument> myServiceProviderDocuments) {
        this.myServiceProviderDocuments = myServiceProviderDocuments;
    }

    public MyServiceProviderSchedule getMyServiceProviderSchedule() {
        return myServiceProviderSchedule;
    }

    public void setMyServiceProviderSchedule(MyServiceProviderSchedule myServiceProviderSchedule) {
        this.myServiceProviderSchedule = myServiceProviderSchedule;
    }

    public List<MyService> getMyServices() {
        return myServices;
    }

    public void setMyServices(List<MyService> myServices) {
        this.myServices = myServices;
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

    public MyServiceProviderProfile getMyServiceProviderProfile() {
        return myServiceProviderProfile;
    }

    public void setMyServiceProviderProfile(MyServiceProviderProfile myServiceProviderProfile) {
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
                ", myServices=" + myServices +
                ", myServiceProviderSchedule=" + myServiceProviderSchedule +
                ", myServiceProviderDocuments=" + myServiceProviderDocuments +
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
                Objects.equals(myServiceProviderProfile, that.myServiceProviderProfile) &&
                Objects.equals(myServices, that.myServices) &&
                Objects.equals(myServiceProviderSchedule, that.myServiceProviderSchedule) &&
                Objects.equals(myServiceProviderDocuments, that.myServiceProviderDocuments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, gender, mobile, email, birthDate, location, username, password, status, myServiceProviderCatalog, myServiceProviderProfile, myServices, myServiceProviderSchedule, myServiceProviderDocuments);
    }
}
