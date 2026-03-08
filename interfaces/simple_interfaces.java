package interfaces;
interface car{
	void body();
	void number_plate();
	void col();
	
}

class car1 implements car{
	
		
	
	public void body()
	{
		System.out.println("body : non_cutt");
		
	}

	public void number_plate() {
		System.out.println("no-plate : 54354");
		
	}
	
	
	public void col() {
		System.out.println("col: white");
	}

	
	
}
public class simple_interfaces {
public static void main(String []args) {
	

	car c1=new car1();
	c1.body();
	c1.col();
	c1.number_plate();
	
}	
	
	
}
