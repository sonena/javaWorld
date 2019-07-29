package com.sonena;

import org.junit.Test;

public class NumberHolderTest {

    @Test
    public void testDisplayTwoNumbers() {
        NumberHolder holder = new NumberHolder(10, 10.0201f);
        holder.NumberHolderDisplay();
        NumberHolder numberHolder = new NumberHolder();
        numberHolder.aint = 100;
        numberHolder.afloat = 2000.00f;
        System.out.println("aint ==" + numberHolder.aint);
        System.out.println("afloat ==" + numberHolder.afloat);
    }
}
