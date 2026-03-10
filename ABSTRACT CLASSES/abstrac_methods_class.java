package abstract_classes;

abstract class  hospital{
	abstract void appointment ();
	abstract void billing ();
	abstract void emergancy ();
	abstract void lab_test();
   
}
// THE METHODS OF ABSTRACT CLASSM MUST BE IMPLEMENT IN THE EXTENDED CLASS 

class myhostpital extends hospital{
	
	void appointment () {
	System.out.println("YOUR APPOINTMENT IS BOOKED WITH DR");
		
	}
	 void billing () {
			System.out.println("YPUR BILL IS 9950/-");
	 }
	 void emergancy () {
			System.out.println("NO EMARGANCY REQURID");
		 
	 }
 void lab_test() {
		System.out.println("LAB REPORTS \n 1: corona : neg-\n 2: HIV :neg - ");
 }
 // THSI METHHOD IS NOT EXTENDED FROM THE PREIOUS CLASS SO THE REFRANCE OF THE OBJECT WILL NOT TAKE THIS 
 void feedback() {
		System.out.println("your feed back is : good /bad ");
 }
}



public class abstrac_methods_class {
public static void main (String []arg) {
	// REFRANCE WILL TAKE THE ABSTRACT METHODS AND THE  NON INHERTED CLASSES WILL NOT TAKE IT 
	hospital h1=new myhostpital ();
	System.out.println("**********HOSPITAL********** ");
     h1.appointment();
      h1.emergancy();
      h1.lab_test();
      h1.billing();
     
      myhostpital h11=new  myhostpital();
      h11.feedback();
     
}
	
}
