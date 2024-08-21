package Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        /**
         * Find the 2nd largest element from array
         * int[] arr = {0, 1, 0, 3, 12};  // o/p = 3
         */

        int[] arr = {0, 1, 0, 3, 12};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){

            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }

        System.out.println(largest);
        System.out.println(secondLargest);


    }
}
