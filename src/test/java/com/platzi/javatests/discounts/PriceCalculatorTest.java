package com.platzi.javatests.discounts;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PriceCalculatorTest {


    @Test
    public void totalZeroWhenThereAreNoPrices() {
        PriceCalculator calculator = new PriceCalculator();
        assertEquals(0, calculator.getTotal(), 0);
    }

    @Test
    public void totalIsSumOfPrices() {
        PriceCalculator calculator = new PriceCalculator();

        calculator.addPrice(100.1);
        calculator.addPrice(100.1);

        assertEquals(200.2,calculator.getTotal(),0);
    }

    @Test
    public void totalIsSumOfPricesMinusDiscount() {
        PriceCalculator calculator = new PriceCalculator();

        calculator.addPrice(100);
        calculator.addPrice(50);
        calculator.addPrice(50);
        calculator.addDiscount(10);

        assertEquals(180,calculator.getTotal(),0.01);
    }
}