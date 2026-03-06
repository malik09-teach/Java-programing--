package inhertance;
import java.util.Scanner ;


class account {
	private String name ;
	private  int  account_num;
	protected 	double balance ;
	private  String add;
	private	int phone_no ;
	
	 account(String name ,int account_num,double balance ,String add,int phone_no ){
		   this.name= name ;
		   this.account_num=  account_num;
			this.balance= balance ;
		this.add=	add;
			this.phone_no =phone_no ;
	}
	
	 account(String name ,int account_num ,String add,int phone_no ){
		   this.name= name ;
		   this.account_num=  account_num;
		this.add=	add;
			this.phone_no =phone_no ;
	}
	 
	 
	
	void showDetails() {
		
	 System.out.print("\n name : "+name+"\n account number :"+account_num+"\n balance : "+balance+"\n address :"+add+" \n phone no :"+phone_no) ;
	 
	}
	void showDetails2() {
		
		 System.out.print("\n name : "+name+"\n account number :"+account_num+"\n address :"+add+" \n phone no :"+phone_no) ;
		 
		} 
	
}
class savings extends  account{
	 
	protected double addmoney;
	protected double wdmoney;
	
	savings(String name ,int account_num,double balance ,String add,int phone_no ,double addmoney,double wdmoney)
	{
		
		
		super ( name ,account_num, balance , add, phone_no);

	this.addmoney=addmoney;
 this.wdmoney=wdmoney;
	
	}
	
void deposite() {
	super.balance+=addmoney;
         showDetails(); 
         
}
	
void withdraw() {
	
	System.out.println("\n  TOTAL BALANCE :"+super.balance+"\n");

	if (wdmoney>super.balance) {

		 System.out.println("\n you are widthdrwaing out of rang  "+wdmoney+"\n");

	}
	else {
		super.balance-=wdmoney;
	showDetails();
}
	}
 

	
}
	class loan extends account {

		protected double local_laon;
		protected double toploan;
		protected double retbalance 	;

		
		
		loan(String name ,int account_num,String add,int phone_no ,double local_loan1,double toplaon1,double retbalance )
		{
			super ( name ,account_num , add, phone_no);

		this.local_laon=local_loan1;
	 this.toploan=toplaon1;
		this.retbalance=retbalance ;
		
	
}
		loan(String name ,int account_num,String add,int phone_no ,double local_loan1,double toplaon1 )
		{
			super ( name ,account_num , add, phone_no);

		this.local_laon=local_loan1;
	 this.toploan=toplaon1;		
	
}
		void  detial_laon() {
			tot_loan();
			pay_emi();
			
			
		}
		

   protected void  tot_loan(){
		
	   
			System.out.println("max loan  you can get  :"+toploan +"\n ************************************"  );
		
			
			if(local_laon>toploan ) {
				
				
				System.out.println("\n loan you get which is out of rang   :"+local_laon+"\n");
			}	
			else {
			showDetails2();
			System.out.println("\n");
			System.out.println(" \n loan you get  :"+local_laon+"\n");
			 }
			
		}
		
		
	protected void pay_emi() {
				 
		 // equted monthly installments

		 double intsltalment=(local_laon +(local_laon *10/100))/12;
	
	System.out.println("***********************\n payment on installment :"+intsltalment+" per month");	
	
	
	
	 }
	 
	
	 
	 
	 void repayment() {
		 
		 if (retbalance == local_laon)
			 
		 {
			 showDetails2();
				System.out.println("\n");
			 System.out.println("\n");
			
			 System.out.println("\n loan  :"+local_laon + "\n AFTER PAYING loan reamin  :"+(local_laon -retbalance)+"\n");
			 
		 }
		 else if (retbalance > local_laon) {
			 showDetails2();
				System.out.println("\n");
			 
			 System.out.println(" loan reamin  :"+local_laon+"\n");
			 
			 System.out.println(" change after loan   :"+(local_laon -retbalance)+"\n");
	
		 }
		 else {
			 showDetails2();
				System.out.println("\n");
			 
			 System.out.println(" loan reamin  :"+local_laon+"\n");
	
	  } 
	 }
	}

	
	
	
	
public class bank_acc_system {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
 
		
		System.out.println(" select below....   \n 1: for account \n 2: for deposit \n 3 : for widthdraw \n 4 : loan you got \n 5 : for repay loan"  + "\n ");
		
		int num=sc.nextInt();
		
	if(num==1) { 
	account acc1=new account( "malik",32452,342244,"tooormang",38327432);
	acc1.showDetails();
	
	}
	else if(num==2) {
		account acc1=new account( "malik",32452,342244,"tooormang",38327432);
		acc1.showDetails();
		
		System.out.println("\n");
		
		savings acc2=new savings("malik",32452,342244,"tooormang",3347,2234,33221243);
	acc2.deposite();
		
	}
	else if(num==3) {
	
		account acc1=new account( "malik",32452,342244,"tooormang",38327432);
		acc1.showDetails();
		
		System.out.println("\n");
	
		savings acc2=new savings("malik",32452,342244,"tooormang",3347,2234,3322123);
		acc2.withdraw();
	}
		else if(num==4) {
			System.out.println("\n");
			
			loan acc3=new loan("malik",32452,"tooormang",3347123,45880,1000000.60);
			acc3.detial_laon();
		}
			else if(num==5) {
			
				loan acc3=new loan("malik",32452,"tooormang",3347123,45880,1000000.60,40080);
			acc3.repayment();
			}
	
	System.out.println("\n");

	}
	
}
