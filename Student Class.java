class Student {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student s = new Student();

        s.name = "Hemalesh";
        s.age = 18;

        s.display();
    }
}
