package com.sonena;

import org.junit.Assert;
import org.junit.Test;

public class CustomCalculationTest {

    @Test
    public void testMultiplication(){
        CustomCalculation sqobj = new CustomCalculation();
        int result = sqobj.multiply(10);
        System.out.println("result = " +result);
        Assert.assertEquals(result,100);
    }
    @Test
    public void testOverrideMethod(){
        CustomCalculation sqobj = new CustomCalculation();
        int area = sqobj.areaOfRectangle(10,20);
        System.out.println("area = " + area);
        Assert.assertEquals(area,30);

    }
    @Test
    public void testOverrideMethodBase(){
        MathOperation sqobj = new CustomCalculation();
        int area = sqobj.areaOfRectangle(10,20);
        System.out.println("area = " + area);
        Assert.assertEquals(area,30);

    }

}
