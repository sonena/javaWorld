package com.sonena;

import org.junit.Assert;
import org.junit.Test;

public class ComparisionTest {

    @Test
    public void testComparisionTwoNum() {
        Comparision comp = new Comparision();

        boolean b = comp.compareTwoNum(3, 4);
        System.out.println(b);
        Assert.assertNotEquals(b, true);

    }
}
