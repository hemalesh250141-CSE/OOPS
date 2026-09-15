//Look carefully:

Animal a1 = new Dog();
Animal a2 = new Cat();

//Both references are of type:

Animal

//But their actual objects are different:

a1 → Dog
a2 → Cat

//Therefore:

a1.sound();

//calls the Dog version.

//And:

a2.sound();

//calls the Cat version.

//That's polymorphism. Real-time example of polymorphism Imagine a payment application. You might have:

Payment
 ├── UPI
 ├── CreditCard
 └── NetBanking

//All have:

pay()

//But each performs payment differently.

class Payment {

    void pay() {
        System.out.println("Processing payment");
    }
}

class UPI extends Payment {

    @Override
    void pay() {
        System.out.println("Payment through UPI");
    }
}

class CreditCard extends Payment {

    @Override
    void pay() {
        System.out.println("Payment through Credit Card");
    }
}

//Then:

Payment p;

p = new UPI();
p.pay();

p = new CreditCard();
p.pay();

//Output:

Payment through UPI
Payment through Credit Card

//This idea is heavily used in real software because the application can work with the common Payment type while each payment method supplies its own implementation.
