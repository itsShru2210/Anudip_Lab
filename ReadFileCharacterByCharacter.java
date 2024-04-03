//Q1 Write a Java program that reads an input file from the file system and outputs the content of the file character by character. Use FileReader.read() method to read characters from the file. At the end, print the total number of characters present in the file. 

import java.io.FileReader;
import java.io.IOException;

public class ReadFileCharacterByCharacter {
    public static void main(String[] args) {
        String fileName = "samplefile.txt"; 
        int character;
        int totalCharacters = 0;

        try (FileReader fileReader = new FileReader(fileName)) {
            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character); // Print each character
                totalCharacters++; // Increment the total number of characters
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

        System.out.println("\nTotal number of characters in the file: " + totalCharacters);
    }
}
