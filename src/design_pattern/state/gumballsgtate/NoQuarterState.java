package design_pattern.state.gumballsgtate;

public class NoQuarterState implements State{

	GumballMachine machine;
	
	public NoQuarterState(GumballMachine machine) {
		// TODO Auto-generated constructor stub
		this.machine=machine;
	}
	
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		machine.setState(machine.getHasQuarter());
		System.out.println("你好，你的金币已经插入了");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("不能在没有插入金币的吐出金币");
	}

	@Override
	public void turnCrack() {
		// TODO Auto-generated method stub
		System.out.println("不能在没有金币的情况下吐出金币");
	}


}
