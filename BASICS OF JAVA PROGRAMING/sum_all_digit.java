package week_02;

import java.util.Scanner;

public class sum_all_digit {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter number: ");
	        int num = scanner.nextInt();
	        int sum=0;
	        for (int i=0;i<=num;i++) {
	        	
	        	sum=sum+i;
	        	
	        }   
	        System.out.print("sum of all digit: "+sum);
	        
	}

}
