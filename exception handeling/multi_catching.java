package execptions_handlings;
import java.util.Scanner ;
import java.util.InputMismatchException;


public class multi_catching {

	public static void main(String []args) {
   
   try {
	   int   petrol_list[]= {77,88,99,22};

	   for (int i=0;i<petrol_list.length;i++) {
	      System.out.println(" avrge of consictive drops: "+(petrol_list[i]+petrol_list[i++])/petrol_list[9]);
	      // the arthimetic error
	   //  System.out.println(" avrge of consictive drops: "+(petrol_list[i]+petrol_list[i++])/0);
	   }
   }
   
   // if the error in the arthimetics so the erroe will show here
   catch(ArithmeticException r)
   {
	   System.out.println(" artimetic logic error.... "+r);
   }
   
   
   //if the error in the  array indexs so the exception will  her 
	catch(ArrayIndexOutOfBoundsException e) {
	
		System.out.println(" index increase error in the refrance of arthimetic .... "+e);
	
	}
   
   // it will print with out crashing the program
    System.out.println (" the program execute successfully with out crashing  :");
    
}	
	
}
