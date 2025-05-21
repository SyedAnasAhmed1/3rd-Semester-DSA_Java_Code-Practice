import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take array size and input
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Selection Sort
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the elements
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;

            // Print current iteration
            System.out.println("Iteration " + (i + 1) + ":");
            for (int k = 0; k < n; k++) {
                System.out.println("Value: " + array[k] + ", Location: " + k);
            }
        }
    }
}
