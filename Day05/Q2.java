package Day05;

class Parent1 {
    int age = 48;
}

class Child1 extends Parent1 {
    int age = 20;

    void display() {
        System.out.println("Parent age: " + super.age);
        System.out.println("Child age: " + this.age);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Child1 c = new Child1();
        c.display();
    }
}
