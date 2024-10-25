package arraysandLoop;

import java.util.Arrays;

public class AscendingOrder7 {
	public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 2};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                   
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Array in ascending order: " + Arrays.toString(arr));
    }
}
