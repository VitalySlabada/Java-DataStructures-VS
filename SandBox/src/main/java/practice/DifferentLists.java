package practice;

import java.util.ArrayList;
import java.util.List;

public class DifferentLists {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        list.add(9);


        Car car1 = new Car();
        car1.setIntegerList(list);

        System.out.println( car1.getIntegerList().get(0));

    }
}
