package design_pattern.command.remoter;

public class GarageDoor {

	String location;
	
	public GarageDoor(String location) {
		// TODO Auto-generated constructor stub
		this.location=location;
	}
	
	public void up() {
		System.out.println(location+" garage door is up");
	}
	
	public void down() {
		System.out.println(location+" garage door is down");
	}
	
	public void stop() {
		System.out.println(location+" garage door is stop");
	}
	
	public void lightOn() {
		System.out.println(location+" garage door is lightOn");
	}
	
	public void lightOff() {
		System.out.println(location+" garage door is lightOff");
	}
	
}
