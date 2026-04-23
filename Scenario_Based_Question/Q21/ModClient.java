package Scenario_Based_Question.Q21;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class ModClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            ModInterface obj = (ModInterface) registry.lookup("ModService");

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int result = obj.mod(a, b);

            System.out.println("Modulus = " + result);

            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}