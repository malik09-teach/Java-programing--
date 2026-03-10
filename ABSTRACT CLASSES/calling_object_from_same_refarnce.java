package abstract_classes;



	abstract class Animal {
	    public abstract void makeSound();
	}

	class Dog extends Animal {
	    public void makeSound() {
	        System.out.println("Bark");
	    }

	    public void wagTail() {
	        System.out.println("Dog is wagging tail");
	    }
	}

	class Cat extends Animal {
	    public void makeSound() {
	        System.out.println("Meow");
	    }

	    public void scratch() {
	        System.out.println("Cat is scratching");
	    }
	}

	public class calling_object_from_same_refarnce {
	    public static void main(String[] args) {
	        Animal a1 = new Dog(); // Upcasting
	        Animal a2 = new Cat(); // Upcasting

	        a1.makeSound(); // Outputs: Bark
	        a2.makeSound(); // Outputs: Meow

	        // Downcasting
	        if (a1 instanceof Dog) {
	            ((Dog) a1).wagTail(); // Safe downcast
	        }

	        if (a2 instanceof Cat) {
	            ((Cat) a2).scratch(); // Safe downcast
	        }
	    
	}
	
}
