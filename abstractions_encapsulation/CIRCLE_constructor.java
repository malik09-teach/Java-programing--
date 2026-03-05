package abstraction_encapsulation_constructor;

public class CIRCLE_constructor {
	private int ridus ;
	
	// constructor
	CIRCLE_constructor(int ridus ){
		
		this.ridus=ridus;
		
	}
	
 double  area_cric() {
	return Math.PI*ridus*ridus; 
 }
 
 double peri_circ() {
	 
	 return 2*Math.PI*ridus;
 }

}
 class opreation{
	
public static  void main (String []args ) 	
{
	
	CIRCLE_constructor obj=new CIRCLE_constructor (5);
	
      System.out.println("area: "+obj.area_cric());


      System.out.println("premeter : "+obj.peri_circ());

}
	
}