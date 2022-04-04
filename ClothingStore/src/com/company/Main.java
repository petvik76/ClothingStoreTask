package com.company;

import com.company.products.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
	Product product1 = new Shirt("Blue Cotton Shirt", "BrandS", 14.99, "blue", ShirtSize.M);
    Product product2 = new Shirt("White Cotton Shirt", "BrandS", 15.99, "white", ShirtSize.M);
    Product product3 = new Trousers("Black Cotton Trousers", "BrandT", 29.99, "black", SuitJacketTrousersSize.SIZE5);
    Product product4 = new Shoe("Black Leather Shoes", "BrandS", 59.99, "black", ShoeSize.SIZE5);
    Product product5 = new SuitJacket("Black Cotton Suit Jacket", "BrandJ", 99.99, "black", SuitJacketTrousersSize.SIZE5);

    Cashier cashier = new Cashier(LocalDateTime.parse("2022-02-02 12:34:56", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    cashier.addProduct(product1);
    cashier.addProduct(product2);
    cashier.addProduct(product3);
    cashier.addProduct(product4);
    cashier.addProduct(product5);
    cashier.print();


    }
}
