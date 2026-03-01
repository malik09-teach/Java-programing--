package week_02;
import java.util.Scanner;
public class grade_calulator {

	public static void main(String[] args) {
	
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks of student: ");
        int num = scanner.nextInt();
        if (num>=90&&num==100) {
        	System.out.print(" GRADE: A ");
        	
        }
        else if(num>=80&&num<=89) {
        	System.out.print(" GRADE: B ");
        	
        }

        else if(num>70&&num<=79) {
        	System.out.print(" GRADE: C ");
        	
        }

        else if(num<=70&&num>0) {
        	System.out.print(" GRADE: f ");
     	
        }
        else {
        	System.out.print(" invalid marks  ");
        }        
	}
}
