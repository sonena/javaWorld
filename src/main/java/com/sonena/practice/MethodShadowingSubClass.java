package com.sonena.practice;

public class MethodShadowingSubClass  extends  MethodShadowingExample{



    @Override
    public int performArthimeticOperation(int x, int y) {
        final int i = x - y;
        return i;
    }


    public static  void printMessage(){
        System.out.println("In Subclass print Message");
    }
}
