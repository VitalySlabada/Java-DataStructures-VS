package threeSum;

import java.util.*;

public class ThreeSum {

    //brute force
    public static ArrayList<ArrayList<Integer>> findThreeSumBruteForce(int[] arr, int target) {

        int counter = 0;
        // arr2D will hold all the solutions, since we don't know how many are there ->
        // -> its best to use Dynamic array which hold set of answers -> another array.

        Arrays.sort(arr);  // sorting n*log(n)

        ArrayList<ArrayList<Integer>> arr2D = new ArrayList<>();

        // triple loop -> n^3
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    counter++;
                    if ((arr[i] + arr[j] + arr[k]) == target) {

                        // if a solution is found we have to create an ArrayList
                        ArrayList<Integer> solution = new ArrayList<>();
                        solution.add(arr[i]);
                        solution.add(arr[j]);
                        solution.add(arr[k]);
                        //add to solution
                        arr2D.add(solution);
                    }
                }
            }
        }
        System.out.println("counter = " + counter);
        return arr2D;
    }




    public static ArrayList<ArrayList<Integer>> findThreeSumForPlusMap(int[] arr, int target) {

        // sorting the initial array O(n*log(n)) needed so that results are sorted
        Arrays.sort(arr);

        //Array to hold results arrays
        ArrayList<ArrayList<Integer>> arr2D = new ArrayList<>();

        //create hash map to be used in the loop later
        HashMap<Integer, Integer> map = new HashMap<>();
        int counter = 0 ;

        //populate hash map
        for (int k = 0; k < arr.length; k++) map.put(arr[k], k);

        // loop in a loop -> O(n^2)
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                //Calculate target to be found in HashMap
                int match = target - arr[i] - arr[j];

                //solution found and conditions to avoid repetitive combos
                if (map.containsKey(match) && (map.get(match) > i) && (map.get(match) > j)) {

                    //put values into an array: "solution"
                    ArrayList<Integer> solution  = new ArrayList<>();
                    solution.add(arr[i]);
                    solution.add(arr[j]);
                    solution.add(match);

                    //add solution array to arr2D array
                    arr2D.add(solution);
                }
            }
        }
        return  arr2D;
    }
}
