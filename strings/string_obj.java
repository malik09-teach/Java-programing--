package STRINGS;

public class string_obj {

	public static void  main (String []args) {
	// let try  the string constructor method and with different memory area 
	

//System.out.println ("");		
		//--------------------------------------------------------------------------------
		//methods that strings can take :
		
		//1. the string variable that take a string in local memory 
		System.out.println ("local varaibale ");

		String str1= "java program";
		System.out.println (str1);
	//----------------------------------------------------------------------------------------	
		
     // converting the array of character to the string using the constructor of a String class 
	
		System.out.println ("\n character array ");	
		char name[]= {'a','b','b','a','s'};
		String str=new String (name);//--> using the String class constructor 
		System.out.println (name);
		//--------------------------------------------------------------------------------
		
		// the same byte data type can also convert to the string
		
		System.out.println ("\n byte in the array");	
		byte []b= {65,66,67,68};
		String str3=new String (b);//--> using the String class constructor 
		System.out.println (str3);
		//--------------------------------------------------------------------------------
		
		// directly create memory in the heap memory 
		System.out.println ("\n heap memory");	
		String str2=new String("Java program");
		System.out.println (str2);	
		
		//--------------------------------------------------------------------------------
		
		//  the same object  in java can have multiple refrence  in local area /pool area 
	
		String strr1= "Java program";
		String strr2= "Java program";
		System.out.println ("\n is local refrance equal to the local refrance  which pointing on the same objecct ");
		System.out.println (strr1==strr2);
		
		//is pool==heap ?
		
		System.out.println ("\n is heap  refrance equal to the local refrance ");	
		System.out.println (strr1==str2);
		
		
		
		//-----------------------------------------------------------------------------------------
		
		// to cheak conversion use comond javap java.lang.Stirng . 
		//String(char[], int, int);
		// here is an intersting part if you want to print the specific index to onword in array so u can use the comond (char[], int, int); 
	
		
		//using the b array in upper example  
		
		
		System.out.println ("\n using the specific index method to print the string ");
		String str5=new String (b,2,2);//--> using the String class constructor that print specific index and width and latter you want  
		System.out.println (str5);
		
	
	}
	
	  
	
	
}
