package design_pattern.facade.hometheater;

public class Amplifier {

	String description;
	Tuner tuner;
	DvdPlayer dvd;
	CdPlayer cdplayer;
	
	public Amplifier(String description) {
		// TODO Auto-generated constructor stub
		this.description=description;
	}
	
	public void on() {
		System.out.println(description+" on");
	}

	public void off() {
		System.out.println(description+"  off");
	}
	
	public void setStereoSound() {
		System.out.println(description+"  stereo mode on");
	}
	
	public void setSurroundSound() {
		System.out.println(description+" surround sound on");
	}
	
	public void setVolume(int level) {
		System.out.println(description+"  set volumn to "+level);
	}
	
	public void setDvd(DvdPlayer dvdPlayer) {
		System.out.println(description+"  setting dvd player to "+dvdPlayer);
		this.dvd=dvdPlayer;
	}
	
	public void setCd(CdPlayer cdPlayer) {
		System.out.println(description+"   setting cd player to "+cdPlayer);
		this.cdplayer=cdPlayer;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return description;
	}
}
