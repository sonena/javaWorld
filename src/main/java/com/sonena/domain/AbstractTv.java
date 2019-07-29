package com.sonena.domain;

public abstract class AbstractTv implements ITelevison {

    protected boolean isTvOn;

    @Override
    public void switchTv() {
        isTvOn = !isTvOn;
    }
}