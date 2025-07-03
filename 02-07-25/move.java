public class move {
    public static void main(String[] args) {
        int[] arr = {0, 1, 3, 0, 5, 0};
        int n = arr.length;
        int index = 0;
        // Move non-zero elements to the front
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }
        // Fill remaining positions with zeroes
        while (index < n) {
            arr[index++] = 0;
        }
        // Print result
        System.out.print("Array after moving zeroes to end: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
