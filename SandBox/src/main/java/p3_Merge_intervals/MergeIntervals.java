package p3_Merge_intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {


    public static List<Integer[]> solveMI(List<Integer[]> listOfArr){
        List<Integer[]> result = new ArrayList<>();
        for (int i= 0; i <listOfArr.size();i++) {
            Integer[] resultArr = {listOfArr.get(i)[0], findEnd(listOfArr, i)};

            result.add(resultArr);
        }
        return result;
    }
    public static int findEnd(List<Integer[]> loa, int i){
        Integer end = loa.get(i)[1];
        if (i<loa.size()-1)  {
            if (loa.get(i+1)[0]<end){
                end =   findEnd(loa,i+1);
                i++;
            }
            return end;
        }else return end;
    }

    public static void main(String[] args) {
        ArrayList<Integer[]> loa = new ArrayList<>();
        loa.add(new Integer[]{1, 2});
        loa.add(new Integer[]{3, 5});
        loa.add(new Integer[]{4, 7});
        loa.add(new Integer[]{6, 8});
        loa.add(new Integer[]{9, 10});

        List<Integer[]> result = solveMI(loa);
        System.out.println("done");

    }
}

