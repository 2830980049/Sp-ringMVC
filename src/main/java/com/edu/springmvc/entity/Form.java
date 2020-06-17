package com.edu.springmvc.entity;

import java.util.List;

/**
 * @author Wuqili
 * @version 1.0
 * @date 2020/6/17 21:38
 */
public class Form {
    private String name;
    private String course;
    private List<String> purpose;
    private Delivery delivery = new Delivery();

    public Form(String name, String course, List<String> purpose, Delivery delivery) {
        this.name = name;
        this.course = course;
        this.purpose = purpose;
        this.delivery = delivery;
    }

    @Override
    public String toString() {
        return "Form{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", purpose=" + purpose +
                ", delivery=" + delivery +
                '}';
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public Form() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public List<String> getPurpose() {
        return purpose;
    }

    public void setPurpose(List<String> purpose) {
        this.purpose = purpose;
    }

    public Form(String name, String course, List<String> purpose) {
        this.name = name;
        this.course = course;
        this.purpose = purpose;
    }
}
