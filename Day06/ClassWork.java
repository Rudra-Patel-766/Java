package Day06;

//Final Variable: A final variable is a constant whose value cannot be changed after initialization.
// public class ClassWork {
//     final int MAX = 100;
    
//     void display(){
//         System.out.println("Max Value: " + MAX);
//     }

//     public static void main(String[] arg){
//         ClassWork obj = new ClassWork();
//         obj.display();
//     }
// }

//Final Method: A final method cannot be overridden by a subclass.
// class parent {
//     final void display(){
//         System.out.println("Final method in parent class");
//     }
// }

// class child extends parent{
//     // void display();    //give compilation error
// }

// public class ClassWork{
//     public static void main(String[] arg){
//         child c = new child();
//         c.display();
//     }
// }

//Final class: A final class cannot be extended by any subclass.
// final class FinalClass{
//     void display(){
//         System.out.println("This is a final class");
//     }
// }

// // class Subclass extends FinalClass {}  //give compile error

// public class ClassWork{
//     public static void main(String[] arg){
//         FinalClass obj = new FinalClass();
//         obj.display();
//     }
// }

//Abstract Keyword: The abstract keyword is used to define classes or methods that are incomplete and must be implemented by a subclass.
// abstract class Shape{
//     abstract void draw();

//     void message(){
//         System.out.println("This is a shape");
//     }
// }

// class Circle extends Shape{
//     void draw(){
//         System.out.println("Drawing a circle");
//     }
// }

// public class ClassWork{
//     public static void main(String[] arg){
//         Shape s = new Circle();
//         s.draw();
//         s.message();
//     }
// }

// Abstract Method: Abstract methods are methods that are declared without an implementation (i.e., without a method body).
// abstract class Animal{
//     abstract void sound();

//     void eat(){
//         System.out.println("This animal eats food.");
//     }
// }

// class Dog extends Animal{
//     void sound(){
//         System.out.println("Dog Barks.");
//     }
// }

// public class ClassWork{
//     public static void main(String[] arg){
//         Animal a = new Dog();
//         a.sound();
//         a.eat();
//     }
// }

// Interface: An interface is a blueprint of a class that contains abstract methods.
// It solves the multiple inheritance diamond problem
interface Animal{
    void sound();
}

class Dog implements Animal{
    public void sound(){
        System.out.println("Dog Barks.");
    }
}

public class ClassWork{
    public static void main(String[] arg){
        Animal a = new Dog();
        a.sound();
    }
}