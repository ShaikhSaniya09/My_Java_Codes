import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        long number = scanner.nextLong();
        
        if (isPerfect(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
        
        scanner.close();
    }

    public static boolean isPerfect(long num) {
        if (num <= 1) {
            return false; 
        }

        long sum = 1; 

        for (long i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                if (i * i == num) {
                    sum += i; 
                } else {
                    sum += i + (num / i); 
                }
            }
        }

        return sum == num;
    }
}
