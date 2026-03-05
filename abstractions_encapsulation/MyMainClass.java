package abstraction_encapsulation_constructor;

class Animal {

	void sound() {
		System.out.print("animal make sound ");
	}
	
}

class dog extends Animal{
		@Override 
	 void sound() {
	        System.out.println("Dog barks");
		}
}
class Cat extends Animal{
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class MyMainClass {
	
    public static void main(String[] args) {
      
        Animal myAnimal; 
        
        myAnimal = new dog();  
        myAnimal.sound();  

        myAnimal = new Cat();  
        myAnimal.sound();  
    }
}