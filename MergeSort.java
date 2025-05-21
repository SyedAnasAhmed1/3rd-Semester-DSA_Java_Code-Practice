import java.util.Arrays;
import java.util.Random;
public class MergeSort {
    public static void main(String[] args) {
        int[] array = new int[10];
        // Generate 10 random numbers
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100); // Random numbers between 0-99
        }
        System.out.println("Original Array: " + Arrays.toString(array));
        mergeSort(array, 0, array.length - 1);
    }
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            // Sort left half
            mergeSort(array, left, mid);
            // Sort right half
            mergeSort(array, mid + 1, right);
            // Merge the sorted halves
            merge(array, left, mid, right);
            System.out.println("After merging (" + left + ", " + right + "): " + Arrays.toString(array));
        }
    }
    public static void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];
        // Copy data to temporary arrays
        System.arraycopy(array, left, leftArray, 0, n1);
        System.arraycopy(array, mid + 1, rightArray, 0, n2);
        // Merge temporary arrays back into original array
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }
        while (i < n1) {
            array[k++] = leftArray[i++];
        }
        while (j < n2) {
            array[k++] = rightArray[j++];
        }
    }
}
