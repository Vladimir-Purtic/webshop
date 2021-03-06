package com.goodgame.dto;

import com.goodgame.model.Keyboard;

public class KeyboardDTO {

    private int id;
    private String name;
    private String color;
    private String keyType;
    private String connection;
    private String RGB;
    private String size;
    private String mass;
    private String layout;
    private int price;
    private int quantity;

    public KeyboardDTO() {
    }

    public KeyboardDTO(Keyboard keyboard){
        this.id = keyboard.getId();
        this.name = keyboard.getName();
        this.color = keyboard.getColor();
        this.keyType = keyboard.getKeyType();
        this.connection = keyboard.getConnection();
        this.RGB = keyboard.getRGB();
        this.size = keyboard.getSize();
        this.mass = keyboard.getMass();
        this.layout = keyboard.getLayout();
        this.price = keyboard.getPrice();
        this.quantity = keyboard.getQuantity();
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

    public String getKeyType() {
        return keyType;
    }

    public void setKeyType(String keyType) {
        this.keyType = keyType;
    }

    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    public String getRGB() {
        return RGB;
    }

    public void setRGB(String RGB) {
        this.RGB = RGB;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}