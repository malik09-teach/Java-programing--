package artimetics;

public class opreators_opreations {

	public static void main(String[] args) {
		System.out.println(" RATIONAL OPREATOR");
		short b1=32767;
		long b2=999999999;
		char b3=40;
		int b4=80,k1=2;
		float l=1.8f;

		double b5=3.32d;
	    double bb =33.554d;

	    System.out.println(" RATIONAL OPREATOR EXAMPLE :SHORT B1=32767");
	    
	    
	    // unray opreation 
	     System.out.println("UNRAY OPREATOR ");
	   int i=  b3++;
	     System.out.println("post increament = "+i); 
	    int a= ++b3;
	     System.out.println(" pre increament = "+a);
	    
	    //arthimetic opreations
	     System.out.println("ARTHIMETIC OPREATOR ");
	     int s=b4+k1;
	     System.out.println("sum="+s);
	     
	     // here  the type casting occoure double is higher byte so will convert to them:
	     
	     
	     double m =b5-l;
	     System.out.println("sub"+m);
	     
	     
	     float mul=l*b3;
	     System.out.println("mul ="+mul);
	     
	    long  div=     b1/b4;
	     System.out.println("div : "+div);
	     
	     double mode=bb%l;
	     System.out.println("mode ="+mode );
	     
	     System.out.println(" BITWISE OPREAOR");
	     
	     int b_1=b4&k1;
	     int b_2=b4|k1;
	     int b_3=b4^k1;
	     int b_4=~k1;
	     int b_5=b4>>k1;
	     int b_6=b4<<k1;
	     int b_7=b4>>>k1;
	    		 
	    		  System.out.println("AND ="+b_1+" OR:"+b_2+" X_OR:"+b_3+" NOT: "+b_4+" RIGHT SHIFT : "+b_5+"  LEFT SHIFT"+ b_6+" right shift unsign shift :"+b_7 );
	    		 
	    		 ;
	      
	     
	}

}
