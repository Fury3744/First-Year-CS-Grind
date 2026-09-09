import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 1. Open the keyboard pipeline
        Scanner input = new Scanner(System.in);

        // 2. Take user input
        System.out.println("Enter your projected ISE score(out of 20): ");
        int iseScore = input.nextInt();

        System.out.println("Enter your projected MSE score (out of 30: ");
        int mseScore = input.nextInt();

        // 3. Calculate and display
        int totalSoFar = iseScore + mseScore;
        System.out.println("\n--- Mid-Semister Report ---");
        System.out.println("Current Total: " + totalSoFar + " / 50");

        // 4. Control Flow (Decision Making)
        if (totalSoFar >= 45) {
            System.out.println("Status: Elite. You are prefectly positioned for a 9.5+ CGPA.");
        } else if (totalSoFar >= 35) {
            System.out.println("Status: Average. You will need a massive ESE to secure a top grade.");
        } else {
            System.out.println("Status: Danger zone. The curve will be brutal.");
        }
        // 5. Close the pipeline
        input.close();
    }
}