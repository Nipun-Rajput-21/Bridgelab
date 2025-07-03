import java.util.Scanner;

public class arraysum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of elements
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Declare array
        int[] arr = new int[n];

        // Input: elements from user
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Calculate sum
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // Output: sum of elements
        System.out.println("Sum: " + sum);

        // Calculate and output average
        double average = (double) sum / n;
        System.out.println("Average: " + average);

        sc.close();
    }
}
