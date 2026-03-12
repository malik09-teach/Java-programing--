package inner_class;

class newinnerclass{


    private static int value = 10;
    int b=33;
    
    static class Asss{    
    // only will take the static member 
    	
    public static void display() {
        System.out.println("Value is: " + value);
    }
    
}
    
 
    
}


public class static_class_access {
    public static void main(String[] args) {
//for creating the the static class object and the accessing the iner class details using the outer class refrance     

    	newinnerclass.Asss obj =new newinnerclass.Asss(); 
    	System.out.println("Value is printed by inner class object: ");
    	obj.display();
    	

    	newinnerclass objouter= new newinnerclass();
    	
    	System.out.println("Value is printed by outer class object:\n valve is : " +objouter.b);
    }



}