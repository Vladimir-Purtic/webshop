package com.goodgame.dto;

import com.goodgame.model.MousePad;

public class MousePadDTO {

    private int id;
    private String name;
    private String color;
    private String backlight;
    private String dimensions;
    private String surface;
    private String powerSupply;
    private String mass;
    private int price;
    private int quantity;

    public MousePadDTO() {
    }

    public MousePadDTO(MousePad mousePad) {
        this.id = mousePad.getId();
        this.name = mousePad.getName();
        this.color = mousePad.getColor();
        this.backlight = mousePad.getBacklight();
        this.dimensions = mousePad.getDimensions();
        this.surface = mousePad.getSurface();
        this.powerSupply = mousePad.getPowerSupply();
        this.mass = mousePad.getMass();
        this.price = mousePad.getPrice();
        this.quantity = mousePad.getQuantity();
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

    public String getBacklight() {
        return backlight;
    }

    public void setBacklight(String backlight) {
        this.backlight = backlight;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public String getSurface() {
        return surface;
    }

    public void setSurface(String surface) {
        this.surface = surface;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
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