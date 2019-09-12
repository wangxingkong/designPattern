package design_pattern.command.party;

public class Hottub {

	boolean on;
	int temperature;
	
	public Hottub() {
		// TODO Auto-generated constructor stub
	}
	
	public void on() {
		on=true;
	}
	
	public void off() {
		on=false;
	}
	
	public void circulate() {
		if(on)
			System.out.println("hottub is bubbling");
	}
	
	public void jetsOn() {
		if(on)
			System.out.println("hottub jets are on");
	}
	
	public void jetOff() {
		if(on)
			System.out.println("huttub jets are off");
	}
	
	public void setTemperature(int temperature) {
		if(temperature>this.temperature) {
			System.out.println("hottub is heating to a steaming "+temperature+" degrees");
		}else {
			System.out.println("hottub is cooling to "+temperature+" degrees");
		}
		this.temperature = temperature;
	}
	
}
