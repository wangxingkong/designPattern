package design_pattern.state.gumballsgtate;

public class SoldOutState  implements State{

	GumballMachine machine;
	
	public SoldOutState(GumballMachine machine) {
		// TODO Auto-generated constructor stub
		this.machine=machine;
	}
	
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("��Ǹ���Ѿ�������");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("��Ǹ���Ѿ�������");
	}

	@Override
	public void turnCrack() {
		// TODO Auto-generated method stub
		System.out.println("��Ǹ���Ѿ�������");
	}

	
	
}
