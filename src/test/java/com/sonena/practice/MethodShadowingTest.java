package com.sonena.practice;

import static org.junit.Assert.*;
import org.junit.Test;

public class MethodShadowingTest {

    @Test
    public void testValidArithmeticOpertaion()
    {
        MethodShadowingExample methodExp = new MethodShadowingSubClass();
        int difference = methodExp.performArthimeticOperation(20,10);
        System.out.println("difference  = " + difference);
        assertEquals(10,difference);
}

    @Test
    public void testShadowing()
    {
        MethodShadowingExample methodExp = new MethodShadowingSubClass();
        methodExp.printMessage();
        MethodShadowingSubClass methodExpSub = new MethodShadowingSubClass();
        methodExpSub.printMessage();
    }
}
