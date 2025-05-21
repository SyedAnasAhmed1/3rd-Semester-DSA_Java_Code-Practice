import java.util.Arrays;

public class ArraySearch {
    public static void main(String[] args) {
        // Step 1: Declare and initialize the array
        int[] accountBalances = {5000, 20000, 15000, 8000, 45000, 1000, 12000, 30000, 7000, 25000};
        
        // Step 2: Sort the array (binary search requires sorted array)
        Arrays.sort(accountBalances);
        
        // Step 3: Specify the value to search for
        int target = 15000;
        
        // Step 4: Perform binary search
        int index = Arrays.binarySearch(accountBalances, target);
        
        // Step 5: Output the result
        if (index >= 0) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
        
        // Step 6: Print the sorted array (for reference)
        System.out.println("Sorted Array: " + Arrays.toString(accountBalances));
    }
    
}
