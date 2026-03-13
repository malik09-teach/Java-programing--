package file_reder;


import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Given_date_convertor{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Console Date Information ---");
        System.out.print("Please enter a date (YYYY-MM-DD): ");

        String dateInput = scanner.nextLine();
        LocalDate parsedDate = null;

        try {
           
            parsedDate = LocalDate.parse(dateInput);
            System.out.println("\nYou entered: " + parsedDate);
            System.out.println("Day of the week: " + parsedDate.getDayOfWeek());
            System.out.println("Month: " + parsedDate.getMonth());
            System.out.println("Year: " + parsedDate.getYear());

               if (parsedDate.isAfter(LocalDate.now())) {
                System.out.println("This date is in the future!");
            } else if (parsedDate.isBefore(LocalDate.now())) {
                System.out.println("This date is in the past.");
            } else {
                System.out.println("This date is today!");
            }

        } catch (DateTimeParseException e) {
            System.out.println("Error: Invalid date format. Please use YYYY-MM-DD.");
        } finally {
            scanner.close(); 
        }

        System.out.println("\n--- End of Program ---");
    }
}