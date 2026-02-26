package Day09;

// public class classWork {
//     public static void main(String[] arg){
//         try{
//             int[] n = new int[5];
//             int divisor = 0;

//             for(int i=0;i<n.length;i++){
//                 int res = n[i]/divisor;
//                 System.out.println(res);
//             }
//         }
//         catch(ArithmeticException e){
//             throw new RuntimeException ("Error: Division by zero occurred", e);
//         }
//     }
// }

//Checking Method Arguments
// import java.io.*;

// public class classWork {
//     public static void main(String[] arg) {
//         // String s = "";
//         String s = null;
        
//         try {
//             System.out.println(getLength(s));
//         } catch (IllegalArgumentException e) {
//             System.out.println(e);
//         }

//         // try {
//         //     System.out.println(getLength(s));
//         // } catch (IllegalArgumentException e) {
//         //     System.out.println("IllegalArgumentException caught");
//         // }

//         // try {
//         //     System.out.println(getLength(s));
//         // } catch (IllegalArgumentException e) {
//         //     System.out.println("IllegalArgumentException caught");
//         // }
//     }

//     public static int getLength(String s) {
//         if (s == null) {
//             throw new IllegalArgumentException("The argument cannot be null");
//         }

//         return s.length();
//     }
// }

//SuperClass Without exception declaration
class SuperClass{
    void method(){
        System.out.println("SuperClass method executed");
    }
}

public class classWork extends SuperClass {
    @Override
    void method() throws ArithmeticException{
        System.out.println("SubClass method executed");
        throw new ArithmeticException("Exception in SubClass");
    }
    public static void main(String[] arg) {
        SuperClass s = new classWork();
        try{
            s.method();
        } catch (ArithmeticException e){
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}