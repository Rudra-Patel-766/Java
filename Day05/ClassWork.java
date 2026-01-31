package Day05;

// class Animal{
//     void eat(){
//         System.out.println("This animal eats food");
//     }
// }

// class Dog extends Animal{
//     void bark(){
//         System.out.println("Dog barks!");
//     }
// }

// public class ClassWork {
//     public static void main(String[] arg){
//         Dog d = new Dog();
//         d.eat();
//         d.bark();
//     }   
// }

// class Student{
//     String name;

//     Student(String name){
//         this.name = name;
//     }

//     void display(){
//         System.out.println("Name: " + this.name);
//     }
// }

// public class ClassWork{
//     public static void main(String[] arg){
//         Student s = new Student("Alice");
//         s.display();
//     }
// }

class Parent{
    void display(){
        System.out.println("Parent Class Method");
    }
}

class Child extends Parent{
    void display(){
        super.display();
        System.out.println("Child class method");
    }
}

public class ClassWork{
    public static void main(String[] args){
        Child c = new Child();
        c.display();
    }
}