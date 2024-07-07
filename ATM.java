import java.util.Scanner;
// Class representing the ATM
class ATM {
    private double balance;

    // Constructor to initialize balance
    public ATM(double initialBalance) {
        balance = initialBalance;
    }

    // Method to check balance
    public void checkBalance() {
        System.out.println("Your balance is: $" + balance);
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal cancelled.");
        } else {
            balance -= amount;
            System.out.println("$" + amount + " withdrawn successfully.");
            System.out.println("Remaining balance: $" + balance);
        }
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("$" + amount + " deposited successfully.");
        System.out.println("Current balance: $" + balance);
    }
}

// Main class to test the ATM functionalities
public class Main {
    public static void main(String[] args) {
        // Creating an ATM object with initial balance of $1000
        ATM atm = new ATM(1000.0);

        // Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Main menu for ATM operations
        while (true) {
            System.out.println("\nATM Operations:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
