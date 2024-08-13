package Arrays;

import java.util.HashSet;

public class SumOfDistinctElements {
    
    public static void main(String[] args) {

        /*
         * 1. Write function  in java for find out sum of distinct elements of array
            Input : {5,1,8,4,9,1,5}
            Output: 27
         */

         int[] arr = {5,1,8,4,9,1,5};
         int result = 0;
         HashSet<Integer> set = new HashSet<>();
         for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
         }
         System.out.println(set);  // [1, 4, 5, 8, 9]

         for (Integer num : set) {
            result += num;
         }
         System.out.println(result); //27
    }
}
