package design_pattern.proxy.gumballmonitor;

import java.rmi.RemoteException;

import design_pattern.proxy.gumball.GumbalMachine;
import design_pattern.proxy.gumball.GumballMonitor;

public class GumBallTestDrive {

	public static void main(String[] args1) throws RemoteException {
		String[] args= {"bj","22"};
		int count=0;
		if(args.length<2) {
			System.out.println("参数不合法，无法进行，请重新输入");
			System.exit(1);
		}
		try {
			count=Integer.parseInt(args[1]);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.exit(1);
		}
		GumbalMachine machine=new GumbalMachine(args[0], count);
		GumballMonitor monitor=new GumballMonitor(machine);
		System.out.println(machine);
		machine.insertQuarter();
		machine.turnCrank();
		machine.insertQuarter();
		
	}
	
}
