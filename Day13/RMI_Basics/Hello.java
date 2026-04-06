package Day13.RMI_Basics;

import java.rmi.*;

public interface Hello extends Remote{
    String sayHello() throws RemoteException;
}