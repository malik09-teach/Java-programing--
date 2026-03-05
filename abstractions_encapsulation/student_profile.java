package abstraction_encapsulation_constructor;
import java.util.Scanner;
public class student_profile {

	private int rollno;
	private String name,course_name;
	private int m1,m2,m3,m4,m5;
	 
	student_profile (int  rollno,String name,String course_name,int m1,int m2,int m3,int m4,int m5){
		
		this.rollno=rollno;
	 this.course_name=	name;
		this.course_name= course_name;
		this.m1 =m1;
		this.m2=m2;
		this.m3 =m3;
		this.m4 =m4;
		this.m5=m5;
	}
	
	
	float total() {
		return  m1+m2+m3+m4+m5;
	}
	float avrage() {
		return (float) total()/5;
	}
		
	String grade() {
		
	if (avrage() >=60) {
		return "grade A";
	}
	
	else {
		return "grade A-";
		
	}	}
	
	
	String detial() {
	
		return "roll no: " +rollno+"\n"+"name : "+name+"\n"+"course : "+course_name;
		
	}

	
	public static void main(String[] args) {
	
		student_profile obj=new student_profile(123,"malik abbas ","cs",56,77,55,44,33);
		
		
		System.out.println(	obj.total());	
		System.out.println(	obj.avrage());	
		System.out.println(	obj.grade());
	System.out.println(	obj.detial());
		
	
		
	}

}
