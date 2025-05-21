import java.util.Scanner;
public class SumUsingRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for N
        System.out.print("Enter a positive integer (N): ");
        int n = scanner.nextInt();

        System.out.println("Sum from 1 to " + n + " is: " + calculateSum(n));
    }
    // Recursive function to calculate sum
    public static int calculateSum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + calculateSum(n - 1);
    }
}
