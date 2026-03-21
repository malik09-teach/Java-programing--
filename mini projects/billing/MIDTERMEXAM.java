package OOP_SP25_MID_TERM_EXAM;

public class MIDTERMEXAM {

	public static void  main (String []args) {
		//domestic bill .............
		System.out.println("DOMESTIC BILLING...");
		
		Customer c1=new Customer(1,"ALI KHAN","peshwar","senior citizen",1500);	
	c1.showdetial();
	Domestic_Connrction con1=new Domestic_Connrction (101,"domestic");
	con1.unitconsume(150);
	con1.showbilldet();
	System.out.println("after discount : "+c1.applybilldiscount(1500));
	System.out.println("\n");
	
	//-------------------------------------------------------------------
	// commercial billing 
	
	System.out.println("COMMERCIAL BILLING...");
	Customer c2=new Customer(1,"ALI KHAN","peshwar","govt_emp",1500);	
	c2.showdetial();
	Commercial_Conection con2=new Commercial_Conection (102,"commercial");
	con2.unitconsume(250);
	con2.showbilldet();
	System.out.println("after discount : "+c2.applybilldiscount(4500));

	
	
	}
}
