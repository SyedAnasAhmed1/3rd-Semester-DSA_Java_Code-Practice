import java.util.Scanner;

public class DescendingOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for k
        System.out.print("Enter an integer value (k): ");
        int k = scanner.nextInt();

        System.out.println("Sequence from " + k + " to 0:");
        for (int i = k; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
}
