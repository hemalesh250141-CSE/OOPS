class BankAccount {
    private int balance = 5000;

    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        System.out.println("Balance = " + b.getBalance());
    }
}
