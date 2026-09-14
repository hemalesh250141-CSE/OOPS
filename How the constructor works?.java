//What happens?
//When this executes:

Student s1 = new Student("Hemalesh", 20);

//Java automatically calls:

Student(String n, int a)

//So:

n = "Hemalesh"
a = 20

//Then:

name = n;
age = a;

//becomes:

name = "Hemalesh"
age = 20
//Without constructor
//You would need:

Student s1 = new Student();

s1.name = "Hemalesh";
s1.age = 20;

//With constructor:

Student s1 = new Student("Hemalesh", 20);

//Much cleaner.

//Real-time example
//When creating a bank account:

class BankAccount {

    String accountHolder;
    double balance;

    BankAccount(String name, double amount) {
        accountHolder = name;
        balance = amount;
    }
}

//You can create:

BankAccount a1 = new BankAccount("Hemalesh", 5000);

//The constructor initializes the account.
