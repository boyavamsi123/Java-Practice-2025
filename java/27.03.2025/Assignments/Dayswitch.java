
import java.util.Scanner;

public class Dayswitch{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the day name: ");
        String day = scanner.next().toLowerCase();

        scanner.close();

        switch (day) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println("Uff, It's a weekday");
            break;
            case "saturday":
            case "sunday":
                System.out.println("Yayy, It's a weekend");
            break;
            default:
                System.out.println("Invalid day. pleas enter a valid day name.");
            break;
        }
    }
}