package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AddServerInt extends Remote {
    double add(double d1, double d2) throws RemoteException;
}
