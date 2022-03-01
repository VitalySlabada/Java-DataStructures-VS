import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class RandomStuff {


    public static void main(String[] args) {

        int []arr = new int[] {1,2,4,5};
        System.out.println(arr.length);


        ArrayList<ArrayList<Integer>> arr2D= new ArrayList<>();
        ArrayList<Integer> solution = new ArrayList<>();
        solution.add(2);
        solution.add(3);
        solution.add(1);
        Collections.sort(solution);
        ArrayList<Integer> solution2 = new ArrayList<>();
        solution2.add(15);
        solution2.add(9);
        solution2.add(6);
        Collections.sort(solution2);

        arr2D.add(solution);
        arr2D.add(solution2);


        System.out.println(arr2D);








    }
}
