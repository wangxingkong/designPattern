package design_pattern.oberser.simple;

import java.util.ArrayList;

public class SimpleSubject implements Subject{

	private ArrayList<Observer> obervers;
	private int value=0;
	
	public SimpleSubject() {
		// TODO Auto-generated constructor stub
		obervers=new ArrayList<>();
	}
	
	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		obervers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		// TODO Auto-generated method stub
		int i=obervers.indexOf(observer);
		if(i>=0)
			obervers.remove(i);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(Observer observer:obervers)
			observer.update(value);
	}

	public void setValue(int value) {
		this.value = value;
		notifyObservers();
	}
	
}
