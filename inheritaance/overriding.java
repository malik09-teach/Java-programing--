package inhertance;
  

class car {
	 private String name ;
	 
	 
	 car(String name){
		this.name=name ; 
	 }
	 
	 void  car_mod() {
	
			System.out .println ("old car  1990 model ...");
	 }
	 
	 void car_name() {
		 System.out .println ("car name : "+name);
		 
	 }
}
//--------------------------------------------------
class new_car extends car{
	
	new_car(String name){
		super (name);
	}
	
	@Override
	void car_mod() {
		System.out .println ("new  car  2020 model ...");
	
	
	}
	
 void name_car() {
	 car_name();
 }
	
}

//------------------------------------------------------------
class latest_Car extends car{
	
	
	latest_Car(String name){
		super (name);
	}
	
	@Override 
	void car_mod() {
		System.out .println ("latest  car  2025 model ...");
		
		
		
	}
	
	void carlatest() {
		car_name();

	}
}

public class overriding {

	public static void main(String[] args) {
		
		System.out .println ("calling as dynamic dispatch run time poly marphism \n can only call the super class extended method cant be acces the own clss methods");
		car obj1=new car("toyota");
		obj1.car_mod();
		obj1.car_name();
		System.out .println ("\n");
		
		car obj2 =new new_car("lexus");
		obj2.car_mod();
		obj2.car_name();
		System.out .println ("\n");		
		car obj3 =new latest_Car("hundiya");
     	obj3.car_mod();
	   obj3.car_name();
		System.out .println ("\n");
     	
		
		System.out .println (" calling from orignal own object can be access the own class methods also the extended  \n");
		
     	car obj4 =new car("toyata ");
     	obj4.car_mod();
     	obj4.car_name();
		System.out .println ("\n");
     	new_car obj5 =new new_car("lexus");
     	obj5.car_mod();
    	obj5.car_name();
     	obj5.name_car();
		System.out .println ("\n");
     	
     	
     	latest_Car obj6=new latest_Car("hundiya");
     	obj6.car_mod();
     	obj6.car_name();
     	obj6.carlatest();
     	
     	
     	
	}

}
