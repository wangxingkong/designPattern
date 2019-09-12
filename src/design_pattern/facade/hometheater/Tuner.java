package design_pattern.facade.hometheater;

public class Tuner {

	String description;
	Amplifier amplifier;
	double frequency;
	
	public Tuner(String description,Amplifier amplifier) {
		// TODO Auto-generated constructor stub
		this.amplifier=amplifier;
	}
	
	public void on() {
		System.out.println(description+" on");
	}
	
	public void off() {
	System.out.println(description+"  off");	
	}
	
	public void setFrequency(double frequency) {
		System.out.println(description+"  setting frequency to "+frequency);
		this.frequency = frequency;
	}
	
	public void setAm() {
		System.out.println(description+"   setting AM mode");
	}
	
	public void setFm() {
		System.out.println(description+"   setting Fm mode");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return description;
	}
}
