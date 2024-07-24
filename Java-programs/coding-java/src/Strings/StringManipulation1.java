package Strings;
import java.util.*;
import java.lang.*;
import java.io.*;

public class StringManipulation1
{
    //convert the input String "hello$world"; to Output: 0.1.2.2.3.$.4.3.5.2.6
     public static void main(String[] args) {
        
        String input = "hello$world"; // Output: 0.1.2.2.3.$.4.3.5.2.6
         
        Map<Character, Integer> charToIndex = new HashMap<>();
        int index = 0;
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (c == '$') {
                result.append("$.");
            } else {
                if (!charToIndex.containsKey(c)) {
                    charToIndex.put(c, index++);
                }
                result.append(charToIndex.get(c)).append(".");
            }
        }

        // Remove the trailing dot
        System.out.println(result.substring(0, result.length() - 1));
    }

}