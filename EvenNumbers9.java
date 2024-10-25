package arraysandLoop;

public class EvenNumbers9 {
	 public static void main(String[] args) {
	        int[] arr = {10, 15, 20, 25, 30};
	        System.out.print("Even numbers: ");
	        for (int num : arr) {
	            if (num % 2 == 0) {
	                System.out.print(num + " ");
	            }
	        }
	    }
}
