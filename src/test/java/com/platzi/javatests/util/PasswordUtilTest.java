package com.platzi.javatests.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordUtilTest {

    @Test
    public void weakWhenHasLessThan8Letters() {
        assertEquals(PasswordUtil.securityLevel.WEAK ,PasswordUtil.assessPassword("1234567"));

    }

    @Test
    public void weakWhenHasLessTOnlyLetters() {
        assertEquals(PasswordUtil.securityLevel.WEAK ,PasswordUtil.assessPassword("abcdefaghi"));
    }

    @Test
    public void mediumWhenHasLettersAndNumbers() {
        assertEquals(PasswordUtil.securityLevel.MEDIUM ,PasswordUtil.assessPassword("abcdsdfsd1231ef3"));
    }

    @Test
    public void strongWhenHasLettersAndNumbersAndSymbols() {
        assertEquals(PasswordUtil.securityLevel.STRONG ,PasswordUtil.assessPassword("abcds&dfs-d1231ef3"));
    }
}

