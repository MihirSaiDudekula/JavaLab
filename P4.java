class Person {  // Class names should be capitalized according to Java conventions
    String name;
    int age;

    // Constructor for Person class
    public Person(String n, int a) {
        this.name = n;
        this.age = a;
    }

    // Display method for Person
    public void display() {
        System.out.println(name);
        System.out.println(age);
    }
}

class Student extends Person {  // Inheritance from Person
    int id;

    // Constructor for Student class
    public Student(int id, String name, int age) {
        super(name, age);  // Calling the superclass (Person) constructor
        this.id = id;
    }

    // Display method for Student
    @Override
    public void display() {
        System.out.println(id);
        System.out.println(name);
        System.out.println(age);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an instance of Student and calling display
        Student student1 = new Student(1, "John Doe", 20);
        student1.display();
    }
}
