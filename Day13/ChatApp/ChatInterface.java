package Day13.ChatApp;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ChatInterface extends Remote {

    void registerClient(ClientInterface client) throws RemoteException;

    void sendMessage(String message) throws RemoteException;
}