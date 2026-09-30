class BankAccount {
    private int balance = 1000;

    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        System.out.println(b.getBalance());
    }
}
