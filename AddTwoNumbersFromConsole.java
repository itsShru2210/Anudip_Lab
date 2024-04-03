//Q2 Write a Java program that reads two numbers from the console. Add two numbers and print the output on the console. Use java.io.Console Class to read lines from the console. Convert the Strings to numbers before carrying out the mathematical operations. (Run the program in command prompt only.)

import java.io.Console;

public class AddTwoNumbersFromConsole {
    public static void main(String[] args) {
        Console console = System.console();
        
        if (console == null) {
            System.err.println("No console available");
            System.exit(1);
        }
        
        String firstNumberStr = console.readLine("Enter the first number: ");
        String secondNumberStr = console.readLine("Enter the second number: ");
        
        try {
            double firstNumber = Double.parseDouble(firstNumberStr);
            double secondNumber = Double.parseDouble(secondNumberStr);
            
            double sum = firstNumber + secondNumber;
            
            System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is: " + sum);
        } catch (NumberFormatException e) {
            System.err.println("Invalid input. Please enter valid numbers.");
        }
    }
}
