package Arrays;

import java.util.Arrays;

public class PrintRepeatedEleWithoutMap {
    public static void main(String[] args) {
        /**
         * Print the elements which are repeated in given array
         * Without using Arrays Sort and Map
         */

        int[] arr = {5, 2, 9, 1, 7, 2, 2, 7, 7, 7, 7};
        
        boolean[] visited = new boolean[arr.length];
        Arrays.fill(visited, false);

        for(int i=0; i<arr.length; i++){

            if(visited[i]) continue;

            int count = 1;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i] == arr[j]){
                    visited[j] = true;
                    count ++;
                }
            }
            
            if(count > 1) System.out.println(arr[i]);
        }
    }
}
