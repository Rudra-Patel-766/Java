package Day07;

//Method overriding:
// class Parent{
//     void show(){
//         System.out.println("Parent show method");
//     }
// }

// class Child extends Parent{
//     @Override
//     void show(){
//         System.out.println("Child's show method");
//     }
// }

// public class classWork {
//     public static void main(String[] arg){
//         Parent obj = new Child();
//         obj.show();
//     }
// }

//ArrayList:
// import java.util.ArrayList;

// public class classWork{
//     public static void main(String[] arg){
//         ArrayList<String> fruits=new ArrayList<>();

//         fruits.add("Apple");
//         fruits.add("Bannana");
//         fruits.add("Cherry");

//         System.out.println("Fruits: " + fruits);
//         fruits.remove("Bannana");
//         System.out.println("After removing Bannana: " + fruits);

//         System.out.println("Size: " + fruits.size());
//         System.out.println("Contains Apple? " + fruits.contains("Apple"));
//     }
// }

//Vector:
// import java.util.Vector;

// public class classWork{
//     public static void main(String[] arg){

//     }
// }

//garbage collection:
public class classWork{
    public static void main(String[] arg){
        classWork obj=new classWork();
        obj=null;
        System.gc();
    }
}