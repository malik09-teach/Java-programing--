package abstract_classes;
 abstract class shape{
	 abstract void area ();
	 abstract void perimeter ();
	 
 }
 
 class rectangle extends shape  {
	private double l,w ;
	
	 rectangle (double l,double w){
		 this.l=l;
		 this.w=w; 
	 }
	 double area1() {
		 return l*w;
	 }
	 
	 double perimeter1() {
		 return 2*l*w;
	 }
	 void area () {
		 System.out.println("area :"+area1());
		 
	 }
	void perimeter ()
	{
		System.out.println("perimeter of rect :"+perimeter1());
		
	}
 }
 
 class circle extends shape {
	 
		private double radius ;
		
		 circle (double radius){
			 this.radius=radius;
		 }
		 double area1() {
			 return  Math.PI*(radius*radius);
		 }
		 
		 double perimeter1() {
			 return 2*Math.PI*radius;
		 }
		 void area () {
			 System.out.println("area of circle :"+area1());
			 
		 }
		void perimeter ()
		{
			System.out.println("perimeter of circle :"+perimeter1());
			
		}
	 }
 
 
public class CIRCLE_RACT_ABSTRACTION {

	public static void main(String[] args) {
	shape c1=new circle(5);
	
	shape r1=new rectangle(5,5);
	
	c1.area();
	c1.perimeter();
	 r1.area();
r1.perimeter();
	}

}
