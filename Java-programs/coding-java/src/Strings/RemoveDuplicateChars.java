package Strings;

import java.util.LinkedHashSet;

public class RemoveDuplicateChars {
    public static void main(String[] args) {
        /**
         * 
         * Write program for Remove duplicate characters from given string in java.
            Input String: "characters"
            Output String: "chartes"
         * 
         */

        String str = "characters";
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<str.length(); i++) {
            if(set.add(str.charAt(i))){
                sb.append(str.charAt(i));
            }
        }

        System.out.println(sb.toString());

    }
}
