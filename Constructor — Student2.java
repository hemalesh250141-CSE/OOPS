class Student {
    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        Student s = new Student("Hemalesh", 18);
        s.display();
    }
}
