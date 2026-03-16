package week_08;

class engine{
	void start() {
		System.out.println("start the engine....");
		
	}
}

class swtich{
	void rotate() {
		System.out.println("rotate the swtich....");
	
	}
}


class car
{
	private engine eng;
	private swtich sw;
	
	public car() {
		eng=new engine();
		sw=new swtich();
	}
	
	void carload() {
		sw.rotate();
		eng.start();
		System.out.println("the car is going...");
	}
	
	
}


public class car_compostion_prac {
	public static  void main (String []args) {
		
		
		car car1=new car();
		
		car1.carload();
		
	}
 
}
