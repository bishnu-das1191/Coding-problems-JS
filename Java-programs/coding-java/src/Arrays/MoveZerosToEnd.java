package Arrays;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        /**
         * Move all zeros to the end of the array
         */

        //To move zeroes to the end of an array, we can use the two-pointer technique.
        int[] arr = {0, 1, 0, 3, 12};

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                arr[index] = arr[i];    //copy all the non-zeros and put in from index                
                index++;                //0 to arr.length using index pointer.
            }
        }

        System.out.println(Arrays.toString(arr)); //[1, 3, 12, 3, 12]
        System.out.println(index);  //3

        while(index < arr.length){
            arr[index] = 0;
            index++;
        }

        System.out.println(Arrays.toString(arr));  //[1, 3, 12, 0, 0]


    }
}
