package com.platzi.javatests.util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringUtilTest {
    public static void main(String[] args) {

        assertEquals(StringUtil.repeat("Hello ", 3), "Hello Hello Hello ");

        assertEquals(StringUtil.repeat("Hello ", 1), "Hello ");

    }

}