package com.sonena.practice;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SwitchStExampleTest {

    private SwitchStExample switchCase;

    @Before
    public void init() {
        switchCase = new SwitchStExample();
    }

    @Test
    public void testSwitchStatement(){
        String dayOfTheWeek = switchCase.dayOfTheWeek(5);
        Assert.assertEquals(dayOfTheWeek ,"Friday");
    }

    @Test
    public void testDefaultSwitchStatement(){
        String dayOfTheWeek = switchCase.dayOfTheWeek(9);
        Assert.assertEquals(dayOfTheWeek ,"Invalid Day");
    }
}
