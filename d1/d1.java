package d1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class d1 {
    public static void main(String[] args) {
        // Specify the path to the input.txt file
        String filePath = "d1/input.txt";

        // Initialize variables
        File file = new File(filePath);
        BufferedReader reader = null;

        try {
            // Create a BufferedReader to read from the file
            reader = new BufferedReader(new FileReader(file));

            String line;
            while ((line = reader.readLine()) != null) {
                // Process each line from the file here
                System.out.println(line); // For example, you can print the line
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}