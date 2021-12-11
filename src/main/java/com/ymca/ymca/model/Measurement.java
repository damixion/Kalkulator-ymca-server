package com.ymca.ymca.model;

import org.hibernate.annotations.Generated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.crypto.Data;
import java.time.LocalDate;

@Entity
public class Measurement {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE )
    Long id;
    String name;
    String sex;
    Double weight;
    Double waist;
    Integer age;
    String description;
    Double result;
    LocalDate date;

    public Measurement() {}

    public Measurement(Long id, String name, String sex, Double weight, Double waist, Integer age, String description, Double result, LocalDate date) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.weight = weight;
        this.waist = waist;
        this.age = age;
        this.description = description;
        this.result = result;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getWaist() {
        return waist;
    }

    public void setWaist(Double waist) {
        this.waist = waist;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
