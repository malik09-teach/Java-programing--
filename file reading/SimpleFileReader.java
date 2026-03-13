package file_reder;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;


// excception is applied which is check the that weather the file exist or not 

public class SimpleFileReader {
    public static void main(String[] args) {
        File file = new File("example.txt"); // Specify the path to your .txt file

        if (!file.exists()) {
            System.out.println("Error: The file does not exist.");
            return;
        }

        if (!file.canRead()) {
            System.out.println("Error: The file cannot be read.");
            return;
        }

        try (FileReader reader = new FileReader(file)) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character); // Print each character from the file
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}