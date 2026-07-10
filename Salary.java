import java.util.Scanner;

public class SimpleSalary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Get inputs from the user
        System.out.print("Enter hours worked: ");
        double hours = input.nextDouble();

        System.out.print("Enter hourly rate: ");
        double rate = input.nextDouble();

        // 2. Calculate total salary
        double totalSalary = hours * rate;

        // 3. Display the result
        System.out.println("Total Salary: $" + totalSalary);

        input.close();
    }
}
