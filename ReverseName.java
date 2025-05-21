import java.util.Scanner;
public class ReverseName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for full name
        System.out.print("Enter your full name: ");
        String name = scanner.nextLine();

        System.out.println("Reversed Name: " + reverse(name));
    }

    // Recursive function to reverse a string
    public static String reverse(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
