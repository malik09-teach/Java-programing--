package inner_class;
import java.util.LinkedList;
import java.util.ArrayList;
class outer {
	static int coount=1;
	
	
	void accesing_local_iner_class() {
	class local_in_class{
			
	  String name ="abbas";
	 void show_name() {
		 System.out.println(name);
		 
	 }
	 // shoud be create obj in the method due to for temp access
	
	 // butt this object will only accessible in the method other wise it will not accessible in the outer class and the
	
		}
	 
	// we can creat the object in the method for accessing the inner loacal  class
	
	local_in_class obj1=new  local_in_class ();
	 System.out.println("calll no : "+coount++);
	obj1.show_name();
	}

//local_in_class obj3=new  local_in_class ();

}


public class local_inner_class {
// implementing for the specific class which can be brow from the interface or abstarct class 

	public static void main (String [] args) {
		
		outer obect=new outer ();
		obect.accesing_local_iner_class();//simple way
		
		
		ArrayList <outer>objlist2=new ArrayList<>(); 
		LinkedList <outer>objList=new LinkedList <>();
		
		objlist2.add(new outer ());
		objlist2.add(new outer());
		objlist2.add(new outer ());
		
		   objList.add(new outer());
		   objList.add(new outer()); // Adding multiple objects do the list is doing to to add multple ibjects in the list  
		   objList.add(new outer());

	        // Iterate through the list and call `accesing_local_iner_class()` for each object
	        for (outer obj : objList) {
	        System.out.println ("\n showing the linklist objects:");
	        	obj.accesing_local_iner_class();
	        }
	        for (outer obj1 :objlist2) {
	        	System.out.println ("\n showing the aarray list  objects:");
	        	obj1.accesing_local_iner_class();
	        }
	        
	        
	
	}
	
}
 