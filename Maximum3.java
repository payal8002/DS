package arraysandLoop;

public class Maximum3{
public static void main(String[] args) {
	 int[] arr = {10, 20, 5, 30, 15};
     int max = arr[0]; 
     for (int i = 1; i < arr.length; i++) {
         if (arr[i] > max) {
             max = arr[i];
         }
     }
     System.out.println("Maximum element is: " + max);
 }
}
//arr = {10, 20, 5, 30, 15}
//max = 10 (the first element)
//First Loop Iteration (i = 1):
//arr[1] = 20
//Check: 20 > 10 → true
//Second Loop Iteration (i = 2):
//arr[2] = 5
//Check: 5 > 20 → false
//Third Loop Iteration (i = 3):
//arr[3] = 30
//Check: 30 > 20 → true
//Fourth Loop Iteration (i = 4):
//arr[4] = 15
//Check: 15 > 30 → false