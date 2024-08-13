package Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Rough {
    public static void main(String[] args) {
        
        int[] arr = {5,2,3,1,6,2,0,4,9,7,0};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); //[0, 0, 1, 2, 2, 3, 4, 5, 6, 7, 9]


        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);

       Collections.sort(numbers);
       System.out.println(numbers); //[1, 2, 5, 8]

       Collections.sort(numbers, Collections.reverseOrder());
       System.out.println(numbers);  //[8, 5, 2, 1]

        

    }
}
