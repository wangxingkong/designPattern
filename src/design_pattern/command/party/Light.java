package design_pattern.command.party;

public class Light {

	String location;
	int level;
	
	public Light(String location) {
		// TODO Auto-generated constructor stub
		this.location=location;
	}
	
	public void on() {
		System.out.println("light is on");
	}
	
	public void off() {
		level=0;
		System.out.println("light is off");
	}
	
	public void dim(int level) {
		this.level=level;
		if(level==0)
			off();
		else
			System.out.println("light is dimmed to "+level+"%");
	}
	
	public int getLevel() {
		return level;
	}
	
}
