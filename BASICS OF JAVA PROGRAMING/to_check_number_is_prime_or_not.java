package week_02;
import java.util.Scanner;
public class to_check_number_is_prime_or_not {

	public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = s.nextInt();
	        boolean isPrime = true;	
	        if (num <= 1) {
	            isPrime = false;
	        } else {
	            for (int i = 2; i < num; i++) {
	                if (num % i == 0) {
	                    isPrime = false; 
	                    break;
	                }  }  }

	        if (isPrime) {
	            System.out.println(num + "  prime number.");
	        } else {
	            System.out.println(num + " not a prime number.");
	        }
	}
}
