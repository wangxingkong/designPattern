package design_pattern.proxy.gumball;

import java.util.Random;

public class HasQuarterState implements State {

	GumbalMachine gumbalMachine;
	Random random=new Random(System.currentTimeMillis());
	public HasQuarterState(GumbalMachine gumbalMachine) {
		// TODO Auto-generated constructor stub
		this.gumbalMachine=gumbalMachine;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("不能重复出入金币");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("已经弹出来金币");
		gumbalMachine.setState(gumbalMachine.getNoQuarterState());
	}

	@Override
	public void turnQuarter() {
		// TODO Auto-generated method stub
		System.out.println("你转动了转轴，弹出了糖果");
		int winner=random.nextInt(10);
		if(winner==0) {
			gumbalMachine.setState(gumbalMachine.getWinnerState());
		}else {
			gumbalMachine.setState(gumbalMachine.getSoldOutState());
		}
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("没有糖果dispense");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "我是在放入金币的状态";
	}
}
