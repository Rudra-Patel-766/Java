package Day02;

// class Day02_classWork{
//     public static void main(String[] args) {
//         char arr[]={'R','U','D','R','A'};
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]);
//         }
//     }
// }

// class Day02_classWork {
//     public static void main(String[] args) {
//         char arr[]={'R','U','D','R','A'};
//         for(int i=arr.length-1;i>=0;i--){
//             System.out.print(arr[i]);
//         }
//     }
// }

// class Day02_classWork {
//     public static void main(String[] args) {
//         String str = "Hello";
//         String rev = "";

//         for (int i = str.length() - 1; i >= 0; i--) {
//             rev = rev + str.charAt(i);
//         }

//         System.out.println(rev);
//     }
// }

import java.lang.StringBuilder;
class Day02_classWork {
    public static void main(String[] args) {
        String str = "Hello";

        String rev = new StringBuilder(str).reverse().toString();

        System.out.println(rev);
    }
}
