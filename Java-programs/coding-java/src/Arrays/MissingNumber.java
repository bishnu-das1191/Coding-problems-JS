package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MissingNumber {
    public static void main(String[] args) {

        /**
         * Find the missing number from unsorted array, with given size of array
         *
         * arr[] = {1,3,5,7,9,8,4};
         * int n = 9
         *
         * //output = 2,6
         *
         */

        int[] arr = { 1, 3, 5, 7, 9, 8, 4 };
        int n = 9;
        ArrayList<Integer> al = new ArrayList<>();
        for (int num : arr) {
            al.add(num);
        }

        //convert to List using streams
        // List<Integer> numList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        // System.out.println(numList);

        System.out.println(al); // [1, 3, 5, 7, 9, 8, 4]

        for (int i = 1; i < n; i++) {
            if (!al.contains(i)) {
                System.out.println(i); // 2,6
            }
        }
    }
}
