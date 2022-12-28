package ru.netology.radio;

public class Radio {
    private int stationNumber;
    private int soundVolume;

    public int getStationNumber() {
        return stationNumber;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void IncreaseVolume1p() {
        if (soundVolume < 10) {
            soundVolume = soundVolume + 1;
        }
        if (soundVolume >= 10) {
            return;
        }
    }

    public void ReduceVolume1p() {
        if (soundVolume > 0) {
            soundVolume = soundVolume - 1;
        }
    }

    public void setStationNumber(int newStationNumber) {
        if (newStationNumber < 0) {
            return;
        }
        if (newStationNumber > 9) {
            return;
        }
        stationNumber = newStationNumber;
    }

    public void NextStationNumber() {
        if (stationNumber == 9) {
            stationNumber = 0;
        } else stationNumber = stationNumber + 1;
        return;
    }

    public void PrevStationNumber() {
        if (stationNumber == 0) {
            stationNumber = 9;
        } else stationNumber = stationNumber - 1;
        return;
    }
}
