package com.sonena.practice;

import org.junit.Ignore;
import org.junit.Test;

public class ExampleArrayTest {
    @Test
    public void testPrint() {

        ExampleArray array = new ExampleArray();
        int[] nArray = {10, 4, 99, 7, 89, 90};
        array.printElementsInArray(nArray);
    }

    @Test
    public void testPrintArrayElementsinReverse() {
        ExampleArray array = new ExampleArray();
        array.printElementsReverseInArray();
    }

    @Test
    public void testSortArray() {
        ExampleArray array = new ExampleArray();
        array.printSortedArray();

    }
}