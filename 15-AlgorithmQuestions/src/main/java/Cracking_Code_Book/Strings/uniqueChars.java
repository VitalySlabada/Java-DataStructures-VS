package Cracking_Code_Book.Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class uniqueChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter string");
        String str = scan.nextLine();
        System.out.println("unique? ->" + isUnique(str));


    }
    public static boolean isUnique (String str){
        //make a char array
        char[] arr = str.toCharArray();
        //make a hashMap
        HashSet<Character> set = new HashSet<>();
        //iterate an arr
        for (char each: arr ){
            //check if char already exist
            if (set.contains(each)) return false;
            set.add(each);
        }
        return true;
   }
}
