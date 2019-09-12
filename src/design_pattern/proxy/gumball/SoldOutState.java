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
		System.out.println("�㲻�ܲ���Ǯ����Ϊ�Ѿ��۹���");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("�㲻�ܵ�������Ϊ��û�в���");
	}

	@Override
	public void turnQuarter() {
		// TODO Auto-generated method stub
		System.out.println("��ת��������û�ж�������");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("ûӴ������Ҫ����");
	}

}
