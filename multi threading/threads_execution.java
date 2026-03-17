package multi_threadeing;


class thread1 extends Thread{
	@Override 
	public void run() {
		int a =0 ;
		
		
		while(a<1000000000) {
		System.out.	println(a+"thread1");
		a++;
	
		}
	}
	
}



public class threads_execution {

	public static void main (String []arg) throws Exception  {
		
	
		thread1 t1= new thread1();
		
		
// by on sleeping method when the main method will end with  the thread
		/*t1.setDaemon(true);
		t1.start();
		 Thread.sleep(100);
		
		
		//by on joining method when the main method will end with  the thread
		// best way also for another threads also 
		
		t1.setDaemon(true);
		t1.start();
	
		
		Thread MainThread= Thread.currentThread();
		MainThread.join();
	*/	
		
		
		
		
		
		
		
		
		
		// the yield is method to allow the cpu to excute also another threads for workiong and then also the run it slef
	//  for the prioerity also matter here how to do that 
		
		
		t1.start();
		
	int a =0 ;
		while(a<1000000000) {
		System.out.	println(a+"mainthread1");
		a++;
	
		}
      Thread.yield();
	
		
		
		
		
		
	}
	
	
}
