package arraysandLoop;

public class LargestInArray8 {
    public static void main(String[] args) {
        int[] arr = {10, 25, 5, 30, 15};
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Largest number is: " + max);
    }
}


