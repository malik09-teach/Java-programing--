package week_02;
import java.util.Scanner;

public class greatest_in_2numbrs {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);		

		System.out.println("enter num1:");
		double num1 = s.nextDouble();
		System.out.println("enter num2:");
		double num2 = s.nextDouble();
		if(num1>num2) {
			System.out.println(" num1 great");		
			
		}
		else {
			
			System.out.println(" num2 is great");
		}

	}

}
