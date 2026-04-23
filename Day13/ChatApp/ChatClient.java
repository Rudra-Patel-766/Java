package Day13.ChatApp;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

public class ChatClient extends UnicastRemoteObject implements ClientInterface {

    protected ChatClient() throws Exception {
        super();
    }

    public void receiveMessage(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        try {
            ChatClient client = new ChatClient();

            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            ChatInterface chat = (ChatInterface) registry.lookup("ChatService");

            chat.registerClient(client);

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter your name: ");
            String name = sc.nextLine();

            while (true) {
                String msg = sc.nextLine();
                chat.sendMessage(name + ": " + msg);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}