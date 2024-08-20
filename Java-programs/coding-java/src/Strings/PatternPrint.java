package Strings;

public class PatternPrint {
    public static void main(String[] args) {
        // print below pattern

        /**
         * J
         * JA
         * JAV
         * JAVA
         */

        String str = "JAVA";

        for (int i = str.length(); i > 0; i--) {
            System.out.println(str.substring(0, str.length() - i + 1));
        }

        System.out.println("=========================================");

        // print below pattern

        /**
         * JAVA
         * JAV
         * JA
         * J
         */

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.substring(0, str.length() - i));
        }

    }

}
