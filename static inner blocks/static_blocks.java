package static_finals_programs;
  class  static_blocks_excution{

	static {
		System.out.println("{block of another class execute depend where the class object is called }");
	}
	
 }




public class static_blocks {
static {
	
	System.out.println("{block of main  class execute with out calling off main it will excute first }");
}

	public static void main(String []args) {
		static_blocks_excution obj=new static_blocks_excution();
		
		
		System.out.println("main method excute now");		
		System.out.println(" the calling of these  not controll by the main method due to the execution of of static block in the method area of the memory");
		
		
	}
	
	// the calling of these is not controlling by the mai8n method due to the execution of of static block in the method area of the memory" 
	// if in the object don then depenf on the object 
	
}
