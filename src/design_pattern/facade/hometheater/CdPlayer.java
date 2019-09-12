package design_pattern.facade.hometheater;

public class CdPlayer {

	String description;
	int currentTrack;
	Amplifier amplifier;
	String title;
	
	public CdPlayer(String description,Amplifier amplifier) {
		// TODO Auto-generated constructor stub
		this.amplifier=amplifier;
		this.description=description;
	}
	
	public void on() {
		System.out.println(description+"  on");
	}
	
	public void off() {
		System.out.println(description+"  off");
	}
	
	public void eject() {
		title=null;
		System.out.println(description+"  eject");
	}
	
	public void play(String title) {
		this.title=title;
		currentTrack=0;
		System.out.println(description+"  playing "+title);
	}
	
	public void play(int track) {
		if(title==null) {
			System.out.println(description+"   cannot play track "+currentTrack);
		}
	}
	
	public void stop() {
		currentTrack=0;
		System.out.println(description+"  stopped");
	}
	
	public void pause() {
		System.out.println(description+"   paused");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return description;
	}
}
