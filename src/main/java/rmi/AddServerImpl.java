package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AddServerImpl extends UnicastRemoteObject implements AddServerInt {

    public AddServerImpl() throws RemoteException {
    }

    @Override
    public double add(double d1, double d2) throws RemoteException {
        return d1 + d2;
    }
}
