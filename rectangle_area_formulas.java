package artimetics;

import java.util.Scanner;
//import java.io.IOException;


public class rectangle_area_formulas {

	public static void main(String[] args) {

		
		Scanner s=new Scanner (System.in);
		
		
	double   base,hieghet ,area;	

	System.out.print("ENTER BASE: ");
	base=s.nextFloat();

	System.out.print("ENTER HIEGHT: ");
	hieghet=s.nextFloat();
	 
//	ProcessBuilder(C);
//	ProcessBuilder (cls);
//	  new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	double area3=(base*hieghet)/2d;

	System.out.println("AREA : "+area3 +"m^2");	
	
	System.out.println(" ------------------------------------------------ ");
	
	System.out.print("side 1: ");
	base=s.nextFloat();

	System.out.print("side 2: ");
	hieghet=s.nextFloat();
	
	System.out.print("side 3: ");
double  side_3=s.nextFloat();

	double  s1=(base+hieghet+side_3)/2f;
	System.out.println("sides : "+s1 );
	
	// math sqrt return double valve 
	
	double area2=Math.sqrt(s1*(s1-base)*(s1-hieghet)*(s1-side_3));
	
	
	System.out.println("AREA2 : "+area2 +"m^2");

	System.out.println("-------------------------------------------------------");
	
	
		
	}
}