package com.sonena;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class ExceptionExampleTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testDivisionByZero() {
        expectedException.expect(ArithmeticException.class);
        expectedException.expectMessage("/ by zero");

        ExceptionExample example = new ExceptionExample();
        example.arithmeticException(10, 0);
    }
}