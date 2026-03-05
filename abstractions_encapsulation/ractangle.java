package abstraction_encapsulation_constructor;

import java.util.Scanner;



public class ractangle {

	   private int length ;
	    private int breadth ;
	    
	    ractangle(int length,int breadth){
	    
	    this.length=length;
	    this.breadth=breadth;
	    
	    }
	    
	    double area(){
	    
	        return breadth*length;
	    }
	    
	    double perimeter (){
	    return 2*area();
	    }

	   
	        public static void main(String[] args) {
	            
	            Scanner sc=new Scanner(System.in);

	    System.out.println("enter length: ");
	            
	    int n1=sc.nextInt();

	    System.out.println("enter breath: " );

	    int n2=sc.nextInt();
	          
	    ractangle obj=new ractangle(n1,n2);

	            System.out.println("area: "+obj.area());
	            
	            System.out.println("premeter : "+obj.perimeter());
	            
	            sc.close();
	            
	        }
}

