package multi_threadeing;


class test2 implements Runnable {
	
	@Override 
	public void  run() {
	int a=0;
		while ( a<50 ) {
		
System.out.println (a+" :ruing from other threads  ");
a++;
try {
 Thread.sleep(100);

}

catch (Exception c){
	System.out.println(c);
	
}

	}


	}
}



class testing extends Thread{
@Override 
public void run() {
	int a =0;
	while (a<50) {
		System.out.println(a+":the thread is runing no " );
		
		a++;
		try { 
		Thread.sleep(100);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		}
}
	
	

	
	
}





public class construcors_of_threads {

	
	public static void main ( String []args ) {
	
// constructor		 Thread t2=new Thread(new test2(),"name of thread");
		 Thread t2=new Thread(new test2());
	     t2.setName("Th2");
	   t2.setPriority(8);
         	t2.setDaemon(false);

			System.out.println (t2.getName());
			System.out.println (t2.getId());
			System.out.println (t2.getPriority());
			System.out.println (t2.isAlive());	
				System.out.println ("thread2:"+t2.getState());

		 	
		 	
		//setter
    testing t1=new testing ();
    t1.setName("Th1");
    t1.setPriority(10);
	t1.setDaemon(false);
	
	
	//getters
	System.out.println (t1.getName());
	System.out.println (t1.getId());
	System.out.println (t1.getPriority());
	System.out.println (t1.isAlive());	
	System.out.println ("thread 1"+t1.getState());
	
	
	//run time
	t1.start();	
	t1.interrupt();
	t2.start();
	t2.interrupt();


	
	
	}
	
	
	
	
}
