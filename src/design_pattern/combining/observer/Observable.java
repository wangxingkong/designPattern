package design_pattern.combining.observer;

import java.util.ArrayList;
import java.util.Iterator;

public class Observable implements QuackObservable{

	ArrayList<Observer> observers=new ArrayList<>();
	QuackObservable duck;
	
	public Observable(QuackObservable duck) {
		// TODO Auto-generated constructor stub
		this.duck=duck;
	}
	
	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		Iterator<Observer> iterator=observers.iterator();
		while(iterator.hasNext()) {
			Observer observer=iterator.next();
			observer.update(duck);
		}
	}

	public ArrayList<Observer> getObservers() {
		return observers;
	}
	
}
