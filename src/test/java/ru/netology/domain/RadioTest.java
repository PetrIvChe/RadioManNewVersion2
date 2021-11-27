package ru.netology.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

        @Test
    //Граничные значения -10
    public void shouldReturn1IncreaseVolumeMinus10Test() {
        Radio currentV = new Radio();
        currentV.setCurrentVolume(-10);
        currentV.increaseVolume();
        int actual = currentV.getCurrentVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    //Граничные значения -1
    public void shouldReturn1IncreaseVolumeMinus1Test() {
        Radio currentV = new Radio();
        currentV.setCurrentVolume(-1);
        currentV.increaseVolume();
        int actual = currentV.getCurrentVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    //Граничные значения 0
    public void shouldReturn1IncreaseVolume0Test() {
        Radio currentV = new Radio();
        currentV.setCurrentVolume(0);
        currentV.increaseVolume();
        int actual = currentV.getCurrentVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    //Граничные значения 9
    public void shouldReturn10IncreaseVolume9Test() {
        Radio currentV = new Radio();
        currentV.setCurrentVolume(9);
        currentV.increaseVolume();
        int actual = currentV.getCurrentVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    //Граничные значения 10
    public void shouldReturn10IncreaseVolume10Test() {
        Radio currentV = new Radio();
        currentV.setCurrentVolume(10);
        currentV.increaseVolume();
        int actual = currentV.getCurrentVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    //Граничные значения 11
    public void shouldReturn1IncreaseVolume11Test() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-11);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    //Эквивалентные значения 5
    public void shouldReturn6IncreaseVolume5Test() {
        Radio currentV = new Radio();
        currentV.setCurrentVolume(5);
        currentV.increaseVolume();
        int actual = currentV.getCurrentVolume();
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    //Минимальная громкость меньше миниимальной
    public void shouldReturn0MinVolumeMinus1Test() {
        Radio currentV = new Radio();
        currentV.setCurrentVolume(-1);
        currentV.decreaseVolume();
        int actual = currentV.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    //Граничные значения 0
    public void shouldReturn0DecreaseVolume0Test() {
        Radio currentV = new Radio();
        currentV.setCurrentVolume(0);
        currentV.decreaseVolume();
        int actual = currentV.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    //Граничные значения 10
    public void shouldReturn9DecreaseVolume10Test() {
        Radio currentV = new Radio();
        currentV.setCurrentVolume(10);
        currentV.decreaseVolume();
        int actual = currentV.getCurrentVolume();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    //Граничные значения 11
    public void shouldReturn0DecreaseVolume11Test() {
        Radio currentV = new Radio();
        currentV.setCurrentVolume(11);
        currentV.decreaseVolume();
        int actual = currentV.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    //Эквивалентные  значения
    public void shouldReturn4DecreaseVolume5Test() {
        Radio currentV = new Radio();
        currentV.setCurrentVolume(5);
        currentV.decreaseVolume();
        int actual = currentV.getCurrentVolume();
        int expected = 4;
        assertEquals(expected, actual);
    }

    // Тесты станций



    @Test
    public void shouldReturn0WhenSet11InNextStationMethod() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setCurrentStation(10);
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldReturn0WhenSetMinus1InNextStationMethod() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setCurrentStation(-1);
        assertEquals(expected, radio.getCurrentStation());
    }
    @Test
    //Следующая станция -11
    public void shouldReturn1NextStationMinus11Test() {
        Radio currentS = new Radio();
        currentS.setCurrentStation(-11);
        currentS.nextStation();
        int actual = currentS.getCurrentStation();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    //Следующая станция minus 1
    public void shouldReturn1NextStationMinus1Test() {
        Radio currentS = new Radio();
        currentS.setCurrentStation(-1);
        currentS.nextStation();
        int actual = currentS.getCurrentStation();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    // станция  0
    public void shouldReturn1NextStation0Test() {
        Radio currentS = new Radio();
        currentS.setCurrentStation(0);
        currentS.nextStation();
        int actual = currentS.getCurrentStation();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    //станция 1
    public void shouldReturn2NextStation1Test() {
        Radio currentS = new Radio();
        currentS.setCurrentStation(1);
        currentS.nextStation();
        int actual = currentS.getCurrentStation();
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    //станция 8
    public void shouldReturn9NextStation8Test() {
        Radio currentS = new Radio();
        currentS.setCurrentStation(8);
        currentS.nextStation();
        int actual = currentS.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    //станция 9
    public void shouldReturn0NextStation9Test() {
        Radio currentS = new Radio();
        currentS.setCurrentStation(9);
        currentS.nextStation();
        int actual = currentS.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }


    @Test
    //станция 10
    public void shouldReturn1NextStation10Test() {
        Radio currentS = new Radio();
        currentS.setCurrentStation(10);
        currentS.nextStation();
        int actual = currentS.getCurrentStation();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    //станция 11
    public void shouldReturn1NextStation11Test() {
        Radio currentS = new Radio();
        currentS.setCurrentStation(11);
        currentS.nextStation();
        int actual = currentS.getCurrentStation();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    //станция от 15
    public void shouldReturn1NextStation15Test() {
        Radio currentS = new Radio();
        currentS.setCurrentStation(15);
        currentS.nextStation();
        int actual = currentS.getCurrentStation();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    //Следующая станция от 5 к 6
    public void shouldReturn6NextStation5Test() {
        Radio currentS = new Radio();
        currentS.setCurrentStation(5);
        currentS.nextStation();
        int actual = currentS.getCurrentStation();
        int expected = 6;
        assertEquals(expected, actual);
    }


    @Test
    //   11
    public void shouldReturnPrevStation10Test() {
        Radio currentS = new Radio();
        currentS.setCurrentStation(11);
        currentS.prevStation();
        int actual = currentS.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    //10
    public void shouldReturnPrevStation9Test() {
        Radio currentS = new Radio();
        currentS.setCurrentStation(10);
        currentS.prevStation();
        int actual = currentS.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    //9
    public void shouldReturnPrevStation8Test() {
        Radio currentS = new Radio();
        currentS.setCurrentStation(9);
        currentS.prevStation();
        int actual = currentS.getCurrentStation();
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    //5
    public void shouldReturnPrevStation4Test() {
        Radio currentS = new Radio();
        currentS.setCurrentStation(5);
        currentS.prevStation();
        int actual = currentS.getCurrentStation();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    //Граничные значения 1
    public void shouldReturnPrevStationMinus1Test() {
        Radio currentS = new Radio();
        currentS.setCurrentStation(-1);
        currentS.prevStation();
        int actual = currentS.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    //0 станция
    public void shouldReturnPrev0StationTest() {
        Radio currentS = new Radio();
        currentS.setCurrentStation(0);
        currentS.prevStation();
        int actual = currentS.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    //-1
    public void shouldReturnPrev9StationTest() {
        Radio currentS = new Radio();
        currentS.setCurrentStation(-1);
        currentS.prevStation();
        int actual = currentS.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    //Переход от 4 к 3 станции
    public void shouldReturnPrevMinus11StationTest() {
        Radio currentS = new Radio();
        currentS.setCurrentStation(-11);
        currentS.prevStation();
        int actual = currentS.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }




}