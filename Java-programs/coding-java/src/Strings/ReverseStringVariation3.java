package Strings;

public class ReverseStringVariation3 {
    public static void main(String[] args) {

        /**
         * Reverse a String but without changign the position of spces.
         * String str = "I am XYZ " //Output: "Z YX maI"
         */

        String str = "I am XYZ ";

        char[] strArr = str.toCharArray();
        int i = 0;
        int j = strArr.length - 1;

        while (i < j) {

            if (i < j && strArr[i] == ' ') {
                i++;
            } else if (i < j && strArr[j] == ' ') {
                j--;
            } else {
                char temp = strArr[i];
                strArr[i] = strArr[j];
                strArr[j] = temp;
                i++;
                j--;
            }

        }

        System.out.println(String.valueOf(strArr));

    }
}
