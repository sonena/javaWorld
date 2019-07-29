package com.sonena;

import org.junit.Test;

public class IdentifyPartsTest {

    @Test
    public void testClassAndInstanceVariable() {
        IdentifyParts a = new IdentifyParts();
        IdentifyParts b = new IdentifyParts();
        System.out.println("a.x = " + a.x);
        System.out.println("b.y = " + b.y);
        a.y = 5;
        b.y = 6;
        a.x = 1;
        System.out.println("a.x => " +a.x);
        System.out.println("b.x => " +b.x);
        b.x = 2;
        System.out.println("a.x # " +a.x);
        System.out.println("b.x # " +b.x);
        System.out.println("a.y = " + a.y);
        System.out.println("b.y = " + b.y);
        System.out.println("a.x = " + a.x);
        System.out.println("b.x = " + b.x);
        System.out.println("IdentifyParts.x = " + IdentifyParts.x);
    }
}