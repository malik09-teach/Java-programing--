package STRINGS;

public class printf_format_specifier {

	public static void main(String[] args) {
		int num1=10;
		float num2=9000.57876576f;
			char ch='a';
			String name ="malik";
			
			
			// formate of  formates= % [index number $][flage][width][precsion]conversion 
			
			System.out.printf(" %d\n %f\n %c\n %s\n %o\n  %x\n %e\n %g\n ",num1,num2,ch,name,num1 ,num1,num2,num2 );
	 
			//we use the  printf for the out to the console for any string or data type before and after operation 
			
			/*	%d\n === for integer 
		 *  %f\n === for float 
		 *  %lf  === for double 
		 *  %c\n === for character 
		 *  %s\n === for  string
		 *  %o\n === for showing number in octal 
		 *    %x\n  === for hexa-decimal 
		 *  %e\n  === for power of notation
		 *  %g\n  showing  float shrink
*/
			
			
			// flags  , flags work on console that manipulate the out puts with diffrent styles  these are (-,+,'',(    );
			// one this is must that it should be use with the width  .
			// with is given to the position of  data type that at which place it must be written so 
			// in below syntax  %02d the 0 is flag and the 3 is width so in before the integer the 0 will appear on the screen 
			System.out.printf("%03d\n",num1);	
			
			// precision is another term in method which use with the float number that precise the decimal num
			// use the let (%.2f) indicate that the valve that is fully binded with the number in floating as only reduce to the 2 digits
			
			System.out.printf("%06.2f",num2);
			
			// full format is printf ("%1$03.2f",num2)
			// in this
			//1$-> index number 
			//0 -> flag
			// 5 -> width 
			//.2 ->precision 
			
	}

}
