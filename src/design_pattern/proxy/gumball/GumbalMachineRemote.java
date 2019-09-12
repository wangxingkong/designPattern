package design_pattern.proxy.gumball;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GumbalMachineRemote extends Remote{

	int getCount() throws RemoteException;
	String getLocation() throws RemoteException;
	State getState() throws RemoteException;
	
}
