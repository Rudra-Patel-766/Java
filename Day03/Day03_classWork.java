package Day03;

//Constructor
// class Student{
//     String name;
//     int age;

//    // default constructor
//     Student(){
//         name="Default name";
//         age=18;
//     }

//     void display(){
//         System.out.println("Name: " + name + ", Age: " + age);
//     }
// }

// public class Day03_classWork {
//     public static void main(String[] arg){
//         Student student1 = new Student();
//         student1.display();
//     }
// }

//parameterized constructor
// class Student{
//     String name;
//     int age;

//     // parameterized
//     Student(String n, int a){
//         name=n;
//         age=a;
//     }

//     void display(){
//         System.out.println("Name: " + name + ", Age: " + age);
//     }
// }

// public class Day03_classWork {
//     public static void main(String[] arg){
//         Student student1 = new Student("Alice",20);
//         student1.display();
//     }
// }

//Static var
// class Counter{
//     static int count = 0;  //static variable

//     Counter(){
//         count++;
//         System.out.println("Object Created. Created Count: " + count);
//     }
// }

// public class Day03_classWork {
//     public static void main(String[] arg){
//         Counter obj1 = new Counter();
//         Counter obj2 = new Counter();
//         Counter obj3 = new Counter();

//         System.out.println("Final Count: " + Counter.count);  //Access using class name
//     }
// }

//instance var
// class Student{
//     int id;
//     String name;
// }

// public class Day03_classWork {
//     public static void main(String[] arg){
//         Student s1 = new Student();
//         Student s2 = new Student();

//         s1.id=101;
//         s1.name="Alice";

//         s2.id=102;
//         s2.name="ABC";

//         System.out.println(s1.id + " " + s1.name);
//         System.out.println(s2.id + " " + s2.name);
//     }
// }

//Instance method
class Person{
    String name;

    void display(){
        System.out.println("Name: " + name);
    }

    public static void main(String[] arg){
        Person p = new Person();
        p.name = "Jhon";
        p.display();
    }
}