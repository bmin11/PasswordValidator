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
}
