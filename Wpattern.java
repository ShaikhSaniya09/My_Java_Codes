import java.util.Scanner;

public class WPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height for the W pattern: ");
        int height = scanner.nextInt();
        
        // Width of the grid needed to fit the complete W shape
        int width = (height * 4) - 3; 

        // Outer loop controls rows
        for (int i = 0; i < height; i++) {
            // Inner loop controls columns
            for (int j = 0; j < width; j++) {
                
                // Condition to place a star at the correct grid intersection
                if (j == i || 
                    j == (height * 2) - 2 - i || 
                    j == (height * 2) - 2 + i || 
                    j == (height * 4) - 4 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Move to the next row
            System.out.println();
        }
        scanner.close();
    }
}
