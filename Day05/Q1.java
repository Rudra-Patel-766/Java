package Day05;

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Manager extends Employee {
    String dept_name;

    Manager(int id, String name, String dept_name) {
        super(id, name);
        this.dept_name = dept_name;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + dept_name);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Manager m = new Manager(14, "ABC", "IT");
        m.display();
    }
}
