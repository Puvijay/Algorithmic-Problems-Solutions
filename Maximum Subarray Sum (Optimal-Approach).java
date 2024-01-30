import java.util.Scanner;

public class Tst {

    public static void main(String[] args) {
        // Initialize a scanner to read input
        Scanner scanner = new Scanner(System.in);

        // Read the number of elements in the array and the number of operations
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // Initialize a prefix sum array with a size of n + 1
        long[] a = new long[n + 1];

        // Process each operation
        for (int i = 0; i < m; i++) {
            // Read the left and right indices and the value to add
            int l = scanner.nextInt() - 1;
            int r = scanner.nextInt();
            int v = scanner.nextInt();

            // Add the value to the prefix sum at the left index
            a[l] += v;

            // Subtract the value from the prefix sum at the right index + 1
            a[r + 1] -= v;
        }

        // Initialize variables to calculate the maximum prefix sum
        long cur = 0;
        long max = 0;

        // Iterate over the prefix sum array
        for (int i = 0; i < n; i++) {
            // Add the current prefix sum to the running sum
            cur += a[i];

            // Update the maximum prefix sum if necessary
            max = Math.max(max, cur);
        }

        // Output the maximum prefix sum
        System.out.println(max);

        // Close the scanner
        scanner.close();
    }
}
