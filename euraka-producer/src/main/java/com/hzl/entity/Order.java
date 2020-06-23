package com.hzl.entity;

import java.time.LocalDateTime;

/**
 * @program: newcloud
 * @description
 * @author: zhilin
 * @create: 2020-06-20 15:06
 **/
public class Order {
    private int id;
    private String name;
    private double price;
    private String place;
    private LocalDateTime publishDt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public LocalDateTime getPublishDt() {
        return publishDt;
    }

    public void setPublishDt(LocalDateTime publishDt) {
        this.publishDt = publishDt;
    }
}
