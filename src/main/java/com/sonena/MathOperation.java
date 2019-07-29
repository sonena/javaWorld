package com.sonena;

public class MathOperation {
    private int a = 10;
    private int b = 20;
    protected int c = 30;
    protected int d = 40;

    private int sum(int a, int b) {
        return a + b;
    }

    public int square(int b) {
        System.out.println("b = " + b);
        return b * b;
    }

    protected int areaOfRectangle(int c, int d) {
        return c * d;
    }
}

