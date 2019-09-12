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
		System.out.println("�����ظ�������");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("�Ѿ����������");
		gumbalMachine.setState(gumbalMachine.getNoQuarterState());
	}

	@Override
	public void turnQuarter() {
		// TODO Auto-generated method stub
		System.out.println("��ת����ת�ᣬ�������ǹ�");
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
		System.out.println("û���ǹ�dispense");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "�����ڷ����ҵ�״̬";
	}
}
