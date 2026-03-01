package week_02;
import java.util.Scanner;

public class pound_to_kilo {


	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	System.out.println("enter pounds:");
		double pound= s.nextDouble();
		
		double kilo;
		kilo=pound*(0.45359237);
		
		System.out.println(" kilograms=:"+kilo);
		
		
		
		

	}

}
