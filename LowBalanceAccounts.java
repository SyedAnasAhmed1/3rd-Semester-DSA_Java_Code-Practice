public class LowBalanceAccounts {
    public static void main(String[] args) {
        // Step 1: Declare and initialize the array with account balances
        int[] accountBalances = {5000, 20000, 15000, 8000, 45000, 1000, 12000, 30000, 7000, 25000};
        
        // Step 2: Check each element in the array for low balance
        System.out.println("Account No. | Balance Status");
        for (int i = 0; i < accountBalances.length; i++) {
            if (accountBalances[i] < 10000) {
                // Print the account number (i+1) and balance
                System.out.println("Account No. " + (i + 1) + " | Low Balance: " + accountBalances[i]);
            }
        }
    }
}
    

