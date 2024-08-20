package Strings;

public class ReverseStringVariation2 {
    public static void main(String[] args) {
        /**
         * Reverse the String but 2nd last character should not be reversed
         *
         * String str = "independence";
         *
         * //output = enednepednci
         *
         */

        String str = "independence";

        int i = 0;
        int j = str.length() - 1;
        char[] strArr = str.toCharArray();

        while (i < j) {

            if (j != strArr.length - 2) {

                char temp = strArr[i];
                strArr[i] = strArr[j];
                strArr[j] = temp;
                i++;
                j--;
            } else {
                j--;
            }

        }

        System.out.println(String.valueOf(strArr));

    }
}
