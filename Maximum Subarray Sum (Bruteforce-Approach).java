import java.util.Scanner;

public class Tst {

    public static void main(String[] args) {

        // Create a scanner object to read input from the user
        Scanner ip = new Scanner(System.in);

        // Read two integers n and m, the number of integers in the array and the number of operations
        int n = ip.nextInt();
        int m = ip.nextInt();

        // Create an array arr of size n and initialize all elements to 0
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = 0;
        }

        // Perform m operations on the array
        for (int i = 0; i < m; i++) {

            // Read three integers a, b, and c which represent the operation
            int a = ip.nextInt();
            int b = ip.nextInt();
            int c = ip.nextInt();

            // Perform the operation on the subarray of arr from index a-1 to b-1
            for (int j = a - 1; j < b; j++) {

                // Perform the operation
                int fc = arr[j];
                fc = fc + c;
                arr[j] = fc;
            }
        }

        // Find the maximum element in the array arr
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Print the maximum element
        System.out.println(max);
    }
}
