package file_reder;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileOpreation {
    public static void main(String[] args) {
        String filePath = "example1reader.txt"; // File to create and operate on

        // Step 1: Create and write data to the file
        try {
            File file = new File(filePath);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            FileWriter writer = new FileWriter(file);
            writer.write("This is a sample text written to the file.\n");
            writer.write("Java programming is fun!");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred during file creation or writing: " + e.getMessage());
        }

        // Step 2: Read data from the file
        try (FileReader reader = new FileReader(filePath)) {
            int character;
            System.out.println("Reading from file:");
            while ((character = reader.read()) != -1) {
                System.out.print((char) character); // Print each character from the file
            }
        } catch (IOException e) {
            System.out.println("An error occurred during file reading: " + e.getMessage());
        }
    }
}