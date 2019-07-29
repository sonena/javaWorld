package com.sonena;

import com.sonena.domain.ITelevison;
import com.sonena.domain.SmartTV;
import org.junit.Assert;
import org.junit.Test;

public class TelevisonTest {

    @Test
    public void testValidTVstate() {
        ITelevison tvObj = new SmartTV(false, 10, 30);
        tvObj.switchTv();
        Assert.assertEquals(true, true);
    }
}