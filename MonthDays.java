import java.time.Month;

public class MonthDays {
    public static void main(String[] args) {
        System.out.println("Month\t\tNumber of Days");
        System.out.println("============================");

        for (Month month : Month.values()) {
            int daysInMonth = month.length(false); // Assuming non-leap year
            System.out.println(month + "\t\t" + daysInMonth);
        }
    }
}
