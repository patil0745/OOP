// Custom exception for insufficient funds
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// BankAccount class
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit funds
    public void deposit(double amount) {
        balance += amount;
    }

    // Method to withdraw funds
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds");
        }
        balance -= amount;
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }
}

// BankApplication class demonstrating the use of BankAccount
public class Q4 {
    public static void main(String[] args) {
        BankAccount account = null; // Declare account variable here
        try {
            // Create a bank account with initial balance
            account = new BankAccount(1000);

            // Simulate user input for deposit and withdrawal
            double depositAmount = 500;
            double withdrawalAmount = 1600;

            // Deposit amount
            account.deposit(depositAmount);
            System.out.println("Deposit of " + depositAmount + " successful.");

            // Attempt withdrawal
            account.withdraw(withdrawalAmount);
            System.out.println("Withdrawal of " + withdrawalAmount + " successful.");
        } catch (InsufficientFundsException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            if (account != null) {
                // Display current balance regardless of exception
                System.out.println("Current Balance: " + account.getBalance());
            }
        }
    }
}
