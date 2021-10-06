package com.company;

public class ProductItem {

    String name;
    double price;

    public ProductItem() {
        this.name = "N/A";
        this.price = 0.0d;
    }

    public ProductItem(String name, double price) {
        this.name = name;
        this.price = price;
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
}
