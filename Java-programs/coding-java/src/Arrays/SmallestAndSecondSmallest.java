package Arrays;

public class SmallestAndSecondSmallest {
    public static void main(String[] args) {
        /**
         * Find the smallest and 2nd smallest number from given array
         * 
         */

        // int[] arr = {5, 2, 9, 1, 7};

        int[] arr = {2, 2, 2};

        int secondSmallest = Integer.MAX_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){

            if(arr[i] < smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] != smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }

        System.out.println("Smallest : "+smallest); // 1
        System.out.println("2nd Smallest : "+secondSmallest); // 2
    }
}
