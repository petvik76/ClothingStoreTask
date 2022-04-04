package com.company;

import com.company.products.Product;
import com.company.products.Shirt;
import com.company.products.Shoe;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.max;


public class Cashier {
    private List<Product> products;
    private LocalDateTime date;
    private double totalDiscountSum;


    public Cashier(LocalDateTime date) {
        this.date = date;
        this.products = new ArrayList<>();
        this.totalDiscountSum = 0;
    }

    public void addProduct(Product product) {
       this.products.add(product);
    }

    public double getDiscount(Product product) {
        int dayOfWeek = date.getDayOfWeek().getValue();
        double productsNumberDiscount = 0;
        double tuesdayDiscount = 0;
        if (this.products.size() >= 3) {
            productsNumberDiscount = 0.2;
        }
        if (dayOfWeek == 2) {
            if (product instanceof Shirt) {
                tuesdayDiscount = 0.1;
            } else if (product instanceof Shoe) {
                tuesdayDiscount = 0.25;
            }

        }

        return max(productsNumberDiscount, tuesdayDiscount);
    }

    public void print() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("Date: %s%n---Products---", this.date.toString())).append(System.lineSeparator());
        this.products.forEach(p -> {
            builder.append(p.toString()).append(System.lineSeparator());

            if (this.getDiscount(p) > 0) {
                double discountSum = getDiscount(p) * p.getPrice();
                totalDiscountSum += discountSum;
                builder.append(String.format("#discount %.0f%% -$%.2f", this.getDiscount(p) * 100, discountSum)).append("\n");

            }
        });
        builder.append(String.format("SUBTOTAL: $%.2f", this.getTotalSum())).append(System.lineSeparator());
        builder.append(String.format("DISCOUNT: -$%.2f", this.totalDiscountSum)).append(System.lineSeparator());
        builder.append(String.format("TOTAL: $%.2f", this.getTotalSum() - totalDiscountSum));


        System.out.println(builder);
    }

    private double getTotalSum() {
        return this.products.stream().mapToDouble(Product::getPrice).sum();
    }

}
