class Vehicle {

    private String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle {

    Car(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println(getBrand() + " car started");
    }
}

public class Main {

    public static void main(String[] args) {

        Vehicle v = new Car("Tesla");

        v.start();
    }
}
