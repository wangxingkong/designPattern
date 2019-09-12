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
		System.out.println("你要的糖果正在弹出");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("不能反悔呦");
	}

	@Override
	public void turnQuarter() {
		// TODO Auto-generated method stub
		System.out.println("你的糖果正在路上，请稍等能");
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
