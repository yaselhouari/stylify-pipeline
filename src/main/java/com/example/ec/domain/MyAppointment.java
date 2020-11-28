package com.example.ec.domain;

import javax.persistence.*;
import java.io.Serializable;
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

    @Override
    public String toString() {
        return "MyAppointment{" +
                "my_client_id=" + my_client_id +
                ", my_service_id=" + my_service_id +
                ", time='" + time + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {ؤ
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyAppointment that = (MyAppointment) o;
        return Objects.equals(my_client_id, that.my_client_id) &&
                Objects.equals(my_service_id, that.my_service_id) &&
                Objects.equals(time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(my_client_id, my_service_id, time);
    }
}
