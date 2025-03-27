
import java.util.Scanner;

public class EvenOdd{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        switch (number % 2){
            case 0:
                System.out.println("Given number is even");
            break;
            case 1:
                case -1:
                    System.out.println("Given number is odd");
                    break;
                default:
                    System.out.println("Invalid input");
        }
    }
}