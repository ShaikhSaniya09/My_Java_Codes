import java.util.Scanner;

public class MarkPercentage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Enter marks for 3 subjects (assuming max 100 marks per subject)
        System.out.print("Enter marks for Subject 1: ");
        double sub1 = input.nextDouble();

        System.out.print("Enter marks for Subject 2: ");
        double sub2 = input.nextDouble();

        System.out.print("Enter marks for Subject 3: ");
        double sub3 = input.nextDouble();

        // 2. Perform calculations
        double totalMarks = sub1 + sub2 + sub3;
        
        // Total maximum marks for 3 subjects is 300
        double maxMarks = 300.0; 
        double percentage = (totalMarks / maxMarks) * 100;

        // 3. Display results
        System.out.println("\n--- RESULTS ---");
        System.out.println("Total Marks Obtained: " + totalMarks + " out of " + maxMarks);
        System.out.printf("Total Percentage:     %.2f%%\n", percentage);

        input.close();
    }
}
