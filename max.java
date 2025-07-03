import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of elements
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Declare and initialize array
        int[] arr = new int[n];

        // Input: elements from user
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find maximum element
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Output: maximum value
        System.out.println("Maximum element: " + max);

        sc.close();
    }
}
