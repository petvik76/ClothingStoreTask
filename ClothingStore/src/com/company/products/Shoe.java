package com.company.products;

public class Shoe extends Product{

    private ShoeSize size;

    public Shoe(String name, String brand, double price, String color, ShoeSize size) {
        super(name, brand, price, color);
        this.size = size;

    }

    public ShoeSize getSize() {
        return size;
    }

    public void setSize(ShoeSize size) {
        this.size = size;
    }
}

