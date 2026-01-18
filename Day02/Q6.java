package Day02;

// without System Define
// class Q6 {
//     public static void main(String[] args) {
//         String str = "Hello";
//         String rev = "";

//         for (int i = str.length() - 1; i >= 0; i--) {
//             rev = rev + str.charAt(i);
//         }

//         System.out.println(rev);
//     }
// }


//with System Define
import java.lang.StringBuilder;
class Q6 {
    public static void main(String[] args) {
        String str = "Hello";

        String rev = new StringBuilder(str).reverse().toString();

        System.out.println(rev);
    }
}