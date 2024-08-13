package Strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringCompression {
    public static void main(String[] args) {
        
        /**
         * String Compression:
            String input = "aabcccccaaa";
            // Output: a2b1c5a3
         * 
         * 
         */

         String str = "aabcccccaaa";  // Output: "a2b1c5a3"

        String result = "";
        int count =1;

        for (int i = 0; i < str.length(); i++) {
            
            if(i+1 < str.length() && str.charAt(i) == str.charAt(i+1)){
                count ++;
            }else{
                result += str.charAt(i);
                result += count;
                count = 1;
            }
        }

        result = result.length() < str.length() ? result : str;
        System.out.println(result); //a2b1c5a3

    }
}
