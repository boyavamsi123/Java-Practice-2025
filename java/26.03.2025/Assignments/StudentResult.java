import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Student marks
        System.out.print("Enter student marks: ");
        int marks = scanner.nextInt();

        // Determine grade
        if (marks < 35) {
            System.out.println("Fail");
        } else if (marks == 35) {
            System.out.println("Pass");
        } else if (marks > 35 && marks <= 70) {
            System.out.println("Third Class");
        } else if (marks > 70 && marks <= 85) {
            System.out.println("Second Class");
        } else {
            System.out.println("First Class");
        }

        scanner.close();
    }
}