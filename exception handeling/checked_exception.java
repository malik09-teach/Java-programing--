package execptions_handlings;
import java .util.Scanner; 
import java.io.*;


public class checked_exception {
//	Scanner sc=new Scanner("my.txt");
	static void fun1 ()  {
	
		
		try {
		
			// this is checking exceotion due to the file is not exsist 			
			 	FileInputStream fi=new FileInputStream("my.txt");
	
			 	
		}
		catch (Exception e) {
			System.out.println(e);
		
		}
			
}
		
	}