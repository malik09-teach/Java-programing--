package execptions_handlings;

public class nasted_exceptions {
public static void main (String []args) {
	
       try {
	            int[] numbers = {1, 2, 3};
	           
	           
	       //-----------------------------------------     
	            
	            try {
	               System.out.println(10 / 0); // Inner exception: ArithmeticException
	            }
	            
	            catch (ArithmeticException e) {
	                System.out.println("Inner catch: Division by zero.");
	            }
	            //-----------------------------------------------------
	           
	            
	            try {
	            	
	            	String name =null;
	               System.out.println(name.length() ); // Inner exception: ArithmeticException
	            }
	            
	            catch (Exception e) {
	                System.out.println("your error :"+e.getClass().getName());
	            }
	            
	            
	            
	            
	            
	            System.out.println(numbers[5]);  
	          // Outer exception: ArrayIndexOutOfBoundsException
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Outer catch: Array index out of bounds.");
	        }
	
}

}	
