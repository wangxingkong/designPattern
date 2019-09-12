package design_pattern.proxy.gumball;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumbalMachine extends UnicastRemoteObject implements GumbalMachineRemote{

	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State winnerState;
	
	State state=soldOutState;
	int count=0;
	String location;
	
	public GumbalMachine(String location,int numberGumballs)throws RemoteException {
		// TODO Auto-generated constructor stub
		soldOutState=new SoldOutState(this);
		noQuarterState=new NoQuarterState(this);
		hasQuarterState=new HasQuarterState(this);
		soldState=new SoleState(this);
		winnerState=new WinnerState(this);
		state=noQuarterState;
	}
	
	
	public void insertQuarter() {
		state.insertQuarter();
	}
 
	public void ejectQuarter() {
		state.ejectQuarter();
	}
 
	public void turnCrank() {
		state.dispense();
	}

	
	
	@Override
	public int getCount() throws RemoteException {
		// TODO Auto-generated method stub
		return count;
	}

	@Override
	public String getLocation() throws RemoteException {
		// TODO Auto-generated method stub
		return location;
	}

	@Override
	public State getState() throws RemoteException {
		// TODO Auto-generated method stub
		return state;
	}

	public void setSoldOutState(State soldOutState) {
		this.soldOutState = soldOutState;
	}

	public void setNoQuarterState(State noQuarterState) {
		this.noQuarterState = noQuarterState;
	}

	public void setHasQuarterState(State hasQuarterState) {
		this.hasQuarterState = hasQuarterState;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public State getWinnerState() {
		return winnerState;
	}

	public void setSoldState(State soldState) {
		this.soldState = soldState;
	}

	public void setWinnerState(State winnerState) {
		this.winnerState = winnerState;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void releaseBall() {
		// TODO Auto-generated method stub
		count--;
	}
}
