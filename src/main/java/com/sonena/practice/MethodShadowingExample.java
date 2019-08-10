package com.sonena.practice;

public class MethodShadowingExample {


    public int performArthimeticOperation(int i, int j) {

        return i + j;

    }
    public static void printMessage(){

        System.out.println("In base class static function");
    }


}
