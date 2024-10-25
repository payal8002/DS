package arraysandLoop;

import java.util.Scanner;

public class CountOccurrences4 {
	 Scanner scanner = new Scanner(System.in);
	 int[] arr = {1, 2, 3, 4, 5, 2, 2, 6, 7, 8, 9,};
     System.out.print("Enter the element to count:");
     int element = scanner.nextInt();
     int count = 0;
     for (int num : arr) {
         if (num == element) {
             count++;
         }
     }
     System.out.println("The element " + element + " occurs " + count + " times in the array.");
     scanner.close();
 }
}
