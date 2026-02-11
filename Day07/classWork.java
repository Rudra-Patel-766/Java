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

//Array:
// public class classWork {
//     public static void main(String[] args) {
//         int[] numbers = {10, 20, 30, 40, 50};

//         for (int i = 0; i < numbers.length; i++) {
//             System.out.println(numbers[i]);
//         }

//         for (int num : numbers) {
//             System.out.println(num);
//         }
//     }
// }

//ArrayList:
import java.util.ArrayList;

public class classWork{
    public static void main(String[] arg){
        ArrayList<String> fruits=new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Bannana");
        fruits.add("Cherry");

        System.out.println("Fruits: " + fruits);
        fruits.remove("Bannana");
        System.out.println("After removing Bannana: " + fruits);

        System.out.println("Size: " + fruits.size());
        System.out.println("Contains Apple? " + fruits.contains("Apple"));

        System.out.println(fruits.get(0));
    }
}

//Vector:
// import java.util.Vector;

// public class classWork {
//     public static void main(String[] args) {
//         Vector<Integer> numbers = new Vector<>();

//         numbers.add(100);
//         numbers.add(200);
//         numbers.add(300);

//         System.out.println("Vector: " + numbers);
//         numbers.remove(1);
//         System.out.println("After removing index 1: " + numbers);

//         System.out.println("Size: " + numbers.size());
//         System.out.println("Element at index 0: " + numbers.get(0));
//     }
// }

//garbage collection:
// public class classWork{
//     public static void main(String[] arg){
//         classWork obj=new classWork();
//         obj=null;
//         System.gc();
//     }
// }

//String
// public class classWork{
//     public static void main(String[] arg){
//         String message = "  Hello World" + "!!  ";
//         System.out.println(message);
//         System.out.println(message.endsWith("!!"));
//         System.out.println(message.startsWith("!!"));
//         System.out.println(message.length());
//         System.out.println(message.indexOf("H"));
//         System.out.println(message.replace("!","*"));
//         System.out.println(message.toLowerCase());
//         System.out.println(message.toUpperCase());
//         System.out.println(message.trim());
//         System.out.println(message.substring(2));
//         System.out.println(message.substring(2, 4));
//         System.out.println(message.charAt(3));
//     }
// }

//String Buffer: Mutable (modifiable) version of String. Thread-safe (synchronized).
// public class classWork{
//     public static void main(String[] args) {
//         StringBuffer sb = new StringBuffer("Hello");

//         sb.append(" World");
//         System.out.println("After Append: " + sb);

//         sb.insert(6, "Java ");
//         System.out.println("After Insert: " + sb);

//         sb.replace(0, 5, "Hi");
//         System.out.println("After Replace: " + sb);

//         sb.delete(2, 5);
//         System.out.println("After Delete: " + sb);

//         sb.reverse();
//         System.out.println("After Reverse: " + sb);
//     }
// }

//String tokenizer: Used for splitting a string into tokens (words, numbers, etc.)
// import java.util.StringTokenizer;

// public class classWork{
//     public static void main(String[] args) {
//         String str = "Java,Python,C++,JavaScript";
//         StringTokenizer st = new StringTokenizer(str, ",");

//         while (st.hasMoreTokens()) {
//             System.out.println(st.nextToken());
//         }
//     }
// }