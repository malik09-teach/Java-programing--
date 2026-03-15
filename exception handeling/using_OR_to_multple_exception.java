package execptions_handlings;

public class using_OR_to_multple_exception {
	public static void  main (String []args ) {
		try {
		
			   int[] numbers = {1, 2, 3};
	         //   int result = 10 / 0; // This will throw ArithmeticException
	            System.out.println(numbers[5]);
			
		}
		
		// using the or opreator we can get specific error in the 
		catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
		
		    System.out.println("error caught...  :"+e.getClass().getName());
		}
		
		//or use the universal exception 
		
	/*	catch (Exception e) {
			
		    System.out.println("error caught...  :"+e.getClass().getName());
		}
		*/
	}
	
}
