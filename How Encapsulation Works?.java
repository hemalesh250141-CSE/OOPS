//Why private?
//This:

private double balance;

//means outside code cannot directly do:

account.balance = -5000;

//Instead, it must go through:

account.setBalance(...)

//And we can validate the value:

if (amount >= 0)

//So the class controls its own data.

//Real-time example
//Think about a banking application.
//You shouldn't be able to directly modify Account balance from anywhere in the application Instead,
//the application provides controlled operations

deposit()
withdraw()
getBalance()

//For example:

class BankAccount {

    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}
//This is much closer to how real applications are designed.
