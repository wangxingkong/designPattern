package design_pattern.proxy.gumball;

import java.rmi.RemoteException;

public class GumballMachineTestDrive {

	public static void main(String[] args) throws RemoteException {
		GumballMonitor[] monitors=new GumballMonitor[10];
		for(int i=0;i<10;i++) {
			monitors[i]=new GumballMonitor(new GumbalMachine("bj", 10));
		}
		for(int i=0;i<10;i++) {
			monitors[i].report();
		}
	}
	
}
