package SpiralArray;


import java.util.Arrays;

import static SpiralArray.SolveSpiral.*;
public class app {
    public static void main(String[] args) {
        int[][] array =   {{1, 2, 3, 4}, {12, 13, 14, 5}, {11, 16, 15, 6}, {10, 9, 8, 7}};

        System.out.println(Arrays.toString(solveSpiralForloops(array)));

    }
}
