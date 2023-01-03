package ru.netology.radio;

public class Radio {

    private int amountStation = 10;
    private int maxStationNumber = amountStation - 1;
    private int minStationNumber = 0;
    private int stationNumber = minStationNumber;

    public Radio() {
    }

    public Radio(int size) {
        amountStation = size;
        maxStationNumber = amountStation - 1;
    }

    private int soundVolume;
    private int maxSoundVolume = 100;
    private int minSoundVolume = 0;

    public void setSoundVolume(int newSoundVolume) {
        soundVolume = newSoundVolume;
        return;
    }


    public int getMaxStationNumber() {
        return maxStationNumber;
    }

    public int getStationNumber() {
        return stationNumber;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void IncreaseVolume1p() {
        if (soundVolume < maxSoundVolume) {
            soundVolume = soundVolume + 1;
        }
        if (soundVolume >= maxSoundVolume) {
            return;
        }
    }

    public void ReduceVolume1p() {
        if (soundVolume > minSoundVolume) {
            soundVolume = soundVolume - 1;
        }
    }

    public void setStationNumber(int newStationNumber) {
        if (newStationNumber < minStationNumber) {
            return;
        }
        if (newStationNumber > maxStationNumber) {
            return;
        }
        stationNumber = newStationNumber;
    }

    public void NextStationNumber() {
        if (stationNumber == maxStationNumber) {
            stationNumber = minStationNumber;
        } else stationNumber = stationNumber + 1;
        return;
    }

    public void PrevStationNumber() {
        if (stationNumber == minStationNumber) {
            stationNumber = maxStationNumber;
        } else stationNumber = stationNumber - 1;
        return;
    }
}
