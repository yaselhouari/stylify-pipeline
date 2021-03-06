package com.example.ec.helper;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Objects;

public class MyResult {
    public String firstName;
    public String lastName;
    public double price;
    public double rate;
    public String time;
    public double locationDifference;

    public MyResult() {
    }

    public MyResult(String firstName, String lastName, double price, double rate, String time, double locationDifference) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.price = price;
        this.rate = rate;
        this.time = time;
        this.locationDifference = locationDifference;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getLocationDifference() {
        return locationDifference;
    }

    public void setLocationDifference(double locationDifference) {
        this.locationDifference = locationDifference;
    }

    @Override
    public String toString() {
        return "MyResult{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", price=" + price +
                ", rate=" + rate +
                ", time='" + time + '\'' +
                ", locationDifference=" + locationDifference +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyResult myResult = (MyResult) o;
        return Double.compare(myResult.price, price) == 0 &&
                Double.compare(myResult.rate, rate) == 0 &&
                Double.compare(myResult.locationDifference, locationDifference) == 0 &&
                Objects.equals(firstName, myResult.firstName) &&
                Objects.equals(lastName, myResult.lastName) &&
                Objects.equals(time, myResult.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, price, rate, time, locationDifference);
    }
}
