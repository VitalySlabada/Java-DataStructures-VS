package twoSum;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    //Brute Force
// O(n^2)
    public static int[] findTwoSumBruteForce(int[] arr, int target) {
        for (int i = 0; i <= arr.length - 2; i++) {      // -> n
            for (int j = i + 1; j <= arr.length - 1; j++) {       //-> n
                if ((arr[i] + arr[j]) == target) return new int[]{i, j};
            }
        }
        //return in nothing found
        return new int[]{};
    }


//HashMap
//O(n*log(n))

    public static int[] findTwoSumHashMap(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        //first pass to assign values:
        for (int i = 0; i < arr.length; i++) map.put(arr[i], i);
        //second pass to find pair
        for (int i = 0; i < arr.length - 1; i++) {
            if (map.containsKey(target - arr[i])) {
                return new int[]{i, map.get(target - arr[i])};
            }
        }
        return new int[]{};
    }


    public static int[] findTwoSumTwoPointer(int[] array, int target) {
        int i = 0;
        int j = array.length - 1;
        int sum;
        int[] arrCopy = array.clone();
        Arrays.sort(array); //n
        while (i != j) {
            sum = array[i] + array[j];

            if (sum == target) {
                int i2 = 0;
                int j2 = 0;
                //iterate original copy of an array to find the original indices
                for (int k = 0; k < arrCopy.length; k++) {
                    if (arrCopy[k] == array[i]) i2 = k;
                    if (arrCopy[k] == array[j]) j2 = k;
                }
                return new int[]{i2, j2};
            }

            else if (sum < target) i++;
            else j--;
        }
        return new int[]{};
    }
}
