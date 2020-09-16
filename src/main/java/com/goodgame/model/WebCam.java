package com.goodgame.model;

import javax.persistence.*;

@Entity
@Table(name = "web_cam")
public class WebCam {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private String color;
    @Column(name = "effective_resolution")
    private String effectiveResolution;
    @Column(name = "image_resolution")
    private String imageResolution;
    @Column(name = "video_resolution")
    private String videoResolution;
    private String connection;
    private String microphone;
    private String mass;
    private int price;
    private int quantity;

    public WebCam() {
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
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
