package static_finals_programs;
class single_ton {
    private int num1; // Roll Number
    private String name; // Name

    // Private constructor to prevent instantiation
    private single_ton() {
        num1 = 1;
        name = "non_name";
    }

    // Static instance for Singleton
    private static single_ton instance = null;

    // Method to provide the Singleton instance
    public static single_ton getinstance() {
        if (instance == null) {
            instance = new single_ton();
        }
        return instance;
    }

    // Setter for num1 (Roll Number)
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Method to display the Singleton details
    public void displayMessage() {
        System.out.println("This is the Singleton instance called with Roll Number: " + num1 + " and Name: " + name);
    }
}

public class singleton_class {
    public static void main(String[] args) {
        // Get the Singleton instance
        single_ton obj = single_ton.getinstance();

        // Set name and roll number
        obj.setNum1(101); // Setting Roll Number
        obj.setName("malik"); // Setting Name

        // Display the Singleton details
        obj.displayMessage();
    }
}