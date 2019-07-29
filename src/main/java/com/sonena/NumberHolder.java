package com.sonena;

public class NumberHolder {

    public int aint;
    public float afloat;

    public NumberHolder() {
    }

    public NumberHolder(int j, float f) {
        aint = j;
        afloat = f;
    }

    public void NumberHolderDisplay() {
        System.out.println(" numbers are " + aint + ", afloat = " + afloat);
    }
}
