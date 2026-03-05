package abstraction_encapsulation_constructor;


class customer{
	private String name;
	private String address;
	private int id;
	private String phone_no;

	customer(String name,String address,int id, String phone_no){
		 this.address=address;
		this.id=id;
		this.name=name;
		this.phone_no=phone_no;
	}
	public String toString() {
		
		return "\n"+"name :"+name+ "\n"+" id :"+id+"\n"+ " address :"+address+    "\n"+ " phone _ no :"+phone_no;
	}
	
	
	
}

class product {

	private String item_name;
	private String price;
	private int id;
	private int qty;

	product(String item_name, String price,int id, int qty){
		this.id=id;
		this.item_name=item_name;
	    this.price=price;
		this.qty=qty;
	}
	
	
	public String toString() {
		return "\n item name :"+item_name+"\n"+"id no :"+id+"\n"+"price : "+price +"\n"+"quantity :"+qty+"\n";
	}
	
	
}


public class customer_prouduct_abs_enc {

public static void main (String []args ) {
	
	product pro1=new product("soap","12$",990,2);
	customer cos1=new customer("malik ","dir",4,"03130191226");
	
	System.out.println("product detail"+pro1);
	System.out.println("customer detials \n"+cos1);
	
}

}
