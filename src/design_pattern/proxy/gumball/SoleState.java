package design_pattern.proxy.gumball;

public class SoleState implements State {

	GumbalMachine gumbalMachine;
	
	public SoleState(GumbalMachine gumbalMachine) {
		// TODO Auto-generated constructor stub
		this.gumbalMachine=gumbalMachine;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("����Ҫ���ǹ��Ѿ����㵯����");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("�Բ������Ѿ�ת��ת��");
	}

	@Override
	public void turnQuarter() {
		// TODO Auto-generated method stub
		System.out.println("��Ȼ��ת����ת�ᵫ������ǹ��Ѿ�������");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		try {
			if(gumbalMachine.getCount()>0) {
				gumbalMachine.setState(gumbalMachine.getNoQuarterState());
			}else
				gumbalMachine.setState(gumbalMachine.getSoldState());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
