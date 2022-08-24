package com.platzi.javatests.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void fizzWhenDivisibleBy3() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(303));
    }

    @Test
    public void buzzWhenDivisibleBy5() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(100));
    }

    @Test
    public void FizzBuzzWhenDivisibleBy3And5() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(1320));

    }

    @Test
    public void notFizzNorBuzzWhenNotDivisibleBy3Or5() {
        assertEquals("!FizzNorBuzz :(", FizzBuzz.fizzBuzz(9998));
    }
}