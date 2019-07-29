package com.sonena;

import org.junit.Assert;
import org.junit.Test;

public class MathOperationTest {
    @Test
    public void testValidSquareOfTwoNums(){
        MathOperation addObj = new MathOperation();
        int area = addObj.square(20);
        Assert.assertEquals(area,400);
    }
    /*
    @Test@Ignore
    public void testAccessToInstanceVariable(){
        Addition addObj = new Addition();
        //addObj.b = 40;
    }
    @Test@Ignore
    public void testAccessToMethod(){
        Addition addObj = new Addition();
        int result =  addObj.area(10,20);
        System.out.println("result = " + result);
    }
*/
}
