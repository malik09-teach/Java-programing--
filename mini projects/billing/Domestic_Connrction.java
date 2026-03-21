package OOP_SP25_MID_TERM_EXAM;

public class Domestic_Connrction extends Connection{
    double units;
    Domestic_Connrction(int conection_id ,String type ){
		super(conection_id , type);
		
	 }
	 
	 double unitconsume(double units1 ) {	
		 return units=units1;
			 }
	 
	 
	 
	 double basebill() {
		 return unitconsume(units)*10;
	 }
	  
	 void showbilldet() {
		 System.out.println("conection id:"+connection_id);
		 
		 System.out.println("type :"+ type+"\n UNIT CONSUME:"+units+"\n base bill: "+ basebill());
	 }
	 
	}

