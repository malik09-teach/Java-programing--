package OOP_SP25_MID_TERM_EXAM;

public  class Commercial_Conection extends Connection{
    double units;
	 Commercial_Conection(int conection_id ,String type ){
		super(conection_id , type);
		
	 }
	 
	 double unitconsume(double units1 ) {	
		 return units=units1;
			 }
	 
	 
	 
	 double basebill() {
		 return unitconsume(units)*18;
	 }
	  
	 void showbilldet() {
		 System.out.println("\n connectio id:"+connection_id+"\n type :"+type+"\n UNIT CONSUME:"+units+"\n base bill: "+ basebill());
	 }
	 
	}


