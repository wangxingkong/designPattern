package design_pattern.state.gumballsgtate;

public class WinnerSatate implements State {

	GumballMachine gumballMachine;
	public WinnerSatate(GumballMachine gumballMachine) {
		// TODO Auto-generated constructor stub
		this.gumballMachine=gumballMachine;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("�Բ������Ե�");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("�Բ�����ȴ�");
	}

	@Override
	public void turnCrack() {
		// TODO Auto-generated method stub
		System.out.println("�Բ�����ȴ�");
	}
	
	public void dispense() {
		gumballMachine.setCount(gumballMachine.getCount()-1);;
		if(gumballMachine.getCount()==0) {
			gumballMachine.setState(gumballMachine.getSoldoutState());
		}else {
			gumballMachine.setCount(gumballMachine.getCount()-1);
			if(gumballMachine.getCount()>0)
				gumballMachine.setState(gumballMachine.getNoQuarter());
			else 
				gumballMachine.setState(gumballMachine.getSoldoutState());
		}
	}

}
