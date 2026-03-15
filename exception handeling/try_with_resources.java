package execptions_handlings;

import java.io.*;
import java.util.Scanner;

public class try_with_resources  {

    // Method to perform division using try-with-resources
    static void div() throws Exception {
        // Try-with-resources to automatically close resources
        try (FileInputStream fi = new FileInputStream("examp1.txt"); Scanner sc = new Scanner(fi)) {
            // Read integers from the file
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            System.out.println("The value of a: " + a);
            System.out.println("The value of b: " + b);
            System.out.println("The value of c: " + c);

            // Perform division and handle division by zero
            try {
                System.out.println("The result of a / c: " + (a / c));
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero is not allowed!");
            }
        }
    }

    public static void main(String[] args) {
        // Create the file and write test data
        String filePath = "examp1.txt";
        try {
            File file = new File(filePath);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            // Write integers to the file
            try (FileWriter writer = new FileWriter(file)) {
                writer.write("10\n"); // Write valid integers
                writer.write("20\n");
                writer.write("0\n"); // Writing 0 to test division by zero
            }

            // Call the div method
            div();
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}



/* package execptions_handlings;


import java.io.*;
import java.util.Scanner;
public class try_with_resources {


	static void div ()throws Exception {
		try(FileInputStream fi = new FileInputStream("reader.txt"); Scanner sc=new Scanner(fi);
) {
			int a= sc.nextInt();
			int b =sc.nextInt();;
			int c =sc.nextInt();
			
			
			System.out.println ("the div:"+a);
					System.out.println ("the div:"+b);
							System.out.println ("the div:"+c);
	System.out.println ("the div:"+a/c);		
			
		}
		
		
	
	}
	
	
	
	public static void main (String []arrgs) {

		
			/*   String filePath = "reader.txt"; 
		      
		           File file = new File(filePath);
		           if (file.createNewFile()) {
		               System.out.println("File created: " + file.getName());
		           } else {
		               System.out.println("File already exists.");
		           }

		           FileWriter writer = new FileWriter(file);
		           writer.write(10);
		           writer.write(20);
		           writer.write(0);
		           writer.write(40);
		           writer.close();
		
		 		
		
				try {
		div();
		}
		
		
		
		
		catch (Exception e) {
			System.out.println(e);
		} 
}
	
}
*/