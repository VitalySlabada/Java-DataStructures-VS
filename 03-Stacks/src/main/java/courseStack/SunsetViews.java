package courseStack;

import java.util.ArrayList;

public class SunsetViews {
    public static void main(String[] args) {
        int[] buildings = {3, 5, 4, 4, 3, 1, 3, 2};
//        sunsetViews(buildings, "east").forEach(System.out::println);

        System.out.println(sunsetViews(buildings, "west"));
    }

    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction) {
        ArrayList<Integer> result = new ArrayList<>();
        MyStack<Integer> myStack = new MyStack<>();
        int limit = 0;
        //Left direction
        if (direction.equalsIgnoreCase("left") || direction.equalsIgnoreCase("west")) {
            for (int i = 0; i < buildings.length; i++) {
                int height = buildings[i];
                if (height > limit) {
                    result.add(i);
                    limit = height;
                }
            }
            return result;
        }

        //for Right direction
        else {
            for (int i = buildings.length - 1; i >= 0; i--){
                int height = buildings[i];
                if (height > limit) {
                    myStack.push(i);
                    limit = height;
                }
            }
            while(myStack.size()>0){
                result.add(myStack.pop());
            }
            return result;
        }



    }
}
