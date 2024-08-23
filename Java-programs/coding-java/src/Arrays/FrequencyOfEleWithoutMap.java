package Arrays;

import java.util.Arrays;

public class FrequencyOfEleWithoutMap {

    public static void main(String[] args) {
    /**
     * Find the frequency of elements without using Arrays.sort and Map methods.
     * 
     */

        int[] arr = {5, 2, 9, 1, 7, 2, 7, 7};

        boolean[] visited = new boolean[arr.length];
        Arrays.fill(visited,false);

        for (int i = 0; i < arr.length; i++) {

            if(visited[i]) continue;

            int count = 1;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] +"->" + count);
        }
    }
    

     
}
