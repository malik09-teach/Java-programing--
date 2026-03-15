package execptions_handlings;

public class throws_examples {

	private static  void area (int a , int b)throws Exception{
	

	if (a<=0 || b<=0) 
	{	throw 	new Exception("theelement cant be 0");
	}
	System.out.println(" area :"+ a*b);
	

}

private static void vol(int a, int b ,int c)throws Exception{
	

	if (a<=0 || b<=0 || c<=0)  
	{
		throw 	new Exception("theelement cant be 0");}
System.out.println("volume :"+ a*b*c);
	
}

protected static void callingthe(int a ,int b,int c) throws Exception{ 

	area (a,b);
	vol(a,b,c);
	}


public static void main (String []args) {
	try {
		callingthe(1,5,6);
		
	}
	catch (Exception e){
		System.out.println (e);
	}
	
	 
}
}
/*
public class throws_examples 
{

// Method to calculate the area; throws an exception if inputs are invalid
private static void area(int a, int b) throws Exception {
    if (a <= 0 || b <= 0) { // Check for invalid inputs
        throw new Exception("The element for area calculation cannot be 0 or negative!");
    }
    System.out.println("Area: " + a * b);
}

// Method to calculate the volume; throws an exception if inputs are invalid
private static void vol(int a, int b, int c) throws Exception {
    if (a <= 0 || b <= 0 || c <= 0) { // Check for invalid inputs
        throw new Exception("The element for volume calculation cannot be 0 or negative!");
    }
    System.out.println("Volume: " + a * b * c);
}

// Method to call area and volume calculations; propagates exceptions
protected static void callingthe(int a, int b, int c) throws Exception {
    area(a, b);     // Call area method
    vol(a, b, c);   // Call volume method
}

// Main method to test the functionality
public static void main(String[] args) {
    try {
        callingthe(4, 5, 6); // Valid inputs
        // Uncomment the following line to test invalid inputs
        // callingthe(0, 5, 6);
    } catch (Exception e) {
        System.out.println("Exception caught: " + e.getMessage());
    }
}}
*/