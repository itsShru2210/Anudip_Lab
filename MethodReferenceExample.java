// Write a Java program that demonstrates the use of method references for static methods. Create a functional interface and use a method reference to call a static method that calculates the square of a number.

// Functional interface with a method that takes an integer and returns an integer
interface NumberFunction {
    int calculateSquare(int num);
}

public class MethodReferenceExample {
    // Static method to calculate the square of a number
    public static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        // Method reference to the static method 'square'
        NumberFunction numberFunction = MethodReferenceExample::square;
        
        // Call the method using the functional interface and method reference
        int result = numberFunction.calculateSquare(5);
        
        // Print the result
        System.out.println("Square of 5 is: " + result);
    }
}
