package Day13.ChatApp;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

public class ChatImpl extends UnicastRemoteObject implements ChatInterface {

    private List<ClientInterface> clients;

    protected ChatImpl() throws RemoteException {
        clients = new ArrayList<>();
    }

    public void registerClient(ClientInterface client) throws RemoteException {
        clients.add(client);
        System.out.println("New client connected.");
    }

    public void sendMessage(String message) throws RemoteException {
        for (ClientInterface client : clients) {
            client.receiveMessage(message);
        }
    }
}
