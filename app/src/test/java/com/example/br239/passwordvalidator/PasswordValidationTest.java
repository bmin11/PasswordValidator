package com.example.br239.passwordvalidator;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by br239 on 2018-02-08.
 */

public class PasswordValidationTest {
    @Test
    public void stringComparisonTest() throws Exception {
        assertEquals(true, MainActivity.testForPasswordString("ranwfpwepf"));
    }

    @Test
    public void stringComparisonTest2() throws Exception {
        assertEquals(false, MainActivity.testForPasswordString("password"));
    }

    @Test
    public void lengthTest() throws Exception {
        assertEquals(true, MainActivity.testForLength("averylongpassword"));
    }

    @Test
    public void lengthTest2() throws Exception {
        assertEquals(false, MainActivity.testForLength("notlong"));
    }

    @Test
    public void blankSpaceTest() throws Exception {
        assertEquals(true, MainActivity.testForBlankSpace("noblankspace"));
    }

    @Test
    public void blankSpaceTest2() throws Exception {
        assertEquals(false, MainActivity.testForBlankSpace("some blank spaces"));
    }

    @Test
    public void uppercaseTest() throws Exception {
        assertEquals(true, MainActivity.testForUppercase("ItHasSomeUppercases"));
    }

    @Test
    public void uppercaseTest2() throws Exception {
        assertEquals(false, MainActivity.testForUppercase("nouppercases"));
    }

    @Test
    public void lowercaseTest() throws Exception {
        assertEquals(true, MainActivity.testForLowercase("ItHasSomeLowercases"));
    }

    @Test
    public void lowercaseTest2() throws Exception {
        assertEquals(false, MainActivity.testForLowercase("ALLCAPS"));
    }
}
