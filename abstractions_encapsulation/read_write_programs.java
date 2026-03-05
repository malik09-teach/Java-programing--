package abstraction_encapsulation_constructor;

public class read_write_programs {

  void  readableprograms() {
		
		int acc_no=125654323;
		
		//showing the program logicly that the program will  not modify 
		
		System.out.println ("account no : "+acc_no );
		
	}
	
	 void writableprog() {
		// will show that the program can be modify after the given valve 
		
		int balance=229033;
		System.out.println ("account balance :"+balance  );
		
		
		balance =modify(balance);
		
		System.out.println ("after modify account balance +500 :"+balance  );
		
		
	}

	int modify  (int mod_bal) {
		
		 return mod_bal+=500;
		
	}
	
	
	
	public static void main(String[] args) {
		
		read_write_programs obj=new read_write_programs();
	
		System.out.println ("the readable funtion :" );
		obj.readableprograms();
		System.out.println ("the writable funtion dur to update balnce :" );
		obj.writableprog();
	}

}
