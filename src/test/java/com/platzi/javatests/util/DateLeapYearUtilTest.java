package com.platzi.javatests.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class DateLeapYearUtilTest {

    @Test
    public void returnTrueWhenYearDivisibleBy400() {
        assertTrue(DateLeapYearUtil.isLeapYear(1600));
        assertTrue(DateLeapYearUtil.isLeapYear(2000));
        assertTrue(DateLeapYearUtil.isLeapYear(2400));
    }

    @Test
    public void returnFalseWhenYearDivisibleBy100ButNotBy400() {
        assertFalse(DateLeapYearUtil.isLeapYear(1700));
        assertFalse(DateLeapYearUtil.isLeapYear(1800));
        assertFalse(DateLeapYearUtil.isLeapYear(1900));

    }

    @Test
    public void returnTrueWhenYearDivisibleBy4ButNotBy100() {
        assertTrue(DateLeapYearUtil.isLeapYear(1996));
        assertTrue(DateLeapYearUtil.isLeapYear(2004));
        assertTrue(DateLeapYearUtil.isLeapYear(2008));

    }

    @Test
    public void returnFalseWhenNotDivisibleBy4() {
        assertFalse(DateLeapYearUtil.isLeapYear(2017));
        assertFalse(DateLeapYearUtil.isLeapYear(2018));
        assertFalse(DateLeapYearUtil.isLeapYear(2019));

    }

}