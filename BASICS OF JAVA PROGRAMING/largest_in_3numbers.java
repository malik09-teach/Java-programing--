package week_02;
import java.util.Scanner ;
public class largest_in_3numbers {
		public static void main(String[] args) {
			
			Scanner s=new Scanner (System.in);
		
	System.out.println("enter num1:");
	int num1 = s.nextInt();
System.out.println("enter num2:");
	int num2 = s.nextInt();
	System.out.println("enter num3:");
	int num3 = s.nextInt();
	if(num1>num2&&num1>num3) {
System.out.println(num1+"is greatest");
				}
		else if(num2>num1&&num2>num3) {
	System.out.println(num2+"is greatest");
									}
		else {
				System.out.println(num3+"is greatest");
								}
		}
		}

	



