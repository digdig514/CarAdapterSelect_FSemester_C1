package com.example.digdig.caradapterdatasource_android2.model;

/**
 * Created by digdig on 17-05-16.
 */
//comparable, serializable and implements
public class Car {
    private int picture;
    private String model;
    private String brande;
    private float price;

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public String getModel() {
        return model.toUpperCase();
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrande() {
        return brande.substring(0,1).toUpperCase()+brande.substring(1).toLowerCase();
    }

    public void setBrande(String brande) {
        this.brande = brande;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Car(int picture, String model, String brade, float price) {
        this.picture = picture;
        this.model = model;
        this.brande = brade;
        this.price = price;
    }

    @Override
    public String toString() {
        return getModel()+ ","+ getBrande();
    }
}
