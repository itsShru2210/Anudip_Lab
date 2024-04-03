import java.util.Scanner;

public class IntegerConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number:");

        try {
            String userInput = scanner.nextLine();

            if (userInput == null) {
                throw new NullPointerException("Input is null.");
            }

            int number = Integer.parseInt(userInput);
            System.out.println("The integer value is: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Input is not a valid integer.");
        } catch (NullPointerException e) {
            System.out.println("Error: Input is null.");
        }
    }
}
