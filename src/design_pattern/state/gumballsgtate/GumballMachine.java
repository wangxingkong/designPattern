package design_pattern.state.gumballsgtate;

public class GumballMachine {

	private State soldState;
	private State noQuarter;
	private State hasQuarterState;
	private State soldoutState;
	private State winnerState;
	private State currentState;
	
	private int count=0;
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setSoldoutState(State soldoutState) {
		this.soldoutState = soldoutState;
	}
	
	public State getSoldoutState() {
		return soldoutState;
	}
	
	
	public GumballMachine() {
		// TODO Auto-generated constructor stub
		soldState=new SoldState(this);
		soldoutState=new SoldOutState(this);
		hasQuarterState=new HasQuarterState(this);
		noQuarter=new NoQuarterState(this);
		winnerState=new WinnerSatate(this);
		currentState=noQuarter;
		count=10;
	}
	

	public void insertQuarter() {
		currentState.insertQuarter();
	}
 
	public void ejectQuarter() {
		currentState.ejectQuarter();
	}
 
	public void turnCrank() {
		currentState.turnCrack();
	}
	
	public State getSoldState() {
		// TODO Auto-generated method stub
		return soldState;
	}


	public void setState(State currentState) {
		// TODO Auto-generated method stub
		this.currentState=currentState;
	}


	public State getNoQuarter() {
		// TODO Auto-generated method stub
		return noQuarter;
	}


	public State getHasQuarter() {
		// TODO Auto-generated method stub
		return hasQuarterState;
	}

}
