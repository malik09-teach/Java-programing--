package abstraction_encapsulation_constructor;

class x{
	
  public  x(){

	System.out.println( "a cons");
}
}
class z extends x {
	
	public   z(){
	
	
	
	
		System.out.println( "b cons");
		}
}

class c extends z  {
	public  c(){
		
			
	
		System.out.println("c cons");
	
}
}


public class inher1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		c b =  new c();
		
	

		
	}
	}
	



