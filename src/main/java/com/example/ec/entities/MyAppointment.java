package com.example.ec.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;
import java.util.Objects;

@Entity
public class MyAppointment implements Serializable {
    @Id
    @Column(name = "my_client_id")
    Integer my_client_id;

    @Id
    @Column(name = "my_service_id")
    Integer my_service_id;

    @Column
    String time;

    @Column
    String dateCreated;

    @Column
    String clientName;

    @Column
    String clientPhone;

    @Column
    String startTimeExpected;

    @Column
    String startTime;

    @Column
    String endTimeExpected;

    @Column
    String endTime;

    @Column
    String price;

    @Column
    String status;

    public MyAppointment() {
    }

    public Integer getMy_client_id() {
        return my_client_id;
    }

    public void setMy_client_id(Integer my_client_id) {
        this.my_client_id = my_client_id;
    }

    public Integer getMy_service_id() {
        return my_service_id;
    }

    public void setMy_service_id(Integer my_service_provider_id) {
        this.my_service_id = my_service_provider_id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTimeExpected() {
        return endTimeExpected;
    }

    public void setEndTimeExpected(String endTimeExpected) {
        this.endTimeExpected = endTimeExpected;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "MyAppointment{" +
                "my_client_id=" + my_client_id +
                ", my_service_id=" + my_service_id +
                ", time='" + time + '\'' +
                ", dateCreated='" + dateCreated + '\'' +
                ", clientName='" + clientName + '\'' +
                ", clientPhone='" + clientPhone + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTimeExpected='" + endTimeExpected + '\'' +
                ", endTime='" + endTime + '\'' +
                ", price='" + price + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyAppointment that = (MyAppointment) o;
        return Objects.equals(my_client_id, that.my_client_id) &&
                Objects.equals(my_service_id, that.my_service_id) &&
                Objects.equals(time, that.time) &&
                Objects.equals(dateCreated, that.dateCreated) &&
                Objects.equals(clientName, that.clientName) &&
                Objects.equals(clientPhone, that.clientPhone) &&
                Objects.equals(startTime, that.startTime) &&
                Objects.equals(endTimeExpected, that.endTimeExpected) &&
                Objects.equals(endTime, that.endTime) &&
                Objects.equals(price, that.price) &&
                Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(my_client_id, my_service_id, time, dateCreated, clientName, clientPhone, startTime, endTimeExpected, endTime, price, status);
    }
}
