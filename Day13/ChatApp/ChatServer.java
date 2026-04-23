package Day13.ChatApp;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ChatServer {

    public static void main(String[] args) {
        try {
            ChatInterface chat = new ChatImpl();

            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("ChatService", chat);

            System.out.println("Chat Server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}