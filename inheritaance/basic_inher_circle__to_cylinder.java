package inhertance;

class circle {
	
	//------------------------------
	//basic inheritance without constructor
	//-----------------------------------
	
	public  double ridus ;
	/*
	circle (){
		ridus =1;
	}

	circle (double ridus ){
		this.ridus=ridus ;
		}*/
	
	double area() {
		return Math.PI*ridus;
	}
	
	double perimeter() {
		return 2*Math.PI*(ridus*ridus);
		
	}
	
 void showRes () {
	 
	
	 System.out.println("area :"+area()); 
	 System.out.println("perimeter :"+perimeter()); 
 }
	
}

class cylinder extends circle{
	
	public double hight;
	/*
cylinder(double circle ){
	
	this.hight=hight;
}*/
	
	
	double volume() {
		 
		return area()*hight;
		
	}
	
	
	void showVol() {
		System.out.print("volume is :"+volume());
	}
	
	
}


public class basic_inher_circle__to_cylinder {

	public static void main(String[] args) {
	
		circle obj=new circle ();
		cylinder obj1=new cylinder();
		
		obj.ridus=5;
		
		obj1.hight=9;
		obj1.ridus=6;
		
		
		
		// it will take default valve of constructor and print 
				 // area = 3.14
				 //perimeter=6.28
				 //the valve is asign to ridus butt in the obje of child class thats why it is not taking that valve
				 
		System.out.print( "calling from the parent obj area and perimeter :");
		 obj.showRes();
		 
		 
		 //here in obj of child class every thing is normal 
		 
		System.out.print("calling the child class obj area and perimeter : ");
			obj1.showRes();
			
             //  obj1 child class  can access and contain 			
			//-------------------------------------------
			// hight,ridus 
			//constructor super class and it self
			//functions of itsself and super class
			
			
			System.out.print("calling from chlid class vol");
			  obj1.showVol();
	
		
		
		

	}

}
