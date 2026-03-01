package week_02;
import java.util.Scanner;
public class temprature_to_fernhite {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("enter cel:");
		double cel = s.nextDouble();
double temp=(cel*9/5)+32;

System.out.println("temp="+temp+"c");
	

	}

}
