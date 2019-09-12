package design_pattern.combining.observer;

public class QuackCounter implements Quackable {

	Quackable duck;
	
	public QuackCounter(Quackable duck) {
		// TODO Auto-generated constructor stub
		this.duck=duck;
	}
	
	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		duck.registerObserver(observer);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		duck.notifyObserver();
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		duck.quack();
		numberOfQuack++;
	}

	private int numberOfQuack=0;
}
