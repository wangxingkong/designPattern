package design_pattern.facade.hometheater;

public class Projector {

	String  description;
	DvdPlayer dvdPlayer;
	
	public Projector(String description,DvdPlayer dvdPlayer) {
		// TODO Auto-generated constructor stub
		this.dvdPlayer=dvdPlayer;
		this.description=description;
	}
	
	public void on() {
		System.out.println(description+"  on");
	}
	
	public void off() {
		System.out.println(description+"   off");
	}
	
	public void wideScreeenMode() {
		System.out.println(description+"   in widescreenmode");
	}

	public void tvMode() {
		System.out.println(description+"  in tv mode");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return description;
	}
}
