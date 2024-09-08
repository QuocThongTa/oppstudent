package oppstudent;

public class Student {
    int id;
    String name;
    int age;

    // Constructor with two parameters
    Student(int i, String n) { // Corrected 'string' to 'String'
        id = i;
        name = n;
        age = 0; // Initialize age to a default value, if needed
    }
    
    // Constructor with three parameters
    Student(int i, String n, int a) { // Corrected '.' to ',' and 'int n' to 'String n'
        id = i;
        name = n;
        age = a;
    }

    void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String args[]) {
        Student s1 = new Student(111, "Karan");
        Student s2 = new Student(222, "Aryan", 25);
        s1.display();
        s2.display();
    }
}