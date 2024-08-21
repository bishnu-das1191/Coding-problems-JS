package Arrays;

public class PrintSmallestAndLargestNum {
    public static void main(String[] args) {
        
        /**
         * Find the smallest and lagest number form int array
         */

        int[] arr = { 10, 55, 1, 2, 3, 4, 0, 55 };
		int smallest = arr[0];
		int largest = arr[0];
		for(int i=0; i<arr.length; i++){
		    if(arr[i] < smallest){
		        smallest = arr[i];
		    }else if(arr[i] > largest){
		        largest = arr[i];
		    }
		}
		
		System.out.println(smallest); //0
		System.out.println(largest); //55

    }
}
