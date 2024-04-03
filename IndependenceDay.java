import java.time.LocalDate;
import java.time.MonthDay;
import java.util.Scanner;

public class IndependenceDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get today's date
        LocalDate today = LocalDate.now();

        // Create a MonthDay object for Independence Day (15th August)
        MonthDay independenceDay = MonthDay.of(8, 15);

        System.out.println("Enter the date (in format MM-DD):");
        String userInput = scanner.nextLine();

        try {
            // Parse user input to LocalDate
            LocalDate userDate = LocalDate.parse("2024-" + userInput);

            if (userDate.getMonthValue() == 8 && userDate.getDayOfMonth() == 15) {
                System.out.println("Today is Independence Day!");
            } else {
                if (MonthDay.from(userDate).isBefore(independenceDay)) {
                    System.out.println("Independence day is yet to come this year.");
                } else {
                    System.out.println("Independence day was already celebrated this year.");
                }
            }
        } catch (Exception e) {
            System.out.println("Invalid date format. Please enter date in MM-DD format.");
        }

        scanner.close();
    }
}
