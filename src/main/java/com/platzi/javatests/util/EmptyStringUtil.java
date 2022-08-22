package com.platzi.javatests.util;

public class EmptyStringUtil {
    public static boolean isEmpty(String str) {
        return str == null || str.trim().length() == 0;
    }
}
