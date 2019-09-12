package design_pattern.proxy.gumball;

public class SoldOutState implements State {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	transient GumbalMachine gumballMachine;
	
	public SoldOutState(GumbalMachine gumbalMachine) {
		// TODO Auto-generated constructor stub
		this.gumballMachine=gumbalMachine;
	}
	
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("你不能插入钱，因为已经售光了");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("你不能弹出，因为你没有插入");
	}

	@Override
	public void turnQuarter() {
		// TODO Auto-generated method stub
		System.out.println("你转动，但是没有东西弹出");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("没哟东西需要弹出");
	}

}
