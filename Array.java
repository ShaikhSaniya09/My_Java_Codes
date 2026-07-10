import java.util.Arrays;

public class ManualSort {
    public static void main(String[] args) {
        int[] numbers = {15, 3, 9, 1, 24, -5, 12};
        int n = numbers.length;

        // Loop through the array elements
        for (int i = 0; i < n - 1; i++) {
            // Last i elements are already in place, no need to check them
            for (int j = 0; j < n - i - 1; j++) {
                
                // Swap if the current element is greater than the next
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        System.out.println("Manually Sorted Array: " + Arrays.toString(numbers));
    }
}
