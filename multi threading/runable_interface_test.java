package multi_threadeing;
 import java.util.Random;
class test_multi_table implements Runnable {
	@Override  
	public void run () {
try {
		
		fun();
	}

	catch (Exception e) {
		System.out.println(" problem the thread "+e);
	}
	}
	
	
	
	void  fun () {
		
		Random r= new Random ();
		
		int  min = 1;
		int maxx = 100;
		
		int arr[] = new int[100];
		int i=0;
		for ( i =0; i <100;++i) {
		
			int rand= r.nextInt(maxx-min+1)+min;
			
			arr[i]=rand;
			 
			System.out.println(" std no B24 :"+i+" : s.no  :"+arr[i]);
		}
	}

}



// while it can  also done inside the own class 



public class runable_interface_test {

	
	 public static void main (String []arg) {
		 
		 test_multi_table t= new test_multi_table (); 
		 Thread th1= new Thread (t);
		th1.start();
		 
		 
		 
	
	
			
			Random r= new Random ();
			
			int  min = 1;
			int maxx = 100;
			
			int arr []= new int [100];
			int i=0;
			for ( i =0; i <100;++i) {
			
				int rand= r.nextInt(maxx-min+1)+min;
				
				arr[i]=rand;
				 
				System.out.println(" std no B25 :"+i+" : s.no  :"+arr[i]);
			}
		}
		
		
		 
		 
		 
	 
}
