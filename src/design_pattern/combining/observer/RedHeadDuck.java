package design_pattern.combining.observer;

public class RedHeadDuck implements Quackable{

	Observable observable;
	
	public RedHeadDuck() {
		// TODO Auto-generated constructor stub
		observable=new Observable(this);
	}
	
	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		observable.notifyObserver();
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("redheadduck  quack");
		notifyObserver();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "redheadduck";
	}
	
}
