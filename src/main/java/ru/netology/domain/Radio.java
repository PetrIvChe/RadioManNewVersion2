package ru.netology.domain;

public class Radio {
    private int currentVolume;
    private int currentStation;
    private int numberOfRadioStation = 10;

    public Radio() {
    }

    public Radio(int numberOfRadioStation) {
        this.numberOfRadioStation = numberOfRadioStation;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 100) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }

        this.currentVolume = currentVolume;
    }

    public int getCurrentStation() {

        return currentStation;
    }

    public int setCurrentStation(int CurrentStation) {
        if (CurrentStation > numberOfRadioStation - 1) {
            return 0;
        }
        if (CurrentStation < 0) {
            return 9;
        }
        return this.currentStation = CurrentStation;
    }

    //Метод увеличения звука на 1
    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            this.currentVolume = 100;
        }
    }

    //Метод уменьшения звука на 1
    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            this.currentVolume = 0;
        }
    }

    //Метод переключения станции next
//Номер текущей радиостанции изменяется в пределах от 0 до 9
    public void nextStation() {
        if (currentStation < numberOfRadioStation - 1) {
            this.currentStation = currentStation + 1;
        } else {
            this.currentStation = 0;
        }

    }

    //Метод переключения станции prev
//Номер текущей радиостанции изменяется в пределах от 0 до 9
    public void prevStation() {
        if (currentStation > 0) {
            this.currentStation = currentStation - 1;
        } else {
            currentStation = 9;
        }
    }
}


