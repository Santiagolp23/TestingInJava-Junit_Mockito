package com.platzi.javatests.romannumbers;

import java.util.Arrays;
import java.util.List;

public class RomanNumbers {
    enum RomanNumeral {

        M(1000), CM(900), D(500), CD(400),
        C(100), XC(90), L(50), XL(40),
        X(10), IX(9), V(5), IV(4),
        I(1);

        private final int value;

        RomanNumeral(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public static List<RomanNumeral> getRomanNumerals() {
            return Arrays.asList(RomanNumeral.values());
        }

    }


    public static String arabicToRoman(int n) {
        StringBuilder numberInRoman = new StringBuilder();
        while (n >= 1000) {
            numberInRoman.append(RomanNumeral.M);
            n -= RomanNumeral.M.getValue();
        }
        while (n >= 900) {
            numberInRoman.append(RomanNumeral.CM);
            n -= RomanNumeral.CM.getValue();
        }
        while (n >= 500) {
            numberInRoman.append(RomanNumeral.D);
            n -= RomanNumeral.D.getValue();
        }
        while (n >= 400) {
            numberInRoman.append(RomanNumeral.CD);
            n -= RomanNumeral.CD.getValue();
        }
        while (n >= 100) {
            numberInRoman.append(RomanNumeral.C);
            n -= RomanNumeral.C.getValue();
        }
        while (n >= 90) {
            numberInRoman.append(RomanNumeral.XC);
            n -= RomanNumeral.XC.getValue();
        }
        while (n >= 50) {
            numberInRoman.append(RomanNumeral.L);
            n -= RomanNumeral.L.getValue();
        }
        while (n >= 40) {
            numberInRoman.append(RomanNumeral.XL);
            n -= RomanNumeral.XL.getValue();
        }
        while (n >= 10) {
            numberInRoman.append(RomanNumeral.X);
            n -= RomanNumeral.X.getValue();
        }
        while (n >= 9) {
            numberInRoman.append(RomanNumeral.IX);
            n -= RomanNumeral.IX.getValue();
        }
        while (n >= 5) {
            numberInRoman.append(RomanNumeral.V);
            n -= RomanNumeral.V.getValue();
        }
        while (n >= 4) {
            numberInRoman.append(RomanNumeral.IV);
            n -= RomanNumeral.IV.getValue();
        }
        while (n >= 1) {
            numberInRoman.append(RomanNumeral.I);
            n -= RomanNumeral.I.getValue();
        }


        return numberInRoman.toString();

    }
}
