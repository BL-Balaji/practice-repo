package fifth_session;

class BankAccount {
    private double balance; // hidden from outside

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        return balance; // controlled access
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(500);  // ✅ valid way
        System.out.println("Balance: " + account.getBalance());

        // ❌ Not allowed (balance is private)
        // account.balance = 1000;
    }
}

