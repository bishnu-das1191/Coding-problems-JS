package Strings;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        /**
         * check given two strings are Anagram or not
         */

        String str1 = "TEA";
        String str2 = "EAT";

        char[] str1Arr = str1.toCharArray();
        char[] str2Arr = str2.toCharArray();

        Arrays.sort(str1Arr);
        Arrays.sort(str2Arr);

        if(Arrays.equals(str1Arr, str2Arr)){
            System.out.println("Its Anagram");
        }else{
            System.out.println("Not an Anagram");
        }
    }
}
