package com.sonena.practice;

public class Challenge1 {

    //Write a method to reverse a String inplace with Unit tests
    public String inputString;

    public Challenge1(String str1) {
        inputString = str1;
        System.out.println("inputString =" + inputString);
    }
    public boolean isStringReversible() {
        if (inputString == null || inputString.isEmpty()) {
            return false;
        } else
            return true;
    }
    public String reverseTheString() {

        if (true == isStringReversible()) {
            int lenOfString = inputString.length();
            char[] tempArray = inputString.toCharArray();
            int i;
            int j = lenOfString - 1;
            for (i = 0; i < j; i++, j--) {
                char temp = tempArray[i];
                tempArray[i] = tempArray[j];
                tempArray[j] = temp;
            }
            String outputString = new String(tempArray);
            return outputString;
        } else
            return inputString;
    }
}