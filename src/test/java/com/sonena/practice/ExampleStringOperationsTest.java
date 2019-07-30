package com.sonena.practice;

import org.junit.Before;
import org.junit.Test;

public class ExampleStringOperationsTest {

    private ExampleStringOperations example;

    @Before
    public void init() {
        example = new ExampleStringOperations();
    }

    @Test
    public void testStringAssignment() {
        String astring = example.assignNewString("Sonena");
        System.out.println("outputString = " + astring);
        String newString = example.createNewStrings("HAPPY");
        System.out.println("newString = " + newString);
        String cString = example.subString("Are you reaching home quickly");
        System.out.println("cstring = " + cString);
        int lenString = example.getLenOfString("Elephant");
        System.out.println("lenString = " + lenString);
        int indexNum = example.getIndexOf(" what a lovely day");
        System.out.println("indexNum = " + indexNum);
        int lastIndexNum = example.getLastIndexOf(" what a lovely day");
        System.out.println("lastIndexNum = " + lastIndexNum);
    }

    @Test
    public void testCompareTwoStrings() {
        ExampleStringOperations example = new ExampleStringOperations();
        boolean result = example.equalityOfTwoStrings("Sonena", "SOneNA");
        System.out.println("result = " + result);

        StringBuilder string = example.stringBuilderMethod("PALINDROME");
        System.out.println("stringBuilderMethod :: " + string);
    }
}

