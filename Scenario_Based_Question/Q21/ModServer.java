package Scenario_Based_Question.Q21;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ModServer {
    public static void main(String[] args) {
        try {
            ModImpl obj = new ModImpl();

            Registry registry = LocateRegistry.createRegistry(1099);

            registry.rebind("ModService", obj);

            System.out.println("Server is ready...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
