package design_pattern.state.gumballsgtate;

public class HasQuarterState implements State{

	GumballMachine machine;
	
	public HasQuarterState(GumballMachine machine) {
		// TODO Auto-generated constructor stub
		this.machine=machine;
	}
	
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("不能重复插入金币");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("抱歉");
		machine.setState(machine.getNoQuarter());
	}

	@Override
	public void turnCrack() {
		// TODO Auto-generated method stub
		machine.setState(machine.getSoldState());
		System.out.println("你要的糖果就要出来");
	}


}
