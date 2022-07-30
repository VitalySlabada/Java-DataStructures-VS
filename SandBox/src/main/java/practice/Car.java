package practice;

import java.util.List;

public class Car {
    int gear;
    List<Integer> integerList;

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public List<Integer> getIntegerList() {
        return integerList;
    }

    public void setIntegerList(List<Integer> integerList) {
        this.integerList = integerList;
    }

    public Car() {
    }

    public Car(int gear, List<Integer> integerList) {
        this.gear = gear;
        this.integerList = integerList;
    }
}
