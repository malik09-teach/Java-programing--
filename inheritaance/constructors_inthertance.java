package inhertance;

class display1{
	
	
	display1(){
		System.out.println ("display frist non param constructor");
	}
display1(int x ){

	System.out.println ("display frist parametrize constructor "+x);
}
	
	
}


class display2 extends display1{
	
	int y;
	

	display2(){
		
		System.out.println ("display second non param constructor");
	}

	display2(int y){
		System.out.println ("display second paramerterize  constructor"+y);
	}
	

	display2(int x,int y){
		
		super(x);
		
		System.out.println ("display second paramerterize  constructor"+y);
	}
	
	
	
}



public class constructors_inthertance {

	public static void main(String[] args) {
		System.out.println ("calling non _param cons from child first will call supepr non param then child non param");
		display2 obj1=new display2();
		
		System.out.println (" \n ");
		System.out.println ("calling param cons from child first will call supepr non param then child parametrize ");
		display2 obj2 =new display2(10);
		
		System.out.println (" \n ");
		System.out.println ("calling hybrid param  cons from child first will call supepr param then child parametrize ");
		display2 obj3 =new display2(15,20);	
		
		
	}

}
