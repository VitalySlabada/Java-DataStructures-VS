package threeSum;

import java.util.Arrays;

import static threeSum.ThreeSum.*;

public class app {
    public static void main(String[] args) {

        int[] arr = new int[]{12, 3, 1, 2, -6, 5, -8, 6};
        int target = 0;


        //call Brute force
        System.out.println("##################################################");
        System.out.println("brute force approach");
        System.out.println(findThreeSumBruteForce(arr, target));

        System.out.println("##################################################");
        System.out.println("for loop and hash map");
        System.out.println(findThreeSumForPlusMap(arr, target));



    }


}
