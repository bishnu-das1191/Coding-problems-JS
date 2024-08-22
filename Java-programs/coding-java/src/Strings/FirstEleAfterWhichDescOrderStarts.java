package Strings;

public class FirstEleAfterWhichDescOrderStarts {

    public static void main(String[] args) {
        /**
         * Find the index of Element after which all elements
         *  are sorted in descending order 
         */
        int midx = 0;
        int arr[] = new int[] { 0, 1, 2, 3, 2, 1 };
        for (int i = 0; i < arr.length - 1; i++)
            if (arr[i] > arr[i + 1]) {
                midx = i;
                break;
            }
        System.out.println("The element is at : " + midx); // 3

    }

}