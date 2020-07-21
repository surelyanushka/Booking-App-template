package com.example.app2.models;

public class Concerts {

    public String title, description, price, date;

    public int image;

//    String title[]

    public Concerts() {
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }

    public String getDate() {
        return date;
    }

    public int getImage() {
        return image;
    }

    public Concerts(String title, String description, String price, String date, int image) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.date = date;
        this.image = image;
    }
}
