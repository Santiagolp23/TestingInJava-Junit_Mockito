package com.platzi.javatests.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmptyStringUtilTest {

    @Test
    public void isNotEmpty() {
        assertFalse(EmptyStringUtil.isEmpty("ABCD"));
    }

    @Test
    public void isEmptyWithSpace() {
        assertTrue(EmptyStringUtil.isEmpty(" "));
    }

    @Test
    public void isEmpty() {
        assertTrue(EmptyStringUtil.isEmpty(""));
    }

    @Test
    public void isEmptyWhenNull() {
        assertTrue(EmptyStringUtil.isEmpty(null));
    }
}