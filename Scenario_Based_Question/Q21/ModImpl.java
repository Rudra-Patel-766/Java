package Scenario_Based_Question.Q21;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class ModImpl extends UnicastRemoteObject implements ModInterface {

    protected ModImpl() throws RemoteException {
        super();
    }

    public int mod(int a, int b) throws RemoteException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a % b;
    }
}
