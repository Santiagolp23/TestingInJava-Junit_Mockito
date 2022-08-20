package com.platzi.javatests.util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringUtilTest {

    @Test
    public void repeatOnce() {
        assertEquals(StringUtil.repeat("Hello ", 1), "Hello ");
    }

    @Test
    public void repeatThreeTimes() {
        assertEquals(StringUtil.repeat("Hello ", 3), "Hello Hello Hello ");
    }

    @Test
    public void repeatZeroTimes() {
        assertEquals(StringUtil.repeat("Hello ", 0), "");
    }
}
