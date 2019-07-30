package com.sonena.practice;

import java.util.Arrays;

public class ExampleArray {

    public static int[] numArray;

    public void printElementsInArray(int[] nArray) {
        numArray = new int[(nArray.length)];
        numArray = Arrays.copyOf(nArray, nArray.length);

        for (int i = 0; i < numArray.length; i++) {
            System.out.println("Elements in the Array  = " + i + "=" + numArray[i]);
        }
    }

    public void printElementsReverseInArray() {
        for (int i = numArray.length - 1; i > 0; --i) {
            System.out.println("Elements in the Array  = " + i + "=" + numArray[i]);
        }
    }

    public void printSortedArray() {
        Arrays.sort(numArray);
        System.out.println("Elements in the Sorted  Array  = " + Arrays.toString(numArray));
    }
}
