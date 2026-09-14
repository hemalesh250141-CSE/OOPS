//Understand this line carefully
Student s1 = new Student();

//It means:

Student → type/class
s1      → object reference
new     → creates a new object
Student() → creates Student object

//You can create many objects from one class.

Student s1 = new Student();
Student s2 = new Student();
Student s3 = new Student();
//Real-time example

//An online shopping application may have:

class Product {
    String name;
    double price;
}

//Objects could be:

Product 1 → Laptop
Product 2 → Mouse
Product 3 → Keyboard

//The class describes the product, while the objects represent actual products.
