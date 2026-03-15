package execptions_handlings;

public class finally_examples {
	
	
	
	
public static void main (String []args) {
	

	int a ,b ,c;
	a=5;
	b=5;
	c=4;
int vol=0;
	
try {	
	
	if (a<=0 || b<=0 || c<=0)  
	{
		  throw new IllegalArgumentException(" the valves are not valid try again with +ive ");
		}
	
 	vol=a*b*c;
	System.out.println("volume :" +vol);	

}	
catch (IllegalArgumentException r) {
	System.out.println("the exception in the elements"+r.getMessage());
}

	catch (Exception e) {
		System.out.println(" any other exception: "+e.getMessage());
	}
	


	finally {
		if (vol > 0)  {
		System.out.println(" the vol is calculated  ...");
	}
		else {
			System.out.println(" the vol not calculated  ...");
			
		}
}

}
}
