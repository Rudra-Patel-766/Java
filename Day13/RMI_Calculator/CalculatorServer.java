package Day13.RMI_Calculator;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorServer {

    public static void main(String[] args) {
        try {
            Calculator calc = new CalculatorImpl();

            Registry registry = LocateRegistry.createRegistry(2000);
            registry.rebind("HelloService", calc);

            System.out.println("Calculator Server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}