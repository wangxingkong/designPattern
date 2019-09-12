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
		System.out.println("������˽��");
		gumbalMachine.setState(gumbalMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("��ûӴ������");
	}

	@Override
	public void turnQuarter() {
		// TODO Auto-generated method stub
		System.out.println("��ת���ˣ�����ûӴ��ҷ���");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("����Ҫ�ȷ����Ҳ���");
	}

}
