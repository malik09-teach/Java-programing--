package OOP_SP25_MID_TERM_EXAM;

public class Customer {
	
	int customer_id;
	String name;
	String address;
	String category;
	double amount;
	Customer(int customer_id,String name,String address,String category ,double amount){
		
		
		this.address=address;
		this.customer_id=customer_id;
		this.category=category;
		this.name=name;
		//this.amount=applybilldiscount( amount);
	}
	
	double applybilldiscount(double amount1) {
		
		if (category.equalsIgnoreCase("senior citizen")) {
			return 		amount= amount1-(amount1*10.0/100.0);
	
		}
		
		else if (category.equalsIgnoreCase("govt_emp")) {
			return 		amount= amount1-(amount1*15.0/100.0);
		}
	
		
		else   {
			return amount= amount1;
	
		}}
	
	double afterdiscshow_amount(){
		return amount;
	}
	
	void showdetial() {
		System.out.println("\n ID :"+customer_id+"\n name :"+name+"\n ADDRESS :"+address+"\n CATEGORY:"+category);
	}
	}//terminator


