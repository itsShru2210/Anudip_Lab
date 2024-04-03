// 1. Write a Java program that uses lambda expressions to manipulate strings. Create lambda expressions to perform the following operations on a given string: ● Convert the string to uppercase ● Convert the string to lowercase ● Reverse the string.

import java.util.function.Function;

public class StringManipulationWithLambda {
    public static void main(String[] args) {
        String inputString = "Hello, World!";
        
        // Lambda expressions to perform string operations
        Function<String, String> toUpperCase = str -> str.toUpperCase();
        Function<String, String> toLowerCase = str -> str.toLowerCase();
        Function<String, String> reverseString = str -> new StringBuilder(str).reverse().toString();
        
        // Perform string operations using lambda expressions
        String upperCaseString = manipulateString(inputString, toUpperCase);
        String lowerCaseString = manipulateString(inputString, toLowerCase);
        String reversedString = manipulateString(inputString, reverseString);
        
        // Print the results
        System.out.println("Original string: " + inputString);
        System.out.println("Uppercase string: " + upperCaseString);
        System.out.println("Lowercase string: " + lowerCaseString);
        System.out.println("Reversed string: " + reversedString);
    }
    
    // Method to apply function on input string
    public static String manipulateString(String inputString, Function<String, String> stringFunction) {
        return stringFunction.apply(inputString);
    }
}
