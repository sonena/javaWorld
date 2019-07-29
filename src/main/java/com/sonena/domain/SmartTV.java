package com.sonena.domain;

public class SmartTV extends AbstractTv {
    int changeVolume;
    int changeChannel;
    int maxVolume = 80;
    int maxAvailableChannels = 250;


    public SmartTV(boolean stateofTV, int chgVolume, int chgChannel) {
        super.isTvOn = stateofTV;
        this.changeVolume = chgVolume;
        this.changeChannel = chgChannel;
    }

    public boolean isSmartTV(boolean checkIsSmartOrNot) {
        if (checkIsSmartOrNot == false)
            return false;
        else
            return true;
    }


    public int decreaseTVVolume(int reduceVolumeLevel) {
        if (changeVolume <= 0) {
            throw new RuntimeException("Can only increase the volume as it is at the min level");
        } else if (changeVolume > reduceVolumeLevel)
            changeVolume -= reduceVolumeLevel;
        else if (changeVolume < reduceVolumeLevel)
            throw new RuntimeException("Cant decrease the volume as it is higher than current");
        return changeVolume;
    }

    public int increaseTVvolume(int increaseInVolume) {
        if (changeVolume <= 0) {
            changeVolume += changeVolume;
        } else if (increaseInVolume > maxVolume)
            throw new RuntimeException("Cant increase  the volume as the max value is 80");
        else if (changeVolume + increaseInVolume > maxVolume)
            throw new RuntimeException("Cant increase  the volume as the max value is 80");
        else if (changeVolume + increaseInVolume < maxVolume)
            changeVolume += increaseInVolume;
        return changeVolume;
    }

    public int increaseChannelNumber(int incrementChannelNum) {
        if (changeChannel >= maxAvailableChannels)
            throw new RuntimeException("Cant change the channel number");
        else if (changeChannel + incrementChannelNum >= maxAvailableChannels)
            throw new RuntimeException("Cant change the channel number");
        else
            changeChannel += incrementChannelNum;
        return changeChannel;

    }

    public int decreaseChannelNumber(int decrementChannelNum) {
        if (decrementChannelNum <= 0)
            throw new RuntimeException("Cant change the channel number");
        else if (changeChannel + decrementChannelNum <= 0)
            throw new RuntimeException("Cant change the channel number");
        else
            changeChannel -= decrementChannelNum;
        return changeChannel;
    }
}
