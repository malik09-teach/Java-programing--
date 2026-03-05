package abstraction_encapsulation_constructor;
import java .util.Scanner;

public class cylinder {

	private int ridus;
	private int hieght;	
//doing the constructor overloading
	//default
	cylinder()
	{
		this.ridus=1;
		this.hieght=1;
	}
	// parameteraize
	
	cylinder(int ridus, int hieght)
	{
		this.ridus=ridus;
		this.hieght=hieght;
	}
	
	
	 double lid1_area() {
		return Math.PI*ridus*ridus;
	}
	
	double circumferance() {
		return 2*Math.PI*ridus;
	}
	
	double totalsurfacearea() {
		return 2*(lid1_area()+circumferance())*hieght;
	}
	
	double volume() {
		return lid1_area()*hieght ;
		
	}
	
	public static void main (String []args) {
	 

		Scanner sc=new Scanner (System.in);
		System.out.println ("enter ridus : ");
		int rid=sc.nextInt();
		
		System.out.println ("enter hieght : ");
		int hig=sc.nextInt();
		//constructor
		cylinder obj=new cylinder(rid,hig);
		
		System.out.println ("LID AREA: "+obj.lid1_area());
		System.out.println ("cicumference : "+obj.circumferance());
		System.out.println ("volume : "+obj.volume());
		System.out.println ("TOTAL surface area : "+obj.totalsurfacearea());
		
	sc.close();
	
	
	
		
	}
	
	
	
	
	
}
