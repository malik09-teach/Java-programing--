package week_02;
import java.util.Scanner;

public class revrse_num{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
int reverse=0;
 while(num!=0) {
 int m=num%10;
 
 reverse=reverse *10 + m;
 
 num/=10;
 
 
	 
 }

    System.out.println("reverse of : "+num +" = "+reverse);
    
    }
}
