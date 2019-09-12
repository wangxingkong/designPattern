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
		System.out.println("��ϲ���Ѿ������˴�Ž�ҵ�״̬");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("��Ǹ����Ϊ��Ķ����Ѿ�ͻ���ˣ������˻����");
	}

	@Override
	public void turnCrack() {
		// TODO Auto-generated method stub
		System.out.println("�ǹ��Ѿ��³���ת��ת�᲻������");
	}

	

}
