 package week_02;
import java.util.Scanner;
public class num_is_palindrom_or_not {
	
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = scanner.nextInt();
	        int n2=num;        
	int reverse=0;
	while(num!=0) {
	 int m=num%10;
	  reverse=reverse *10 + m;
	 num/=10;
	 }
//    System.out.println("reverse of : "+num +" = "+reverse);	
if (n2==reverse) {
	 System.out.println("number is pilndrom : "+n2 +" = "+reverse);
}
else {
	 System.out.println("not plindrom : "+n2 +" = "+reverse);
}
}}
