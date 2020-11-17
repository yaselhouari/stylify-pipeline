package net.devlance.stylify.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ServicePackage {

    @Id
    @GeneratedValue
    private String code;

    @Column
    private String name;

    public ServicePackage(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public ServicePackage() {

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
