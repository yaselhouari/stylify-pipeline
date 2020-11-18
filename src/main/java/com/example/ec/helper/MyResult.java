package com.example.ec.helper;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Objects;

public class MyResult {
    public String firstName;
    public String lastName;
    public String price;
    public String rate;
    public String time;


    public MyResult(String firstName, String lastName, String price, String rate, String time) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.price = price;
        this.rate = rate;
        this.time = time;
    }

    @Override
    public String toString() {
        return "MyResult{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", price='" + price + '\'' +
                ", rate='" + rate + '\'' +
                ", time='" + time + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyResult myResult = (MyResult) o;
        return firstName.equals(myResult.firstName) &&
                lastName.equals(myResult.lastName) &&
                price.equals(myResult.price) &&
                rate.equals(myResult.rate) &&
                time.equals(myResult.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, price, rate, time);
    }
}
