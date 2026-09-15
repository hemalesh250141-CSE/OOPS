//Understand the structure
Vehicle
   ↑
   |
  Car

//Car inherits from Vehicle. Therefore Car can use:

start()

even though start() was written inside Vehicle.

//Real-time example

//Consider a college management system:

Person
 ├── Student
 └── Teacher

//Common information:

class Person {
    String name;
    int age;
}

//Then:

class Student extends Person {
    int rollNo;
}

//And:

class Teacher extends Person {
    String subject;
}

//Instead of rewriting name and age in every class, we can inherit them from Person.

Where inheritance is useful
Employee management
Banking systems
Vehicle systems
Game development
GUI applications
Android applications
Enterprise software
