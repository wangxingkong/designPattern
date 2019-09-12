package design_pattern.facade.hometheater;

public class DvdPlayer {

	String description;
	int currentTrack;
	Amplifier amplifier;
	String movie;
	
	public DvdPlayer(String description,Amplifier amplifier) {
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
		movie=null;
		System.out.println(description+"  eject");
	}
	
	
	public void play(int track) {
		if(movie==null) {
			System.out.println(description+"  can not play track "+track+"  no dvd");
		}else {
			currentTrack=track;
			System.out.println(description+"   playing track "+currentTrack+"  of "+movie);
		}
	}
	
	
	
	public void stop() {
		currentTrack=0;
		System.out.println(description+"   stopped "+movie);
	}
	
	public void pause() {
		System.out.println(description+"  paused "+movie);
	}
	
	public void setTwoChannelAudio() {
		System.out.println(description+"  set two channel audio");
	}
	
	public void setSurroundAudio() {
		System.out.println(description+"  set surround audio");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return description;
	}

	public void play(String string) {
		// TODO Auto-generated method stub
		System.out.println("正在播放的电影是"+string);
	}
}
