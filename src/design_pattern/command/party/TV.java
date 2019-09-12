package design_pattern.command.party;

public class TV {

	String location;
	int channel;
	
	public TV(String location) {
		// TODO Auto-generated constructor stub
		this.location=location;
	}
	
	public void on() {
		System.out.println(location+"  tv is on");
	}
	
	public void off() {
		System.out.println(location+"  tv is off");
	}
	
	public void setChannel() {
		this.channel = 3;
		System.out.println(location+"  tv channel is set for dvd");
	}
	
}
