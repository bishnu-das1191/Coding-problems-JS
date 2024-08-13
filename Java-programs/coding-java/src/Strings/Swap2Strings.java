package Strings;

public class Swap2Strings {
    public static void main(String[] args) {
        /**
         * Write a program to Swap two strings without using 3rd variable.
            Input:
            Original str1: Hello
            Original str2: World

            Output:
            Swapped str1: World
            Swapped str2: Hello
         * 
         */

        String str1 = "Hello";
        String str2 = "World";

        System.out.println("Original str1: " + str1);
        System.out.println("Original str2: " + str2);

        // Swap strings without using a third variable
        str1 = str1 + str2; // HelloWorld
        str2 = str1.substring(0, str1.length() - str2.length()); // Hello
        str1 = str1.substring(str2.length());  // World

        System.out.println("Swappedstr1: " + str1); // World
        System.out.println("Swapped str2: " + str2); // Hello
    }
}
