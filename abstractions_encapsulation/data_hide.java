package abstraction_encapsulation_constructor;

import java.util.Scanner;

//about hide data and how we can access by on getter and setter method 
public class data_hide {
    
	private int length ;
	private int breadth ;
	
	
	//assigning the valve to the data 
	void setter(int l,int b) {
		length=l;
		breadth=b;
		
	}

	
	// only for  reading 
int ret_l() {
	
	return length;
	
}

int ret_b() {

return breadth;

}


//showing the function is the square 
public boolean isSqure () {
	
	if (length==breadth) {
		return true;
		
	}
	else {
		return false ;
	}
	
}
	
	public static void main(String[] args) {

		data_hide obj=new data_hide();
		
		Scanner s=new Scanner (System.in);
		System.out.println(" enter length :");
		int l=s.nextInt();
		System.out.println(" enter breadth :");
		int b=s.nextInt();
		
		
		obj.setter(l, b);
	
		System.out.println(" is square:"+obj.isSqure());
		
        s.close();
	}


}