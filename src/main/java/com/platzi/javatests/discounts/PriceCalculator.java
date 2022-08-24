package com.platzi.javatests.discounts;

import java.util.ArrayList;

public class PriceCalculator {
    ArrayList<Double> prices = new ArrayList<>();
    private double percentageDiscount = 0;


    public double getTotal() {
        double total = 0;
        for (Double price : prices) {
            total += price;
        }

        return total-(total*(percentageDiscount/100));
    }


    public void addPrice(double price) {
        prices.add(price);

    }

    public void addDiscount(double percentage) {
        percentageDiscount = percentage;

    }
}
