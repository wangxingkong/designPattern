package design_pattern.command.party;

public class Stereo {

	String location;
	
	public Stereo(String location) {
		// TODO Auto-generated constructor stub
		this.location=location;
	}
	
	public void on() {
		System.out.println(location+"  stereo is on");
	}
	
	public void off() {
		System.out.println(location+"  stereo is off");
	}
	
	public void setCD() {
		System.out.println(location+"  stereo is set for CD input");
	}
	
	public void setDVD() {
		System.out.println(location+"  stereo is set for DVD input");
	}
	
	public void setRadio() {
		System.out.println(location+"  stereo is set for Radio");
	}
	
	public void setVolume(int volumn) {
		System.out.println(location+"  stereo volumn set to"+volumn);
	}
	
}
