package arraysandLoop;

import java.util.Scanner;
public class CountDigits1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int number = sc.nextInt();
		int count =0;
		if (number < 0) {
			number= -number;
		}
		if (number == 0) {
		count =1;	
		}
        while (number > 0) {
			number /=10;
			count++;
		}
        System.out.println("The number of arrays"+count);
        sc.close();
	}

}
//Explanation:-
//count is initialized to 0
