package design_pattern.proxy.gumball;

public class GumballMonitor {

	GumbalMachineRemote machineRemote;
	
	public GumballMonitor(GumbalMachineRemote machineRemote) {
		// TODO Auto-generated constructor stub
		this.machineRemote=machineRemote;
	}
	
	public void report() {
		try {
			System.out.println("gumbal machine "+machineRemote.getLocation());
			System.out.println("current inventory "+machineRemote.getCount());
			System.out.println("current state "+machineRemote.getState());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}
