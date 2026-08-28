class Student {
    int rollNo;
    String name;
    int age;

    // Constructor
    Student(int r, String n, int a) {
        rollNo = r;
        name = n;
        age = a;
    }

    // Method to display student data
    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating object
        Student s1 = new Student(101, "Rahul", 18);

        // Display data
        s1.display();
    }
}
