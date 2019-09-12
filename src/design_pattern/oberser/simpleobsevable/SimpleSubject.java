package design_pattern.oberser.simpleobsevable;

import java.util.Observable;

public class SimpleSubject extends Observable{

	private int value;
	
	public SimpleSubject() {
		// TODO Auto-generated constructor stub
	}
	
	public void setValue(int value) {
		this.value = value;
		setChanged();
		notifyObservers(value);
	}
	
	public int  getValue() {
		return this.value;
	}
}
