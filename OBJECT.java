class Student {
    String name;
    int age;
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Hemalesh";
        s1.age = 20;

        s2.name = "Rahul";
        s2.age = 21;

        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}
