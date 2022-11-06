package Cracking_Code_Book.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class CheckPermutation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter string 1 ");
        String str1 = scan.nextLine();
        System.out.println("enter string 2 ");
        String str2 = scan.nextLine();
        System.out.println(checkPermutation(str1,str2));
    }

    public static boolean checkPermutation (String str1, String str2){
        //check if same size
        if (str1.length()!=str2.length()) return false;
        int arr1[] = new int[256];
        int arr2[] = new int[256];
        //create two arrays
        for (int i = 0; i<str1.length();i++){
            arr1[str1.charAt(i)]++;
            arr2[str1.charAt(i)]++;
        }

        return Arrays.equals(arr1,arr2);
    }

}
