package exception;

import java.util.Scanner;

// Step 1: Create user-defined exception
class MINBAL extends Exception {
    MINBAL(String message) {
        super(message);
    }
}

// Step 2: Main class to check balance
public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input balance
        System.out.print("Enter account balance: ₹");
        int balance = sc.nextInt();

        try {
            // Step 3: Check for minimum balance
            if (balance < 500) {
                throw new MINBAL("Balance is below ₹500. Minimum balance requirement not met.");
            } else {
                System.out.println("Balance is sufficient: ₹" + balance);
            }
        } catch (MINBAL e) {
            // Handle the custom exception
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}
