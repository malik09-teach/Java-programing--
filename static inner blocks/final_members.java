package static_finals_programs;
  class members2 {
	
	 int mx11=99;
	  final int max1=88,max2=55;
	  
	  final void max () {
		if  (  max1>=max2)
			System.out .println(max1);
		else 
			System.out .println(max2);
	  }  
  void max1(){
		System.out .println(" parent class non finalized called");  
  }
	  
  }

  
  class mmember1 extends members2{
	// the finalized  methods is not overriding butt the non-final is can inherted
	  
	   void max1 () {
			System.out .println(" child class non finalized called");
			System.out .println("showing the inherted data of above parent class : "+mx11);
	  }
  }
  
  
public class final_members {

  public static void main (String []args) {
	  members2 obj =new members2 ();
	  obj.max();
  obj.max1(); 
  
  
  mmember1 obj1 =new mmember1 ();
  obj1.max1();
  
  }
	
}
