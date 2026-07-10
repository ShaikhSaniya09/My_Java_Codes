import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Input gross income
        System.out.print("Enter your Gross Income: ");
        double grossIncome = input.nextDouble();

        // 2. Set tax rate (15%)
        double taxRate = 15.0;

        // 3. Calculate tax and net income
        double taxAmount = (taxRate / 100) * grossIncome;
        double netIncome = grossIncome - taxAmount;

        // 4. Display the results
        System.out.println("\n--- TAX SUMMARY ---");
        System.out.printf("Gross Income: $%.2f\n", grossIncome);
        System.out.printf("Tax Deducted (15%%): $%.2f\n", taxAmount);
        System.out.println("-------------------");
        System.out.printf("Net Income (Take-Home): $%.2f\n", netIncome);

        input.close();
    }
}
