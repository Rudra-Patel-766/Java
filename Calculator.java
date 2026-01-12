public class Calculator {
    public static void Add(int a, int b){
        int sum=a+b;
        System.out.println(sum);
    }

    public static void Subtract(int a, int b){
        int sub=a-b;
        System.out.println(sub);
    }

    public static void Multiply(int a, int b){
        int mult=a*b;
        System.out.println(mult);
    }

    public static void Division(int a, int b){
        int div=a/b;
        System.out.println(div);
    }
    public static void main(String[] arg){
        Add(2,3);
    }
}
