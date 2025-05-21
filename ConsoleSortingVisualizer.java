import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class ConsoleSortingVisualizer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Sorting Visualizer!");
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100); // Generate random numbers between 0 and 99
        }

        System.out.println("Original Array: " + Arrays.toString(array));

        System.out.println("\nChoose a sorting algorithm:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.println("3. Insertion Sort");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                bubbleSort(array);
                break;
            case 2:
                selectionSort(array);
                break;
            case 3:
                insertionSort(array);
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        System.out.println("\nSorted Array: " + Arrays.toString(array));
        scanner.close();
    }

    // Bubble Sort
    private static void bubbleSort(int[] array) {
        System.out.println("\nPerforming Bubble Sort:");
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
                printArray(array); // Print after each pass
            }
        }
    }

    // Selection Sort
    private static void selectionSort(int[] array) {
        System.out.println("\nPerforming Selection Sort:");
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            swap(array, i, minIndex);
            printArray(array); // Print after each pass
        }
    }

    // Insertion Sort
    private static void insertionSort(int[] array) {
        System.out.println("\nPerforming Insertion Sort:");
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
            printArray(array); // Print after each pass
        }
    }

    // Helper method to swap two elements in an array
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // Helper method to print the current state of the array
    private static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
