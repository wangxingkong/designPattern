package design_pattern.proxy.gumball;

public class NoQuarterState implements State {

	GumbalMachine gumbalMachine;
	public NoQuarterState(GumbalMachine gumbalMachine) {
		// TODO Auto-generated constructor stub
		this.gumbalMachine=gumbalMachine;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("你插入了金币");
		gumbalMachine.setState(gumbalMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("你没哟插入金币");
	}

	@Override
	public void turnQuarter() {
		// TODO Auto-generated method stub
		System.out.println("你转动了，但是没哟金币放入");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("你需要先放入金币才行");
	}

}
