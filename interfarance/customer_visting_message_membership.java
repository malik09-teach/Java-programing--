package interfaces;

interface member {
	void callback();
	
}

class customer implements member {

private String name , id , address,status;
static int count=1;

customer ( String name , String id , String address,String status){
	   this.name = name ;
	   this.id= id; 
	   this.address= address;
    this .status=status;

  
}
	
	
	@Override
public void callback() {
		System.out.println("\n customer call no:"+ count++);
		System.out.println("name :"+ name);
		System.out.println("id  :"+ id);
		System.out.println("address :"+address);
		System.out.println("status :"+ status);
		
	}
	
	
	
}

 class store {
	 
	 member mem[]=new member [100];
	 
	 int count=0;
	 
	 void reg(member m ) {
		 mem[count++]=m;
	 }
	 
	 
	 void invite_to_sale_regmem() {
		 for (int i =0;i<count;i++) {
			 mem[i].callback();
		 }
	 }
	 
 }


public class customer_visting_message_membership {
	
	
public static void main (String []args) {
	customer cos[]=new customer[100];
	cos[0]=new customer("malik ","n1001","KPK"," visiting");
System.out.println();
	cos[1]=new customer("habib ","n1002","pubjanb"," visiting");
	System.out.println();
	cos[2]=new customer("khan ","n1003","sindh"," not visiting");

	
	
	store reg1=new store();
	
	reg1.reg(cos[0]);
	reg1.reg(cos[1]);
	reg1.reg(cos[2]);
	
	reg1.invite_to_sale_regmem();
	
}
	
	
	
}
