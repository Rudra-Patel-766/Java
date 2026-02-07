package Day06;

interface A {
    void show();
}

interface B {
    void show();
}

class DiamondSolution implements A, B {

    public void show() {
        System.out.println("Diamond problem resolved using interface.");
    }
}

public class Q3 {
    public static void main(String[] args) {
        DiamondSolution obj = new DiamondSolution();
        obj.show();
    }
}