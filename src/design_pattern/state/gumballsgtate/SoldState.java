package design_pattern.state.gumballsgtate;

public class SoldState implements State {

	GumballMachine machine;
	
	public SoldState(GumballMachine machine) {
		// TODO Auto-generated constructor stub
		this.machine=machine;
	}
	
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		machine.setState(machine.getHasQuarter());
		System.out.println("恭喜你已经进入了存放金币的状态");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("抱歉，因为你的东西已经突出了，不能退换金币");
	}

	@Override
	public void turnCrack() {
		// TODO Auto-generated method stub
		System.out.println("糖果已经吐出，转动转轴不起作用");
	}

	

}
