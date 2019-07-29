package com.sonena.domain;

public interface ITelevison {

    void switchTv();

    int decreaseTVVolume(int reduceVolumeLevel);

    int increaseTVvolume(int increaseInVolume);

    int increaseChannelNumber(int incrementChannelNum);

    int decreaseChannelNumber(int decrementChannelNum);
}
