package Day03;

class Detail {
    int rollNo;
    String name;
    static String college = "Symbiosis";

    Detail(int r, String n) {
        rollNo = r;
        name = n;
    }

    static void displayCollege() {
        System.out.println("College Name: " + college);
    }

    void displayStudent() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println();
    }
}

public class Q4 {
    public static void main(String[] args) {
        Detail.displayCollege();

        System.out.println(" ");

        Detail s1 = new Detail(134, "Rudra");
        Detail s2 = new Detail(200, "Abc");

        s1.displayStudent();
        s2.displayStudent();
    }
}
