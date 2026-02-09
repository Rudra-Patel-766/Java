package Day08;

//exception handling
// public class classWork {
//     public static void main(String[] arg) {
//         int num1 = 10;
//         int num2 = 0;

//         try {
//             int result = num1 / num2;
//             System.out.println("Result: " + result);
//         } catch (ArithmeticException e) {
//             System.out.println("Error: Cannot divide by zero!");
//             System.out.println("Exception Message: " + e.getMessage());
//         }

//         System.out.println("Program continues after exception handling.");
//     }
// }

//Handling multiple exception
public class classWork {
    public static void main(String[] arg) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Error: Null pointer exception Object is null.");
        } catch (Exception e) {
            System.out.println("Some other error occurred.");
        }

        System.out.println("Program continues after exception handling.");
    }
}