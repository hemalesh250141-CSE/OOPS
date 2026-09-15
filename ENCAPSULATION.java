class BankAccount {

    private double balance;

    public void setBalance(double amount) {
        if (amount >= 0) {
            balance = amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.setBalance(5000);

        System.out.println("Balance: " + account.getBalance());
    }
}
