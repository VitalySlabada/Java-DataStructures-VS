package Cracking_Code_Book.Strings;

import java.util.ArrayList;

public class URLify {
    public static void main(String[] args) {
        System.out.println("test case -> " + urlify("test case "));
    }

    public static String urlify(String str){
        StringBuilder strMod = new StringBuilder();

        for (int i = 0 ; i< str.length(); i++){
            if (str.charAt(i) == ' ') {
                strMod.append("%20");
            } else strMod.append(str.charAt(i));
        }
        String answer = strMod.toString();
     return answer;

    }



}
