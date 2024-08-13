package Strings;

public class PrintEachLetterTwice {
    public static void main(String[] args) {
        
        /**
         * 2. Write programs To print each letter twice.
            Original String: hello 
            Output String: hheelllloo
         * 
         * 
         */

        String str = "hello";

        StringBuilder sb = new StringBuilder();
        char[] ch = str.toCharArray();

        for (char c : ch) {
            sb.append(c).append(c); //each character will append twice
        }

        System.out.println(sb.toString()); // hheelllloo



    }
}
