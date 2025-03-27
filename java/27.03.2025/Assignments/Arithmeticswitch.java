import java.util.Scanner;

public class Arithmeticswitch{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.err.println("Enter firts number: ");
        double num1 = scanner.nextInt();

        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Enter the target operation : ");
        char operation = scanner.next().charAt(0);

        scanner.close();

         double result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                System.out.println("Result is: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result is: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result is: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result is: " + result);
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operation. Please enter +, -, *, or /");
        }
    }
}