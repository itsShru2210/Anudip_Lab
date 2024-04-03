import java.util.InputMismatchException;
import java.util.Scanner;

public class MismatchInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an integer:");

        try {
            int num = scanner.nextInt();
            System.out.println("You entered: " + num);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer.");
        }
    }
}
