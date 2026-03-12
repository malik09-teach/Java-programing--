package inner_class;

class outerclass{
	int x =10;
	
	class inneer{
		int y=20;
		
		void dispinter() {
		// the internal class can directly access the extrnal class entaties butt the outer class cant be acces the internal class with out any object 
			
			System.out.println ("accessing the internal \n"+"x:"+x+",  y :"+y);
		
		}
	}
	//make the object insteade in method   in outer class so it will accessible in every method
	inneer i=new inneer();
	
	void showingext() {
		
		i.dispinter();
		System.out.println ("\n accessing the member of internal class by  external class :"+i.y);
	}
}


public class inner_classes {
  
	public static void main (String []args) {
		// we can access the in class by using the refrance of extranal or internal by refrancceing the extranl 
		
		outerclass ob1=new outerclass ();
		System.out.println ("\n accessing the object of internal by external class ");
		ob1.showingext();
		
		
		// this is the  objecrt for the interna class which are accessing the the methods of the inner class 
		
		
		
		outerclass.inneer ob2=new outerclass().new inneer ();
		System.out.println ("\n accessing the object of internal by it self ");
		ob2.dispinter();
		
	}
	
	
}
