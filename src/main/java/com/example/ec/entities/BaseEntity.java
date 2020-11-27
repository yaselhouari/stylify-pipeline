package com.example.ec.entities;

import lombok.Getter;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * See: https://stackoverflow.com/questions/48784923/is-using-id-field-in-allargsconstructor-while-using-spring-jpa-correct
 * @author developer
 */
@Entity
@Getter
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class BaseEntity implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
}