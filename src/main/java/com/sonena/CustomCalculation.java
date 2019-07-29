package com.sonena;

public class CustomCalculation extends MathOperation {

    public int multiply(int c) {
        return c * c;
    }

    @Override
    protected int areaOfRectangle(int c, int d) {
        return c + d;
    }
}
