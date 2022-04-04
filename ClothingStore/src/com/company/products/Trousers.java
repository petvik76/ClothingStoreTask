package com.company.products;

public class Trousers extends Product{
    private SuitJacketTrousersSize size;
    public Trousers(String name, String brand, double price, String color, SuitJacketTrousersSize size) {
        super(name, brand, price, color);
        this.size = size;
    }

    public SuitJacketTrousersSize getSize() {
        return size;
    }

    public void setSize(SuitJacketTrousersSize size) {
        this.size = size;
    }
}
