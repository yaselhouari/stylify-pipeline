package com.example.ec.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@IdClass(MyAppointmentIdClass.class)
public class MyAppointment  implements Serializable {
    @Id
    private Integer client_id;
    @Id
    private Integer provider_id;

    @ManyToOne
    @PrimaryKeyJoinColumn(name="provider_id", referencedColumnName="my_provider_idid")
    private MyServiceProvider myServiceProvider;

    @ManyToOne
    @PrimaryKeyJoinColumn(name="client_id", referencedColumnName="my_client_id")
    private MyClient myClient;

    public MyAppointment() {
    }

    public MyAppointment(Integer client_id, Integer provider_id, MyServiceProvider myServiceProvider, MyClient myClient) {
        this.client_id = client_id;
        this.provider_id = provider_id;
        this.myServiceProvider = myServiceProvider;
        this.myClient = myClient;
    }

    public Integer getClient_id() {
        return client_id;
    }

    public void setClient_id(Integer client_id) {
        this.client_id = client_id;
    }

    public Integer getProvider_id() {
        return provider_id;
    }

    public void setProvider_id(Integer provider_id) {
        this.provider_id = provider_id;
    }

    public MyServiceProvider getMyServiceProvider() {
        return myServiceProvider;
    }

    public void setMyServiceProvider(MyServiceProvider myServiceProvider) {
        this.myServiceProvider = myServiceProvider;
    }

    public MyClient getMyClient() {
        return myClient;
    }

    public void setMyClient(MyClient myClient) {
        this.myClient = myClient;
    }

    @Override
    public String toString() {
        return "MyAppointment{" +
                "client_id=" + client_id +
                ", provider_id=" + provider_id +
                ", myServiceProvider=" + myServiceProvider +
                ", myClient=" + myClient +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyAppointment that = (MyAppointment) o;
        return client_id.equals(that.client_id) &&
                provider_id.equals(that.provider_id) &&
                myServiceProvider.equals(that.myServiceProvider) &&
                myClient.equals(that.myClient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(client_id, provider_id, myServiceProvider, myClient);
    }
}
