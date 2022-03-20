package myQueue;

import java.util.HashMap;
import java.util.Map;

public class FindFirstRepeatingCharacter {


    public static void main(String[] args) {
        String input = "a green apple";

        System.out.println(findFirstRepeatingCharachter(input));


    }

    private static char findFirstRepeatingCharachter(String str) {
        Map<Character,Integer> map = new HashMap<>();

        int count = 0;
        char[] chars = str.toCharArray();

        for(Character ch:chars){
            if (map.containsKey(ch)){

                count = map.get(ch);
                map.put(ch, count+1);

            }else{
                map.put(ch,1);

            }


        }

        for (Character ch1: chars){
            if (map.get(ch1)>1) return ch1;


        }

        return Character.MIN_VALUE;

    }

}
