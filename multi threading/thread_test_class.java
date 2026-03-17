package multi_threadeing;


// using the class  thread..
class threadtest extends Thread{
	@Override 
	public void run() {
		fun();
	}
	
void fun() {
	
	int a =0;
	int i=0;
	while (i<1000 ) {
		
		System.out.println(a+":hello");
		a++;
		i++;
	}
}
}


// if we not add the thread so it will not run it separatly 


public class thread_test_class {
 public static void main ( String []args) {

	 
	 threadtest t1=new threadtest();
	 t1.start();
	 
	
	 int a =0;
	 int i=0;
		while (i <1000) {
			
			System.out.println(a+":world");
			a++;
			
			i++;
		} 
	 
	
}}
