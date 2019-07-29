package com.sonena;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class BoxingTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testConvertToInteger() {
        Boxing boxing = new Boxing();
        int input = 3;
        Integer output = boxing.convertToInteger(input);
        System.out.println("int " +output);
        Assert.assertEquals(output.intValue(), input);
    }
}
