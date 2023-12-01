package d1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class d1 {
    public static void main(String[] args) {
        // Specify the path to the input.txt file
        String filePath = "d1/input.txt";

        // Create an array to store the input
        ArrayList<String> inputList = new ArrayList<String>();

        // Create an array to store all the combined digits - in preparation for addition
        ArrayList<Integer> listOfDigits = new ArrayList<Integer>();

        // Initialize variables
        File file = new File(filePath);
        BufferedReader reader = null;

        try {
            // Create a BufferedReader to read from the file
            reader = new BufferedReader(new FileReader(file));

            String line;
            while ((line = reader.readLine()) != null) {
                // Process each line from the file here
                // System.out.println(line); // For example, you can print the line

                // Save each line to an array
                inputList.add(line);
            }

            // Print out the input line by line
            for (String eachLine : inputList) {
                System.out.println(eachLine);

                // Iterate from left to right
                for (int i = 0; i < 5; i++) {
                    System.out.println(i);
                }

                // Iterate from right to left
                for (int j = 0; j < 5; j++) {
                    System.out.println(j);
                }

                // Put these two digits together

            }

            // Add the entire list of digits together

            // Return the result

            // System.out.println(inputList);
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