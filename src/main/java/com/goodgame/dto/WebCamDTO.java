package com.goodgame.dto;


import com.goodgame.model.WebCam;

public class WebCamDTO {

    private int id;
    private String name;
    private String color;
    private String effectiveResolution;
    private String imageResolution;
    private String videoResolution;
    private String connection;
    private String microphone;
    private String mass;
    private int price;
    private int quantity;

    public WebCamDTO() {
    }

    public WebCamDTO(WebCam webCam) {
        this.id = webCam.getId();
        this.name = webCam.getName();
        this.color = webCam.getColor();
        this.effectiveResolution = webCam.getEffectiveResolution();
        this.imageResolution = webCam.getImageResolution();
        this.videoResolution = webCam.getVideoResolution();
        this.connection = webCam.getConnection();
        this.microphone = webCam.getMicrophone();
        this.mass = webCam.getMass();
        this.price = webCam.getPrice();
        this.quantity = webCam.getQuantity();
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

    public String getEffectiveResolution() {
        return effectiveResolution;
    }

    public void setEffectiveResolution(String effectiveResolution) {
        this.effectiveResolution = effectiveResolution;
    }

    public String getImageResolution() {
        return imageResolution;
    }

    public void setImageResolution(String imageResolution) {
        this.imageResolution = imageResolution;
    }

    public String getVideoResolution() {
        return videoResolution;
    }

    public void setVideoResolution(String videoResolution) {
        this.videoResolution = videoResolution;
    }

    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    public String getMicrophone() {
        return microphone;
    }

    public void setMicrophone(String microphone) {
        this.microphone = microphone;
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
