package com.platzi.javatests.util;

public class DateLeapYearUtil {
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }

        if (year % 400 == 0) {
            return true;
        }

        return false;
    }
}
