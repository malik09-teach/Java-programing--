package inner_class;
 import java.util.ArrayList;
 



class message{

	
String Sname;
String Rname;
static int count=1;
static int count1=1;
message(String Sname,String Rname){
		this.Sname= Sname;
	 this. Rname= Rname;
	
	}
	interface message_sender{
	public 	void sender();
	}

	abstract class message_reciver {
public abstract void reciver ();		
	}
	
	void messaging () {
		message_sender m1=new message_sender(){
		@Override
		
			public void sender() {
			System.out.println("sender no :"+count++ +" name :"+Sname);
					}
	};
	m1.sender();
	
	
	message_reciver R1=new message_reciver () {
		
	public 	void reciver() {
		System.out.println("reciver  no :"+count1++ +" name :"+Rname);
		
		}
	};
	 R1.reciver();
	
}
	}

public class anonymus_classes {
 public static void main (String []args) {
	 ArrayList <message> messages=new ArrayList<>();
	 
	 messages.add(new message("malik ","shoiab"));
	 messages.add(new message("arsalan  ","shoiab"));
	 messages.add(new message("shoiab ","arsaln"));
	 
	 for (message msg :messages) {
		 msg.messaging();
	 }
	 
	 
 }
	
	
}
