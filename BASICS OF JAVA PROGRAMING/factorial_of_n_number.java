package week_02;
import java.util.Scanner;

public class factorial_of_n_number {

	public static void main(String[] args) {
Scanner s=new Scanner (System.in);
System.out.println("enter number:");
int n =s.nextInt();

int fact=1;

 for (int i=1;i<=n;i++) {
	 
fact=fact*i;	 
 }
 System.out.println("factorial of : "+n+" = "+fact);

	
	//close (Scanner) ;}
	

}}
