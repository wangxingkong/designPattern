package design_pattern.command.party;

import java.util.concurrent.SynchronousQueue;

public class CeilingFan {

	public static final int HIGH=3;
	public static final int MEDIAN=2;
	public static final int LOW=1;
	public static final int OFF=0;
	String location;
	int speed;
	
	public CeilingFan(String location) {
		// TODO Auto-generated constructor stub
		this.location=location;
	}
	
	public void high() {
		speed=HIGH;
		System.out.println(location+" ceiling fan is on high");
	}
	
	public void median() {
		speed=MEDIAN;
		System.out.println(location+"  ceiling fan is on median");
	}
	
	public void low() {
		speed=LOW;
		System.out.println(location+"  ceiling fan is on low");
	}
	
	public  void off() {
		speed=OFF;
		System.out.println(location+ "ceiling fan is on off");
	}
	
	public int getSpeed() {
		return speed;
	}
}

