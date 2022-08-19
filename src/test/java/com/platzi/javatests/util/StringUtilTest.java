package com.platzi.javatests.util;

public class StringUtilTest {
    public static void main(String[] args) {

        String result = StringUtil.repeat("Hello ", 3);
        if (!result.equals("Hello Hello Hello ")) {
            System.out.println("ERROR");
        }

        String result2 = StringUtil.repeat("Hello ", 1);
        if (!result2.equals("Hello ")) {
            System.out.println("ERROR");
        }
    }

}