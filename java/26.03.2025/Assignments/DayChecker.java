
import java.util.Scanner;

public class DayChecker{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the day: ");
        String day = scanner.next().toLowerCase();
        if (day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || 
            day.equals("thursday") || day.equals("friday")) {
            System.out.println("Uff, It's a weekday");
        } else if (day.equals("saturday") || day.equals("sunday")) {
            System.out.println("Yayy, It's a weekend");
        } else {
            System.out.println("Invalid day! Please enter a valid day.");
        }

        scanner.close();
    }
}