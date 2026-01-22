package Day03;

import java.util.Scanner;

class Calculator {
    int a, b;

    Calculator(int x, int y) {
        a = x;
        b = y;
    }

    void calculate(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Sum = " + (a + b));
                break;

            case 2:
                if (b != 0)
                    System.out.println("Division = " + (a / b));
                else
                    System.out.println("Cannot divide by zero");
                break;

            case 3:
                System.out.println("Multiplication = " + (a * b));
                break;

            case 4:
                System.out.println("Subtraction = " + (a - b));
                break;

            case 5:
                System.out.println("Exiting...");
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}

public class Q2 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        Calculator obj = new Calculator(n1, n2);
        int ch;

        do {
            System.out.println("\n1. Sum");
            System.out.println("2. Division");
            System.out.println("3. Multiplication");
            System.out.println("4. Subtraction");

            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            obj.calculate(ch);
        } while (ch!=5);

        sc.close();
    }
}