package com.platzi.javatests.romannumbers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumbersTest {

    @Test
    public void valid_number_1_to_roman() {
        assertEquals("I", RomanNumbers.arabicToRoman(1));
    }

    @Test
    public void valid_number_2_to_roman() {
        assertEquals("II", RomanNumbers.arabicToRoman(2));
    }

    @Test
    public void valid_number_3_to_roman() {
        assertEquals("III", RomanNumbers.arabicToRoman(3));
    }

    @Test
    public void valid_number_5_to_roman() {
        assertEquals("V", RomanNumbers.arabicToRoman(5));
    }

    @Test
    public void valid_number_6_to_roman() {
        assertEquals("VI", RomanNumbers.arabicToRoman(6));
    }

    @Test
    public void valid_number_7_to_roman() {
        assertEquals("VII", RomanNumbers.arabicToRoman(7));
    }

    @Test
    public void valid_number_10_to_roman() {
        assertEquals("X", RomanNumbers.arabicToRoman(10));
    }

    @Test
    public void valid_number_11_to_roman() {
        assertEquals("XI", RomanNumbers.arabicToRoman(11));
    }

    @Test
    public void valid_number_15_to_roman() {
        assertEquals("XV", RomanNumbers.arabicToRoman(15));
    }

    @Test
    public void valid_number_16_to_roman() {
        assertEquals("XVI", RomanNumbers.arabicToRoman(16));
    }

    @Test
    public void valid_number_50_to_roman() {
        assertEquals("L", RomanNumbers.arabicToRoman(50));
    }

    @Test
    public void valid_number_51_to_roman() {
        assertEquals("LI", RomanNumbers.arabicToRoman(51));
    }

    @Test
    public void valid_number_55_to_roman() {
        assertEquals("LV", RomanNumbers.arabicToRoman(55));
    }

    @Test
    public void valid_number_56_to_roman() {
        assertEquals("LVI", RomanNumbers.arabicToRoman(56));
    }

    @Test
    public void valid_number_60_to_roman() {
        assertEquals("LX", RomanNumbers.arabicToRoman(60));
    }

    @Test
    public void valid_number_70_to_roman() {
        assertEquals("LXX", RomanNumbers.arabicToRoman(70));
    }

    @Test
    public void valid_number_80_to_roman() {
        assertEquals("LXXX", RomanNumbers.arabicToRoman(80));
    }

    @Test
    public void valid_number_81_to_roman() {
        assertEquals("LXXXI", RomanNumbers.arabicToRoman(81));
    }

    @Test
    public void valid_number_85_to_roman() {
        assertEquals("LXXXV", RomanNumbers.arabicToRoman(85));
    }

    @Test
    public void valid_number_86_to_roman() {
        assertEquals("LXXXVI", RomanNumbers.arabicToRoman(86));
    }

    @Test
    public void valid_number_126_to_roman() {
        assertEquals("CXXVI", RomanNumbers.arabicToRoman(126));
    }

    @Test
    public void valid_number_2507_to_roman() {
        assertEquals("MMDVII", RomanNumbers.arabicToRoman(2507));
    }

    @Test
    public void valid_number_4_to_roman() {
        assertEquals("IV", RomanNumbers.arabicToRoman(4));
    }

    @Test
    public void valid_number_9_to_roman() {
        assertEquals("IX", RomanNumbers.arabicToRoman(9));
    }

    @Test
    public void valid_number_14_to_roman() {
        assertEquals("XIV", RomanNumbers.arabicToRoman(14));
    }

    @Test
    public void valid_number_19_to_roman() {
        assertEquals("XIX", RomanNumbers.arabicToRoman(19));
    }

    @Test
    public void valid_number_24_to_roman() {
        assertEquals("XXIV", RomanNumbers.arabicToRoman(24));
    }

    @Test
    public void valid_number_40_to_roman() {
        assertEquals("XL", RomanNumbers.arabicToRoman(0));
    }

    @Test
    public void valid_number_49_to_roman() {
        assertEquals("XLIX", RomanNumbers.arabicToRoman(49));
    }

    @Test
    public void valid_number_90_to_roman() {
        assertEquals("XC", RomanNumbers.arabicToRoman(90));
    }

    @Test
    public void valid_number_99_to_roman() {
        assertEquals("XCIX", RomanNumbers.arabicToRoman(99));
    }

    @Test
    public void valid_number_400_to_roman() {
        assertEquals("CD", RomanNumbers.arabicToRoman(400));
    }

    @Test
    public void valid_number_900_to_roman() {
        assertEquals("CM", RomanNumbers.arabicToRoman(900));
    }
}
