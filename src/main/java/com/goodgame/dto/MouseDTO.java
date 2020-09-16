package com.goodgame.dto;

import com.goodgame.model.Mouse;

public class MouseDTO {

    private int id;
    private String name;
    private String color;
    private String connection;
    private String sensor;
    private String resolution;
    private String RGB;
    private String mass;
    private int price;
    private int quantity;

    public MouseDTO(){
    }

    public MouseDTO(int id) {
        this.id = id;
    }

    public MouseDTO(Mouse mouse) {
        this.id = mouse.getId();
        this.name = mouse.getName();
        this.color = mouse.getColor();
        this.connection = mouse.getConnection();
        this.sensor = mouse.getSensor();
        this.resolution = mouse.getResolution();
        this.RGB = mouse.getRGB();
        this.mass = mouse.getMass();
        this.price = mouse.getPrice();
        this.quantity = mouse.getQuantity();
    }

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    public String getSensor() {
        return sensor;
    }

    public void setSensor(String sensor) {
        this.sensor = sensor;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getRGB() {
        return RGB;
    }

    public void setRGB(String RGB) {
        this.RGB = RGB;
    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
