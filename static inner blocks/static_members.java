  package static_finals_programs;
  
   class static_sample {
	 	  static int num=1 ; 
	  public static void fun1()
	  {	 
		  System.out.println(" static number is :"+ num);
	  }
	  
	static int incrementFun2(){
		  return ++num;
	  }
  }
  
  
public class static_members {

	public static void main (String []args)
	{
		static_sample obj =new static_sample();	
		
		//we are accessing it  from the object due to its belong to the classs not to the
		//object its store in method sect butt belongs to the class 
		//so the object can be access this
 	//will show the static number 
	obj.fun1();
		
		// will show the static number is incremented
		System.out.println(obj.incrementFun2());
		
		
		// now we will access it from the class 
		
		System.out.println(	static_sample.num);
		static_sample.fun1();
		
		System.out.println(	static_sample.incrementFun2());
	}
}
