package abstraction_encapsulation_constructor;

import java.util.Scanner;


import java.util.Arrays;
import java.util.Scanner;
//-------------------------------------------------------------------------------------------
public class Student_info {
	 private String name ,
	            department;
	 private int roll_id,n;
	 private String  subjects[] ;
	 
	 //constructor-----------
	 
	 Student_info(String name ,int  roll_id,String subject[] ,String department,int limit){
		 
		 this.name=name; 
         this.roll_id=roll_id;
         this.n=limit;
         this.department =department;
         this.subjects=new String[n];
	
         set_sub( subject);
	 
	 }
	 
	 //--------------------------------------------------------

	void set_sub(String [] n2) {
  
		for(int i=0;i<n;i++) {

	  this.subjects=n2;
	  
  }  
	  }
	 
	  int rollback() {
		  return roll_id;
		  
	  }
	  
	  String ret_name() {
		  return name ;
	  }
	  
	  String[] ret_subject() {
		  return subjects;
}


	  
	  String ret_dept() {
		  return department;
		  }
	  
	  
	public String toString(){
		   return "NAME :"+name +"\n ROLL NO :"+roll_id+"\n SUBJECTS:"+Arrays.toString(ret_subject())+ "\n DEPARTMENT :"+department;
		  }
	//-----------------------------------------------------------------------------------------
	
	public static void main (String []args) {
		Scanner s=new Scanner(System.in);	
		
		 System.out.print("enter no of students :");
			int n1=s.nextInt();
			s.nextLine();
			Student_info obj[]=new Student_info[n1];
			//-------------------------------------------------
			for (int l=0;l<n1;l++) {
			
			
		System.out.print("enter your name :");
		String name=s.nextLine();
		System.out.print("enter your id :");
				int  id=s.nextInt();
				s.nextLine();
				System.out.print("enter department :");
				String dept=s.nextLine();
				s.nextLine();
         
         System.out.print("enter no of subjects :");
			int n=s.nextInt();
			
			s.nextLine();
			
			String sub[]=new String[n];
		
			for(int i=0;i<n;i++)
		  {
				System.out.print("enter your subject name :"+(i+1)+" =");
		           sub[i]= s.nextLine();
		
		  }
			  obj[l]=new Student_info(name,id,sub,dept,n);
			
			  System.out.println("----------result--------- \n"+obj[l]);
			
			}		
	}
  
}
