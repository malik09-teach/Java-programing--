package artimetics;

public class masking_merging {

	public static void main(String[] args) {

		// let we are doing it on the byte :
		
		byte a =9;
		byte b=12;
		byte c;
		
		
		//storing 2 variable in  a single variable by using bitwise opreation 
		
		
	c=(byte)(a<<4);
// the a is shifted to the 4 byte on left side so it become 9 in the M.S.D side 
	//c=0000_0000
	//c=1001_0000
	
	c=(byte)(c|b);
	///the merging occur in  the first 4 bits which is empty so by OR operator c|b;
	// now this take 
	//c=1001_0000
	   //(c|b)
	//c=1001_1111;
	//a>>n=a/2^n fir right shift ;
	//a<<n=a*2^n left shift; 

	
System.out.println( (c&0b11110000)>>4);
	
	System.out.println((c&0b00001111));
	
		
		
	}

}
