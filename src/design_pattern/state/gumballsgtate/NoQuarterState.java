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
		System.out.println("��ã���Ľ���Ѿ�������");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("������û�в����ҵ��³����");
	}

	@Override
	public void turnCrack() {
		// TODO Auto-generated method stub
		System.out.println("������û�н�ҵ�������³����");
	}


}
