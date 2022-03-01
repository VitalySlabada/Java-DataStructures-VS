package twoSum;

import java.util.Arrays;

import static twoSum.TwoSum.*;

public class TwoSumApp {
    public static void main(String[] args) {


        int[] arr = new int[]{1, 4, 2, 23, 12, 15, 7};
        int target = 38;


        //call Brute force
        System.out.println("##################################################");
        System.out.println("brute force approach");
        System.out.println(Arrays.toString(findTwoSumBruteForce(arr, target)));

        System.out.println("##################################################");
        System.out.println("HashMap  approach");
        System.out.println(Arrays.toString(findTwoSumHashMap(arr, target)));

        System.out.println("##################################################");
        System.out.println("Two pointer  approach");
        System.out.println(Arrays.toString(findTwoSumTwoPointer(arr, target)));

    }
}
