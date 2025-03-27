
import java.util.Scanner;

public class Company{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your online assessment status?");
        String examStatus = scanner.nextLine();

       // String examStatus = "Pass";
        if(examStatus == "Pass") {
            System.out.println("Please wait for further rounds");
            String round1Status = "Pass";
            if(round1Status == "Pass"){
                System.out.println("You have cleared round 1 interview, Please wait for round 2 interview");
                String round2Status = "Fail";
                if(round2Status == "Pass"){
                System.out.println("You have cleared round 2 interview, Please wait for HR round");
                }
                else{
                System.out.println("You can go to home");
                }
            }
            else{
                System.out.println("You can go to home");
            }
        }       
        else{
            System.out.println("You can go to home");
        }
    }
}    