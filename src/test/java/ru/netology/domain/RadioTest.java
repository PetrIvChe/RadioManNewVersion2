package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    //Граничные значения -10
    public void shouldReturn1IncreaseVolumeMinus10Test() {
        radio.setCurrentVolume(-10);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    //Граничные значения -1
    public void shouldReturn1IncreaseVolumeMinus1Test() {
        radio.setCurrentVolume(-1);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    //Граничные значения 0
    public void shouldReturn1IncreaseVolume0Test() {
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    //Граничные значения 99
    public void shouldReturn100IncreaseVolume99Test() {
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    //Граничные значения 100
    public void shouldReturn100IncreaseVolume100Test() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    //Граничные значения 101
    public void shouldReturn1IncreaseVolume101Test() {
        radio.setCurrentVolume(101);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    //Эквивалентные значения 50
    public void shouldReturn6IncreaseVolume5Test() {
        radio.setCurrentVolume(50);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 51;
        assertEquals(expected, actual);
    }

    @Test
    //Минимальная громкость меньше миниимальной
    public void shouldReturn0MinVolumeMinus1Test() {
        radio.setCurrentVolume(-1);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    //Граничные значения 0
    public void shouldReturn0DecreaseVolume0Test() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    //Граничные значения 100
    public void shouldReturn99DecreaseVolume100Test() {
        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 99;
        assertEquals(expected, actual);
    }

    @Test
    //Граничные значения 101
    public void shouldReturn0DecreaseVolume101Test() {
        radio.setCurrentVolume(101);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    //Эквивалентные  значения
    public void shouldReturn4DecreaseVolume5Test() {
        radio.setCurrentVolume(50);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 49;
        assertEquals(expected, actual);
    }

    // Тесты станций


    @Test
    public void shouldReturn0WhenSet11InNextStationMethod() {
        int expected = 0;
        radio.setCurrentStation(10);
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldReturn0WhenSetMinus1InNextStationMethod() {

        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    //Следующая станция -11
    public void shouldReturn1NextStationMinus11Test() {
        radio.setCurrentStation(-11);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    //Следующая станция minus 1
    public void shouldReturn1NextStationMinus1Test() {
        radio.setCurrentStation(-1);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    // станция  0
    public void shouldReturn1NextStation0Test() {
        radio.setCurrentStation(0);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    //станция 1
    public void shouldReturn2NextStation1Test() {
        radio.setCurrentStation(1);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    //станция 8
    public void shouldReturn9NextStation8Test() {
        radio.setCurrentStation(8);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    //станция 9
    public void shouldReturn0NextStation9Test() {
        radio.setCurrentStation(9);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }


    @Test
    //станция 10
    public void shouldReturn1NextStation10Test() {
        radio.setCurrentStation(10);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    //станция 11
    public void shouldReturn1NextStation11Test() {
        radio.setCurrentStation(11);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    //станция от 15
    public void shouldReturn1NextStation15Test() {
        radio.setCurrentStation(15);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    //Следующая станция от 5 к 6
    public void shouldReturn6NextStation5Test() {
        radio.setCurrentStation(5);
        radio.nextStation();
        int actual = radio.getCurrentStation();
        int expected = 6;
        assertEquals(expected, actual);
    }


    @Test
    //   11
    public void shouldReturnPrevStation10Test() {
        radio.setCurrentStation(11);
        radio.prevStation();
        int actual = radio.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    //10
    public void shouldReturnPrevStation9Test() {
        radio.setCurrentStation(10);
        radio.prevStation();
        int actual = radio.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    //9
    public void shouldReturnPrevStation8Test() {
        radio.setCurrentStation(9);
        radio.prevStation();
        int actual = radio.getCurrentStation();
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    //5
    public void shouldReturnPrevStation4Test() {
        radio.setCurrentStation(5);
        radio.prevStation();
        int actual = radio.getCurrentStation();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    //Граничные значения 1
    public void shouldReturnPrevStationMinus1Test() {
        radio.setCurrentStation(-1);
        radio.prevStation();
        int actual = radio.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    //0 станция
    public void shouldReturnPrev0StationTest() {
        radio.setCurrentStation(0);
        radio.prevStation();
        int actual = radio.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    //-1
    public void shouldReturnPrev9StationTest() {
        radio.setCurrentStation(-1);
        radio.prevStation();
        int actual = radio.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    //Переход от 4 к 3 станции
    public void shouldReturnPrevMinus11StationTest() {
        radio.setCurrentStation(-11);
        radio.prevStation();
        int actual = radio.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }
}