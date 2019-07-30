package com.sonena.practice;


public class ExampleStringOperations {
    private String inputString;

    public String assignNewString(String str1) {
        inputString = str1;
        return inputString;
    }

    public String createNewStrings(String str1) {
        inputString = new String(str1);
        return inputString;
    }

    public String subString(String str1) {
        inputString = str1.substring(5, 10);
        return inputString;
    }

    public int getLenOfString(String str1) {
        int lenOfString = str1.length();
        return lenOfString;
    }

    public int getIndexOf(String str1) {
        int indexNum = str1.indexOf("lovely");
        return indexNum;
    }

    public int getLastIndexOf(String str1) {
        int indexNum = str1.lastIndexOf('y');
        return indexNum;
    }

    public boolean equalityOfTwoStrings(String str1, String str2) {
        if (str1.equalsIgnoreCase(str2)) {
            return true;
        } else
            return false;
    }

    public StringBuilder stringBuilderMethod(String str1) {
        StringBuilder str2 = new StringBuilder(str1);
        str2.reverse();
        return str2;
    }

}