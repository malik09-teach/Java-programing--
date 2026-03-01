package week_02;

import java.util.Scanner;

public class fibnoacci_series {

	public static void main(String[] args) {
		
		 Scanner s = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = s.nextInt();
		
		
		int first = 0, second = 1;
        System.out.print("Fibonacci Series: " + first + " " + second + " ");

        for (int i = 2; i < num; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
	}
}
	
