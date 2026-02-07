package Day06;

final class FinalDemo {

    final int MAX = 100;

    final void display() {
        System.out.println("Final variable value: " + MAX);
        System.out.println("This is a final method.");
    }
}

public class Q1 {
    public static void main(String[] args) {
        FinalDemo obj = new FinalDemo();
        obj.display();
    }
}