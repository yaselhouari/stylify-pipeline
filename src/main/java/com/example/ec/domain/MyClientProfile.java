package com.example.ec.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class MyClientProfile  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @OneToOne( fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "client_id", nullable = false)
    private MyClient myClient;

    public MyClientProfile() {
    }

    public MyClientProfile(String id, MyClient myClient) {
        this.id = id;
        this.myClient = myClient;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MyClient getMyClient() {
        return myClient;
    }

    public void setMyClient(MyClient myClient) {
        this.myClient = myClient;
    }

    @Override
    public String toString() {
        return "MyClientProfile{" +
                "id='" + id + '\'' +
                ", myClient=" + myClient +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyClientProfile that = (MyClientProfile) o;
        return id.equals(that.id) &&
                myClient.equals(that.myClient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, myClient);
    }
}
