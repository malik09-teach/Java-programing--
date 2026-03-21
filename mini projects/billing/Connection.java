package OOP_SP25_MID_TERM_EXAM;

public class Connection {
	
	
	int connection_id ;
	 String type ;
	 
	 Connection(int connection_id ,String type){
		 
		 this.connection_id= connection_id;
	 this.type=type;
	 }
	 

	 
	 double unitconsume(double units ) {
	return units;	 
	 }
	 
	 double basebill()
	 {
		 return 0;
	 }
}




