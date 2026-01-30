package Day03;

class Sum{
    int add(int a, int b) {
        return a + b;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Sum calc = new Sum();
        int result = calc.add(10, 20);
        System.out.println("Sum = " + result);
    }
}