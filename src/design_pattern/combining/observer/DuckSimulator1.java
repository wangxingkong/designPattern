package design_pattern.combining.observer;

public class DuckSimulator1 {

	public static void main(String[] args) {
		DuckSimulator1 simulator1=new DuckSimulator1();
		simulator1.simulator();
	}

	private void simulator() {
		// TODO Auto-generated method stub
		Quackable redheadDuck=new RedHeadDuck();
		Quackable rubberDuck=new RubberDuck();
		Quackologist quackologist=new Quackologist();
		redheadDuck.registerObserver(quackologist);
		redheadDuck.quack();
		rubberDuck.quack();
	}
	
}
