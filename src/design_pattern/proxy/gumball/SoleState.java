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
		System.out.println("你需要的糖果已经给你弹出了");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("对不起，你已经转动转轴");
	}

	@Override
	public void turnQuarter() {
		// TODO Auto-generated method stub
		System.out.println("虽然你转动了转轴但是你的糖果已经弹出了");
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
