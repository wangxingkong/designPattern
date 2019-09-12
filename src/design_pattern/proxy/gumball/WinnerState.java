package design_pattern.proxy.gumball;

public class WinnerState implements State {

	GumbalMachine gumbalMachine;
	
	public WinnerState(GumbalMachine gumbalMachine) {
		// TODO Auto-generated constructor stub
		this.gumbalMachine=gumbalMachine;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("��Ҫ���ǹ����ڵ���");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("���ܷ�����");
	}

	@Override
	public void turnQuarter() {
		// TODO Auto-generated method stub
		System.out.println("����ǹ�����·�ϣ����Ե���");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		gumbalMachine.releaseBall();
		try {
			if(gumbalMachine.getCount()==0) {
				gumbalMachine.setState(gumbalMachine.getSoldOutState());
			}else {
				gumbalMachine.releaseBall();
				if(gumbalMachine.getCount()>0)
					gumbalMachine.setState(gumbalMachine.getSoldState());
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
