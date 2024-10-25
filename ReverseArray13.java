package arraysandLoop;

import java.util.Arrays;

public class ReverseArray13 {
	 public static void main(String[] args) {
		  int[] array = {1, 2, 33, 4, 5};  
	        System.out.println("Original Array: " + Arrays.toString(array));
	        int first = 0, end = array.length - 1;
	        while (first < end) {
	            // Swap elements at 'start' and 'end'
	            int temp = array[first];
	            array[first] = array[end];
	            array[end] = temp;
	            first++;//increase first element
	            end--;//decrease the last elements
	        }
	        System.out.println("Reversed Array: " + Arrays.toString(array));
	    }
	}
//First Iteration:
// start =0 ,first element 1;
//end = 1 , last element 5
//check start < end → 0 < 4 (true) 
//temp = array[start]; → temp = 1
//array[start] = array[end]; → array[0] = 5
//array[end] = temp; → array[4] = 1
//Increment start and decrement end: start = 1, end = 3

//Second Iteration:
//Check start < end → 1 < 3 (true).
//temp = array[start]; → temp = 2
//array[start] = array[end]; → array[1] = 4
//array[end] = temp; → array[3] = 2 
//Increment start and decrement end: start = 2, end = 2

//Third Iteration:
//Check start < end → 2 < 2 (false)
