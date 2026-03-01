package week_02;
import java.util.Scanner;
public class area_and_perimeterofractangle {

	public static void main(String[] args) {
Scanner s=new Scanner (System.in);
		
		System.out.println("enter length:");
		double num1 = s.nextDouble();


		System.out.println("enter width:");
		double num2 = s.nextDouble();
		
		
		System.out.println("area:"+(num1*num2));
		
		double area2= 0.5*(num1+num2);
		
		System.out.println("perimeter of ractangle:"+area2);

	}
	
}
