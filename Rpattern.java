public class RPattern {
    public static void main(String[] args) {
        // Height of the letter 'R' (odd numbers work best)
        int height = 9; 
        int width = 5;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // 1. Left vertical line of the R
                // 2. Top horizontal curve (i == 0) and Middle horizontal curve (i == height / 2)
                // 3. Right vertical loop close (j == width - 1) only for the top half
                // 4. Diagonal leg (i - j == height / 2) for the bottom half
                if (j == 0 || 
                   ((i == 0 || i == height / 2) && j < width - 1) || 
                   (j == width - 1 && i < height / 2 && i > 0) || 
                   (i > height / 2 && i - j == height / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next row
        }
    }
}
