package static_finals_programs;
class members {
	
/*	members (int a , int b){
	
		maxi(a,b);
	}
	*/
	static int  maxi(int a , int b) {
		System.out.print("callling the super  ");
		
return  a>=b ? a:b;
	}
}


class member1 extends members{
	

/*	member1 (int a , int b){
	
		super(a,b);
	}
	*/ 
	// this will not call due to not override from the super class 
	static int  maxi(int a , int b) {
		System.out.print("\n callling the child ");
return  a>=b ? a:b;
	}

}
public class inherting_members_of_static {

	public static  void main (String []args){
		
	members obj1= new members ();
	members obj2= new member1 ();
	member1 obj3= new member1 ();
	
	
		System.out.println("parent class object show res :"+	obj1.maxi(5,6));
		System.out.println("\n poly marphism show res :"+	obj2.maxi(5,6));	
	// the static methods and classes and data can't override 
		
		System.out.println("\n child class object show res :"+	obj3.maxi(5,6));	
		
	
	}
}
