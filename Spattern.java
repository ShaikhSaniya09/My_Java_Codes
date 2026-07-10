
public class SPattern {
    public static void main(String[] args) {
        // Height of the letter 'S' (optimal with an odd number >= 7)
        int height = 7; 
        int width = 5;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Logic to draw the letter 'S'
                if (
                    // Top line, Middle line, and Bottom line
                    ((i == 0 || i == height / 2 || i == height - 1) && j > 0 && j < width - 1) ||
                    // Left curve (Top half)
                    (j == 0 && i > 0 && i < height / 2) ||
                    // Right curve (Bottom half)
                    (j == width - 1 && i > height / 2 && i < height - 1)
                ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Move to the next line after completing each row
            System.out.println();
        }
    }
}
