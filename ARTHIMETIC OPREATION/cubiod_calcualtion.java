package artimetics;
import java.util.Scanner;

public class cubiod_calcualtion {

	public static void main(String[] args) {
	    Scanner s=new Scanner (System.in);
		
	    double breadth, length ,hieghet ,volume ,TOP,FRONT,SIDE ;
		 System.out.print("ENTER BREADTH: ");
		  breadth=s.nextDouble();
		  
		  System.out.print("ENTER WIDTH: ");
		  length=s.nextDouble();
		  
		  System.out.print("ENTER HIGHET: ");
		  hieghet=s.nextDouble();
		
		  
	    // FACE CALCULATION
		  
		  
		  TOP= length*hieghet;
		  FRONT=breadth*hieghet;
	 SIDE=breadth* length;
	 
	 double totarea=2*(TOP+FRONT+SIDE); 
	 
	  System.out.println ("TOP /BOT = "+TOP+"M^2");
	  System.out.println ("BACK /FRONT = "+FRONT+"M^2");
	  System.out.println ("LEFT/RIGHT SIDE = "+SIDE+"M^2");
	  
	  System.out.println (" ");
	  
	  System.out.println ("TOTAL AREA  = "+totarea+"M^2");
	    
	    // AREA CALCULATION  
	  
	  volume =breadth* length*hieghet;
	  
	  System.out.println ("VOLUME = "+volume+"M^2");
	 
	}

}
