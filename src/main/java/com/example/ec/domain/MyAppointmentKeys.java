package com.example.ec.domain;

import java.io.Serializable;
import java.util.Objects;

public class MyAppointmentKeys implements Serializable {
    Integer my_client_id;
    Integer my_service_id;

    public MyAppointmentKeys() {
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

    public void setMy_service_id(Integer my_service_id) {
        this.my_service_id = my_service_id;
    }

    @Override
    public String toString() {
        return "MyAppointmentKeys{" +
                "myClientId=" + my_client_id +
                ", myServiceId=" + my_service_id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyAppointmentKeys that = (MyAppointmentKeys) o;
        return Objects.equals(my_client_id, that.my_client_id) &&
                Objects.equals(my_service_id, that.my_service_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(my_client_id, my_service_id);
    }
}
