package Arrays;

import java.util.Arrays;

public class AddElementAtLast {

    public static void main(String[] args) {
        
        /**
         * Add an element at the last of array
         * int[] arr = {5, 2, 9, 1, 7};
         * int extra = 20
         * 
         * o/p = {5, 2, 9, 1, 7, 20}
         */

        int[] arr = {5, 2, 9, 1, 7};

        int extra = 20;
        int[] res = new int[arr.length+1];

        for(int i=0; i< res.length; i++){
            if(i == res.length-1){
                res[i] = extra;
            }else{
                res[i] = arr[i];
            }
        }
        System.out.println(Arrays.toString(res));

    }
    

}
