package com.sonena.practice;

import org.junit.Assert;
import org.junit.Test;

public class Challenge1Test {
    @Test
    public void testStringReversal() {
        Challenge1 strRev = new Challenge1("I am Happy");
        String outputString = strRev.reverseTheString();
        System.out.println("output String = " + outputString);
        Assert.assertEquals(outputString, "yppaH ma I");
    }

    @Test
    public void testInvalidEmptyStringReversal() {
        Challenge1 strRev = new Challenge1("");
        String outputString = strRev.reverseTheString();
        System.out.println("output String = " + outputString);
        Assert.assertEquals(outputString, "");
    }

    @Test
    public void testvalidEmptyStringReversal() {
        Challenge1 strRev = new Challenge1("212345gdhgg");
        String outputString = strRev.reverseTheString();
        System.out.println("output String = " + outputString);
        Assert.assertEquals(outputString, "gghdg543212");
    }

}