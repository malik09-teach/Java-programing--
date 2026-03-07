package week_07;
import java.util.ArrayList;
import java.util.Scanner;

class Item {
    String name;
    int quantity;
    double price;

    Item(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String displayDetails() {
        return "Item{name='" + name + "', quantity=" + quantity + ", price=" + price + '}';
    }
}

public class InventoryManagementSystem {
	// the dynamic array which can be shrink or extend .
    private ArrayList<Item> inventory = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addItem() {
        System.out.print("Enter item name: ");
        String name = scanner.nextLine();
        System.out.print("Enter item quantity: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter item price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        inventory.add(new Item(name, quantity, price));
    }

    public void updateQuantity() {
        System.out.print("Enter item name: ");
        String name = scanner.nextLine();
        for (Item item : inventory) {
            if (item.name.equals(name)) {
                System.out.print("Enter new quantity: ");
                item.quantity = scanner.nextInt();
                scanner.nextLine(); 
                return;
            }
        }
        System.out.println("Item not found!");
    }

    public void removeItem() {
        System.out.print("Enter item name: ");
        String name = scanner.nextLine();
        inventory.removeIf(item -> item.name.equals(name));
    }

    public void searchItem() {
        System.out.print("Enter item name: ");
        String name = scanner.nextLine();
        for (Item item : inventory) {
            if (item.name.equals(name)) {
                System.out.println(item.displayDetails());
                return;
            }
        }
        System.out.println("Item not found!");
    }

    public void calculateTotalValue() {
        double totalValue = 0;
        for (Item item : inventory) {
            totalValue += item.quantity * item.price;
        }
        System.out.println("Total inventory value: " + totalValue);
    }

    public void menu() {
        while (true) {
            System.out.println("1. Add Item\n2. Update Quantity\n3. Remove Item\n4. Search Item\n5. Calculate Total Value\n6. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
            //using  the acessor to direct access the case ->
                case 1 -> addItem();
                case 2 -> updateQuantity();
                case 3 -> removeItem();
                case 4 -> searchItem();
                case 5 -> calculateTotalValue();
                case 6 -> System.exit(0);
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    public static void main(String[] args) {
    	
    	//using the class function directly .......
        new InventoryManagementSystem().menu();
    }
}