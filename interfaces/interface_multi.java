package interfaces;

interface phone_players{
	
	void music_player ();
	void video_palyer();
	
	//introduce due to in future if some change occoure in the exsisting class so it occoure easily not in whole structure 
	public default void media () {
		System .out.println ("you are not accessed ");
	}
	
}

interface drivers{
public 	void driver1();
public void driver2();
public	void driver3();
public	void driver4();

}


class phone implements phone_players,drivers  {
	
	public	void music_player () {System .out.println ("you are accessed to music player  ");}
	public	void video_palyer(){System .out.println ("you are  accessed to vedio player  ");}
	@Override 
	public	 void media () {System .out.println ("you are  accessed media ");}
	
	public  void driver1() {System .out.println ("you are  accessed driver 1 ");}
	public	void driver2() {System .out.println ("you are  accessed driver 2");}
	public	void driver3(){System .out.println ("you are  accessed driver 3");}
	public	void driver4(){System .out.println ("you are  accessed driver 4");}
	
}

public class interface_multi {

	public static void main (String []args) {
		phone p1 = new phone ();
		
		
		
		p1.driver1();
		p1.driver2();
		p1.driver4();
		p1.driver4();
	
	p1.media();
	p1.music_player();
	p1.video_palyer();
	
	
	
	}
	
	
	
	
}
