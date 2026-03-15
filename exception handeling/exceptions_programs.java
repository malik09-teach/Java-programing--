 package execptions_handlings;

import java.util.InputMismatchException;
import java.util.Scanner;

// Program to handle exceptions caused by intentional or unintentional user actions

public class exceptions_programs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, div;

        try {
            // Taking input from the user
            System.out.print("Enter the first number: ");
            num1 = sc.nextInt(); // May throw InputMismatchException if input is not an integer

            System.out.print("Enter the second number: ");
            num2 = sc.nextInt(); // May throw InputMismatchException if input is not an integer

            // Perform division
            div = num1 / num2; // May throw ArithmeticException for division by zero
            System.out.println("The result of division is: " + div);
        }/* catch (InputMismatchException e) {
            System.out.println("Exception caught: Please enter valid integers.");
        }*/ catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero is not allowed.");
        }
            // Closing the scanner resource
            sc.close();
            System.out.println("Program ended successfully.");
        
    }
}



/*
import java.util.Scanner;

// exceptions made for rhe user when the are use the programs intentionly or unintentionly wrong




public class exceptions_programs {
	public static  void  main (String []args) {
 Scanner sc=new Scanner (System.in);
		int num1 ,num2,div;
		
		num1=sc.nextInt();
        num2=sc.nextInt();
				
		
		try {
			

				div= num1/num2;
				System.out.println("div is : "+div);	
		}
		
		 catch (ArithmeticException e)
		 {
			 System.out.println("Exception caught: Division by zero is not allowed."); 
		}
		
		 System.out.println(" program end succcesfuly");
		
		 	
		
	}

}*/
