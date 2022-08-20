package com.platzi.javatests.util;

import static org.junit.Assert.assertEquals;

public class StringUtilTest {
    public static void main(String[] args) {

        String result = StringUtil.repeat("Hello ", 3);
        assertEquals(result, "Hello Hello Hello ");


        String result2 = StringUtil.repeat("Hello ", 1);
            assertEquals(result2, "Hello ");

    }

}