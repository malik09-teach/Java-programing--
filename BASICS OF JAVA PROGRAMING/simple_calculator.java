package week_02;

import java.util.Scanner;

public class simple_calculator {

	public static void main(String[] args) {
				Scanner s=new Scanner (System.in);
		
		System.out.println("enter num1:");
		int num1 = s.nextInt();

		System.out.println("enter num2:");
		int num2 = s.nextInt();

		System.out.println("addition="+num1+num2);
		System.out.println("subtraction=" + (num1-num2));
		System.out.println("multiplication="+num1*num2);
		System.out.println("divison="+num1/num2);
	}
}
