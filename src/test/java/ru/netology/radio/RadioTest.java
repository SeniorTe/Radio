package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStationNumberBeforeMinLimit() {
        Radio radio = new Radio();

        radio.setStationNumber(-1);

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNumberAfterMinLimit() {
        Radio radio = new Radio();

        radio.setStationNumber(1);

        int expected = 1;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNumberBetweenLimit() {
        Radio radio = new Radio();

        radio.setStationNumber(5);

        int expected = 5;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNumberBeforeMaxLimit() {
        Radio radio = new Radio();

        radio.setStationNumber(8);

        int expected = 8;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNumberMaxLimit() {
        Radio radio = new Radio();

        radio.setStationNumber(9);

        int expected = 9;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNumberAfterMaxLimit() {
        Radio radio = new Radio();

        radio.setStationNumber(10);

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNumberBeyondMaxLimit() {
        Radio radio = new Radio();

        radio.setStationNumber(25);

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStationNumber1p() {
        Radio radio = new Radio();

        radio.NextStationNumber();

        int expected = 1;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceStationNumber1p() {
        Radio radio = new Radio();

        radio.NextStationNumber();
        radio.NextStationNumber();
        radio.PrevStationNumber();

        int expected = 1;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStationNumber1pMaxLimit() {
        Radio radio = new Radio();

        radio.NextStationNumber();
        radio.NextStationNumber();
        radio.NextStationNumber();
        radio.NextStationNumber();
        radio.NextStationNumber();
        radio.NextStationNumber();
        radio.NextStationNumber();
        radio.NextStationNumber();
        radio.NextStationNumber();
        radio.NextStationNumber();

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceStationNumber1pMinLimit() {
        Radio radio = new Radio();

        radio.PrevStationNumber();

        int expected = 9;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume1p() {
        Radio radio = new Radio();

        radio.IncreaseVolume1p();

        int expected = 1;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAbutMaxLimitVolume() {
        Radio radio = new Radio();

        radio.setSoundVolume(98);

        radio.IncreaseVolume1p();
        radio.IncreaseVolume1p();
        radio.IncreaseVolume1p();


        int expected = 100;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAbutMinLimitVolume() {
        Radio radio = new Radio();

        radio.ReduceVolume1p();
        radio.ReduceVolume1p();
        radio.ReduceVolume1p();

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolume1p() {
        Radio radio = new Radio();

        radio.IncreaseVolume1p();
        radio.IncreaseVolume1p();
        radio.IncreaseVolume1p();
        radio.ReduceVolume1p();

        int expected = 2;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test() {
        Radio radio = new Radio(25);

        radio.setStationNumber(50);

        Assertions.assertEquals(0, radio.getStationNumber());

        Assertions.assertEquals(24, radio.getMaxStationNumber());
    }
}
