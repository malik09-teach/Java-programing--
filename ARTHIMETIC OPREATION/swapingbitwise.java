package artimetics;

public class swapingbitwise {

	public static void main(String[] args) {
	int k=15,l=6;
	 
	System.out.println("before swaping :"+k+" "+l);
	k=k^l;
	    //a=1111=15
        //b=0110=6
		//-----
		//a=1001=9
	
	l=k^l;
	//a=1001=9
	//b=0110=6
	//-----
	//b=1111=15
	
	k=k^l;
	//a=1001=9
	//b=1111=15
	//-------
	//a=0110=6
	
	System.out.println("after swaping :"+k+" "+l);
	
	//let assign the binary number to the  
	
	
	int a = 0b0101; // binary for 5
    int b = 0b1010; // binary for 10

    // AND operation
    int andResult = a & b;
    System.out.println("AND Operation:");
    System.out.println("a = " + Integer.toBinaryString(a));
    System.out.println("b = " + Integer.toBinaryString(b));
    System.out.println("a & b = " + Integer.toBinaryString(andResult));
    // Explanation: 0101 & 1010 = 0000 (bits are ANDed)

    // OR operation
    int orResult = a | b;
    System.out.println("\nOR Operation:");
    System.out.println("a = " + Integer.toBinaryString(a));
    System.out.println("b = " + Integer.toBinaryString(b));
    System.out.println("a | b = " + Integer.toBinaryString(orResult));
    // Explanation: 0101 | 1010 = 1111 (bits are ORed)

    // XOR operation
    int xorResult = a ^ b;
    System.out.println("\nXOR Operation:");
    System.out.println("a = " + Integer.toBinaryString(a));
    System.out.println("b = " + Integer.toBinaryString(b));
    System.out.println("a ^ b = " + Integer.toBinaryString(xorResult));
    // Explanation: 0101 ^ 1010 = 1111 (bits are XORed)

    // NOT operation
    int notResult = ~a;
    System.out.println("\nNOT Operation:");
    System.out.println("a = " + Integer.toBinaryString(a));
    System.out.println("~a = " + Integer.toBinaryString(notResult));
    // Explanation: ~0101 = 1010 (bits are inverted)
	//a<<n=a*2^n fir right shift ;
    // Left Shift operation
    int leftShiftResult = a << 2;
    System.out.println("\nLeft Shift Operation:");
    System.out.println("a = " + Integer.toBinaryString(a)+"  in decimal: "+a);
    System.out.println("a << 1 = " + Integer.toBinaryString(leftShiftResult));
    // Explanation: 0101 << 1 = 1010 (bits are shifted left by 1 position)
	//a>>n=a/2^n f0r right shift ;
    // Right Shift operation
    int rightShiftResult = b >> 1;
    System.out.println("\nRight Shift Operation:");
    System.out.println("b = " + Integer.toBinaryString(b));
    System.out.println("b >> 1 = " + Integer.toBinaryString(rightShiftResult));;
	
	

	}

}
